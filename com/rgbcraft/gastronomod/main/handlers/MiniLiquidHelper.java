package com.rgbcraft.gastronomod.main.handlers;


import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.liquids.LiquidContainerData;
import net.minecraftforge.liquids.LiquidContainerRegistry;
import net.minecraftforge.liquids.LiquidDictionary;
import net.minecraftforge.liquids.LiquidStack;

public class MiniLiquidHelper {
	/**
	 * Registers a container for an existing liquid (smaller version of LiquidHelper from Oil & Gas Overhaul
	 * @param liquidNname The name of the liquid
	 * @param containerItem The item of the full container
	 * @param containerItemEmpty The item of the empty container
	 */
	public static void registerLiquidContainer(String liquidName, LiquidStack fallbackLiquidStack, ItemStack containerItemFull, ItemStack containerItemEmpty) {	
		LiquidStack liquidStack = LiquidDictionary.getOrCreateLiquid(liquidName, fallbackLiquidStack);		
		LiquidContainerData liquidData = new LiquidContainerData(liquidStack, containerItemFull, containerItemEmpty);
		LiquidContainerRegistry.registerLiquid(liquidData);
	}
}
