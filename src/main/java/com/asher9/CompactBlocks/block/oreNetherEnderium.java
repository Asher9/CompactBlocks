package com.asher9.CompactBlocks.block;

import java.util.Random;

import javax.annotation.Nullable;

import com.asher9.CompactBlocks.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public class oreNetherEnderium extends Block {

	private static Item drop;
	private int least_quantity;
	private int most_quantity;

	public oreNetherEnderium(Material material, String unlocalizedName, float hardness, float resistance, float lightLevel,String tool, int harvestLevel, CreativeTabs creativeTab, SoundType stepSound, Item drop, int least_quantity, int most_quantity) {
		super(material);
		this.drop = drop;
		this.least_quantity = least_quantity;
		this.most_quantity = most_quantity;
		this.setUnlocalizedName(unlocalizedName);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setLightLevel(lightLevel);
		this.setHarvestLevel(tool, harvestLevel);
		this.setCreativeTab(creativeTab);
		this.setSoundType(stepSound);
		this.setRegistryName(new ResourceLocation(Reference.getMODID(), unlocalizedName));
	}

	@Override
	public int quantityDroppedWithBonus(int fortune, Random random) {
		return MathHelper.clamp(this.quantityDropped(random) + random.nextInt(fortune + 1), this.least_quantity,
				this.most_quantity);
	}

	/**
	 * Returns the quantity of items to drop on block destruction.
	 */
	@Override
	public int quantityDropped(Random random) {
		if (this.least_quantity >= this.most_quantity)
			return this.least_quantity;
		return this.least_quantity + random.nextInt(this.most_quantity - this.least_quantity + 1);
	}

	/**
	 * Get the Item that this Block should drop when harvested.
	 */
	@Override
	@Nullable
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return this.drop;
	}
}