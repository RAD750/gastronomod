package com.rgbcraft.gastronomod.main.arbori;

import java.util.List;
import java.util.Random;

import com.rgbcraft.gastronomod.main.CreativeTab;

import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
public class BlockArboriSapling extends BlockSapling {

	protected BlockArboriSapling(int par1, int par2) {
		super(par1, par2);
		this.setStepSound(soundGrassFootstep);
		this.setCreativeTab(CreativeTab.tabGastronomodAgri);
		this.setTextureFile("/com/rgbcraft/gastronomod/textures/arbori.png");
		float var3 = 0.4F;
		this.setBlockBounds(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var3 * 2.0F, 0.5F + var3);
	}
	
	public boolean isSimulating() {
        return !FMLCommonHandler.instance().getEffectiveSide().isClient();
    }

	@Override
	public void updateTick(final World world, final int i, final int j, final int k, final Random random) {
		if (!isSimulating()) {
            return;
        }
		if (!this.canBlockStay(world, i, j, k)) {
            this.dropBlockAsItem(world, i, j, k, world.getBlockMetadata(i, j, k), 0);
            world.setBlockWithNotify(i, j, k, 0);
            return;
        }
		//random.nextInt = 30
        if (world.getBlockLightValue(i, j + 1, k) >= 9 && random.nextInt(1) == 0) {
            this.growTree(world, i, j, k, random);
        }
	}
	
	@Override
    public boolean onBlockActivated(final World world, final int i, final int j, final int k, final EntityPlayer entityplayer, final int side, final float a, final float b, final float c) {
		if (!isSimulating()) {
            return false;
        }
		final ItemStack equipped = entityplayer.getCurrentEquippedItem();
        if (equipped == null) {
            return false;
        }
        if (equipped.getItem() == Item.dyePowder && equipped.getItemDamage() == 15) {
        	this.growTree(world, i, j, k, world.rand);
            if (!entityplayer.capabilities.isCreativeMode) {
                final ItemStack itemStack = equipped;
                --itemStack.stackSize;
            }
            entityplayer.swingItem();
        }
        return false;
    }
	
	@Override
	public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        par3List.add(new ItemStack(par1, 1, 0));
    }
    
}
