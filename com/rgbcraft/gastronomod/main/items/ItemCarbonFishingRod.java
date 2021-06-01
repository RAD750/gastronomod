package com.rgbcraft.gastronomod.main.items;

import com.rgbcraft.gastronomod.main.CreativeTab;
import com.rgbcraft.gastronomod.main.entities.EntityCarbonFishHook;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityFishHook;
import net.minecraft.item.ItemFishingRod;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemCarbonFishingRod extends ItemFishingRod {

	public ItemCarbonFishingRod(int par1) {
		super(par1);
        this.setTextureFile("/com/rgbcraft/gastronomod/textures/items.png");
        this.setCreativeTab(CreativeTab.tabGastronomodPesca);
        this.setIconIndex(11);
        this.setItemName("carbonFishingRod");
	}
	 public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	    {
	        if (par3EntityPlayer.fishEntity != null)
	        {
	            int var4 = par3EntityPlayer.fishEntity.catchFish();
	            par1ItemStack.damageItem(var4, par3EntityPlayer);
	            par3EntityPlayer.swingItem();
	        }
	        else
	        {
	            par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

	            if (!par2World.isRemote)
	            {
	                par2World.spawnEntityInWorld(new EntityCarbonFishHook(par2World, par3EntityPlayer));
	            }

	            par3EntityPlayer.swingItem();
	        }

	        return par1ItemStack;
	    }
}