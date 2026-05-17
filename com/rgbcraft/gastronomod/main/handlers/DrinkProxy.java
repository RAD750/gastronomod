package com.rgbcraft.gastronomod.main.handlers;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import net.minecraft.item.Item;

import java.lang.reflect.Field;

public class DrinkProxy {
    private final Object drinkInstance;
    private static Class<?> drinkClass;

    static {
        try {
            drinkClass = Class.forName("tarun1998.thirstmod.common.items.Drink");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public DrinkProxy(int id, int replenish, float saturation, boolean alwaysDrinkable) throws Exception {
        Constructor<?> constructor = drinkClass.getConstructor(int.class, int.class, float.class, boolean.class);
        this.drinkInstance = constructor.newInstance(id, replenish, saturation, alwaysDrinkable);
    }

    public DrinkProxy(int id, int replenish, float saturation, boolean alwaysDrinkable, int storeRecipe, String name) throws Exception {
        Constructor<?> constructor = drinkClass.getConstructor(int.class, int.class, float.class, boolean.class, int.class, String.class);
        this.drinkInstance = constructor.newInstance(id, replenish, saturation, alwaysDrinkable, storeRecipe, name);
    }

    public Object getDrinkInstance() {
        return this.drinkInstance;
    }

    public Object onFoodEaten(Object itemstack, Object world, Object entityplayer) throws Exception {
        Method method = drinkClass.getMethod("onFoodEaten", Class.forName("ItemStack"), Class.forName("World"), Class.forName("EntityPlayer"));
        return method.invoke(this.drinkInstance, itemstack, world, entityplayer);
    }

    public int getMaxItemUseDuration(Object itemstack) throws Exception {
        Method method = drinkClass.getMethod("getMaxItemUseDuration", Class.forName("ItemStack"));
        return (int) method.invoke(this.drinkInstance, itemstack);
    }

    public Object getItemUseAction(Object itemstack) throws Exception {
        Method method = drinkClass.getMethod("getItemUseAction", Class.forName("ItemStack"));
        return method.invoke(this.drinkInstance, itemstack);
    }

    public Object onItemRightClick(Object itemstack, Object world, Object entityplayer) throws Exception {
        Method method = drinkClass.getMethod("onItemRightClick", Class.forName("ItemStack"), Class.forName("World"), Class.forName("EntityPlayer"));
        return method.invoke(this.drinkInstance, itemstack, world, entityplayer);
    }

    public DrinkProxy setPotionEffect(int i, int j, int k, float f) throws Exception {
        Method method = drinkClass.getMethod("setPotionEffect", int.class, int.class, int.class, float.class);
        method.invoke(this.drinkInstance, i, j, k, f);
        return this;
    }

    public boolean hasEffect(Object itemstack) throws Exception {
        Method method = drinkClass.getMethod("hasEffect", Class.forName("ItemStack"));
        return (boolean) method.invoke(this.drinkInstance, itemstack);
    }

    public DrinkProxy setPoisoningChance(float chance) throws Exception {
        Method method = drinkClass.getMethod("setPoisoningChance", float.class);
        method.invoke(this.drinkInstance, chance);
        return this;
    }

    public Object setHasEffect() throws Exception {
        Method method = drinkClass.getMethod("setHasEffect");
        return method.invoke(this.drinkInstance);
    }

    public DrinkProxy setEffect(boolean b) throws Exception {
        Method method = drinkClass.getMethod("setEffect", boolean.class);
        method.invoke(this.drinkInstance, b);
        return this;
    }

    public DrinkProxy healFood(int level, float saturation) throws Exception {
        Method method = drinkClass.getMethod("healFood", int.class, float.class);
        method.invoke(this.drinkInstance, level, saturation);
        return this;
    }

    public boolean canDrink() throws Exception {
        Method method = drinkClass.getMethod("canDrink");
        return (boolean) method.invoke(this.drinkInstance);
    }

    public Object setReturn(Object item) throws Exception {
        Method method = drinkClass.getMethod("setReturn", Item.class);
        return method.invoke(this.drinkInstance, item);
    }

    public Object setTexFile(String tex) throws Exception {
        Method method = drinkClass.getMethod("setTexFile", String.class);
        return method.invoke(this.drinkInstance, tex);
    }

    public String getTextureFile() throws Exception {
        Method method = drinkClass.getMethod("getTextureFile");
        return (String) method.invoke(this.drinkInstance);
    }

    public Object getReturn() throws Exception {
        Method method = drinkClass.getMethod("getReturn");
        return method.invoke(this.drinkInstance);
    }

    public int getStoreRecipe() throws Exception {
        Field field = drinkClass.getField("storeRecipe");
        return field.getInt(this.drinkInstance);
    }

    public void setStoreRecipe(int storeRecipe) throws Exception {
        Field field = drinkClass.getField("storeRecipe");
        field.setInt(this.drinkInstance, storeRecipe);
    }

    public String getInName() throws Exception {
        Field field = drinkClass.getField("inName");
        return (String) field.get(this.drinkInstance);
    }

    public void setInName(String inName) throws Exception {
        Field field = drinkClass.getField("inName");
        field.set(this.drinkInstance, inName);
    }

    public String getUsername() throws Exception {
        Field field = drinkClass.getField("username");
        return (String) field.get(this.drinkInstance);
    }

    public void setUsername(String username) throws Exception {
        Field field = drinkClass.getField("username");
        field.set(this.drinkInstance, username);
    }
}