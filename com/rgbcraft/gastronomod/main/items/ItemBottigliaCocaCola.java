package com.rgbcraft.gastronomod.main.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemBottigliaCocaCola extends ItemFood {

    public ItemBottigliaCocaCola(int par1, int par2, float par3, boolean par4) {
		super(par1, par2, par3, par4);
		// TODO Auto-generated constructor stub
	}

	/**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.drink;
    }
}