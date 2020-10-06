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
		
		//Aglio
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.spicchio_aglio, 4), new ItemStack(Items.aglio));
		
		//grassi e condimenti
		ic2.api.Ic2Recipes.addExtractorRecipe(new ItemStack(Item.bucketMilk), new ItemStack(Items.burro));
		GameRegistry.addSmelting(Item.bucketWater.itemID, new ItemStack(Items.sale), 0.1f);
		
		GameRegistry.addRecipe(new ItemStack(Items.parmigiano, 2), new Object[] { "   ", "###", " # ", '#', Item.bucketMilk});
		GameRegistry.addRecipe(new ItemStack(Items.mozzarella, 2), new Object[] { "   ", " ##", " ##", '#', Item.bucketMilk});
		ic2.api.Ic2Recipes.addMaceratorRecipe(new ItemStack(Items.parmigiano), new ItemStack(Items.parmigiano_gratt));
		
		//farine
		ic2.api.Ic2Recipes.addExtractorRecipe(new ItemStack(Item.wheat), new ItemStack(Items.farina_int));
		ic2.api.Ic2Recipes.addMaceratorRecipe(new ItemStack(Items.farina_int), new ItemStack(Items.farina_00));
		ic2.api.Ic2Recipes.addMaceratorRecipe(new ItemStack(Item.wheat), new ItemStack(Item.axeDiamond));
		
		//lieviti
		GameRegistry.addRecipe(new ItemStack(Items.lievito, 4), new Object[] { "#B#", "#S#", "###", '#', Item.wheat, 'B', Item.bucketWater, 'S', Item.sugar});
		
		//pane
		GameRegistry.addRecipe(new ItemStack(Items.pane_nero_nc, 4), new Object[] { "FSF", "FLF", "ABT", 'F', Items.farina_int, 'S', Item.pumpkinSeeds, 'L', Items.lievito, 'A', Items.sale, 'B', Item.bucketWater, 'T', Item.bucketMilk});
		GameRegistry.addSmelting(Items.pane_nero_nc.itemID, new ItemStack(Items.pane_nero, 1), 0.15f);
		
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
		
		//pizza
		GameRegistry.addRecipe(new ItemStack(Items.base_pizza, 1), new Object[] { "FSF", "FLF", "FBF", 'F', Items.farina_00, 'S', Items.sale, 'L', Items.lievito, 'B', Item.bucketWater});
		GameRegistry.addRecipe(new ItemStack(Items.pizza_margherita_nc, 1), new Object[] { "PMP", "PBP", "PMP", 'B', Items.base_pizza, 'M', Items.mozzarella, 'P', Items.pomodoro});
		GameRegistry.addRecipe(new ItemStack(Items.pizza_marinara_nc, 1), new Object[] { "PAP", "SBS", "PAP", 'B', Items.base_pizza, 'S', Items.basilico, 'A', Items.spicchio_aglio, 'P', Items.pomodoro});
		GameRegistry.addSmelting(Items.pizza_margherita_nc.itemID, new ItemStack(Items.pizza_margherita), 0.15f);
		GameRegistry.addSmelting(Items.pizza_marinara_nc.itemID, new ItemStack(Items.pizza_marinara), 0.15f);
		
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
		
				
}
	}
