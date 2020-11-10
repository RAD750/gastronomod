package com.rgbcraft.gastronomod.main.items;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeeds;

import com.rgbcraft.gastronomod.main.agri.BlockPomodoro;
import com.rgbcraft.gastronomod.main.items.roba.ItemIndica;
import com.rgbcraft.gastronomod.main.items.roba.ItemSativa;
import com.rgbcraft.gastronomod.main.agri.AgriBlocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items {
		
	//pentolame
	public static Item pentola, pentola_sporca, pentola_acqua, pentola_bollente, pentola_spaghetti;
	public static Item pentolino, pentolino_sporco, pentolino_sugo, pentolino_sugo_cotto;
	public static Item bottiglia;
	
	//piatti
	public static Item piatto, piatto_sporco, piatto_spaghetti, piatto_spaghetti_aglio_olio, piatto_spaghetti_sugo;
	public static Item barattolo, barattolo_sporco;
	
	public static Item basilicoSemi, aglioSemi, prezzemoloSemi, pomodoroSemi;
	public static Item basilico, spicchio_aglio, aglio, prezzemolo, ariosto, pomodoro;
	
	//sughi
	public static Item sugo_pomodoro;
	
	//grassi e condimenti
	public static Item burro, olio_oliva, sale;

	//pasta e riso
	public static Item spaghetti, mozzarella, parmigiano, parmigiano_gratt;
	
	public static Item base_pizza, pizza_margherita, pizza_marinara, pizza_margherita_nc, pizza_marinara_nc;
	
	//farine
	public static Item farina_int, farina_00, lievito, pane_nero, pane_nero_nc;
	
	//dolci
	public static Item shortbread_nc, shortbread, nutella, tiramisu, gelatoBase, cioccolato;
	
	public static Item bogusCibo;
	
	public static Item cocacola;
	
	public static Item conoVuoto, conoCioccolato, conoPistacchio, conoStracciatella, conoFiordilatte, conoCostoso;
	public static Item vaschettaVuota, gelatoCioccolato, gelatoPistacchio, gelatoStracciatella, gelatoFiordilatte, gelatoCostoso, cacaoTritato;
	
	//MARIA
	public static Item sativaSemi, sativaFoglia, indicaSemi, indicaFoglia;
	public static Item sativaCannone, indicaCannone;

	//texture file
	
	public static final String texture = "/com/rgbcraft/gastronomod/textures/items.png";
	public static final String textureAgri = "/com/rgbcraft/gastronomod/textures/agri.png";
		
	public static void InizializzaItem() {
		

	//a_CentraleTermica = new Item(24301).setIconIndex(0).setItemName("a_CentraleTermica").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	// new ItemFood (ID, mezziCosciotti, saturation, preferito_dai_lupi)
	//ProtoFood = new ItemFood(25100, 1, 0.5f, false).setItemName("ProtoFood").setCreativeTab(CreativeTabs.tabFood);
		
		bogusCibo = new ItemFood(10000, 1, 1.5f, false).setAlwaysEdible().setPotionEffect(17, 2, 255, 100.0f).setItemName("bogusCibo").setCreativeTab(CreativeTabs.tabBrewing);
		

		
		//dolci
		
		
		//farine
		farina_int = new Item(10010).setIconIndex(145).setItemName("farina_int").setTextureFile(texture).setCreativeTab(CreativeTabs.tabFood);
		farina_00 = new Item(10011).setIconIndex(144).setItemName("farina_00").setTextureFile(texture).setCreativeTab(CreativeTabs.tabFood);
		lievito = new Item(10012).setIconIndex(146).setItemName("lievito").setTextureFile(texture).setCreativeTab(CreativeTabs.tabFood).setMaxStackSize(16);
		
		spaghetti = new Item(10020).setIconIndex(160).setItemName("spaghetti").setTextureFile(texture).setCreativeTab(CreativeTabs.tabFood).setMaxStackSize(32);
		pane_nero_nc = new Item(10021).setItemName("pane_nero_nc").setTextureFile(texture).setCreativeTab(CreativeTabs.tabFood).setIconIndex(54).setMaxStackSize(16);
		pane_nero = new ItemFood(10022, 6, 1.5f, true).setPotionEffect(5, 180, 5, 100.0f).setItemName("pane_nero").setTextureFile(texture).setCreativeTab(CreativeTabs.tabFood).setIconIndex(55).setMaxStackSize(16);
		
		
		//dolci
			
		nutella = new ItemBarattolo(10030, 20).setPotionEffect(20, 5, 3, 100.0f).setIconIndex(128).setTextureFile(texture).setItemName("nutella").setCreativeTab(CreativeTabs.tabFood);
		shortbread_nc = new Item(10031).setIconIndex(129).setItemName("shortbread_nc").setTextureFile(texture).setCreativeTab(CreativeTabs.tabFood).setMaxStackSize(24);
		shortbread = new ItemFood(10032, 2, 1.0f, false).setIconIndex(131).setItemName("shortbread").setTextureFile(texture).setCreativeTab(CreativeTabs.tabFood).setMaxStackSize(24);
	    tiramisu = new ItemFood(10033, 4, 1.0f, false).setIconIndex(130).setItemName("tiramisu").setTextureFile(texture).setCreativeTab(CreativeTabs.tabFood).setMaxStackSize(1);
	    cioccolato = new ItemFood(10039, 6, 1.5f, true).setPotionEffect(5, 180, 5, 100.0f).setItemName("cioccolato").setTextureFile(texture).setCreativeTab(CreativeTabs.tabFood).setIconIndex(132).setMaxStackSize(16);
	    cacaoTritato = new Item(10013).setIconIndex(133).setItemName("cacaoTriato").setTextureFile(texture).setCreativeTab(CreativeTabs.tabFood);
	    
	    conoVuoto = new Item(10140).setIconIndex(224).setItemName("conoVuoto").setTextureFile(texture).setCreativeTab(CreativeTabs.tabMisc);
	    conoCioccolato = new ItemFood(10034, 4, 1.5f, true).setAlwaysEdible().setPotionEffect(5, 120, 5, 90.0f).setItemName("conoCioccolato").setTextureFile(texture).setCreativeTab(CreativeTabs.tabFood).setIconIndex(225).setMaxStackSize(3);
	    //conoPistacchio = new ItemFood(10035, 4, 1.5f, true).setAlwaysEdible().setPotionEffect(5, 120, 5, 90.0f).setItemName("conoPistacchio").setTextureFile(texture).setCreativeTab(CreativeTabs.tabFood).setIconIndex(226).setMaxStackSize(3);
	    conoStracciatella = new ItemFood(10036, 4, 1.5f, true).setAlwaysEdible().setPotionEffect(5, 120, 5, 90.0f).setItemName("conoStracciatella").setTextureFile(texture).setCreativeTab(CreativeTabs.tabFood).setIconIndex(227).setMaxStackSize(3);
	    conoFiordilatte = new ItemFood(10037, 4, 1.5f, true).setAlwaysEdible().setPotionEffect(5, 120, 5, 90.0f).setItemName("conoFiordilatte").setTextureFile(texture).setCreativeTab(CreativeTabs.tabFood).setIconIndex(228).setMaxStackSize(3);
	    conoCostoso = new ItemFood(10038, 6, 1.5f, true).setAlwaysEdible().setPotionEffect(5, 1000, 5, 100.0f).setItemName("conoCostoso").setTextureFile(texture).setCreativeTab(CreativeTabs.tabFood).setIconIndex(229).setMaxStackSize(3);
	    
		//piatti, barattori, pentole, pentolini vuoti
		pentola = new Item(10040).setItemName("pentola").setCreativeTab(CreativeTabs.tabMisc).setTextureFile(texture).setIconIndex(0).setMaxStackSize(4);
		pentola_sporca = new Item(10041).setItemName("pentola_sporca").setCreativeTab(CreativeTabs.tabMisc).setTextureFile(texture).setIconIndex(1).setMaxStackSize(4);
		pentolino = new Item(10042).setItemName("pentolino").setCreativeTab(CreativeTabs.tabMisc).setTextureFile(texture).setIconIndex(2).setMaxStackSize(4);
		pentolino_sporco = new Item(10043).setItemName("pentolino_sporco").setCreativeTab(CreativeTabs.tabMisc).setTextureFile(texture).setIconIndex(3).setMaxStackSize(4);
	    piatto = new Item(10044).setItemName("piatto_vuoto").setCreativeTab(CreativeTabs.tabMisc).setTextureFile(texture).setIconIndex(4).setMaxStackSize(16);
	    piatto_sporco = new Item(10045).setItemName("piatto_sporco").setCreativeTab(CreativeTabs.tabMisc).setTextureFile(texture).setIconIndex(5).setMaxStackSize(16);
	    barattolo = new Item(10046).setItemName("barattolo").setCreativeTab(CreativeTabs.tabMisc).setTextureFile(texture).setIconIndex(6).setMaxStackSize(4);
	    barattolo_sporco = new Item(10047).setItemName("barattolo_sporco").setCreativeTab(CreativeTabs.tabMisc).setTextureFile(texture).setIconIndex(7).setMaxStackSize(4);
	    bottiglia = new Item(10048).setItemName("bottiglia").setCreativeTab(CreativeTabs.tabMisc).setTextureFile(texture).setIconIndex(8).setMaxStackSize(6);
		
	    mozzarella = new ItemFood(10050, 6, 1.0f, false).setItemName("mozzarella").setIconIndex(179).setCreativeTab(CreativeTabs.tabFood).setTextureFile(texture).setMaxStackSize(8);
	    parmigiano = new ItemFood(10051, 4, 1.0f, false).setItemName("parmigiano").setIconIndex(177).setCreativeTab(CreativeTabs.tabFood).setTextureFile(texture).setMaxStackSize(8);
	    parmigiano_gratt = new Item(10052).setItemName("parmigiano_gratt").setIconIndex(178).setCreativeTab(CreativeTabs.tabFood).setTextureFile(texture).setMaxStackSize(32);
	    
	    //pentole con roba da cuocere
	    pentola_acqua = new Item(10060).setItemName("pentola_acqua").setCreativeTab(CreativeTabs.tabMisc).setTextureFile(texture).setIconIndex(64).setMaxStackSize(1);
	    pentola_bollente = new Item(10061).setItemName("pentola_bollente").setCreativeTab(CreativeTabs.tabMisc).setTextureFile(texture).setIconIndex(65).setMaxStackSize(1);
	    pentola_spaghetti = new Item(10062).setItemName("pentola_spaghetti").setCreativeTab(CreativeTabs.tabFood).setTextureFile(texture).setIconIndex(66).setContainerItem(pentola).setMaxStackSize(1);
	    pentolino_sugo = new Item(10063).setItemName("pentolino_sugo").setCreativeTab(CreativeTabs.tabFood).setTextureFile(texture).setIconIndex(49).setMaxStackSize(1);
	    pentolino_sugo_cotto = new Item(10064).setItemName("pentolino_sugo_cotto").setCreativeTab(CreativeTabs.tabFood).setTextureFile(texture).setIconIndex(53).setContainerItem(pentolino).setMaxStackSize(1);
	    
	    //prodotti semilavorati
	    base_pizza = new Item(10070).setItemName("base_pizza").setCreativeTab(CreativeTabs.tabFood).setTextureFile(texture).setIconIndex(48).setMaxStackSize(4);
	    spicchio_aglio = new ItemFood(10071, 1, 0.5f, false).setItemName("spicchio_aglio").setCreativeTab(CreativeTabs.tabFood).setTextureFile(texture).setIconIndex(50);
	    
	    pizza_margherita_nc = new Item(10072).setCreativeTab(CreativeTabs.tabFood).setItemName("pizza_margherita_nc").setTextureFile(texture).setIconIndex(51).setMaxStackSize(1);
	    pizza_marinara_nc = new Item(10073).setCreativeTab(CreativeTabs.tabFood).setItemName("pizza_marinara_nc").setTextureFile(texture).setIconIndex(52).setMaxStackSize(1);
	    
	    //piatti finiti
	    pizza_margherita = new ItemFood(10080, 16, 1.5f, false).setCreativeTab(CreativeTabs.tabFood).setItemName("pizza_margherita").setTextureFile(texture).setIconIndex(16).setMaxStackSize(1);
	    pizza_marinara = new ItemFood(10081, 12, 1.5f, false).setCreativeTab(CreativeTabs.tabFood).setItemName("pizza_marinara").setTextureFile(texture).setIconIndex(17).setMaxStackSize(1);
	    
	    
		//piatti finiti (il piatto viene restituito)
	    piatto_spaghetti = new ItemPiatto(10082, 3).setItemName("piatto_spaghetti").setCreativeTab(CreativeTabs.tabFood).setTextureFile(texture).setIconIndex(18);
	    piatto_spaghetti_sugo = new ItemPiatto(10083, 10).setItemName("piatto_spaghetti_sugo").setCreativeTab(CreativeTabs.tabFood).setTextureFile(texture).setIconIndex(19);
	    piatto_spaghetti_aglio_olio = new ItemPiatto(10084, 9).setItemName("piatto_spaghetti_aglio_olio").setCreativeTab(CreativeTabs.tabFood).setTextureFile(texture).setIconIndex(20);
	    
	    pomodoroSemi = new ItemSeeds(10100, AgriBlocks.BlockPomodoro.blockID, Block.tilledField.blockID).setIconIndex(20).setItemName("itemPomodoroSeeds").setCreativeTab(CreativeTabs.tabFood).setTextureFile(textureAgri);
	    basilicoSemi = new ItemSeeds(10101, AgriBlocks.BlockBasilico.blockID, Block.tilledField.blockID).setIconIndex(4).setItemName("itemBasilicoSeeds").setCreativeTab(CreativeTabs.tabFood).setTextureFile(textureAgri);
	    prezzemoloSemi = new ItemSeeds(10102, AgriBlocks.BlockPrezzemolo.blockID, Block.tilledField.blockID).setIconIndex(84).setItemName("itemPrezzemoloSeeds").setCreativeTab(CreativeTabs.tabFood).setTextureFile(textureAgri);

	    //MARIA GIOVANNA
	    
	    indicaSemi = new ItemSeeds(10110, AgriBlocks.BlockIndica.blockID, Block.tilledField.blockID).setIconIndex(36).setItemName("indicaSemi").setCreativeTab(CreativeTabs.tabBrewing).setTextureFile(textureAgri);
	    sativaSemi = new ItemSeeds(10111, AgriBlocks.BlockSativa.blockID, Block.tilledField.blockID).setIconIndex(52).setItemName("sativaSemi").setCreativeTab(CreativeTabs.tabBrewing).setTextureFile(textureAgri);
	    
	    indicaFoglia = new Item(10115).setItemName("indicaFoglia").setCreativeTab(CreativeTabs.tabBrewing).setTextureFile(texture).setIconIndex(209);
	    sativaFoglia = new Item(10116).setItemName("sativaFoglia").setCreativeTab(CreativeTabs.tabBrewing).setTextureFile(texture).setIconIndex(210);
	    
	    indicaCannone = new ItemIndica(10120, 1).setItemName("indicaCannone");
	    sativaCannone = new ItemSativa(10121, 1).setItemName("sativaCannone");
	    
	    //GELATI
	    vaschettaVuota = new Item(10130).setItemName("vaschettaVuota").setCreativeTab(CreativeTabs.tabMisc).setTextureFile(texture).setIconIndex(9);
	    gelatoBase = new Item(10131).setItemName("gelatoBase").setCreativeTab(CreativeTabs.tabMisc).setTextureFile(texture).setIconIndex(240);
	    gelatoCioccolato = new Item(10132).setItemName("gelatoCioccolato").setCreativeTab(CreativeTabs.tabMisc).setTextureFile(texture).setIconIndex(241);
	    //gelatoPistacchio = new Item(10133).setItemName("gelatoPistacchio").setCreativeTab(CreativeTabs.tabMisc).setTextureFile(texture).setIconIndex(242);
	    gelatoStracciatella= new Item(10134).setItemName("gelatoStracciatella").setCreativeTab(CreativeTabs.tabMisc).setTextureFile(texture).setIconIndex(243);
	    gelatoFiordilatte= new Item(10135).setItemName("gelatoFiordilatte").setCreativeTab(CreativeTabs.tabMisc).setTextureFile(texture).setIconIndex(244);
	    gelatoCostoso= new Item(10136).setItemName("gelatoFiordilatte").setCreativeTab(CreativeTabs.tabMisc).setTextureFile(texture).setIconIndex(245);
	    
	    
	    //verdura, frutta
	    aglio = new ItemSeeds(10090, AgriBlocks.BlockAglio.blockID, Block.tilledField.blockID).setItemName("aglio").setCreativeTab(CreativeTabs.tabFood).setTextureFile(texture).setIconIndex(80);
	    basilico = new Item(10091).setItemName("basilico").setCreativeTab(CreativeTabs.tabFood).setTextureFile(texture).setIconIndex(81);
	    prezzemolo = new Item(10092).setItemName("prezzemolo").setCreativeTab(CreativeTabs.tabFood).setTextureFile(textureAgri).setIconIndex(85);
	    pomodoro = new ItemFood(10093, 5, 1.5f, false).setItemName("pomodoro").setCreativeTab(CreativeTabs.tabFood).setTextureFile(texture).setIconIndex(83);
	    ariosto = new Item(10094).setItemName("ariosto").setCreativeTab(CreativeTabs.tabFood).setTextureFile(texture).setIconIndex(84);
	    
		//grassi e condimenti
		burro = new ItemFood(10001, 3, 1.5f, false).setPotionEffect(9, 60, 10, 100.0f).setIconIndex(176).setItemName("burro").setTextureFile(texture).setCreativeTab(CreativeTabs.tabFood);
		sale = new Item(10002).setIconIndex(112).setItemName("sale").setTextureFile(texture).setCreativeTab(CreativeTabs.tabFood);
		olio_oliva = new Item(10003).setIconIndex(113).setItemName("olio_oliva").setTextureFile(texture).setCreativeTab(CreativeTabs.tabFood).setContainerItem(Items.barattolo_sporco);
		sugo_pomodoro = new Item(10004).setIconIndex(114).setItemName("sugo_pomodoro").setTextureFile(texture).setCreativeTab(CreativeTabs.tabFood).setContainerItem(Items.barattolo_sporco);
		
		cocacola = new ItemBottigliaCocaCola(10005, 3, 1.5f, false).setPotionEffect(3, 60, 10, 100.0f).setIconIndex(192).setItemName("cocacola").setTextureFile(texture).setCreativeTab(CreativeTabs.tabFood).setContainerItem(Items.bottiglia);
		
	}
	
	
	 
	
	
	public static void RegistraLingua() {
	
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
		
		LanguageRegistry.addName(pizza_margherita_nc, "Pizza margherita (cruda)");
		LanguageRegistry.addName(pizza_marinara_nc, "Pizza marinara (cruda)");
		
		LanguageRegistry.addName(piatto_spaghetti, "Spaghetti in bianco");
		LanguageRegistry.addName(piatto_spaghetti_sugo, "Spaghetti al pomodoro");
		LanguageRegistry.addName(piatto_spaghetti_aglio_olio, "Spaghetti aglio e olio");
		
		LanguageRegistry.addName(base_pizza, "Base per pizza");
		LanguageRegistry.addName(pentolino_sugo, "Pentolino con sugo di pomodoro");
		LanguageRegistry.addName(pentolino_sugo_cotto, "Pentolino con sugo di pomodoro cotto");
		LanguageRegistry.addName(spicchio_aglio, "Spicchio d'aglio");
		
		LanguageRegistry.addName(pentola_acqua, "Pentola con acqua");
		LanguageRegistry.addName(pentola_bollente, "Pentola con acqua bollente");
		LanguageRegistry.addName(pentola_spaghetti, "Pentola con acqua bollente e spaghetti");
		
		LanguageRegistry.addName(aglio, "Aglio");
		LanguageRegistry.addName(basilico, "Basilico");
		LanguageRegistry.addName(prezzemolo, "Prezzemolo");
		LanguageRegistry.addName(pomodoro, "Pomodoro");
		LanguageRegistry.addName(ariosto, "Spezie");
		
		LanguageRegistry.addName(sale, "Sale");
		LanguageRegistry.addName(olio_oliva, "Olio d'oliva");
		LanguageRegistry.addName(sugo_pomodoro, "Sugo di pomodoro");
		
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
		LanguageRegistry.addName(pane_nero_nc, "Pane nero crudo");
		LanguageRegistry.addName(pane_nero, "Pane nero (Alto Adige)");
		
		
		LanguageRegistry.addName(burro, "Burro");
		LanguageRegistry.addName(parmigiano, "Parmigiano");
		LanguageRegistry.addName(parmigiano_gratt, "Parmigiano grattuggiato");
		LanguageRegistry.addName(mozzarella, "Mozzarella");
		
		LanguageRegistry.addName(cocacola, "Coca-Cola®");
				
		LanguageRegistry.addName(pomodoroSemi, "Semi di pomodoro");
		LanguageRegistry.addName(basilicoSemi, "Semi di basilico");
		LanguageRegistry.addName(prezzemoloSemi, "Semi di prezzemolo");
		
		LanguageRegistry.addName(indicaSemi, "Semi d'indica");
		LanguageRegistry.addName(sativaSemi, "Semi di sativa");
		LanguageRegistry.addName(indicaFoglia, "Foglia d'indica");
		LanguageRegistry.addName(sativaFoglia, "Foglia di sativa");
		LanguageRegistry.addName(indicaCannone, "Cannone Indica");
		LanguageRegistry.addName(sativaCannone, "Cannone Sativa");
		
		
	}
}

