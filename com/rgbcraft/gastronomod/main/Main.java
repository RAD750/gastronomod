package com.rgbcraft.gastronomod.main;

import com.rgbcraft.gastronomod.main.agri.AgriBlocks;
import com.rgbcraft.gastronomod.main.arbori.ArboriBlocks;
import com.rgbcraft.gastronomod.main.handlers.CraftingHandler;
import com.rgbcraft.gastronomod.main.handlers.GrassHandler;
import com.rgbcraft.gastronomod.main.items.Items;
import com.rgbcraft.gastronomod.main.proxies.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;

import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.client.Minecraft;
import net.minecraft.src.BaseMod;
import net.minecraftforge.common.MinecraftForge;


@Mod(name="Gastronomod", version="1.7", modid="gastronomod")
public class Main extends BaseMod{

	//proxy per prerendering
	  @SidedProxy(clientSide="com.rgbcraft.gastronomod.main.proxies.ClientProxy", serverSide="com.rgbcraft.gastronomod.main.proxies.ServerProxy")
	  public static CommonProxy proxy;
	
	@Override
	public String getVersion() {
		return "1.7";
	}

	@Override
	public void load() {

		
	}
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println("[Gastronomod] VIVA L'ATR125 - UNICO TRENO MODERNO COI FINESTRINI ALLINEATI AI SEDILI");		
	}
	
	
	@Init
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
		AgriBlocks.InizializzaBlocchiAgri();
		AgriBlocks.RegistraLinguaAgri();
		Items.InizializzaItem();
		Items.RegistraLingua();
		
		GrassHandler.InitGrassHandler();
		/*ArboriBlocks.InizializzaArbori();
		ArboriBlocks.RegistraArbori();*/
		
	}
	
	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
		//proxy per modelli techne
		CraftingHandler.AggiungiCrafting();
	    proxy.postInit(event);
	}
	
}
