package com.asher9.CompactBlocks.api;

import com.asher9.CompactBlocks.init.CBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockBreakable extends Block
{
    private final boolean ignoreSimilarity;

    protected BlockBreakable(Material materialIn, boolean ignoreSimilarityIn)
    {
        this(materialIn, ignoreSimilarityIn, materialIn.getMaterialMapColor());
    }

    protected BlockBreakable(Material materialIn, boolean ignoreSimilarityIn, MapColor mapColorIn)
    {
        super(materialIn, mapColorIn);
        this.ignoreSimilarity = ignoreSimilarityIn;
    }

    /**
     * Used to determine ambient occlusion and culling when rebuilding chunks for render
     */
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side)
    {
        IBlockState iblockstate = blockAccess.getBlockState(pos.offset(side));
        Block block = iblockstate.getBlock();

        if (this == CBlocks.compressedGlassBlock || this == CBlocks.doublecompressedGlassBlock || this == CBlocks.triplecompressedGlassBlock || this == CBlocks.quadruplecompressedGlassBlock ||
                this == CBlocks.compressedIce || this == CBlocks.doublecompressedIce || this == CBlocks.triplecompressedIce || this == CBlocks.quadruplecompressedIce ||
                this == CBlocks.compressedColorGlass || this == CBlocks.doublecompressedColorGlass || this == CBlocks.triplecompressedColorGlass || this == CBlocks.quadruplecompressedColorGlass)
        {
            if (blockState != iblockstate)
            {
                return true;
            }

            if (block == this)
            {
                return false;
            }
        }

        return !this.ignoreSimilarity && block == this ? false : super.shouldSideBeRendered(blockState, blockAccess, pos, side);
    }
}