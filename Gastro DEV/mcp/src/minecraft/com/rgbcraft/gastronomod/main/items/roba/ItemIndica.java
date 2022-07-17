package com.rgbcraft.gastronomod.main.items.roba;

import java.util.Random;

import com.rgbcraft.gastronomod.main.items.Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemIndica extends ItemFood{

	public ItemIndica(int par1, int par2) {
		super(par1, par2, false);
		this.setMaxStackSize(1);
		this.setIconIndex(208);
		this.setTextureFile("/com/rgbcraft/gastronomod/textures/items.png");
		this.setCreativeTab(CreativeTabs.tabBrewing);
		this.setItemName("cannoneIndica");
		this.setAlwaysEdible();
	}
	
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.bow;
    }
	
	public ItemStack onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
		super.onFoodEaten(par1ItemStack, par2World, par3EntityPlayer);
		if (!par2World.isRemote) {
			for(int i = 0; i<20; i++) {
				String s = "";
				for (int j = 0; j < 50; j++) {
					char c = Integer.toHexString((new Random().nextInt(16))).charAt(0);
					s += "§" + c + "§k" + c;
				}
				par3EntityPlayer.sendChatToPlayer(s);
			}
			par2World.playSoundAtEntity(par3EntityPlayer, "portal.portal", 1.0F, 0.05F);
			par2World.playSoundAtEntity(par3EntityPlayer, "mob.endermen.stare", 1.0F, 0.05F);
			par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.hunger.id, 600, 0));
			
			Random random = new Random();
			int chance = random.nextInt(100);
			if (chance < 10) {
				par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.blindness.id, 3600, 0));
				par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.confusion.id, 3600, 0));
			} else if (chance > 95) {
				par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.confusion.id, 4000, 0));
				par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.blindness.id, 4000, 3));
				par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 4000, 3));
				par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.poison.id, 4000, 3));
			} else {
				par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 1800, 3));
				par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 1200, 3));
				par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.regeneration.id, 200, 0));
				par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.resistance.id, 800, 0));
			}
			
			
			System.out.println(par3EntityPlayer.username + " è un tossicodipendente");
		}
		return ic2.api.Items.getItem("scrap");
    }
}
