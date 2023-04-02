package com.rgbcraft.gastronomod.main.handlers;

import com.rgbcraft.gastronomod.main.agri.AgriBlocks;
import com.rgbcraft.gastronomod.main.items.Items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

public class GrassHandler {
	public static void InitGrassHandler() {
		MinecraftForge.addGrassSeed(new ItemStack(Items.sativaSemi), 1);
		MinecraftForge.addGrassSeed(new ItemStack(Items.indicaSemi), 1);
		MinecraftForge.addGrassSeed(new ItemStack(Items.pomodoroSemi), 7);
		MinecraftForge.addGrassSeed(new ItemStack(Items.basilicoSemi), 7);
		MinecraftForge.addGrassSeed(new ItemStack(Items.prezzemoloSemi), 7);
		MinecraftForge.addGrassSeed(new ItemStack(Items.aglio), 4);
		MinecraftForge.addGrassSeed(new ItemStack(Items.riso), 7);
		MinecraftForge.addGrassSeed(new ItemStack(Items.carciofoSemi), 5);
		
		MinecraftForge.addGrassPlant(AgriBlocks.blueOrchid, 0, 5);
		MinecraftForge.addGrassPlant(AgriBlocks.allium, 0, 5);
		MinecraftForge.addGrassPlant(AgriBlocks.azureBluet, 0, 5);
		MinecraftForge.addGrassPlant(AgriBlocks.orangeTulip, 0, 4);
		MinecraftForge.addGrassPlant(AgriBlocks.oxeyeDaisy, 0, 8);
		MinecraftForge.addGrassPlant(AgriBlocks.cornflower, 0, 5);
		MinecraftForge.addGrassPlant(AgriBlocks.lilyValley, 0, 5);
		MinecraftForge.addGrassPlant(AgriBlocks.torchFlower, 0, 2);
		MinecraftForge.addGrassPlant(AgriBlocks.poppy, 0, 2);
		MinecraftForge.addGrassPlant(AgriBlocks.witherRose, 0, 2);
		MinecraftForge.addGrassPlant(AgriBlocks.pinkTulip, 0, 4);
		MinecraftForge.addGrassPlant(AgriBlocks.redTulip, 0, 4);
		MinecraftForge.addGrassPlant(AgriBlocks.whiteTulip, 0, 4);
	}
}
