package com.rgbcraft.gastronomod.main.proxies;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ServerProxy extends CommonProxy {
	public ServerProxy() {
	}

	@Mod.PreInit
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
	}

	@Mod.Init
	public void init(FMLInitializationEvent event) {
		super.init(event);
	}

	@Mod.PostInit
	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
	}
}