package com.rgbcraft.gastronomod.main.agri;
import com.rgbcraft.gastronomod.main.items.Items;

import net.minecraft.block.BlockCrops;

public class BlockSenape extends BlockCrops {

    protected BlockSenape(int id, int textId) {
        super(id, textId);
        setBlockName("blockSenape");
    }
    
    public int getBlockTextureFromSideAndMetadata(int side, int metadata) {
        if (metadata < 7) {
            if (metadata == 6) {
                metadata = 5;
            }

            return this.blockIndexInTexture + (metadata >> 1);
        } else {
            return this.blockIndexInTexture + 3;
        }
    }

    protected int getSeedItem() {
        return Items.senapeSemi.itemID;
    }

    protected int getCropItem() {
        return Items.senapeSemi.itemID;
    }
}