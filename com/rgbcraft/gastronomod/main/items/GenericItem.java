package com.rgbcraft.gastronomod.main.items;

import com.rgbcraft.gastronomod.main.CreativeTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class GenericItem extends Item {

	public GenericItem(int id, int iconIndex, String itemName,  CreativeTabs tab, int stackSize) {
		super(id);
		this.setIconIndex(iconIndex);
		this.setItemName(itemName);
		this.setCreativeTab(tab);
		this.setMaxStackSize(stackSize);
		this.setTextureFile("/com/rgbcraft/gastronomod/textures/items.png");
	}

}
