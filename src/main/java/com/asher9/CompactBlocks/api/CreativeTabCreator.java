package com.asher9.CompactBlocks.api;

import com.asher9.CompactBlocks.CompactBlocks;
import com.asher9.CompactBlocks.init.CBlocks;
import com.asher9.CompactBlocks.init.CItems;
import com.asher9.CompactBlocks.util.Utils;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

public class CreativeTabCreator {
	
	private static class CustomCreativeTab extends CreativeTabs {
		
		private ItemStack stack;

		private CustomCreativeTab(String label) {
			super(label);
			if (CompactBlocks.config.cache.creativeTabSearch) {
				setBackgroundImageName("item_search.png");
			}
		}

		@Override
		@Nonnull
		public Item getTabIconItem() {
			return stack.getItem();
		}

		private void setTabIconItemStack(ItemStack stack) {
			this.stack = stack;
		}

		@Override
		@Nonnull
		public ItemStack getIconItemStack() {
			return stack;
		}
		
		@Override
		public boolean hasSearchBar() {
			return CompactBlocks.config.cache.creativeTabSearch;
		}
	}


	public static CustomCreativeTab tabcompressedBlocks = new CustomCreativeTab("tabcompressedBlocks");
	public static CustomCreativeTab tabcompressedWoodBlocks = new CustomCreativeTab("tabcompressedWoodBlocks");
	public static CustomCreativeTab tabcompressedGlassBlocks = new CustomCreativeTab("tabcompressedGlassBlocks");
	public static CustomCreativeTab tabcompressedClayBlocks = new CustomCreativeTab("tabcompressedClayBlocks");
	public static CustomCreativeTab tabcompressedWoolBlocks = new CustomCreativeTab("tabcompressedWoolBlocks");
    public static CustomCreativeTab tabcompressedItems = new CustomCreativeTab("tabcompressedItems");
    
	public static void Init() {
		Utils.getLogger().info("Loading Creative Tabs...");

		tabcompressedBlocks.setTabIconItemStack(new ItemStack(CBlocks.blockEnderium));
		tabcompressedWoodBlocks.setTabIconItemStack(new ItemStack(CBlocks.compressedWoodLog));
		tabcompressedGlassBlocks.setTabIconItemStack(new ItemStack(CBlocks.compressedColorGlass));
		tabcompressedClayBlocks.setTabIconItemStack(new ItemStack(CBlocks.compressedHardenedClay));
		tabcompressedWoolBlocks.setTabIconItemStack(new ItemStack(CBlocks.compressedWool));
		tabcompressedItems.setTabIconItemStack(new ItemStack(CItems.ingotEnderium));
		
		Utils.getLogger().info("Creative Tabs loaded");
	}
}