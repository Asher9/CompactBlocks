package com.asher9.CompactBlocks.init;

import com.asher9.CompactBlocks.api.EnumHandler;
import com.asher9.CompactBlocks.util.Utils;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CShapelessCraftingRecipe {
	 
public static void ShapelessCraftingRecipe() {
	Utils.getLogger().info("Loading Shapeless Recipes...");
	
	//Compressed Blocks
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.COBBLESTONE, 9), new ItemStack(CBlocks.compressedCobblestone)); 
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedCobblestone, 9), new ItemStack(CBlocks.doublecompressedCobblestone));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedCobblestone, 9), new ItemStack(CBlocks.triplecompressedCobblestone));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedCobblestone, 9), new ItemStack(CBlocks.quadruplecompressedCobblestone));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.DIRT, 9, 0), new ItemStack(CBlocks.compressedDirt));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedDirt, 9), new ItemStack(CBlocks.doublecompressedDirt));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedDirt, 9), new ItemStack(CBlocks.triplecompressedDirt));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedDirt, 9), new ItemStack(CBlocks.quadruplecompressedDirt));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SAND, 9), new ItemStack(CBlocks.compressedSand));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedSand, 9), new ItemStack(CBlocks.doublecompressedSand));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedSand, 9), new ItemStack(CBlocks.triplecompressedSand));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedSand, 9), new ItemStack(CBlocks.quadruplecompressedSand));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.GRAVEL, 9), new ItemStack(CBlocks.compressedGravel));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedGravel, 9), new ItemStack(CBlocks.doublecompressedGravel));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedGravel, 9), new ItemStack(CBlocks.triplecompressedGravel));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedGravel, 9), new ItemStack(CBlocks.quadruplecompressedGravel));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.COAL_BLOCK, 9), new ItemStack(CBlocks.compressedCoalBlock));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedCoalBlock, 9), new ItemStack(CBlocks.doublecompressedCoalBlock));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedCoalBlock, 9), new ItemStack(CBlocks.triplecompressedCoalBlock));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedCoalBlock, 9), new ItemStack(CBlocks.quadruplecompressedCoalBlock));
	GameRegistry.addShapelessRecipe(new ItemStack(CItems.ingotEnderium, 9), new ItemStack(CBlocks.blockEnderium));
	GameRegistry.addShapelessRecipe(new ItemStack(CItems.nuggetEnderium, 9), new ItemStack(CItems.ingotEnderium));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.OBSIDIAN, 9), new ItemStack(CBlocks.compressedObsidian));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedObsidian, 9), new ItemStack(CBlocks.doublecompressedObsidian));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedObsidian, 9), new ItemStack(CBlocks.triplecompressedObsidian));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedObsidian, 9), new ItemStack(CBlocks.quadruplecompressedObsidian));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.blockEnderium, 9), new ItemStack(CBlocks.compressedEnderium));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedEnderium, 9), new ItemStack(CBlocks.doublecompressedEnderium));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedEnderium, 9), new ItemStack(CBlocks.triplecompressedEnderium));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedEnderium, 9), new ItemStack(CBlocks.quadruplecompressedEnderium));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE, 9), new ItemStack(CBlocks.compressedStone));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedStone, 9), new ItemStack(CBlocks.doublecompressedStone));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedStone, 9), new ItemStack(CBlocks.triplecompressedStone));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedStone, 9), new ItemStack(CBlocks.quadruplecompressedStone));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.CLAY, 9), new ItemStack(CBlocks.compressedClay));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedClay, 9), new ItemStack(CBlocks.doublecompressedClay));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedClay, 9), new ItemStack(CBlocks.triplecompressedClay));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedClay, 9), new ItemStack(CBlocks.quadruplecompressedClay));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.BRICK_BLOCK, 9), new ItemStack(CBlocks.compressedBrick));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedBrick, 9), new ItemStack(CBlocks.doublecompressedBrick));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedBrick, 9), new ItemStack(CBlocks.triplecompressedBrick));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedBrick, 9), new ItemStack(CBlocks.quadruplecompressedBrick));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.BEDROCK, 9), new ItemStack(CBlocks.compressedBedrock));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedBedrock, 9), new ItemStack(CBlocks.doublecompressedBedrock));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedBedrock, 9), new ItemStack(CBlocks.triplecompressedBedrock));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedBedrock, 9), new ItemStack(CBlocks.quadruplecompressedBedrock));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.MOSSY_COBBLESTONE, 9), new ItemStack(CBlocks.compressedCobblestone_mossy));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedCobblestone_mossy, 9), new ItemStack(CBlocks.doublecompressedCobblestone_mossy));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedCobblestone_mossy, 9), new ItemStack(CBlocks.triplecompressedCobblestone_mossy));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedCobblestone_mossy, 9), new ItemStack(CBlocks.quadruplecompressedCobblestone_mossy));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.DIAMOND_BLOCK, 9), new ItemStack(CBlocks.compressedDiamondBlock));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedDiamondBlock, 9), new ItemStack(CBlocks.doublecompressedDiamondBlock));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedDiamondBlock, 9), new ItemStack(CBlocks.triplecompressedDiamondBlock));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedDiamondBlock, 9), new ItemStack(CBlocks.quadruplecompressedDiamondBlock));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.EMERALD_BLOCK, 9), new ItemStack(CBlocks.compressedEmeraldBlock));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedEmeraldBlock, 9), new ItemStack(CBlocks.doublecompressedEmeraldBlock));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedEmeraldBlock, 9), new ItemStack(CBlocks.triplecompressedEmeraldBlock));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedEmeraldBlock, 9), new ItemStack(CBlocks.quadruplecompressedEmeraldBlock));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.END_STONE, 9), new ItemStack(CBlocks.compressedEndStone));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedEndStone, 9), new ItemStack(CBlocks.doublecompressedEndStone));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedEndStone, 9), new ItemStack(CBlocks.triplecompressedEndStone));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedEndStone, 9), new ItemStack(CBlocks.quadruplecompressedEndStone));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.GLOWSTONE, 9), new ItemStack(CBlocks.compressedGlowstone));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedGlowstone, 9), new ItemStack(CBlocks.doublecompressedGlowstone));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedGlowstone, 9), new ItemStack(CBlocks.triplecompressedGlowstone));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedGlowstone, 9), new ItemStack(CBlocks.quadruplecompressedGlowstone));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.GLASS, 9), new ItemStack(CBlocks.compressedGlassBlock));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedGlassBlock, 9), new ItemStack(CBlocks.doublecompressedGlassBlock));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedGlassBlock, 9), new ItemStack(CBlocks.triplecompressedGlassBlock));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedGlassBlock, 9), new ItemStack(CBlocks.quadruplecompressedGlassBlock));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.GOLD_BLOCK, 9), new ItemStack(CBlocks.compressedGoldBlock));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedGoldBlock, 9), new ItemStack(CBlocks.doublecompressedGoldBlock));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedGoldBlock, 9), new ItemStack(CBlocks.triplecompressedGoldBlock));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedGoldBlock, 9), new ItemStack(CBlocks.quadruplecompressedGoldBlock));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.HAY_BLOCK, 9), new ItemStack(CBlocks.compressedHayBlock));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedHayBlock, 9), new ItemStack(CBlocks.doublecompressedHayBlock));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedHayBlock, 9), new ItemStack(CBlocks.triplecompressedHayBlock));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedHayBlock, 9), new ItemStack(CBlocks.quadruplecompressedHayBlock));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.ICE, 9), new ItemStack(CBlocks.compressedIce));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedIce, 9), new ItemStack(CBlocks.doublecompressedIce));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedIce, 9), new ItemStack(CBlocks.triplecompressedIce));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedIce, 9), new ItemStack(CBlocks.quadruplecompressedIce));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.IRON_BLOCK, 9), new ItemStack(CBlocks.compressedIronBlock));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedIronBlock, 9), new ItemStack(CBlocks.doublecompressedIronBlock));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedIronBlock, 9), new ItemStack(CBlocks.triplecompressedIronBlock));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedIronBlock, 9), new ItemStack(CBlocks.quadruplecompressedIronBlock));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.LAPIS_BLOCK, 9), new ItemStack(CBlocks.compressedLapisBlock));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedLapisBlock, 9), new ItemStack(CBlocks.doublecompressedLapisBlock));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedLapisBlock, 9), new ItemStack(CBlocks.triplecompressedLapisBlock));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedLapisBlock, 9), new ItemStack(CBlocks.quadruplecompressedLapisBlock));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.NETHER_BRICK, 9), new ItemStack(CBlocks.compressedNetherBrick));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedNetherBrick, 9), new ItemStack(CBlocks.doublecompressedNetherBrick));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedNetherBrick, 9), new ItemStack(CBlocks.triplecompressedNetherBrick));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedNetherBrick, 9), new ItemStack(CBlocks.quadruplecompressedNetherBrick));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.NETHERRACK, 9), new ItemStack(CBlocks.compressedNetherrack));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedNetherrack, 9), new ItemStack(CBlocks.doublecompressedNetherrack));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedNetherrack, 9), new ItemStack(CBlocks.triplecompressedNetherrack));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedNetherrack, 9), new ItemStack(CBlocks.quadruplecompressedNetherrack));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.REDSTONE_BLOCK, 9), new ItemStack(CBlocks.compressedRedstoneBlock));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedRedstoneBlock, 9), new ItemStack(CBlocks.doublecompressedRedstoneBlock));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedRedstoneBlock, 9), new ItemStack(CBlocks.triplecompressedRedstoneBlock));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedRedstoneBlock, 9), new ItemStack(CBlocks.quadruplecompressedRedstoneBlock));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SAND, 9, 1), new ItemStack(CBlocks.compressedRedSand));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedRedSand, 9), new ItemStack(CBlocks.doublecompressedRedSand));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedRedSand, 9), new ItemStack(CBlocks.triplecompressedRedSand));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedRedSand, 9), new ItemStack(CBlocks.quadruplecompressedRedSand));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONEBRICK, 9, 0), new ItemStack(CBlocks.compressedStoneBrick));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedStoneBrick, 9), new ItemStack(CBlocks.doublecompressedStoneBrick));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedStoneBrick, 9), new ItemStack(CBlocks.triplecompressedStoneBrick));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedStoneBrick, 9), new ItemStack(CBlocks.quadruplecompressedStoneBrick));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONEBRICK, 9, 3), new ItemStack(CBlocks.compressedStoneBrickChiseled));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedStoneBrickChiseled, 9), new ItemStack(CBlocks.doublecompressedStoneBrickChiseled));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedStoneBrickChiseled, 9), new ItemStack(CBlocks.triplecompressedStoneBrickChiseled));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedStoneBrickChiseled, 9), new ItemStack(CBlocks.quadruplecompressedStoneBrickChiseled));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONEBRICK, 9, 2), new ItemStack(CBlocks.compressedStoneBrickCracked));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedStoneBrickCracked, 9), new ItemStack(CBlocks.doublecompressedStoneBrickCracked));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedStoneBrickCracked, 9), new ItemStack(CBlocks.triplecompressedStoneBrickCracked));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedStoneBrickCracked, 9), new ItemStack(CBlocks.quadruplecompressedStoneBrickCracked));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONEBRICK, 9, 1), new ItemStack(CBlocks.compressedStoneBrickMossy));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedStoneBrickMossy, 9), new ItemStack(CBlocks.doublecompressedStoneBrickMossy));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedStoneBrickMossy, 9), new ItemStack(CBlocks.triplecompressedStoneBrickMossy));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedStoneBrickMossy, 9), new ItemStack(CBlocks.quadruplecompressedStoneBrickMossy));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SPONGE, 9), new ItemStack(CBlocks.compressedSponge));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedSponge, 9), new ItemStack(CBlocks.doublecompressedSponge));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedSponge, 9), new ItemStack(CBlocks.triplecompressedSponge));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedSponge, 9), new ItemStack(CBlocks.quadruplecompressedSponge));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.BOOKSHELF, 9), new ItemStack(CBlocks.compressedBookshelf));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedBookshelf, 9), new ItemStack(CBlocks.doublecompressedBookshelf));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedBookshelf, 9), new ItemStack(CBlocks.triplecompressedBookshelf));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedBookshelf, 9), new ItemStack(CBlocks.quadruplecompressedBookshelf));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.CRAFTING_TABLE, 9), new ItemStack(CBlocks.compressedCraftingTable));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedCraftingTable, 9), new ItemStack(CBlocks.doublecompressedCraftingTable));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedCraftingTable, 9), new ItemStack(CBlocks.triplecompressedCraftingTable));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedCraftingTable, 9), new ItemStack(CBlocks.quadruplecompressedCraftingTable));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.HARDENED_CLAY, 9), new ItemStack(CBlocks.compressedHardenedClay_ST));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedHardenedClay_ST, 9), new ItemStack(CBlocks.doublecompressedHardenedClay_ST));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedHardenedClay_ST, 9), new ItemStack(CBlocks.triplecompressedHardenedClay_ST));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedHardenedClay_ST, 9), new ItemStack(CBlocks.quadruplecompressedHardenedClay_ST));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.COAL_ORE, 9), new ItemStack(CBlocks.compressedCoalOre));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedCoalOre, 9), new ItemStack(CBlocks.doublecompressedCoalOre));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedCoalOre, 9), new ItemStack(CBlocks.triplecompressedCoalOre));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedCoalOre, 9), new ItemStack(CBlocks.quadruplecompressedCoalOre));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.DIAMOND_ORE, 9), new ItemStack(CBlocks.compressedDiamondOre));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedDiamondOre, 9), new ItemStack(CBlocks.doublecompressedDiamondOre));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedDiamondOre, 9), new ItemStack(CBlocks.triplecompressedDiamondOre));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedDiamondOre, 9), new ItemStack(CBlocks.quadruplecompressedDiamondOre));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.EMERALD_ORE, 9), new ItemStack(CBlocks.compressedEmeraldOre));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedEmeraldOre, 9), new ItemStack(CBlocks.doublecompressedEmeraldOre));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedEmeraldOre, 9), new ItemStack(CBlocks.triplecompressedEmeraldOre));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedEmeraldOre, 9), new ItemStack(CBlocks.quadruplecompressedEmeraldOre));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.GOLD_ORE, 9), new ItemStack(CBlocks.compressedGoldOre));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedGoldOre, 9), new ItemStack(CBlocks.doublecompressedGoldOre));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedGoldOre, 9), new ItemStack(CBlocks.triplecompressedGoldOre));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedGoldOre, 9), new ItemStack(CBlocks.quadruplecompressedGoldOre));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.IRON_ORE, 9), new ItemStack(CBlocks.compressedIronOre));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedIronOre, 9), new ItemStack(CBlocks.doublecompressedIronOre));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedIronOre, 9), new ItemStack(CBlocks.triplecompressedIronOre));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedIronOre, 9), new ItemStack(CBlocks.quadruplecompressedIronOre));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.DIRT, 9, 2), new ItemStack(CBlocks.compressedPodzol));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedPodzol, 9), new ItemStack(CBlocks.doublecompressedPodzol));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedPodzol, 9), new ItemStack(CBlocks.triplecompressedPodzol));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedPodzol, 9), new ItemStack(CBlocks.quadruplecompressedPodzol));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.QUARTZ_BLOCK, 9, 0), new ItemStack(CBlocks.compressedQuartzBlock));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedQuartzBlock, 9), new ItemStack(CBlocks.doublecompressedQuartzBlock));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedQuartzBlock, 9), new ItemStack(CBlocks.triplecompressedQuartzBlock));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedQuartzBlock, 9), new ItemStack(CBlocks.quadruplecompressedQuartzBlock));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.QUARTZ_BLOCK, 9, 1), new ItemStack(CBlocks.compressedQuartzChiseled));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedQuartzChiseled, 9), new ItemStack(CBlocks.doublecompressedQuartzChiseled));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedQuartzChiseled, 9), new ItemStack(CBlocks.triplecompressedQuartzChiseled));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedQuartzChiseled, 9), new ItemStack(CBlocks.quadruplecompressedQuartzChiseled));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.QUARTZ_BLOCK, 9, 2), new ItemStack(CBlocks.compressedQuartzLines));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedQuartzLines, 9), new ItemStack(CBlocks.doublecompressedQuartzLines));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedQuartzLines, 9), new ItemStack(CBlocks.triplecompressedQuartzLines));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedQuartzLines, 9), new ItemStack(CBlocks.quadruplecompressedQuartzLines));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.TNT, 9), new ItemStack(CBlocks.compressedTNT));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedTNT, 9), new ItemStack(CBlocks.doublecompressedTNT));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedTNT, 9), new ItemStack(CBlocks.triplecompressedTNT));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedTNT, 9), new ItemStack(CBlocks.quadruplecompressedTNT));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SOUL_SAND, 9), new ItemStack(CBlocks.compressedSoulSand));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedSoulSand, 9), new ItemStack(CBlocks.doublecompressedSoulSand));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedSoulSand, 9), new ItemStack(CBlocks.triplecompressedSoulSand));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedSoulSand, 9), new ItemStack(CBlocks.quadruplecompressedSoulSand));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.MELON_BLOCK, 9), new ItemStack(CBlocks.compressedMelon)); 
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedMelon, 9), new ItemStack(CBlocks.doublecompressedMelon));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedMelon, 9), new ItemStack(CBlocks.triplecompressedMelon));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedMelon, 9), new ItemStack(CBlocks.quadruplecompressedMelon));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.LIT_PUMPKIN, 9), new ItemStack(CBlocks.compressedJackOLantern)); 
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedJackOLantern, 9), new ItemStack(CBlocks.doublecompressedJackOLantern));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedJackOLantern, 9), new ItemStack(CBlocks.triplecompressedJackOLantern));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedJackOLantern, 9), new ItemStack(CBlocks.quadruplecompressedJackOLantern));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PUMPKIN, 9), new ItemStack(CBlocks.compressedPumpkin)); 
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedPumpkin, 9), new ItemStack(CBlocks.doublecompressedPumpkin));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedPumpkin, 9), new ItemStack(CBlocks.triplecompressedPumpkin));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedPumpkin, 9), new ItemStack(CBlocks.quadruplecompressedPumpkin));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SNOW, 9), new ItemStack(CBlocks.compressedSnow)); 
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedSnow, 9), new ItemStack(CBlocks.doublecompressedSnow));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedSnow, 9), new ItemStack(CBlocks.triplecompressedSnow));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedSnow, 9), new ItemStack(CBlocks.quadruplecompressedSnow));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.CACTUS, 9), new ItemStack(CBlocks.compressedCactus)); 
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedCactus, 9), new ItemStack(CBlocks.doublecompressedCactus));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedCactus, 9), new ItemStack(CBlocks.triplecompressedCactus));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedCactus, 9), new ItemStack(CBlocks.quadruplecompressedCactus));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.END_BRICKS, 9), new ItemStack(CBlocks.compressedEndBricks)); 
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedEndBricks, 9), new ItemStack(CBlocks.doublecompressedEndBricks));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedEndBricks, 9), new ItemStack(CBlocks.triplecompressedEndBricks));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedEndBricks, 9), new ItemStack(CBlocks.quadruplecompressedEndBricks));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.GRASS_PATH, 9), new ItemStack(CBlocks.compressedGrassPath)); 
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedGrassPath, 9), new ItemStack(CBlocks.doublecompressedGrassPath));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedGrassPath, 9), new ItemStack(CBlocks.triplecompressedGrassPath));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedGrassPath, 9), new ItemStack(CBlocks.quadruplecompressedGrassPath));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.DIRT, 9, 1), new ItemStack(CBlocks.compressedCoarseDirt)); 
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedCoarseDirt, 9), new ItemStack(CBlocks.doublecompressedCoarseDirt));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedCoarseDirt, 9), new ItemStack(CBlocks.triplecompressedCoarseDirt));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedCoarseDirt, 9), new ItemStack(CBlocks.quadruplecompressedCoarseDirt));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SEA_LANTERN, 9), new ItemStack(CBlocks.compressedSeaLantern)); 
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedSeaLantern, 9), new ItemStack(CBlocks.doublecompressedSeaLantern));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedSeaLantern, 9), new ItemStack(CBlocks.triplecompressedSeaLantern));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedSeaLantern, 9), new ItemStack(CBlocks.quadruplecompressedSeaLantern));
	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.NETHER_WART_BLOCK, 9), new ItemStack(CBlocks.compressedNetherWartBlock));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedNetherWartBlock, 9), new ItemStack(CBlocks.doublecompressedNetherWartBlock));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedNetherWartBlock, 9), new ItemStack(CBlocks.triplecompressedNetherWartBlock));
	GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedNetherWartBlock, 9), new ItemStack(CBlocks.quadruplecompressedNetherWartBlock));
	
	for (int i = 0; i < EnumHandler.ColorTypes.values().length; i++)
    {
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.WOOL, 9, i), new ItemStack(CBlocks.compressedWool, 1, i));
		GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedWool, 9, i), new ItemStack(CBlocks.doublecompressedWool, 1, i));
		GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedWool, 9, i), new ItemStack(CBlocks.triplecompressedWool, 1, i));
		GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedWool, 9, i), new ItemStack(CBlocks.quadruplecompressedWool, 1, i));
    }
	for (int i = 0; i < EnumHandler.ColorTypes.values().length; i++)
    {
        GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedWool, 1, i), new Object[] {new ItemStack(Items.DYE, 1, 15 - i), new ItemStack(Item.getItemFromBlock(CBlocks.compressedWool), 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedWool, 1, i), new Object[] {new ItemStack(Items.DYE, 1, 15 - i), new ItemStack(Item.getItemFromBlock(CBlocks.doublecompressedWool), 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedWool, 1, i), new Object[] {new ItemStack(Items.DYE, 1, 15 - i), new ItemStack(Item.getItemFromBlock(CBlocks.triplecompressedWool), 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.quadruplecompressedWool, 1, i), new Object[] {new ItemStack(Items.DYE, 1, 15 - i), new ItemStack(Item.getItemFromBlock(CBlocks.quadruplecompressedWool), 1, 0)});
    }
	for (int i = 0; i < EnumHandler.ColorTypes.values().length; i++)
    {
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_GLASS, 9, i), new ItemStack(CBlocks.compressedColorGlass, 1, i));
		GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedColorGlass, 9, i), new ItemStack(CBlocks.doublecompressedColorGlass, 1, i));
		GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedColorGlass, 9, i), new ItemStack(CBlocks.triplecompressedColorGlass, 1, i));
		GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedColorGlass, 9, i), new ItemStack(CBlocks.quadruplecompressedColorGlass, 1, i));
    }
	for (int i = 0; i < EnumHandler.ColorTypes.values().length; i++)
    {
        GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedColorGlass, 1, i), new Object[] {new ItemStack(Items.DYE, 1, 15 - i), new ItemStack(Item.getItemFromBlock(CBlocks.compressedColorGlass), 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedColorGlass, 1, i), new Object[] {new ItemStack(Items.DYE, 1, 15 - i), new ItemStack(Item.getItemFromBlock(CBlocks.doublecompressedColorGlass), 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedColorGlass, 1, i), new Object[] {new ItemStack(Items.DYE, 1, 15 - i), new ItemStack(Item.getItemFromBlock(CBlocks.triplecompressedColorGlass), 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.quadruplecompressedColorGlass, 1, i), new Object[] {new ItemStack(Items.DYE, 1, 15 - i), new ItemStack(Item.getItemFromBlock(CBlocks.quadruplecompressedColorGlass), 1, 0)});
    }
	for (int i = 0; i < EnumHandler.ColorTypes.values().length; i++)
    {
        GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedHardenedClay, 1, i), new Object[] {new ItemStack(Items.DYE, 1, 15 - i), new ItemStack(Item.getItemFromBlock(CBlocks.compressedHardenedClay), 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedHardenedClay, 1, i), new Object[] {new ItemStack(Items.DYE, 1, 15 - i), new ItemStack(Item.getItemFromBlock(CBlocks.doublecompressedHardenedClay), 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedHardenedClay, 1, i), new Object[] {new ItemStack(Items.DYE, 1, 15 - i), new ItemStack(Item.getItemFromBlock(CBlocks.triplecompressedHardenedClay), 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.quadruplecompressedHardenedClay, 1, i), new Object[] {new ItemStack(Items.DYE, 1, 15 - i), new ItemStack(Item.getItemFromBlock(CBlocks.quadruplecompressedHardenedClay), 1, 0)});
    }
	for (int i = 0; i < EnumHandler.ColorTypes.values().length; i++)
    {
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 9, i), new ItemStack(CBlocks.compressedHardenedClay, 1, i));
		GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedHardenedClay, 9, i), new ItemStack(CBlocks.doublecompressedHardenedClay, 1, i));
		GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedHardenedClay, 9, i), new ItemStack(CBlocks.triplecompressedHardenedClay, 1, i));
		GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedHardenedClay, 9, i), new ItemStack(CBlocks.quadruplecompressedHardenedClay, 1, i));
    }
	for (int i = 0; i < EnumHandler.WoodTypes.values().length; i++)
    {
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 9, i), new ItemStack(CBlocks.compressedWoodPlanks, 1, i));
		GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedWoodPlanks, 9, i), new ItemStack(CBlocks.doublecompressedWoodPlanks, 1, i));
		GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedWoodPlanks, 9, i), new ItemStack(CBlocks.triplecompressedWoodPlanks, 1, i));
		GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedWoodPlanks, 9, i), new ItemStack(CBlocks.quadruplecompressedWoodPlanks, 1, i));
    }
	for (int i = 0; i < EnumHandler.WoodTypes.values().length - 2; i++)
    {
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.LOG, 9, i), new ItemStack(CBlocks.compressedWoodLog, 1, i));
		GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedWoodLog, 9, i), new ItemStack(CBlocks.doublecompressedWoodLog, 1, i));
		GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedWoodLog, 9, i), new ItemStack(CBlocks.triplecompressedWoodLog, 1, i));
		GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedWoodLog, 9, i), new ItemStack(CBlocks.quadruplecompressedWoodLog, 1, i));
    }
	for (int i = 0; i < EnumHandler.WoodTypes.values().length - 4; i++)
    {
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.LOG2, 9, i), new ItemStack(CBlocks.compressedWoodLog, 1, i + 4));
		GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.compressedWoodLog, 9, i + 4), new ItemStack(CBlocks.doublecompressedWoodLog, 1, i + 4));
		GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.doublecompressedWoodLog, 9, i + 4), new ItemStack(CBlocks.triplecompressedWoodLog, 1, i + 4));
		GameRegistry.addShapelessRecipe(new ItemStack(CBlocks.triplecompressedWoodLog, 9, i + 4), new ItemStack(CBlocks.quadruplecompressedWoodLog, 1, i + 4));
    }
	
	Utils.getLogger().info("Shapeless Recipes loaded");
}
}
	

