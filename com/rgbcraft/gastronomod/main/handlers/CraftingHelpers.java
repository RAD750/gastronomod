package com.rgbcraft.gastronomod.main.handlers;

import java.util.ArrayList;

import com.rgbcraft.gastronomod.main.Main;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class CraftingHelpers {

	/**
	 * Get an Ore Dictionary Item
	 * @param oreDictName Ore Dictionary Item Name
	 * @return The requested ItemStack, or null if not found (Check log) 
	 */
	public static ItemStack getOreDict(String oreDictName) {
		ArrayList<ItemStack> ores;
		ores = OreDictionary.getOres(oreDictName);
		if ( ores.size() > 0 ) {
			ItemStack oreItemStack = ores.get(0);
			return oreItemStack;
		} else {
			Main.gastroLog.warning("Missing OreDict Item!! " + oreDictName);
			return null;
		}
	}
}
