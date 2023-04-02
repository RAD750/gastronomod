package com.rgbcraft.gastronomod.main.agri;

import com.rgbcraft.gastronomod.main.CreativeTab;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class BlockGenericFlower extends BlockFlower {

	public BlockGenericFlower(int id, int textureIndex, Material material, String blockName) {
		super(id, textureIndex, material);
        this.blockIndexInTexture = textureIndex;
        float var4 = 0.2F;
        this.setBlockBounds(0.5F - var4, 0.0F, 0.5F - var4, 0.5F + var4, var4 * 3.0F, 0.5F + var4);
        this.setCreativeTab(CreativeTab.tabGastronomodAgri);
        this.setTextureFile("/com/rgbcraft/gastronomod/textures/flori.png");
        this.setBlockName(blockName);
        this.setStepSound(soundGrassFootstep);
	}
}
