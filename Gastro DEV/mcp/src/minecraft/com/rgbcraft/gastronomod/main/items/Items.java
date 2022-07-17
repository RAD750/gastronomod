package com.rgbcraft.gastronomod.main.items;

import com.rgbcraft.gastronomod.main.CreativeTab;
import com.rgbcraft.gastronomod.main.agri.AgriBlocks;
import com.rgbcraft.gastronomod.main.handlers.MiniLiquidHelper;
import com.rgbcraft.gastronomod.main.items.roba.ItemIndica;
import com.rgbcraft.gastronomod.main.items.roba.ItemSativa;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraftforge.liquids.LiquidDictionary;

public class Items {
		
	//attrezzi
	
	public static Item carbonFishingRod;
	
	public static Item tonno, tonnoPinneGialle, tonnoCotto, cornedBeef, orata, orataCotta, tonnoScatola;
	
	//pentolame
	public static Item pentola, pentola_sporca, pentola_acqua, pentola_bollente, pentola_spaghetti, pentola_riso, pentola_olio, pentola_olio_bollente;
	public static Item pentolino, pentolino_sporco, pentolino_sugo, pentolino_sugo_cotto;
	public static Item bottiglia;
	
	//piatti
	public static Item piatto, piatto_sporco, piatto_spaghetti, piatto_spaghetti_aglio_olio, piatto_spaghetti_sugo, piatto_ravioli, pentola_ravioli, piatto_riso;
	public static Item barattolo, barattolo_sporco;
	
	public static Item basilicoSemi, aglioSemi, prezzemoloSemi, pomodoroSemi, carciofoSemi;
	public static Item basilico, spicchio_aglio, aglio, prezzemolo, ariosto, pomodoro, carciofo;
	
	//sughi
	public static Item sugo_pomodoro;
	
	//grassi e condimenti
	public static Item burro, olio_oliva, sale, riso;

	//pasta e riso
	public static Item spaghetti, mozzarella, parmigiano, parmigiano_gratt, ravioli;
	
	public static Item base_pizza, pizza_margherita, pizza_marinara, pizza_margherita_nc, pizza_marinara_nc, pizza_capricciosa, pizza_capricciosa_nc;
	
	//farine
	public static Item farina_int, farina_00, lievito, pane_nero, pane_nero_nc, pangrattato;
	
	//dolci
	public static Item shortbread_nc, shortbread, nutella, tiramisu, gelatoBase, cioccolato;
	
	public static Item bogusCibo;
	
	public static Item arancino_crudo, arancino;
	
	
	public static Item cocacola;
	
	public static Item conoVuoto, conoCioccolato, conoPistacchio, conoStracciatella, conoFiordilatte, conoCostoso;
	public static Item vaschettaVuota, gelatoCioccolato, gelatoPistacchio, gelatoStracciatella, gelatoFiordilatte, gelatoCostoso, cacaoTritato;
	
	//MARIA
	public static Item sativaSemi, sativaFoglia, indicaSemi, indicaFoglia;
	public static Item sativaCannone, indicaCannone;

	public static Item emptyCarton, milkCarton;
	
	//texture file
	
	public static final String texture = "/com/rgbcraft/gastronomod/textures/items.png";
	public static final String textureAgri = "/com/rgbcraft/gastronomod/textures/agri.png";
		
