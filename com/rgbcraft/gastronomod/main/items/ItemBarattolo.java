package com.rgbcraft.gastronomod.main.items;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemBarattolo extends ItemFood
{

	public ItemBarattolo(int par1, int par2)
    {
        super(par1, par2, false);
        this.setMaxStackSize(1);
        this.setIconIndex(7);
        this.setTextureFile("/com/rgbcraft/gastronomod/textures/items.png");
        this.setCreativeTab(CreativeTabs.tabMisc);
    }

	public ItemStack onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        super.onFoodEaten(par1ItemStack, par2World, par3EntityPlayer);
        return new ItemStack(Items.barattolo_sporco);
    }
}
