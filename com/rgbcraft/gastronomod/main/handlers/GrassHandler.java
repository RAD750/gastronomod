package com.rgbcraft.gastronomod.main.handlers;

import com.rgbcraft.gastronomod.main.items.Items;
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
	}
}