	public static void InizializzaItem() {
		

	//a_CentraleTermica = new Item(24301).setIconIndex(0).setItemName("a_CentraleTermica").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	// new ItemFood (ID, mezziCosciotti, saturation, preferito_dai_lupi)
	//ProtoFood = new ItemFood(25100, 1, 0.5f, false).setItemName("ProtoFood").setCreativeTab(CreativeTab.tabGastronomodCibi);
		
		bogusCibo = new ItemFood(10000, 1, 1.5f, false).setAlwaysEdible().setPotionEffect(17, 2, 255, 100.0f).setItemName("bogusCibo").setCreativeTab(CreativeTab.tabGastronomodAgri);
		
		carbonFishingRod = new ItemCarbonFishingRod(9999);
		
		
		//dolci
		
		
		
		//farine
		farina_int = new Item(10010).setIconIndex(145).setItemName("farina_int").setTextureFile(texture).setCreativeTab(CreativeTab.tabGastronomodCibi);
		farina_00 = new Item(10011).setIconIndex(144).setItemName("farina_00").setTextureFile(texture).setCreativeTab(CreativeTab.tabGastronomodCibi);
		lievito = new Item(10012).setIconIndex(146).setItemName("lievito").setTextureFile(texture).setCreativeTab(CreativeTab.tabGastronomodCibi).setMaxStackSize(16);
		
		spaghetti = new Item(10020).setIconIndex(160).setItemName("spaghetti").setTextureFile(texture).setCreativeTab(CreativeTab.tabGastronomodCibi).setMaxStackSize(32);
		pane_nero_nc = new Item(10021).setItemName("pane_nero_nc").setTextureFile(texture).setCreativeTab(CreativeTab.tabGastronomodCibi).setIconIndex(54).setMaxStackSize(16);
		pane_nero = new ItemFood(10022, 6, 1.5f, true).setPotionEffect(5, 180, 5, 100.0f).setItemName("pane_nero").setTextureFile(texture).setCreativeTab(CreativeTab.tabGastronomodCibi).setIconIndex(55).setMaxStackSize(16);
		
		pangrattato = new Item(10023).setItemName("pangrattato").setTextureFile(texture).setCreativeTab(CreativeTab.tabGastronomodCibi).setIconIndex(56);
		
		
		//dolci
			
		nutella = new ItemBarattolo(10030, 20).setPotionEffect(20, 5, 3, 100.0f).setIconIndex(128).setTextureFile(texture).setItemName("nutella").setCreativeTab(CreativeTab.tabGastronomodCibi);
		shortbread_nc = new Item(10031).setIconIndex(129).setItemName("shortbread_nc").setTextureFile(texture).setCreativeTab(CreativeTab.tabGastronomodCibi).setMaxStackSize(24);
		shortbread = new ItemFood(10032, 2, 1.0f, false).setIconIndex(131).setItemName("shortbread").setTextureFile(texture).setCreativeTab(CreativeTab.tabGastronomodCibi).setMaxStackSize(24);
	    tiramisu = new ItemFood(10033, 4, 1.0f, false).setIconIndex(130).setItemName("tiramisu").setTextureFile(texture).setCreativeTab(CreativeTab.tabGastronomodCibi).setMaxStackSize(1);
	    cioccolato = new ItemFood(10039, 6, 1.5f, true).setPotionEffect(5, 180, 5, 100.0f).setItemName("cioccolato").setTextureFile(texture).setCreativeTab(CreativeTab.tabGastronomodCibi).setIconIndex(132).setMaxStackSize(16);
	    cacaoTritato = new Item(10013).setIconIndex(133).setItemName("cacaoTriato").setTextureFile(texture).setCreativeTab(CreativeTab.tabGastronomodCibi);
	    
	    conoVuoto = new Item(10140).setIconIndex(224).setItemName("conoVuoto").setTextureFile(texture).setCreativeTab(CreativeTab.tabGastronomodAltro);
	    conoCioccolato = new ItemFood(10034, 4, 1.5f, true).setAlwaysEdible().setPotionEffect(5, 120, 5, 90.0f).setItemName("conoCioccolato").setTextureFile(texture).setCreativeTab(CreativeTab.tabGastronomodCibi).setIconIndex(225).setMaxStackSize(16);
	    //conoPistacchio = new ItemFood(10035, 4, 1.5f, true).setAlwaysEdible().setPotionEffect(5, 120, 5, 90.0f).setItemName("conoPistacchio").setTextureFile(texture).setCreativeTab(CreativeTab.tabGastronomodCibi).setIconIndex(226).setMaxStackSize(16);
	    conoStracciatella = new ItemFood(10036, 4, 1.5f, true).setAlwaysEdible().setPotionEffect(5, 120, 5, 90.0f).setItemName("conoStracciatella").setTextureFile(texture).setCreativeTab(CreativeTab.tabGastronomodCibi).setIconIndex(227).setMaxStackSize(16);
	    conoFiordilatte = new ItemFood(10037, 4, 1.5f, true).setAlwaysEdible().setPotionEffect(5, 120, 5, 90.0f).setItemName("conoFiordilatte").setTextureFile(texture).setCreativeTab(CreativeTab.tabGastronomodCibi).setIconIndex(228).setMaxStackSize(16);
	    conoCostoso = new ItemFood(10038, 6, 1.5f, true).setAlwaysEdible().setPotionEffect(5, 1000, 5, 100.0f).setItemName("conoCostoso").setTextureFile(texture).setCreativeTab(CreativeTab.tabGastronomodCibi).setIconIndex(229).setMaxStackSize(16);
	    
		//piatti, barattori, pentole, pentolini vuoti
		pentola = new Item(10040).setItemName("pentola").setCreativeTab(CreativeTab.tabGastronomodAltro).setTextureFile(texture).setIconIndex(0).setMaxStackSize(4);
		pentola_sporca = new Item(10041).setItemName("pentola_sporca").setCreativeTab(CreativeTab.tabGastronomodAltro).setTextureFile(texture).setIconIndex(1).setMaxStackSize(4);
		pentolino = new Item(10042).setItemName("pentolino").setCreativeTab(CreativeTab.tabGastronomodAltro).setTextureFile(texture).setIconIndex(2).setMaxStackSize(4);
		pentolino_sporco = new Item(10043).setItemName("pentolino_sporco").setCreativeTab(CreativeTab.tabGastronomodAltro).setTextureFile(texture).setIconIndex(3).setMaxStackSize(4);
	    piatto = new Item(10044).setItemName("piatto_vuoto").setCreativeTab(CreativeTab.tabGastronomodAltro).setTextureFile(texture).setIconIndex(4).setMaxStackSize(16);
	    piatto_sporco = new Item(10045).setItemName("piatto_sporco").setCreativeTab(CreativeTab.tabGastronomodAltro).setTextureFile(texture).setIconIndex(5).setMaxStackSize(16);
	    barattolo = new Item(10046).setItemName("barattolo").setCreativeTab(CreativeTab.tabGastronomodAltro).setTextureFile(texture).setIconIndex(6).setMaxStackSize(4);
	    barattolo_sporco = new Item(10047).setItemName("barattolo_sporco").setCreativeTab(CreativeTab.tabGastronomodAltro).setTextureFile(texture).setIconIndex(7).setMaxStackSize(4);
	    bottiglia = new Item(10048).setItemName("bottiglia)").setCreativeTab(CreativeTab.tabGastronomodAltro).setTextureFile(texture).setIconIndex(8).setMaxStackSize(6);
		
	    mozzarella = new ItemFood(10050, 6, 1.0f, false).setItemName("mozzarella").setIconIndex(179).setCreativeTab(CreativeTab.tabGastronomodCibi).setTextureFile(texture).setMaxStackSize(8);
	    parmigiano = new ItemFood(10051, 4, 1.0f, false).setItemName("parmigiano").setIconIndex(177).setCreativeTab(CreativeTab.tabGastronomodCibi).setTextureFile(texture).setMaxStackSize(8);
	    parmigiano_gratt = new Item(10052).setItemName("parmigiano_gratt").setIconIndex(178).setCreativeTab(CreativeTab.tabGastronomodCibi).setTextureFile(texture).setMaxStackSize(32);
	    
	    //pentole con roba da cuocere
	    pentola_acqua = new Item(10060).setItemName("pentola_acqua").setCreativeTab(CreativeTab.tabGastronomodAltro).setTextureFile(texture).setIconIndex(64).setMaxStackSize(1);
	    pentola_bollente = new Item(10061).setItemName("pentola_bollente").setCreativeTab(CreativeTab.tabGastronomodAltro).setTextureFile(texture).setIconIndex(65).setMaxStackSize(1);
	    pentola_spaghetti = new Item(10062).setItemName("pentola_spaghetti").setCreativeTab(CreativeTab.tabGastronomodCibi).setTextureFile(texture).setIconIndex(66).setContainerItem(pentola).setMaxStackSize(1);
	    pentola_ravioli = new Item(10065).setItemName("pentola_ravioli").setCreativeTab(CreativeTab.tabGastronomodCibi).setTextureFile(texture).setIconIndex(66).setContainerItem(pentola).setMaxStackSize(1);
	    pentolino_sugo = new Item(10063).setItemName("pentolino_sugo").setCreativeTab(CreativeTab.tabGastronomodCibi).setTextureFile(texture).setIconIndex(49).setMaxStackSize(1);
	    pentolino_sugo_cotto = new Item(10064).setItemName("pentolino_sugo_cotto").setCreativeTab(CreativeTab.tabGastronomodCibi).setTextureFile(texture).setIconIndex(53).setContainerItem(pentolino).setMaxStackSize(1);
	    pentola_riso = new Item(10066).setItemName("pentola_riso").setCreativeTab(CreativeTab.tabGastronomodCibi).setTextureFile(texture).setContainerItem(pentola).setMaxStackSize(1).setIconIndex(67);
	    pentola_olio = new Item(10067).setItemName("pentola_olio").setCreativeTab(CreativeTab.tabGastronomodCibi).setTextureFile(texture).setIconIndex(68).setMaxStackSize(1);
	    pentola_olio_bollente = new Item(10068).setItemName("pentola_olio_bollente").setCreativeTab(CreativeTab.tabGastronomodCibi).setTextureFile(texture).setIconIndex(69).setContainerItem(pentola_sporca).setMaxStackSize(1);
	    
	    //prodotti semilavorati
	    base_pizza = new Item(10070).setItemName("base_pizza").setCreativeTab(CreativeTab.tabGastronomodCibi).setTextureFile(texture).setIconIndex(48).setMaxStackSize(4);
	    spicchio_aglio = new ItemFood(10071, 1, 0.5f, false).setItemName("spicchio_aglio").setCreativeTab(CreativeTab.tabGastronomodCibi).setTextureFile(texture).setIconIndex(50);
	    
	    pizza_margherita_nc = new Item(10072).setCreativeTab(CreativeTab.tabGastronomodCibi).setItemName("pizza_margherita_nc").setTextureFile(texture).setIconIndex(51).setMaxStackSize(64);
	    pizza_marinara_nc = new Item(10073).setCreativeTab(CreativeTab.tabGastronomodCibi).setItemName("pizza_marinara_nc").setTextureFile(texture).setIconIndex(52).setMaxStackSize(64);
	    pizza_capricciosa_nc = new Item(10074).setCreativeTab(CreativeTab.tabGastronomodCibi).setItemName("pizza_capricciosa_nc").setTextureFile(texture).setIconIndex(57).setMaxStackSize(66);
	    
	    //riso
	    
	    
	    //piatti finiti
	    pizza_margherita = new ItemFood(10080, 16, 1.5f, false).setCreativeTab(CreativeTab.tabGastronomodCibi).setItemName("pizza_margherita").setTextureFile(texture).setIconIndex(16).setMaxStackSize(24);
	    pizza_marinara = new ItemFood(10081, 12, 1.5f, false).setCreativeTab(CreativeTab.tabGastronomodCibi).setItemName("pizza_marinara").setTextureFile(texture).setIconIndex(17).setMaxStackSize(24);
	    pizza_capricciosa = new ItemFood(10075, 17, 1.5f, false).setCreativeTab(CreativeTab.tabGastronomodCibi).setItemName("pizza_capricciosa").setTextureFile(texture).setIconIndex(23).setMaxStackSize(24);
	    
	    
		//piatti finiti (il piatto viene restituito)
	    piatto_spaghetti = new ItemPiatto(10082, 3).setItemName("piatto_spaghetti").setCreativeTab(CreativeTab.tabGastronomodCibi).setTextureFile(texture).setIconIndex(18);
	    piatto_spaghetti_sugo = new ItemPiatto(10083, 10).setItemName("piatto_spaghetti_sugo").setCreativeTab(CreativeTab.tabGastronomodCibi).setTextureFile(texture).setIconIndex(19);
	    piatto_spaghetti_aglio_olio = new ItemPiatto(10084, 9).setItemName("piatto_spaghetti_aglio_olio").setCreativeTab(CreativeTab.tabGastronomodCibi).setTextureFile(texture).setIconIndex(20);
	    piatto_ravioli = new ItemPiatto(10085, 4).setPotionEffect(20, 3, 3, 40.0f).setItemName("piatto_ravioli").setCreativeTab(CreativeTab.tabGastronomodCibi).setIconIndex(21);
	    piatto_riso = new ItemPiatto(10086, 4).setItemName("piatto_riso").setCreativeTab(CreativeTab.tabGastronomodCibi).setIconIndex(22);
	    
	    arancino_crudo = new Item(10087).setItemName("arancino_crudo").setCreativeTab(CreativeTab.tabGastronomodCibi).setTextureFile(texture).setIconIndex(116);
	    arancino = new ItemFood(10089, 10, 1.5f, false).setItemName("arancino").setCreativeTab(CreativeTab.tabGastronomodCibi).setTextureFile(texture).setIconIndex(117).setMaxStackSize(32);
	    
	    pomodoroSemi = new ItemSeeds(10100, AgriBlocks.BlockPomodoro.blockID, Block.tilledField.blockID).setIconIndex(20).setItemName("itemPomodoroSeeds").setCreativeTab(CreativeTab.tabGastronomodAgri).setTextureFile(textureAgri);
	    basilicoSemi = new ItemSeeds(10101, AgriBlocks.BlockBasilico.blockID, Block.tilledField.blockID).setIconIndex(4).setItemName("itemBasilicoSeeds").setCreativeTab(CreativeTab.tabGastronomodAgri).setTextureFile(textureAgri);
	    prezzemoloSemi = new ItemSeeds(10102, AgriBlocks.BlockPrezzemolo.blockID, Block.tilledField.blockID).setIconIndex(84).setItemName("itemPrezzemoloSeeds").setCreativeTab(CreativeTab.tabGastronomodAgri).setTextureFile(textureAgri);
	    carciofoSemi = new ItemSeeds(10103, AgriBlocks.BlockCarciofo.blockID, Block.tilledField.blockID).setIconIndex(116).setItemName("itemCarciofoSeeds").setCreativeTab(CreativeTab.tabGastronomodAgri).setTextureFile(textureAgri);
	    riso = new ItemSeeds(10104, AgriBlocks.BlockRiso.blockID, Block.tilledField.blockID).setIconIndex(115).setItemName("riso").setCreativeTab(CreativeTab.tabGastronomodAgri).setTextureFile(texture);
	    
	    //MARIA GIOVANNA
	    
	    indicaSemi = new ItemSeeds(10110, AgriBlocks.BlockIndica.blockID, Block.tilledField.blockID).setIconIndex(36).setItemName("indicaSemi").setCreativeTab(CreativeTab.tabGastronomodAgri).setTextureFile(textureAgri);
	    sativaSemi = new ItemSeeds(10111, AgriBlocks.BlockSativa.blockID, Block.tilledField.blockID).setIconIndex(52).setItemName("sativaSemi").setCreativeTab(CreativeTab.tabGastronomodAgri).setTextureFile(textureAgri);
	    
	    indicaFoglia = new Item(10115).setItemName("indicaFoglia").setCreativeTab(CreativeTab.tabGastronomodAgri).setTextureFile(texture).setIconIndex(209);
	    sativaFoglia = new Item(10116).setItemName("sativaFoglia").setCreativeTab(CreativeTab.tabGastronomodAgri).setTextureFile(texture).setIconIndex(210);
	    
	    indicaCannone = new ItemIndica(10120, 1).setItemName("indicaCannone");
	    sativaCannone = new ItemSativa(10121, 1).setItemName("sativaCannone");
	    
	    //GELATI
	    vaschettaVuota = new Item(10130).setItemName("vaschettaVuota").setCreativeTab(CreativeTab.tabGastronomodAltro).setTextureFile(texture).setIconIndex(9);
	    gelatoBase = new Item(10131).setItemName("gelatoBase").setCreativeTab(CreativeTab.tabGastronomodAltro).setTextureFile(texture).setIconIndex(240);
	    gelatoCioccolato = new Item(10132).setItemName("gelatoCioccolato").setCreativeTab(CreativeTab.tabGastronomodAltro).setTextureFile(texture).setIconIndex(241);
	    //gelatoPistacchio = new Item(10133).setItemName("gelatoPistacchio").setCreativeTab(CreativeTab.tabGastronomodAltro).setTextureFile(texture).setIconIndex(242);
	    gelatoStracciatella= new Item(10134).setItemName("gelatoStracciatella").setCreativeTab(CreativeTab.tabGastronomodAltro).setTextureFile(texture).setIconIndex(243);
	    gelatoFiordilatte= new Item(10135).setItemName("gelatoFiordilatte").setCreativeTab(CreativeTab.tabGastronomodAltro).setTextureFile(texture).setIconIndex(244);
	    gelatoCostoso= new Item(10136).setItemName("gelatoCostoso").setCreativeTab(CreativeTab.tabGastronomodAltro).setTextureFile(texture).setIconIndex(245);
	    
	    
	    //verdura, frutta
	    aglio = new ItemSeeds(10090, AgriBlocks.BlockAglio.blockID, Block.tilledField.blockID).setItemName("aglio").setCreativeTab(CreativeTab.tabGastronomodAgri).setTextureFile(texture).setIconIndex(80);
	    basilico = new Item(10091).setItemName("basilico").setCreativeTab(CreativeTab.tabGastronomodAgri).setTextureFile(texture).setIconIndex(81);
	    prezzemolo = new Item(10092).setItemName("prezzemolo").setCreativeTab(CreativeTab.tabGastronomodAgri).setTextureFile(textureAgri).setIconIndex(85);
	    pomodoro = new ItemFood(10093, 5, 1.5f, false).setItemName("pomodoro").setCreativeTab(CreativeTab.tabGastronomodAgri).setTextureFile(texture).setIconIndex(83);
	    ariosto = new Item(10094).setItemName("ariosto").setCreativeTab(CreativeTab.tabGastronomodAgri).setTextureFile(texture).setIconIndex(84);
	    carciofo = new ItemFood(10095, 2, 0.5f, false).setItemName("carciofo").setCreativeTab(CreativeTab.tabGastronomodAgri).setTextureFile(textureAgri).setIconIndex(117);
	    
		//grassi e condimenti
		burro = new ItemFood(10001, 3, 1.5f, false).setPotionEffect(9, 60, 10, 100.0f).setIconIndex(176).setItemName("burro").setTextureFile(texture).setCreativeTab(CreativeTab.tabGastronomodCibi);
		sale = new Item(10002).setIconIndex(112).setItemName("sale").setTextureFile(texture).setCreativeTab(CreativeTab.tabGastronomodCibi);
		olio_oliva = new Item(10003).setIconIndex(113).setItemName("olio_oliva").setTextureFile(texture).setCreativeTab(CreativeTab.tabGastronomodCibi).setContainerItem(Items.barattolo_sporco);
		sugo_pomodoro = new Item(10004).setIconIndex(114).setItemName("sugo_pomodoro").setTextureFile(texture).setCreativeTab(CreativeTab.tabGastronomodCibi).setContainerItem(Items.barattolo_sporco);
		
		cocacola = new ItemBottigliaCocaCola(10005, 3, 1.5f, false).setPotionEffect(3, 60, 10, 100.0f).setIconIndex(192).setItemName("cocacola").setTextureFile(texture).setCreativeTab(CreativeTab.tabGastronomodCibi).setContainerItem(Items.bottiglia);
		
		milkCarton = new ItemMilkCarton(10006, 3, 0.5f, false, 180);
		emptyCarton = new Item(10007).setIconIndex(181).setItemName("emptyCarton").setTextureFile(texture).setCreativeTab(CreativeTab.tabGastronomodCibi);
		
		if (LiquidDictionary.getLiquid("milk", 1) != null) {		
			MiniLiquidHelper.registerLiquidContainer("milk", new ItemStack(Items.milkCarton), new ItemStack(Items.emptyCarton));
		}
		
		//pesci
		tonnoPinneGialle = new ItemFood(10150, 4, 1.5f, false).setIconIndex(96).setItemName("tonnoPinneGialle").setTextureFile(texture).setCreativeTab(CreativeTab.tabGastronomodPesca);
		tonno = new ItemFood(10151, 4, 1.5f, false).setIconIndex(97).setItemName("tonno").setTextureFile(texture).setCreativeTab(CreativeTab.tabGastronomodPesca);
		orata = new ItemFood(10152, 2, 1.5f, false).setIconIndex(98).setItemName("orata").setTextureFile(texture).setCreativeTab(CreativeTab.tabGastronomodPesca);
		orataCotta = new ItemFood(10153, 6, 1.5f, false).setIconIndex(99).setItemName("orataCotta").setTextureFile(texture).setCreativeTab(CreativeTab.tabGastronomodPesca);
	
		//scatolame
		
		tonnoScatola = new ItemScatoletta(10160, 4).setIconIndex(86).setItemName("tonnoScatola").setTextureFile(texture).setCreativeTab(CreativeTab.tabGastronomodCibi);
		cornedBeef = new ItemScatoletta(10161, 5).setIconIndex(85).setItemName("cornedBeef").setTextureFile(texture).setCreativeTab(CreativeTab.tabGastronomodCibi);
	}
	
	
	 
	
	
