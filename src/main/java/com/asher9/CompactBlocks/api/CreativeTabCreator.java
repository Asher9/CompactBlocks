package com.asher9.CompactBlocks.api;

import com.asher9.CompactBlocks.CompactBlocks;
import com.asher9.CompactBlocks.config.CConfig;
import com.asher9.CompactBlocks.init.CBlocks;
import com.asher9.CompactBlocks.init.CItems;
import com.asher9.CompactBlocks.util.CLogger;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabCreator {

    private static class CustomCreativeTab extends CreativeTabs {

        private ItemStack stack;

        public CustomCreativeTab(String label) {
            super(label);
            if (CConfig.generalSettings.creativeTabSearch) {
                setBackgroundImageName("item_search.png");
            }
        }

        @Override
        public ItemStack getTabIconItem() {
            return stack;
        }

        private void setTabIconItemStack(ItemStack stack) {
            this.stack = stack;
        }

        @Override
        public ItemStack getIconItemStack() {
            return stack;
        }

        @Override
        public boolean hasSearchBar() {
            return CConfig.generalSettings.creativeTabSearch;
        }
    }

    public static CustomCreativeTab tabcompressedBlocks = new CustomCreativeTab("tabcompressedBlocks");
    public static CustomCreativeTab tabcompressedWoodBlocks = new CustomCreativeTab("tabcompressedWoodBlocks");
    public static CustomCreativeTab tabcompressedGlassBlocks = new CustomCreativeTab("tabcompressedGlassBlocks");
    public static CustomCreativeTab tabcompressedClayBlocks = new CustomCreativeTab("tabcompressedClayBlocks");
    public static CustomCreativeTab tabcompressedWoolBlocks = new CustomCreativeTab("tabcompressedWoolBlocks");
    public static CustomCreativeTab tabcompressedItems = new CustomCreativeTab("tabcompressedItems");

    public static void init() {
        CLogger.getLogger().info("Loading Creative Tabs...");

        tabcompressedBlocks.setTabIconItemStack(new ItemStack(CBlocks.blockEnderium));
        tabcompressedWoodBlocks.setTabIconItemStack(new ItemStack(CBlocks.compressedWoodLog));
        tabcompressedGlassBlocks.setTabIconItemStack(new ItemStack(CBlocks.compressedColorGlass));
        tabcompressedClayBlocks.setTabIconItemStack(new ItemStack(CBlocks.compressedHardenedClay));
        tabcompressedWoolBlocks.setTabIconItemStack(new ItemStack(CBlocks.compressedWool));
        tabcompressedItems.setTabIconItemStack(new ItemStack(CItems.ingotEnderium));

        CLogger.getLogger().info("Ceative Tabs loaded");
    }
}
