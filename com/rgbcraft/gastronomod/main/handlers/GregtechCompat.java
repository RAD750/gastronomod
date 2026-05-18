package com.rgbcraft.gastronomod.main.handlers;


import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class GregtechCompat {

	/**
	 * Gets an Item from my Addon. The Indizes are the same, as the ones at the items.png
	 * @param aIndex Index of my Item
	 * @param aAmount Amount of the Item in the returned Stack
	 * @return The ItemStack you ordered, if not then look at the Log.
	 */
	public static ItemStack getGregTechItem(int aIndex, int aAmount, int aMeta) {
		try {
			return (ItemStack)Class.forName("gregtechmod.GT_Mod").getMethod("getGregTechItem", int.class, int.class, int.class).invoke(null, aIndex, aAmount, aMeta);
		} catch (Exception e) {}
		return null;
	}

	/**
	 * Gets a Block from my Addon.
	 * @param aIndex Index of my Item:
	 * 0 Standardblock,
	 * 1 Machineblock,
	 * 2 Oreblock,
	 * 3 That glowing thing from my Lighthelmet.
	 * @param aAmount Amount of the Item in the returned Stack
	 * @param aMeta The Metavalue of the Block
	 * @return The ItemStack you ordered, if not then look at the Log.
	 */
	public static ItemStack getGregTechBlock(int aIndex, int aAmount, int aMeta) {
		try {
			return (ItemStack)Class.forName("gregtechmod.GT_Mod").getMethod("getGregTechBlock", int.class, int.class, int.class).invoke(null, aIndex, aAmount, aMeta);
		} catch (Exception e) {}
		return null;
	}


	/**
	 * Adds a CentrifugeRecipe
	 * @param aInput1 must be != null
	 * @param aCellInput this is for the needed Cells, > 0 for Tincellcount, < 0 for negative Fuelcancount, == 0 for nothing
	 * @param aOutput1 must be != null
	 * @param aOutput2 can be null
	 * @param aOutput3 can be null
	 * @param aOutput4 can be null
	 * @param aDuration must be > 0
	 */

	public static boolean addCentrifugeRecipe(ItemStack aInput1, int aCellInput, ItemStack aOutput1, ItemStack aOutput2, ItemStack aOutput3, ItemStack aOutput4, int aDuration) {
		try {
			Class.forName("gregtechmod.GT_Mod").getMethod("addCentrifugeRecipe", ItemStack.class, int.class, ItemStack.class, ItemStack.class, ItemStack.class, ItemStack.class, int.class).invoke(null, aInput1, aCellInput, aOutput1, aOutput2, aOutput3, aOutput4, aDuration);
			return true;
		} catch (Exception e) {}
		return false;
	}

	/**
	 * Adds a ElectrolyzerRecipe
	 * @param aInput1 must be != null
	 * @param aCellInput this is for the needed Cells, > 0 for Tincellcount, < 0 for negative Fuelcancount, == 0 for nothing
	 * @param aOutput1 must be != null
	 * @param aOutput2 can be null
	 * @param aOutput3 can be null
	 * @param aOutput4 can be null
	 * @param aDuration must be > 0
	 * @param aEUt should be > 0
	 */
	public static boolean addElectrolyzerRecipe(ItemStack aInput1, int aCellInput, ItemStack aOutput1, ItemStack aOutput2, ItemStack aOutput3, ItemStack aOutput4, int aDuration, int aEUt) {
		try {
			Class.forName("gregtechmod.GT_Mod").getMethod("addElectrolyzerRecipe", ItemStack.class, int.class, ItemStack.class, ItemStack.class, ItemStack.class, ItemStack.class, int.class, int.class).invoke(null, aInput1, aCellInput, aOutput1, aOutput2, aOutput3, aOutput4, aDuration, aEUt);
			return true;
		} catch (Exception e) {}
		return false;
	}

	/**
	 * Adds a Blast Furnace Recipe
	 * @param aInput1 must be != null
	 * @param aInput2 can be null
	 * @param aOutput1 must be != null
	 * @param aOutput2 can be null
	 * @param aDuration must be > 0
	 * @param aEUt should be > 0
	 * @param aLevel should be > 0 is the minimum Heat Level needed for this Recipe
	 */
	public static boolean addBlastRecipe(ItemStack aInput1, ItemStack aInput2, ItemStack aOutput1, ItemStack aOutput2, int aDuration, int aEUt, int aLevel) {
		try {
			Class.forName("gregtechmod.GT_Mod").getMethod("addBlastRecipe", ItemStack.class, ItemStack.class, ItemStack.class, ItemStack.class, int.class, int.class, int.class).invoke(null, aInput1, aInput2, aOutput1, aOutput2, aDuration, aEUt, aLevel);
			return true;
		} catch (Exception e) {}
		return false;
	}

	/**
	 * Adds an Implosion Compressor Recipe
	 * @param aInput1 must be != null
	 * @param aInput2 amount of ITNT, should be > 0
	 * @param aOutput1 must be != null
	 * @param aOutput2 can be null
	 */
	public static boolean addImplosionRecipe(ItemStack aInput1, int aInput2, ItemStack aOutput1, ItemStack aOutput2) {
		try {
			Class.forName("gregtechmod.GT_Mod").getMethod("addImplosionRecipe", ItemStack.class, int.class, ItemStack.class, ItemStack.class).invoke(null, aInput1, aInput2, aOutput1, aOutput2);
			return true;
		} catch (Exception e) {}
		return false;
	}

	/**
	 * Adds a GrinderRecipe
	 * @param aInput1 must be != null
	 * @param aCellInput this is for the needed Cells, > 0 for Tincell count, < 0 for negative Water Cell count, == 0 for nothing
	 * @param aOutput1 must be != null
	 * @param aOutput2 can be null
	 * @param aOutput3 can be null
	 * @param aOutput4 can be null
	 */
	public static boolean addGrinderRecipe(ItemStack aInput1, int aCellInput, ItemStack aOutput1, ItemStack aOutput2, ItemStack aOutput3, ItemStack aOutput4) {
		try {
			Class.forName("gregtechmod.GT_Mod").getMethod("addGrinderRecipe", ItemStack.class, int.class, ItemStack.class, ItemStack.class, ItemStack.class, ItemStack.class).invoke(null, aInput1, aCellInput, aOutput1, aOutput2, aOutput3, aOutput4);
			return true;
		} catch (Exception e) {}
		return false;
	}

	/**
	 * Adds a Canning Machine Recipe
	 * @param aInput1 must be != null
	 * @param aOutput1 must be != null
	 * @param aDuration must be > 0, 100 ticks is standard.
	 * @param aEUt should be > 0, 1 EU/t is standard.
	 */
	public static boolean addCannerRecipe(ItemStack aInput1, ItemStack aInput2, ItemStack aOutput1, ItemStack aOutput2, int aDuration, int aEUt) {
		try {
			Class.forName("gregtechmod.GT_Mod").getMethod("addCannerRecipe", ItemStack.class, ItemStack.class, ItemStack.class, ItemStack.class, int.class, int.class).invoke(null, aInput1, aInput2, aOutput1, aOutput2, aDuration, aEUt);
			return true;
		} catch (Exception e) {}
		return false;
	}

	/**
	 * Adds a BlockID to the List of the Minable Blocks by the Jackhammer
	 * @param aBlock
	 */
	public static boolean addJackHammerMinableBlock(Block aBlock) {
		try {
			Class.forName("gregtechmod.GT_Mod").getMethod("addJackHammerMinableBlock", Block.class).invoke(null, aBlock);
			return true;
		} catch (Exception e) {}
		return false;
	}

	/**
	 * Adds a Chemical Recipe
	 * @param aInput1 must be != null
	 * @param aInput2 must be != null
	 * @param aOutput1 must be != null
	 * @param aDuration must be > 0
	 */
	public static boolean addChemicalRecipe(ItemStack aInput1, ItemStack aInput2, ItemStack aOutput1, int aDuration) {
		try {
			Class.forName("gregtechmod.GT_Mod").getMethod("addChemicalRecipe", ItemStack.class, ItemStack.class, ItemStack.class, int.class).invoke(null, aInput1, aInput2, aOutput1, aDuration);
			return true;
		} catch (Exception e) {}
		return false;
	}

	/**
	 * Adds a Plate Bending Machine Recipe
	 * @param aInput1 must be != null
	 * @param aOutput1 must be != null
	 * @param aDuration must be > 0
	 * @param aEUt should be > 0
	 */
	public static boolean addBenderRecipe(ItemStack aInput1, ItemStack aOutput1, int aDuration, int aEUt) {
		try {
			Class.forName("gregtechmod.GT_Mod").getMethod("addBenderRecipe", ItemStack.class, ItemStack.class, int.class, int.class).invoke(null, aInput1, aOutput1, aDuration, aEUt);
			return true;
		} catch (Exception e) {}
		return false;
	}

	/**
	 * Adds a Vacuum Freezer Recipe
	 * @param aInput1 must be != null
	 * @param aOutput1 must be != null
	 * @param aDuration must be > 0
	 */
	public static boolean addVacuumFreezerRecipe(ItemStack aInput1, ItemStack aOutput1, int aDuration) {
		try {
			Class.forName("gregtechmod.GT_Mod").getMethod("addVacuumFreezerRecipe", ItemStack.class, ItemStack.class, int.class).invoke(null, aInput1, aOutput1, aDuration);
			return true;
		} catch (Exception e) {}
		return false;
	}

	/**
	 * Adds an Alloy Smelter Recipe
	 * @param aInput1 must be != null
	 * @param aOutput1 must be != null
	 * @param aDuration must be > 0
	 * @param aEUt should be > 0
	 */
	public static boolean addAlloySmelterRecipe(ItemStack aInput1, ItemStack aInput2, ItemStack aOutput1, int aDuration, int aEUt) {
		try {
			Class.forName("gregtechmod.GT_Mod").getMethod("addAlloySmelterRecipe", ItemStack.class, ItemStack.class, ItemStack.class, int.class, int.class).invoke(null, aInput1, aInput2, aOutput1, aDuration, aEUt);
			return true;
		} catch (Exception e) {}

		return false;
	}

	/**
	 * Adds a Circuit Assembler Recipe
	 * @param aInput1 must be != null
	 * @param aOutput1 must be != null
	 * @param aDuration must be > 0
	 * @param aEUt should be > 0
	 */
	public static boolean addAssemblerRecipe(ItemStack aInput1, ItemStack aInput2, ItemStack aOutput1, int aDuration, int aEUt) {
		try {
			Class.forName("gregtechmod.GT_Mod").getMethod("addAssemblerRecipe", ItemStack.class, ItemStack.class, ItemStack.class, int.class, int.class).invoke(null, aInput1, aInput2, aOutput1, aDuration, aEUt);
			return true;
		} catch (Exception e) {}
		return false;
	}

	/**
	 * Adds a Wiremill Recipe
	 * @param aInput1 must be != null
	 * @param aOutput1 must be != null
	 * @param aDuration must be > 0
	 * @param aEUt should be > 0
	 */
	public static boolean addWiremillRecipe(ItemStack aInput1, ItemStack aOutput1, int aDuration, int aEUt) {
		try {
			Class.forName("gregtechmod.GT_Mod").getMethod("addWiremillRecipe", ItemStack.class, ItemStack.class, int.class, int.class).invoke(null, aInput1, aOutput1, aDuration, aEUt);
			return true;
		} catch (Exception e) {}
		return false;
	}

	/**
	 * Ⓒ Fabrimat 2021
	 * Adds a Distillation Tower recipe
	 * @param aInput1
	 * @param aInput2 Number of Cells
	 * @param aOutput1
	 * @param aOutput2
	 * @param aOutput3
	 * @param aOutput4
	 * @param aDuration
	 * @param aEUt
	 * @return
	 */

	public static boolean addDistillationRecipe(ItemStack aInput1, int aInput2, ItemStack aOutput1, ItemStack aOutput2, ItemStack aOutput3, ItemStack aOutput4, int aDuration, int aEUt) {
		try {
			Class.forName("gregtechmod.GT_Mod").getMethod("addDistillationRecipe", ItemStack.class, int.class, ItemStack.class, ItemStack.class, ItemStack.class, ItemStack.class, int.class, int.class).invoke(null, aInput1, aInput2, aOutput1, aOutput2, aOutput3, aOutput4, aDuration, aEUt);
			return true;
		} catch (Exception e) {}
		return false;
	}

	/**
	 * Adds a Sawmill Recipe
	 * @param aInput1 must be != null
	 * @param aCellInput this is for the needed Cells, > 0 for Tincell count, < 0 for negative Water Cell count, == 0 for nothing
	 * @param aOutput1 must be != null
	 * @param aOutput2 can be null
	 * @param aOutput3 can be null
	 */
	public static boolean addSawmillRecipe(ItemStack aInput1, int aCellInput, ItemStack aOutput1, ItemStack aOutput2, ItemStack aOutput3) {
		try {
			Class.forName("gregtechmod.GT_Mod").getMethod("addSawmillRecipe", ItemStack.class, int.class, ItemStack.class, ItemStack.class, ItemStack.class).invoke(null, aInput1, aCellInput, aOutput1, aOutput2, aOutput3);
			return true;
		} catch (Exception e) {}
		return false;
	}

	/**
	 * Adds a Fuel for My Generators
	 * @param aInput1 must be != null
	 * @param aOutput1 can be null
	 * @param aEU EU per MilliBucket. If no Liquid Form of this Container is available, then it will give you EU*1000 per Item.
	 * @param aType 0 = Diesel; 1 = Gas Turbine; 2 = Thermal; 3 = DenseFluid; 4 = Plasma; 5 = Magic; And if something is unclear or missing, then look at the GT_Recipe-Class
	 */
	public static boolean addFuel(ItemStack aInput1, ItemStack aOutput1, int aEU, int aType) {
		try {
			Class.forName("gregtechmod.GT_Mod").getMethod("addFuel", ItemStack.class, ItemStack.class, int.class, int.class).invoke(null, aInput1, aOutput1, aEU, aType);
			return true;
		} catch (Exception e) {}
		return false;
	}


}
