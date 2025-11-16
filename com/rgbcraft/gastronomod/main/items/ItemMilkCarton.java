package com.rgbcraft.gastronomod.main.items;

import com.rgbcraft.gastronomod.main.CreativeTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemMilkCarton extends ItemFood {

    public ItemMilkCarton(int itemID, int foodPoints, float saturation, boolean likedByWolves, int textureID) {
		super(itemID, foodPoints, saturation, likedByWolves);
		this.setTextureFile("/com/rgbcraft/gastronomod/textures/items.png");
		this.setItemName("milkCarton");
		this.setCreativeTab(CreativeTab.tabGastronomodCibi);
		this.setIconIndex(textureID);
	}

	/**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.drink;
    }
    
    /*
	public ItemStack onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        super.onFoodEaten(par1ItemStack, par2World, par3EntityPlayer);
        if (!par2World.isRemote)
        {
            par3EntityPlayer.curePotionEffects(par1ItemStack);
        }
        --par1ItemStack.stackSize;
        return null;
    }*/
}