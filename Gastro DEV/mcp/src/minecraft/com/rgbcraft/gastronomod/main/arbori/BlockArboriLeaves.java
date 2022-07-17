package com.rgbcraft.gastronomod.main.arbori;
import java.util.List;

import com.rgbcraft.gastronomod.main.CreativeTab;
import net.minecraft.block.BlockLeaves;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.IShearable;

public class BlockArboriLeaves extends BlockLeaves implements IShearable {

	protected BlockArboriLeaves(int par1, int par2) {
		super(par1, par2);
		this.setStepSound(soundGrassFootstep);
		this.setCreativeTab(CreativeTab.tabGastronomodAgri);
		this.setTextureFile("/com/rgbcraft/gastronomod/textures/arbori.png");
	}
	
	@Override
    public boolean isOpaqueCube()
    {
        //return !this.graphicsLevel;
		return false;
    }

    @Override
    public boolean isShearable(ItemStack item, World world, int x, int y, int z)
    {
        return true;
    }
    
	@Override
	public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        par3List.add(new ItemStack(par1, 1, 0));
    }
}
