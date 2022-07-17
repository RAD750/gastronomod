package com.rgbcraft.gastronomod.main.items;
import com.rgbcraft.gastronomod.main.CreativeTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemScatoletta extends ItemFood
{

	public ItemScatoletta(int par1, int par2)
    {
        super(par1, par2, false);
        this.setMaxStackSize(64);
        this.setIconIndex(5);
        this.setTextureFile("/com/rgbcraft/gastronomod/textures/items.png");
        this.setCreativeTab(CreativeTab.tabGastronomodCibi);
    }
}
