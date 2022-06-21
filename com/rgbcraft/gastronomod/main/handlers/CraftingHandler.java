package com.rgbcraft.gastronomod.main.handlers;

import com.rgbcraft.gastronomod.main.items.Items;
import cpw.mods.fml.common.registry.GameRegistry;
import ic2.api.Ic2Recipes;
import net.minecraftforge.common.MinecraftForge;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CraftingHandler {
	public static void AggiungiCrafting() {
		/*
		GameRegistry.addRecipe(new ItemStack(Items.gray_tile_raw, 9),
			new Object[] { "###", "###", "###", '#', Item.clay});
		GameRegistry.addSmelting(Items.white_small_tile_raw.itemID, new ItemStack(Blocks.white_small_tile), 0.15f);
		GameRegistry.addShapelessRecipe(new ItemStack(Item.clay, 4), new Object[]{new ItemStack(Block.blockClay)});
		 */

		//GameRegistry.addShapelessRecipe(new ItemStack(Items.ProtoFood, 4), new Object[] {ic2.api.Items.getItem("rubber")});

		//Piatti da sporchi a puliti

		GameRegistry.addShapelessRecipe(new ItemStack(Items.pentola), new Object[] {new ItemStack(Items.pentola_sporca), new ItemStack(Item.bucketWater)});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.pentolino), new Object[] {new ItemStack(Items.pentolino_sporco), new ItemStack(Item.bucketWater)});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.barattolo), new Object[] {new ItemStack(Items.barattolo_sporco), new ItemStack(Item.bucketWater)});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.piatto), new Object[] {new ItemStack(Items.piatto_sporco), new ItemStack(Item.bucketWater)});

		GameRegistry.addShapedRecipe(new ItemStack(Items.milkCarton, 64), new Object[] { " # ", "#R#", "###", '#', Item.paper, 'R', ic2.api.Items.getItem("rubber")});

		//GELATO

		GameRegistry.addShapedRecipe(new ItemStack(Items.vaschettaVuota), new Object[] { "   ", "# #", "###", '#', Item.paper});
		GameRegistry.addShapedRecipe(new ItemStack(Items.gelatoCostoso), new Object[] { "#M#", "#M#", " G ", '#', Item.netherStar, 'M', Item.bucketMilk, 'G', Item.ingotGold});
		GregtechHandler.addVacuumFreezerRecipe(new ItemStack(Items.gelatoCostoso), new ItemStack(Items.conoCostoso), 1400);
		GregtechHandler.addVacuumFreezerRecipe(new ItemStack(Items.milkCarton), new ItemStack(Items.gelatoBase), 400);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.gelatoCioccolato), new Object[] {new ItemStack(Items.gelatoBase), new ItemStack(Items.cioccolato)});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.gelatoStracciatella), new Object[] {new ItemStack(Item.bucketMilk), new ItemStack(Items.gelatoBase), new ItemStack(Items.cioccolato)});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.gelatoFiordilatte), new Object[] {new ItemStack(Item.bucketMilk), new ItemStack(Items.gelatoBase)});

		GregtechHandler.addVacuumFreezerRecipe(new ItemStack(Items.gelatoCioccolato), new ItemStack(Items.conoCioccolato), 60);
		GregtechHandler.addVacuumFreezerRecipe(new ItemStack(Items.gelatoStracciatella), new ItemStack(Items.conoStracciatella), 60);
		GregtechHandler.addVacuumFreezerRecipe(new ItemStack(Items.gelatoFiordilatte), new ItemStack(Items.conoFiordilatte), 60);


		ic2.api.Ic2Recipes.addMaceratorRecipe(new ItemStack(Item.dyePowder, 1, 3), new ItemStack(Items.cacaoTritato));
		GameRegistry.addSmelting(Items.cacaoTritato.itemID, new ItemStack(Items.cioccolato), 0.15f);


		//MARIA
		GameRegistry.addRecipe(new ItemStack(Items.indicaCannone, 1), new Object[] { "###", "#F#", "###", '#', Item.paper, 'F', Items.indicaFoglia});
		GameRegistry.addRecipe(new ItemStack(Items.sativaCannone, 1), new Object[] { "###", "#F#", "###", '#', Item.paper, 'F', Items.sativaFoglia});

		//Aglio

		GameRegistry.addShapelessRecipe(new ItemStack(Items.spicchio_aglio, 4), new ItemStack(Items.aglio));

		//grassi e condimenti
		ic2.api.Ic2Recipes.addExtractorRecipe(new ItemStack(Item.bucketMilk), new ItemStack(Items.burro));
		GameRegistry.addSmelting(Item.bucketWater.itemID, new ItemStack(Items.sale), 0.1f);
		GameRegistry.addSmelting(ic2.api.Items.getItem("waterCell").itemID, new ItemStack(Items.sale), 0.1f);

		GameRegistry.addRecipe(new ItemStack(Items.parmigiano, 2), new Object[] { "   ", "###", " # ", '#', Item.bucketMilk});
		GameRegistry.addRecipe(new ItemStack(Items.mozzarella, 2), new Object[] { "   ", " ##", " ##", '#', Item.bucketMilk});
		ic2.api.Ic2Recipes.addMaceratorRecipe(new ItemStack(Items.parmigiano), new ItemStack(Items.parmigiano_gratt));

		//farine
		ic2.api.Ic2Recipes.addExtractorRecipe(new ItemStack(Item.wheat), new ItemStack(Items.farina_int));
		ic2.api.Ic2Recipes.addMaceratorRecipe(new ItemStack(Items.farina_int), new ItemStack(Items.farina_00));

		//lieviti
		GameRegistry.addRecipe(new ItemStack(Items.lievito, 4), new Object[] { "#B#", "#S#", "###", '#', Item.wheat, 'B', Item.bucketWater, 'S', Item.sugar});

		//pane
		GameRegistry.addRecipe(new ItemStack(Items.pane_nero_nc, 4), new Object[] { "FSF", "FLF", "ABT", 'F', Items.farina_int, 'S', Item.pumpkinSeeds, 'L', Items.lievito, 'A', Items.sale, 'B', Item.bucketWater, 'T', Item.bucketMilk});
		GameRegistry.addSmelting(Items.pane_nero_nc.itemID, new ItemStack(Items.pane_nero, 1), 0.15f);

		ic2.api.Ic2Recipes.addMaceratorRecipe(new ItemStack(Item.bread, 1), new ItemStack(Items.pangrattato, 1));

		//shortbread
		GameRegistry.addRecipe(new ItemStack(Items.shortbread_nc, 8), new Object[] { "#B#", "   ", "#B#", '#', Items.farina_00, 'B', Items.burro});
		GameRegistry.addSmelting(Items.shortbread_nc.itemID, new ItemStack(Items.shortbread), 0.15f);

		//tiramisù
		GameRegistry.addRecipe(new ItemStack(Items.tiramisu, 1), new Object[] { "CZC", "FSF", "CLC", 'C', new ItemStack(Item.dyePowder, 1, 3), 'Z', Item.sugar, 'F', Items.farina_00, 'S', Items.shortbread, 'L', Item.bucketMilk});

		//nutella
		GameRegistry.addRecipe(new ItemStack(Items.nutella, 1), new Object[] {"CBC", "CLC", " O ", 'C', new ItemStack(Item.dyePowder, 1, 3), 'B', Items.burro, 'L', Item.bucketMilk, 'O', Items.barattolo});

		//pasta
		GameRegistry.addRecipe(new ItemStack(Items.spaghetti, 4), new Object[] { "#E#", "#E#", "#E#", '#', Items.farina_00, 'E', Item.egg});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.pentola_acqua, 1), new Object[]{new ItemStack(Items.pentola), new ItemStack(Item.bucketWater)});
		GameRegistry.addSmelting(Items.pentola_acqua.itemID, new ItemStack(Items.pentola_bollente), 0.15f);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.pentola_spaghetti, 1), new Object[]{new ItemStack(Items.pentola_bollente), new ItemStack(Items.spaghetti)});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.piatto_spaghetti), new Object[] {new ItemStack(Items.pentola_spaghetti), new ItemStack(Items.piatto)});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.piatto_spaghetti_sugo), new Object[] {new ItemStack(Items.piatto_spaghetti), new ItemStack(Items.pentolino_sugo_cotto)});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.piatto_spaghetti_sugo), new Object[] {new ItemStack(Items.piatto_spaghetti), new ItemStack(Items.sugo_pomodoro)});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.piatto_spaghetti_aglio_olio), new Object[] {new ItemStack(Items.piatto_spaghetti), new ItemStack(Items.spicchio_aglio), new ItemStack(Items.prezzemolo), new ItemStack(Items.olio_oliva)});		

		ItemStack sixCells = ic2.api.Items.getItem("cell").copy();
		sixCells.stackSize = 6;

		GregtechHandler.addCannerRecipe(new ItemStack(Items.pentola), GregtechHandler.getGregTechItem(2, 6, 24), new ItemStack(Items.pentola_olio, 1), sixCells, 40, 1); 

		GameRegistry.addShapelessRecipe(new ItemStack(Items.pentola_olio, 1), new Object [] {new ItemStack(Items.pentola), new ItemStack(Items.olio_oliva)});
		GameRegistry.addSmelting(Items.pentola_olio.itemID, new ItemStack(Items.pentola_olio_bollente), 0.15f);

		GameRegistry.addShapelessRecipe(new ItemStack(Items.pentola_riso), new Object[] {new ItemStack(Items.pentola_bollente), new ItemStack(Items.riso)});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.piatto_riso), new Object [] {new ItemStack(Items.pentola_riso), new ItemStack(Items.piatto)});

		GameRegistry.addRecipe(new ItemStack(Items.arancino_crudo, 4), new Object[] { "BBR", "GMB", "RBR", 'B', Items.piatto_riso, 'R', Items.pangrattato, 'M', Item.porkRaw, 'G', Items.burro});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.arancino), new Object[] {new ItemStack(Items.pentola_olio_bollente), new ItemStack(Items.arancino_crudo)});
		GameRegistry.addRecipe(new ItemStack(Items.arancino, 8), new Object [] { "###", "###", "#P#", '#', Items.arancino_crudo, 'P', Items.pentola_olio_bollente});

		GregtechHandler.addCannerRecipe(new ItemStack(Items.arancino_crudo, 64), new ItemStack(Items.pentola_olio_bollente, 1), new ItemStack(Items.arancino, 64), new ItemStack(Items.pentola_sporca), 400, 24);


		//pizza
		GameRegistry.addRecipe(new ItemStack(Items.base_pizza, 1), new Object[] { "FSF", "FLF", "FBF", 'F', Items.farina_00, 'S', Items.sale, 'L', Items.lievito, 'B', Item.bucketWater});
		GameRegistry.addRecipe(new ItemStack(Items.pizza_margherita_nc, 1), new Object[] { "PMP", "PBP", "PMP", 'B', Items.base_pizza, 'M', Items.mozzarella, 'P', Items.pomodoro});
		GameRegistry.addRecipe(new ItemStack(Items.pizza_marinara_nc, 1), new Object[] { "PAP", "SBS", "PAP", 'B', Items.base_pizza, 'S', Items.basilico, 'A', Items.spicchio_aglio, 'P', Items.pomodoro});
		GameRegistry.addRecipe(new ItemStack(Items.pizza_capricciosa_nc, 1), new Object[] { "PFP", "SBS", "PMP", 'B', Items.base_pizza, 'S', Items.carciofo, 'F', Block.mushroomBrown, 'P', Items.pomodoro, 'M', Items.mozzarella});
		GameRegistry.addSmelting(Items.pizza_margherita_nc.itemID, new ItemStack(Items.pizza_margherita), 0.15f);
		GameRegistry.addSmelting(Items.pizza_marinara_nc.itemID, new ItemStack(Items.pizza_marinara), 0.15f);
		GameRegistry.addSmelting(Items.pizza_capricciosa_nc.itemID, new ItemStack(Items.pizza_capricciosa), 0.15f);

		//sugo
		GameRegistry.addRecipe(new ItemStack(Items.pentolino_sugo, 1), new Object[] { "PPP", "CLB", "   ", 'P', Items.pomodoro, 'C', Item.carrot, 'L', Items.pentolino, 'B', Items.basilico});
		GameRegistry.addSmelting(Items.pentolino_sugo.itemID, new ItemStack(Items.pentolino_sugo_cotto), 0.15f);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.sugo_pomodoro), new Object[] { new ItemStack(Items.pentolino_sugo_cotto), new ItemStack(Items.barattolo)});

		//pentolame
		GameRegistry.addRecipe(new ItemStack(Items.pentolino, 1), new Object[] { "   ", "###", "## ", '#', Item.ingotIron});
		GameRegistry.addRecipe(new ItemStack(Items.pentola, 1), new Object[] { " # ", "# #", "###", '#', Item.ingotIron});
		GameRegistry.addRecipe(new ItemStack(Items.piatto, 1), new Object[] { "   ", "# #", "###", '#', Item.clay});
		GameRegistry.addRecipe(new ItemStack(Items.barattolo, 1), new Object[] { " X ", "# #", "###", '#', Block.glass, 'X', Block.planks});
		GameRegistry.addRecipe(new ItemStack(Items.bottiglia, 1), new Object[] { " X ", " # ", " # ", '#', Block.glass, 'X', Block.planks});


		//cocacola

		GameRegistry.addRecipe(new ItemStack(Items.cocacola, 1), new Object[] {"WCW", "WZW", "WBA", 'A', new ItemStack(Item.dyePowder, 1, 3), 'W', Item.bucketWater, 'Z', Item.sugar, 'C', ic2.api.Items.getItem("scrap"), 'B', Items.bottiglia });

		//pesci

		GameRegistry.addSmelting(Items.orata.itemID, new ItemStack(Items.orataCotta), 0.15f);
		GregtechHandler.addCannerRecipe(new ItemStack(Items.tonno, 1), GregtechHandler.getGregTechItem(2, 1, 24), new ItemStack(Items.tonnoScatola, 4), null, 200, 3);
		GregtechHandler.addCannerRecipe(new ItemStack(Items.tonnoPinneGialle, 1), GregtechHandler.getGregTechItem(2, 1, 24), new ItemStack(Items.tonnoScatola, 6), null, 250, 3);

		//corned beef
		GregtechHandler.addCannerRecipe(new ItemStack(Item.beefCooked, 1), new ItemStack(Items.sale, 1), new ItemStack(Items.cornedBeef, 4), null, 200, 5);

		ItemStack carbonFibre = ic2.api.Items.getItem("carbonFiber").copy();
		ItemStack carbonPlate = ic2.api.Items.getItem("carbonPlate").copy();
		
		GameRegistry.addShapedRecipe(new ItemStack(Items.carbonFishingRod, 1), new Object[] { "  #", " #F", "# F", 'F', carbonFibre, '#', carbonPlate});
		
		//CAMPMERDA
		GameRegistry.addSmelting(CampmerdHandler.getCampMerdItem("CampRawBacon").itemID, new ItemStack(CampmerdHandler.getCampMerdItem("CampCookedBacon"), 1), 0.15f);
		GameRegistry.addSmelting(CampmerdHandler.getCampMerdItem("CampRawSausage").itemID, new ItemStack(CampmerdHandler.getCampMerdItem("CampCookedSausage"), 1), 0.15f);
		GameRegistry.addSmelting(CampmerdHandler.getCampMerdItem("CampRawScrambledEgg").itemID, new ItemStack(CampmerdHandler.getCampMerdItem("CampScrambledEgg"), 1), 0.15f);
		GameRegistry.addSmelting(CampmerdHandler.getCampMerdItem("CampRawFriedEgg").itemID, new ItemStack(CampmerdHandler.getCampMerdItem("CampFriedEgg"), 1), 0.15f);
		GameRegistry.addSmelting(CampmerdHandler.getCampMerdItem("CampRawHamburger").itemID, new ItemStack(CampmerdHandler.getCampMerdItem("CampCookedHamburger"), 1), 0.15f);
		GameRegistry.addSmelting(CampmerdHandler.getCampMerdItem("CampRawFishStew").itemID, new ItemStack(CampmerdHandler.getCampMerdItem("CampCookedFishStew"), 1), 0.15f);
		GameRegistry.addSmelting(CampmerdHandler.getCampMerdItem("CampRawPumpkinStew").itemID, new ItemStack(CampmerdHandler.getCampMerdItem("CampCookedPumpkinStew"), 1), 0.15f);
		GameRegistry.addSmelting(CampmerdHandler.getCampMerdItem("CampRawDeerStew").itemID, new ItemStack(CampmerdHandler.getCampMerdItem("CampCookedDeerStew"), 1), 0.15f);
		GameRegistry.addSmelting(CampmerdHandler.getCampMerdItem("CampRawBearStew").itemID, new ItemStack(CampmerdHandler.getCampMerdItem("CampCookedBearStew"), 1), 0.15f);
		GameRegistry.addSmelting(CampmerdHandler.getCampMerdItem("CampRawMinecraftStew").itemID, new ItemStack(CampmerdHandler.getCampMerdItem("CampCookedMinecraftStew"), 1), 0.15f);
		GameRegistry.addSmelting(CampmerdHandler.getCampMerdItem("CampRawRabbitStew").itemID, new ItemStack(CampmerdHandler.getCampMerdItem("CampCookedRabbitStew"), 1), 0.15f);
		GameRegistry.addSmelting(CampmerdHandler.getCampMerdItem("RawPumpkinSlice").itemID, new ItemStack(CampmerdHandler.getCampMerdItem("CookedPumpkinSlice"), 1), 0.15f);
		GameRegistry.addSmelting(CampmerdHandler.getCampMerdItem("CampBreadSlice").itemID, new ItemStack(CampmerdHandler.getCampMerdItem("CampToast"), 1), 0.15f);
		GameRegistry.addSmelting(CampmerdHandler.getCampMerdItem("CheeseSandwich").itemID, new ItemStack(CampmerdHandler.getCampMerdItem("CheeseToastie"), 1), 0.15f);
		GameRegistry.addSmelting(CampmerdHandler.getCampMerdItem("RawFrogSoup").itemID, new ItemStack(CampmerdHandler.getCampMerdItem("FrogSoup"), 1), 0.15f);
	}
}
