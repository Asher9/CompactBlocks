package com.asher9.CompactBlocks.init;

import com.asher9.CompactBlocks.Reference;
import com.asher9.CompactBlocks.api.CreativeTabCreator;
import com.asher9.CompactBlocks.util.CLogger;
import com.asher9.CompactBlocks.util.Utils;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CModItems {
	
	public static void register() {
		registerItem(CItems.dustEnderium);
		registerItem(CItems.ingotEnderium);
		registerItem(CItems.nuggetEnderium);
		registerItem(CItems.enderiumAxe);
		registerItem(CItems.enderiumShovel);
		registerItem(CItems.enderiumPickaxe);
		registerItem(CItems.compressedCobblestonePickaxe);
		registerItem(CItems.compressedDirtPickaxe);
		registerItem(CItems.compressedGravelPickaxe);
		registerItem(CItems.compressedSandPickaxe);
		
	}
	
	public static void registerRenders() {
		registerRender(CItems.dustEnderium);
		registerRender(CItems.ingotEnderium);
		registerRender(CItems.nuggetEnderium);
		registerRender(CItems.enderiumAxe);
		registerRender(CItems.enderiumShovel);
		registerRender(CItems.enderiumPickaxe);
		registerRender(CItems.compressedCobblestonePickaxe);
		registerRender(CItems.compressedDirtPickaxe);
		registerRender(CItems.compressedGravelPickaxe);
		registerRender(CItems.compressedSandPickaxe);
	}
	
	private static void registerItem(Item item) {
		ForgeRegistries.ITEMS.register(item);
		item.setCreativeTab(CreativeTabCreator.tabcompressedItems);
		CLogger.getLogger().info("Registered Item: " + item.getUnlocalizedName().substring(5));
	}
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.getMODID(), item.getUnlocalizedName().substring(5)), "inventory"));
		CLogger.getLogger().info("Registered Render for: " + item.getUnlocalizedName().substring(5));
	}
	
}
