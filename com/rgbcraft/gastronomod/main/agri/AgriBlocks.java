package com.rgbcraft.gastronomod.main.agri;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class AgriBlocks {
	
	public static Block BlockPomodoro, BlockBasilico, BlockSativa, BlockIndica, BlockAglio, BlockPrezzemolo, BlockRiso, BlockCarciofo, BlockSenape;
	public static Block blueOrchid, allium, azureBluet, orangeTulip, oxeyeDaisy, cornflower, lilyValley, torchFlower, poppy, witherRose, pinkTulip, whiteTulip, redTulip;
	public static final String textureAgri = "/com/rgbcraft/gastronomod/textures/agri.png";

	
	public static void InizializzaBlocchiAgri() {
		BlockPomodoro = new BlockPomodoro(3900, 16).setBlockName("BlockPomodoro").setTextureFile(textureAgri);
		BlockBasilico = new BlockBasilico(3901, 0).setBlockName("BlockBasilico").setTextureFile(textureAgri);
		BlockSativa = new BlockSativa(3910, 32).setBlockName("BlockSativa").setTextureFile(textureAgri);
		BlockIndica = new BlockIndica(3911, 48).setBlockName("BlockIndica").setTextureFile(textureAgri);
		BlockAglio = new BlockAglio(3902, 64).setBlockName("BlockAglio").setTextureFile(textureAgri);
		BlockPrezzemolo = new BlockPrezzemolo(3903, 80).setBlockName("BlockPrezzemolo").setTextureFile(textureAgri);
		BlockRiso = new BlockRiso(3904, 96).setBlockName("BlockRiso").setTextureFile(textureAgri);
		BlockCarciofo = new BlockCarciofo(3905, 112).setBlockName("BlockCarciofo").setTextureFile(textureAgri);
		BlockSenape = new BlockSenape(3906, 128).setBlockName("BlockSenape").setTextureFile(textureAgri);
		
		blueOrchid = new BlockGenericFlower(3950, 0, Material.plants, "blueOrchid");
		allium = new BlockGenericFlower(3951, 1, Material.plants, "allium");
		azureBluet = new BlockGenericFlower(3952, 2, Material.plants, "azureBluet");
		orangeTulip = new BlockGenericFlower(3953, 3, Material.plants, "orangeTulip");
		oxeyeDaisy = new BlockGenericFlower(3954, 4, Material.plants, "oxeyeDaisy");
		cornflower = new BlockGenericFlower(3955, 5, Material.plants, "cornflower");
		lilyValley = new BlockGenericFlower(3956, 6, Material.plants, "lilyValley");
		torchFlower = new BlockGenericFlower(3957, 7, Material.plants, "torchFlower");	
		poppy = new BlockGenericFlower(3958, 8, Material.plants, "poppy");
		witherRose = new BlockGenericFlower(3959, 9, Material.plants, "witherRose");
		pinkTulip = new BlockGenericFlower(3960, 10, Material.plants, "pinkTulip");
		whiteTulip = new BlockGenericFlower(3961, 11, Material.plants, "whiteTulip");
		redTulip = new BlockGenericFlower(3962, 12, Material.plants, "redTulip");
	}
	
	public static void RegistraBlocchiAgri() {
		GameRegistry.registerBlock(blueOrchid, "blueOrchid");
		GameRegistry.registerBlock(allium, "allium");
		GameRegistry.registerBlock(azureBluet, "azureBluet");
		GameRegistry.registerBlock(orangeTulip, "orangeTulip");
		GameRegistry.registerBlock(oxeyeDaisy, "oxeyeDaisy");
		GameRegistry.registerBlock(cornflower, "cornflower");
		GameRegistry.registerBlock(lilyValley, "lilyValley");
		GameRegistry.registerBlock(torchFlower, "torchFlower");
		GameRegistry.registerBlock(poppy, "poppy");
		GameRegistry.registerBlock(witherRose, "witherRose");
		GameRegistry.registerBlock(pinkTulip, "pinkTulip");
		GameRegistry.registerBlock(whiteTulip, "whiteTulip");
		GameRegistry.registerBlock(redTulip, "redTulip");
	}
	
	public static void RegistraLinguaAgri() { 
		LanguageRegistry.addName(blueOrchid, "Blue Orchid");
		LanguageRegistry.addName(allium, "Allium");
		LanguageRegistry.addName(azureBluet, "Azure Bluet");
		LanguageRegistry.addName(orangeTulip, "Orange Tulip");
		LanguageRegistry.addName(oxeyeDaisy, "Oxeye Daisy");
		LanguageRegistry.addName(cornflower, "Cornflower");
		LanguageRegistry.addName(lilyValley, "Lily of the Valley");
		LanguageRegistry.addName(torchFlower, "Torchflower");
		LanguageRegistry.addName(poppy, "Poppy");
		LanguageRegistry.addName(witherRose, "Wither Rose");
		LanguageRegistry.addName(pinkTulip, "Pink Tulip");
		LanguageRegistry.addName(whiteTulip, "White Tulip");
		LanguageRegistry.addName(redTulip, "Red Tulip");
		
	}
}
