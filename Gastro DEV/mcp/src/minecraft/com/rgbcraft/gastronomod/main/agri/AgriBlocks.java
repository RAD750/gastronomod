package com.rgbcraft.gastronomod.main.agri;
import net.minecraft.block.Block;

public class AgriBlocks {
	
	public static Block BlockPomodoro, BlockBasilico, BlockSativa, BlockIndica, BlockAglio, BlockPrezzemolo, BlockRiso, BlockCarciofo;
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
	}
	public static void RegistraLinguaAgri() { 
	}
}
