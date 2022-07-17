package com.rgbcraft.gastronomod.main.arbori;

import com.rgbcraft.gastronomod.main.CreativeTab;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.material.Material;

public class ArboriBlocks {
	public static Block saplingOlive, woodOlive, leaveOlive;
	public static final String textureArbori = "/com/rgbcraft/gastronomod/textures/arbori.png";
	
	public static void InizializzaArbori() {
		saplingOlive = new BlockArboriSapling(3770, 2).setHardness(0.0F).setBlockName("saplingOlive").setRequiresSelfNotify();
		leaveOlive = new BlockArboriLeaves(3771, 1).setBlockName("leaveOlive").setRequiresSelfNotify();
		woodOlive = new Block(3772, 0, Material.wood).setBlockName("woodOlive").setCreativeTab(CreativeTab.tabGastronomodAgri);
	}
	
	public static void RegistraArbori() {
		GameRegistry.registerBlock(saplingOlive, "saplingOlive");
		GameRegistry.registerBlock(leaveOlive, "leaveOlive");
		GameRegistry.registerBlock(woodOlive, "woodOlive");
		LanguageRegistry.addName(saplingOlive, "Olive Sapling");
		LanguageRegistry.addName(leaveOlive, "Olive Leaves");
	}
}

