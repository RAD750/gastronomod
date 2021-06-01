package com.rgbcraft.gastronomod.main;

import com.rgbcraft.gastronomod.main.items.Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTab extends CreativeTabs {
	private String name;
	public static CreativeTabs tabGastronomodCibi = new CreativeTab(CreativeTabs.getNextID(), "Gastronomod - Cibi");
	public static CreativeTabs tabGastronomodAgri = new CreativeTab(CreativeTabs.getNextID(), "Gastronomod - Agricoltura");
	public static CreativeTabs tabGastronomodAltro = new CreativeTab(CreativeTabs.getNextID(), "Gastronomod - Altro");
	public static CreativeTabs tabGastronomodPesca = new CreativeTab(CreativeTabs.getNextID(), "Gastronomod - Pesca");
	
	public CreativeTab(int par1, String par2Str) {
		super(par1, par2Str);
		this.name = par2Str;
	}
	
	@Override
	public String toString() {
		return super.getTabLabel();
	}
	
	@SideOnly(Side.CLIENT) 
	public ItemStack getIconItemStack() {
		if(this.name == tabGastronomodCibi.getTabLabel()) {
			return new ItemStack(Items.conoCostoso);
		} else if (this.name == tabGastronomodAltro.getTabLabel()) {
			return new ItemStack(Items.pentola_acqua);
		} else if (this.name == tabGastronomodAgri.getTabLabel()) {
			return new ItemStack(Items.basilico);
		} else if (this.name == tabGastronomodPesca.getTabLabel()) {
			return new ItemStack(Items.tonnoPinneGialle);
		}
		return null;
	}
	
	
	@Override
	public String getTranslatedTabLabel() {
		return this.name;
	}
}
