package com.asher9.CompactBlocks.block;

import java.util.List;

import com.asher9.CompactBlocks.Reference;
import com.asher9.CompactBlocks.ItemBlocks.IMetaBlockName;
import com.asher9.CompactBlocks.api.EnumHandler.ColorTypes;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class compressedWool extends Block implements IMetaBlockName {
	
    private static final PropertyEnum TYPE = PropertyEnum.create("type", ColorTypes.class);

    public compressedWool(Material materialIn, String unlocalizedName, float hardness, float resistance, float lightLevel, String tool, int harvestLevel, CreativeTabs creativeTab, SoundType stepSound)
    {
        super(materialIn);
        this.setDefaultState(this.blockState.getBaseState().withProperty(TYPE, ColorTypes.WHITE));
        this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.getMODID(), unlocalizedName));
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setLightLevel(lightLevel);
		this.setHarvestLevel(tool, harvestLevel);
		this.setCreativeTab(creativeTab);
		this.setSoundType(stepSound);
    }
    
    	
    	@Override
    	protected BlockStateContainer createBlockState() {
			return new BlockStateContainer(this, new IProperty[] {TYPE});
		}
    	
    	@Override
    	public int getMetaFromState(IBlockState state) {
    		ColorTypes type = (ColorTypes) state.getValue(TYPE);
    		return type.getID();
    	}
    	
    	@Override
    	public IBlockState getStateFromMeta(int meta) {		
    		return this.getDefaultState().withProperty(TYPE, ColorTypes.values()[meta]);
    	}
    	
    	@Override
    	public void getSubBlocks(Item itemIn, CreativeTabs tab, List<ItemStack> list) {
    		for (int i = 0; i < ColorTypes.values().length; i++) {
    			list.add(new ItemStack(itemIn, 1, i));
    		}
    	}

		@Override
		public String getSpecialName(ItemStack stack) {
			return ColorTypes.values()[stack.getItemDamage()].getName();
		}
		
		@Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos,
				EntityPlayer player) {
			return new ItemStack(Item.getItemFromBlock(this), 1, getMetaFromState(world.getBlockState(pos)));
		}
		
		@Override
		public int damageDropped(IBlockState state) {
			return getMetaFromState(state);
		}
		
}