package com.rgbcraft.gastronomod.main.handlers;

import java.lang.reflect.Field;
import net.minecraft.item.Item;

public class CampmerdHandler {
	public static Item getCampMerdItem(String itemName) {
		Item item = null;
		        try {
		            Class campCraft = Class.forName("CampCraft.CampCraft");
		            Field itemField = campCraft.getField(itemName);
		            Object itemObj = itemField.get(null);
		            if(itemObj instanceof Item) {
		                item = (Item) itemObj;
		            }
		        } catch (ClassNotFoundException e) {
		            e.printStackTrace();
		        } catch (NoSuchFieldException e) {
		            e.printStackTrace();
		        } catch (SecurityException e) {
		            e.printStackTrace();
		        } catch (IllegalArgumentException e) {
		            e.printStackTrace();
		        } catch (IllegalAccessException e) {
		            e.printStackTrace();
		        }
		return item;
		}
}