	public static void RegistraLingua() {
	
		LanguageRegistry.addName(carbonFishingRod, "Carbon Fiber Fishing Rod");
		
		LanguageRegistry.addName(emptyCarton, "Empty Carton");
		LanguageRegistry.addName(milkCarton, "Milk Carton");
		
		LanguageRegistry.addName(bogusCibo, "Hai trovato un bug grave se hai ottenuto legittimamente questo item. Segnala a lego11.");
		
		LanguageRegistry.addName(pentola, "Pentola");
		LanguageRegistry.addName(pentola_sporca, "Pentola sporca");
		LanguageRegistry.addName(pentolino, "Pentolino");
		LanguageRegistry.addName(pentolino_sporco, "Pentolino sporco");
		LanguageRegistry.addName(piatto, "Piatto");
		LanguageRegistry.addName(piatto_sporco, "Piatto sporco");
		LanguageRegistry.addName(barattolo, "Barattolo");
		LanguageRegistry.addName(barattolo_sporco, "Barattolo sporco");
		LanguageRegistry.addName(bottiglia, "Bottiglia");
		
		LanguageRegistry.addName(pizza_margherita, "Pizza margherita");
		LanguageRegistry.addName(pizza_marinara, "Pizza marinara");
		LanguageRegistry.addName(pizza_capricciosa, "Pizza capricciosa");
		
		LanguageRegistry.addName(pizza_margherita_nc, "Pizza margherita (cruda)");
		LanguageRegistry.addName(pizza_marinara_nc, "Pizza marinara (cruda)");
		LanguageRegistry.addName(pizza_capricciosa_nc, "Pizza capricciosa (cruda)");
		
		LanguageRegistry.addName(piatto_spaghetti, "Spaghetti in bianco");
		LanguageRegistry.addName(piatto_spaghetti_sugo, "Spaghetti al pomodoro");
		LanguageRegistry.addName(piatto_spaghetti_aglio_olio, "Spaghetti aglio e olio");
		LanguageRegistry.addName(piatto_ravioli, "Piatto ravioli alla Fabrimat");
		LanguageRegistry.addName(piatto_riso, "Piatto di riso");
		
		LanguageRegistry.addName(base_pizza, "Base per pizza");
		LanguageRegistry.addName(pentolino_sugo, "Pentolino con sugo di pomodoro");
		LanguageRegistry.addName(pentolino_sugo_cotto, "Pentolino con sugo di pomodoro cotto");
		LanguageRegistry.addName(spicchio_aglio, "Spicchio d'aglio");
		
		LanguageRegistry.addName(pangrattato, "Pangrattato");
		LanguageRegistry.addName(arancino, "Arancino");
		LanguageRegistry.addName(arancino_crudo, "Arancino (crudo)");
		
		LanguageRegistry.addName(pentola_acqua, "Pentola con acqua");
		LanguageRegistry.addName(pentola_bollente, "Pentola con acqua bollente");
		LanguageRegistry.addName(pentola_spaghetti, "Pentola con acqua bollente e spaghetti");
		LanguageRegistry.addName(pentola_ravioli, "Pentola con acqua bollente e ravioli");
		LanguageRegistry.addName(pentola_riso, "Pentola con acqua bollente e riso");
		
		LanguageRegistry.addName(aglio, "Aglio");
		LanguageRegistry.addName(basilico, "Basilico");
		LanguageRegistry.addName(prezzemolo, "Prezzemolo");
		LanguageRegistry.addName(pomodoro, "Pomodoro");
		LanguageRegistry.addName(ariosto, "Spezie");
		
		LanguageRegistry.addName(sale, "Sale");
		LanguageRegistry.addName(olio_oliva, "Olio d'oliva");
		LanguageRegistry.addName(sugo_pomodoro, "Sugo di pomodoro");
		
		LanguageRegistry.addName(riso, "Riso");
		
		LanguageRegistry.addName(nutella, "Nutella®");
		LanguageRegistry.addName(shortbread_nc, "Shortbread crudi");
		LanguageRegistry.addName(shortbread, "Shortbread (Scozia)");
		
		LanguageRegistry.addName(tiramisu, "Tiramisù");
		LanguageRegistry.addName(cacaoTritato, "Polvere di cacao");
		
		LanguageRegistry.addName(conoVuoto, "Cono gelato");
		LanguageRegistry.addName(conoCioccolato, "Cono gelato cioccolato");
		//LanguageRegistry.addName(conoPistacchio, "Cono gelato pistacchio");
		LanguageRegistry.addName(conoStracciatella, "Cono gelato stracciatella");
		LanguageRegistry.addName(conoFiordilatte, "Cono gelato fiordilatte");
		LanguageRegistry.addName(conoCostoso, "Cono gelato per ricchi sfondati");
		
		LanguageRegistry.addName(cioccolato, "Cioccolato");
		
		LanguageRegistry.addName(vaschettaVuota, "Vaschetta vuota");
		LanguageRegistry.addName(gelatoBase, "Base per gelato");
		LanguageRegistry.addName(gelatoCioccolato, "Gelato cioccolato");
		//LanguageRegistry.addName(gelatoPistacchio, "Gelato pistacchio");
		LanguageRegistry.addName(gelatoStracciatella, "Gelato stracciatella");
		LanguageRegistry.addName(gelatoFiordilatte, "Gelato fiordilatte");
		LanguageRegistry.addName(gelatoCostoso, "Gelato per ricchi sfondati");
		
		LanguageRegistry.addName(farina_00, "Farina 00");
		LanguageRegistry.addName(farina_int, "Farina integrale");
		
		LanguageRegistry.addName(lievito, "Lievito fresco");
		
		LanguageRegistry.addName(spaghetti, "Spaghetti");
		//LanguageRegistry.addName(ravioli, "Ravioli");
		LanguageRegistry.addName(pane_nero_nc, "Pane nero crudo");
		LanguageRegistry.addName(pane_nero, "Pane nero (Alto Adige)");
		
		
		LanguageRegistry.addName(burro, "Burro");
		LanguageRegistry.addName(parmigiano, "Parmigiano");
		LanguageRegistry.addName(parmigiano_gratt, "Parmigiano grattuggiato");
		LanguageRegistry.addName(mozzarella, "Mozzarella");
		
		LanguageRegistry.addName(pentola_olio, "Pentola d'olio");
		LanguageRegistry.addName(pentola_olio_bollente, "Pentola d'olio bollente");
		
		LanguageRegistry.addName(cocacola, "Coca-Cola®");
				
		LanguageRegistry.addName(pomodoroSemi, "Semi di pomodoro");
		LanguageRegistry.addName(basilicoSemi, "Semi di basilico");
		LanguageRegistry.addName(prezzemoloSemi, "Semi di prezzemolo");
		LanguageRegistry.addName(carciofoSemi, "Semi di carciofo");
		LanguageRegistry.addName(carciofo, "Carciofo");
		
		LanguageRegistry.addName(indicaSemi, "Semi d'indica");
		LanguageRegistry.addName(sativaSemi, "Semi di sativa");
		LanguageRegistry.addName(indicaFoglia, "Foglia d'indica");
		LanguageRegistry.addName(sativaFoglia, "Foglia di sativa");
		LanguageRegistry.addName(indicaCannone, "Cannone Indica");
		LanguageRegistry.addName(sativaCannone, "Cannone Sativa");
		
		LanguageRegistry.addName(tonno, "Tonno");
		LanguageRegistry.addName(tonnoPinneGialle, "Tonno pinne gialle");
		LanguageRegistry.addName(orata, "Orata");
		LanguageRegistry.addName(orataCotta, "Orata alla griglia");
		
		LanguageRegistry.addName(tonnoScatola, "Tonno in scatola");
		LanguageRegistry.addName(cornedBeef, "Corned beef (USA)");
	}
}

