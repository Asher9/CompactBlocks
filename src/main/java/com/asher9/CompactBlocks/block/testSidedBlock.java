package com.asher9.CompactBlocks.block;

import com.asher9.CompactBlocks.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class testSidedBlock extends Block {

	public testSidedBlock(Material material, String unlocalizedName, float hardness, float resistance, float lightLevel,
			String tool, int harvestLevel, CreativeTabs creativeTab, SoundType stepSound) {
		super(material);
		
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.getModid(), unlocalizedName));
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setLightLevel(lightLevel);
		this.setHarvestLevel(tool, harvestLevel);
		this.setCreativeTab(creativeTab);
		this.setSoundType(stepSound);
	}
	
	public boolean isFullCube(IBlockState state)
    {
        return false;
    }
	
	@SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }

}
