package com.rgbcraft.gastronomod.main.handlers;
import com.rgbcraft.gastronomod.main.Main;

import net.minecraft.item.Item;

public class BadModHandler {
	public static Item universalItemGetter(int id) {
		return Item.itemsList[id];
	}
	
	public static Item universalItemGetter(String itemName) {
		for (int i = 0; i < Item.itemsList.length; i++) {
			if(Item.itemsList[i] != null && Item.itemsList[i].getItemName() != null && Item.itemsList[i].getItemName().equals(itemName)) {
				return Item.itemsList[i];
			}
		}
		return null;
	}
	
	public static void universalItemPrinter() {
		for (int i = 0; i < Item.itemsList.length; i++) {
			if (Item.itemsList[i] != null) {
				Main.gastroLog.info("Item: " + Item.itemsList[i] + " (" + i + ")");
			}
		}
	}
	
}
