package com.asher9.CompactBlocks.init;

import com.asher9.CompactBlocks.CompactBlocks;
import com.asher9.CompactBlocks.api.EnumHandler;
import com.asher9.CompactBlocks.util.CLogger;
import com.asher9.CompactBlocks.util.Utils;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class CShapedCraftingRecipe {
	

	public static void ShapedRecipe() {
		CLogger.getLogger().info("Loading Shaped Recipes...");
	
	//Compressed Blocks
		if(CompactBlocks.config.cache.activateCompressedCobblestone){
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedCobblestone), "###", "###", "###", '#', Blocks.COBBLESTONE);
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedCobblestone), "###", "###", "###", '#', CBlocks.compressedCobblestone);
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedCobblestone), "###", "###", "###", '#', CBlocks.doublecompressedCobblestone);
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedCobblestone), "###", "###", "###", '#', CBlocks.triplecompressedCobblestone);
		}
		if(CompactBlocks.config.cache.activateCompressedDirt){
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedDirt), "###", "###", "###", '#', new ItemStack(Blocks.DIRT, 1, 0));
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedDirt), "###", "###", "###", '#', CBlocks.compressedDirt);
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedDirt), "###", "###", "###", '#', CBlocks.doublecompressedDirt);
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedDirt), "###", "###", "###", '#', CBlocks.triplecompressedDirt);
		}
		if(CompactBlocks.config.cache.activateCompressedSand){
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedSand), "###", "###", "###", '#', Blocks.SAND);
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedSand),  "###", "###", "###", '#', CBlocks.compressedSand);
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedSand), "###", "###", "###", '#', CBlocks.doublecompressedSand);
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedSand), "###", "###", "###", '#', CBlocks.triplecompressedSand);
		}
		if(CompactBlocks.config.cache.activateCompressedGravel){
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedGravel), "###", "###", "###", '#', Blocks.GRAVEL);
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedGravel), "###", "###", "###", '#', CBlocks.compressedGravel);
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedGravel), "###", "###", "###", '#', CBlocks.doublecompressedGravel);
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedGravel), "###", "###", "###", '#', CBlocks.triplecompressedGravel);
		}
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedCoalBlock), "###", "###", "###", '#', Blocks.COAL_BLOCK);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedCoalBlock), "###", "###", "###", '#', CBlocks.compressedCoalBlock);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedCoalBlock), "###", "###", "###", '#', CBlocks.doublecompressedCoalBlock);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedCoalBlock), "###", "###", "###", '#', CBlocks.triplecompressedCoalBlock);
		
		GameRegistry.addShapedRecipe(new ShapedOreRecipe(CItems.ingotEnderium, true, new Object[]{ "###", "###", "###", Character.valueOf ('#'), "nuggetEnderium"}));
		GameRegistry.addShapedRecipe(new ShapedOreRecipe(CBlocks.blockEnderium, true, new Object[]{ "###", "###", "###", Character.valueOf('#'), "ingotEnderium"}));
		GameRegistry.addShapedRecipe(new ShapedOreRecipe(CItems.enderiumPickaxe, true, new Object[]{ "###", " I ", " I ", Character.valueOf('#'), "ingotEnderium", Character.valueOf('I'), Items.STICK}));
		GameRegistry.addShapedRecipe(new ShapedOreRecipe(CItems.enderiumAxe, true, new Object[]{ "## ", "#I ", " I ", Character.valueOf('#'), "ingotEnderium", Character.valueOf('I'), Items.STICK}));
		GameRegistry.addShapedRecipe(new ShapedOreRecipe(CItems.enderiumShovel, true, new Object[]{ " # ", " I ", " I ", Character.valueOf('#'), "ingotEnderium", Character.valueOf('I'), Items.STICK}));
		
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedObsidian), "###", "###", "###", '#', Blocks.OBSIDIAN);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedObsidian), "###", "###", "###", '#', CBlocks.compressedObsidian);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedObsidian), "###", "###", "###", '#', CBlocks.doublecompressedObsidian);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedObsidian), "###", "###", "###", '#', CBlocks.triplecompressedObsidian);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedEnderium), "###", "###", "###", '#', CBlocks.blockEnderium);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedEnderium), "###", "###", "###", '#', CBlocks.compressedEnderium);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedEnderium), "###", "###", "###", '#', CBlocks.doublecompressedEnderium);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedEnderium), "###", "###", "###", '#', CBlocks.triplecompressedEnderium);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedStone), "###", "###", "###", '#', Blocks.STONE);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedStone), "###", "###", "###", '#', CBlocks.compressedStone);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedStone), "###", "###", "###", '#', CBlocks.doublecompressedStone);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedStone), "###", "###", "###", '#', CBlocks.triplecompressedStone);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedClay), "###", "###", "###", '#', Blocks.CLAY);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedClay), "###", "###", "###", '#', CBlocks.compressedClay);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedClay), "###", "###", "###", '#', CBlocks.doublecompressedClay);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedClay), "###", "###", "###", '#', CBlocks.triplecompressedClay);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedBrick), "###", "###", "###", '#', Blocks.BRICK_BLOCK);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedBrick), "###", "###", "###", '#', CBlocks.compressedBrick);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedBrick), "###", "###", "###", '#', CBlocks.doublecompressedBrick);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedBrick), "###", "###", "###", '#', CBlocks.triplecompressedBrick);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedBedrock), "###", "###", "###", '#', Blocks.BEDROCK);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedBedrock), "###", "###", "###", '#', CBlocks.compressedBedrock);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedBedrock), "###", "###", "###", '#', CBlocks.doublecompressedBedrock);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedBedrock), "###", "###", "###", '#', CBlocks.triplecompressedBedrock);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedCobblestone_mossy), "###", "###", "###", '#', Blocks.MOSSY_COBBLESTONE);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedCobblestone_mossy), "###", "###", "###", '#', CBlocks.compressedCobblestone_mossy);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedCobblestone_mossy), "###", "###", "###", '#', CBlocks.doublecompressedCobblestone_mossy);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedCobblestone_mossy), "###", "###", "###", '#', CBlocks.triplecompressedCobblestone_mossy);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedDiamondBlock), "###", "###", "###", '#', Blocks.DIAMOND_BLOCK);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedDiamondBlock), "###", "###", "###", '#', CBlocks.compressedDiamondBlock);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedDiamondBlock), "###", "###", "###", '#', CBlocks.doublecompressedDiamondBlock);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedDiamondBlock), "###", "###", "###", '#', CBlocks.triplecompressedDiamondBlock);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedEmeraldBlock), "###", "###", "###", '#', Blocks.EMERALD_BLOCK);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedEmeraldBlock), "###", "###", "###", '#', CBlocks.compressedEmeraldBlock);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedEmeraldBlock), "###", "###", "###", '#', CBlocks.doublecompressedEmeraldBlock);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedEmeraldBlock), "###", "###", "###", '#', CBlocks.triplecompressedEmeraldBlock);
		if(CompactBlocks.config.cache.activateCompressedEndStone){
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedEndStone), "###", "###", "###", '#', Blocks.END_STONE);
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedEndStone), "###", "###", "###", '#', CBlocks.compressedEndStone);
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedEndStone), "###", "###", "###", '#', CBlocks.doublecompressedEndStone);
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedEndStone), "###", "###", "###", '#', CBlocks.triplecompressedEndStone);
		}
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedGlowstone), "###", "###", "###", '#', Blocks.GLOWSTONE);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedGlowstone), "###", "###", "###", '#', CBlocks.compressedGlowstone);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedGlowstone), "###", "###", "###", '#', CBlocks.doublecompressedGlowstone);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedGlowstone), "###", "###", "###", '#', CBlocks.triplecompressedGlowstone);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedGlassBlock), "###", "###", "###", '#', Blocks.GLASS);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedGlassBlock), "###", "###", "###", '#', CBlocks.compressedGlassBlock);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedGlassBlock), "###", "###", "###", '#', CBlocks.doublecompressedGlassBlock);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedGlassBlock), "###", "###", "###", '#', CBlocks.triplecompressedGlassBlock);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedGoldBlock), "###", "###", "###", '#', Blocks.GOLD_BLOCK);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedGoldBlock), "###", "###", "###", '#', CBlocks.compressedGoldBlock);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedGoldBlock), "###", "###", "###", '#', CBlocks.doublecompressedGoldBlock);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedGoldBlock), "###", "###", "###", '#', CBlocks.triplecompressedGoldBlock);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedHayBlock), "###", "###", "###", '#', Blocks.HAY_BLOCK);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedHayBlock), "###", "###", "###", '#', CBlocks.compressedHayBlock);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedHayBlock), "###", "###", "###", '#', CBlocks.doublecompressedHayBlock);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedHayBlock), "###", "###", "###", '#', CBlocks.triplecompressedHayBlock);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedIce), "###", "###", "###", '#', Blocks.ICE);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedIce), "###", "###", "###", '#', CBlocks.compressedIce);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedIce), "###", "###", "###", '#', CBlocks.doublecompressedIce);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedIce), "###", "###", "###", '#', CBlocks.triplecompressedIce);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedIronBlock), "###", "###", "###", '#', Blocks.IRON_BLOCK);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedIronBlock), "###", "###", "###", '#', CBlocks.compressedIronBlock);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedIronBlock), "###", "###", "###", '#', CBlocks.doublecompressedIronBlock);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedIronBlock), "###", "###", "###", '#', CBlocks.triplecompressedIronBlock);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedLapisBlock), "###", "###", "###", '#', Blocks.LAPIS_BLOCK);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedLapisBlock), "###", "###", "###", '#', CBlocks.compressedLapisBlock);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedLapisBlock), "###", "###", "###", '#', CBlocks.doublecompressedLapisBlock);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedLapisBlock), "###", "###", "###", '#', CBlocks.triplecompressedLapisBlock);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedNetherBrick), "###", "###", "###", '#', Blocks.NETHER_BRICK);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedNetherBrick), "###", "###", "###", '#', CBlocks.compressedNetherBrick);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedNetherBrick), "###", "###", "###", '#', CBlocks.doublecompressedNetherBrick);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedNetherBrick), "###", "###", "###", '#', CBlocks.triplecompressedNetherBrick);
		if(CompactBlocks.config.cache.activateCompressedNetherrack){
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedNetherrack), "###", "###", "###", '#', Blocks.NETHERRACK);
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedNetherrack), "###", "###", "###", '#', CBlocks.compressedNetherrack);
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedNetherrack), "###", "###", "###", '#', CBlocks.doublecompressedNetherrack);
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedNetherrack), "###", "###", "###", '#', CBlocks.triplecompressedNetherrack);
		}
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedRedstoneBlock), "###", "###", "###", '#', Blocks.REDSTONE_BLOCK);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedRedstoneBlock), "###", "###", "###", '#', CBlocks.compressedRedstoneBlock);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedRedstoneBlock), "###", "###", "###", '#', CBlocks.doublecompressedRedstoneBlock);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedRedstoneBlock), "###", "###", "###", '#', CBlocks.triplecompressedRedstoneBlock);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedRedSand), "###", "###", "###", '#', (new ItemStack(Blocks.SAND, 1, 1)));
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedRedSand),  "###", "###", "###", '#', CBlocks.compressedRedSand);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedRedSand), "###", "###", "###", '#', CBlocks.doublecompressedRedSand);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedRedSand), "###", "###", "###", '#', CBlocks.triplecompressedRedSand);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedStoneBrick), "###", "###", "###", '#', (new ItemStack(Blocks.STONEBRICK, 1, 0)));
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedStoneBrick),  "###", "###", "###", '#', CBlocks.compressedStoneBrick);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedStoneBrick), "###", "###", "###", '#', CBlocks.doublecompressedStoneBrick);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedStoneBrick), "###", "###", "###", '#', CBlocks.triplecompressedStoneBrick);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedStoneBrickChiseled), "###", "###", "###", '#', (new ItemStack(Blocks.STONEBRICK, 1, 3)));
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedStoneBrickChiseled),  "###", "###", "###", '#', CBlocks.compressedStoneBrickChiseled);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedStoneBrickChiseled), "###", "###", "###", '#', CBlocks.doublecompressedStoneBrickChiseled);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedStoneBrickChiseled), "###", "###", "###", '#', CBlocks.triplecompressedStoneBrickChiseled);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedStoneBrickCracked), "###", "###", "###", '#', (new ItemStack(Blocks.STONEBRICK, 1, 2)));
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedStoneBrickCracked),  "###", "###", "###", '#', CBlocks.compressedStoneBrickCracked);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedStoneBrickCracked), "###", "###", "###", '#', CBlocks.doublecompressedStoneBrickCracked);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedStoneBrickCracked), "###", "###", "###", '#', CBlocks.triplecompressedStoneBrickCracked);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedStoneBrickMossy), "###", "###", "###", '#', (new ItemStack(Blocks.STONEBRICK, 1, 1)));
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedStoneBrickMossy),  "###", "###", "###", '#', CBlocks.compressedStoneBrickMossy);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedStoneBrickMossy), "###", "###", "###", '#', CBlocks.doublecompressedStoneBrickMossy);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedStoneBrickMossy), "###", "###", "###", '#', CBlocks.triplecompressedStoneBrickMossy);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedSponge), "###", "###", "###", '#', Blocks.SPONGE);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedSponge),  "###", "###", "###", '#', CBlocks.compressedSponge);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedSponge), "###", "###", "###", '#', CBlocks.doublecompressedSponge);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedSponge), "###", "###", "###", '#', CBlocks.triplecompressedSponge);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedBookshelf), "###", "###", "###", '#', Blocks.BOOKSHELF);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedBookshelf),  "###", "###", "###", '#', CBlocks.compressedBookshelf);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedBookshelf), "###", "###", "###", '#', CBlocks.doublecompressedBookshelf);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedBookshelf), "###", "###", "###", '#', CBlocks.triplecompressedBookshelf);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedCraftingTable), "###", "###", "###", '#', Blocks.CRAFTING_TABLE);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedCraftingTable),  "###", "###", "###", '#', CBlocks.compressedCraftingTable);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedCraftingTable), "###", "###", "###", '#', CBlocks.doublecompressedCraftingTable);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedCraftingTable), "###", "###", "###", '#', CBlocks.triplecompressedCraftingTable);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedHardenedClay_ST), "###", "###", "###", '#', Blocks.HARDENED_CLAY);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedHardenedClay_ST),  "###", "###", "###", '#', CBlocks.compressedHardenedClay_ST);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedHardenedClay_ST), "###", "###", "###", '#', CBlocks.doublecompressedHardenedClay_ST);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedHardenedClay_ST), "###", "###", "###", '#', CBlocks.triplecompressedHardenedClay_ST);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedCoalOre), "###", "###", "###", '#', Blocks.COAL_ORE);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedCoalOre),  "###", "###", "###", '#', CBlocks.compressedCoalOre);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedCoalOre), "###", "###", "###", '#', CBlocks.doublecompressedCoalOre);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedCoalOre), "###", "###", "###", '#', CBlocks.triplecompressedCoalOre);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedDiamondOre), "###", "###", "###", '#', Blocks.DIAMOND_ORE);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedDiamondOre),  "###", "###", "###", '#', CBlocks.compressedDiamondOre);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedDiamondOre), "###", "###", "###", '#', CBlocks.doublecompressedDiamondOre);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedDiamondOre), "###", "###", "###", '#', CBlocks.triplecompressedDiamondOre);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedEmeraldOre), "###", "###", "###", '#', Blocks.EMERALD_ORE);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedEmeraldOre),  "###", "###", "###", '#', CBlocks.compressedEmeraldOre);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedEmeraldOre), "###", "###", "###", '#', CBlocks.doublecompressedEmeraldOre);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedEmeraldOre), "###", "###", "###", '#', CBlocks.triplecompressedEmeraldOre);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedGoldOre), "###", "###", "###", '#', Blocks.GOLD_ORE);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedGoldOre),  "###", "###", "###", '#', CBlocks.compressedGoldOre);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedGoldOre), "###", "###", "###", '#', CBlocks.doublecompressedGoldOre);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedGoldOre), "###", "###", "###", '#', CBlocks.triplecompressedGoldOre);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedIronOre), "###", "###", "###", '#', Blocks.IRON_ORE);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedIronOre),  "###", "###", "###", '#', CBlocks.compressedIronOre);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedIronOre), "###", "###", "###", '#', CBlocks.doublecompressedIronOre);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedIronOre), "###", "###", "###", '#', CBlocks.triplecompressedIronOre);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedPodzol), "###", "###", "###", '#', new ItemStack(Blocks.DIRT, 1, 2));
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedPodzol),  "###", "###", "###", '#', CBlocks.compressedPodzol);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedPodzol), "###", "###", "###", '#', CBlocks.doublecompressedPodzol);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedPodzol), "###", "###", "###", '#', CBlocks.triplecompressedPodzol);	
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedQuartzBlock), "###", "###", "###", '#', new ItemStack(Blocks.QUARTZ_BLOCK, 1, 0));
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedQuartzBlock),  "###", "###", "###", '#', CBlocks.compressedQuartzBlock);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedQuartzBlock), "###", "###", "###", '#', CBlocks.doublecompressedQuartzBlock);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedQuartzBlock), "###", "###", "###", '#', CBlocks.triplecompressedQuartzBlock);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedQuartzChiseled), "###", "###", "###", '#', new ItemStack(Blocks.QUARTZ_BLOCK, 1, 1));
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedQuartzChiseled),  "###", "###", "###", '#', CBlocks.compressedQuartzChiseled);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedQuartzChiseled), "###", "###", "###", '#', CBlocks.doublecompressedQuartzChiseled);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedQuartzChiseled), "###", "###", "###", '#', CBlocks.triplecompressedQuartzChiseled);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedQuartzLines), "###", "###", "###", '#', new ItemStack(Blocks.QUARTZ_BLOCK, 1, 2));
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedQuartzLines),  "###", "###", "###", '#', CBlocks.compressedQuartzLines);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedQuartzLines), "###", "###", "###", '#', CBlocks.doublecompressedQuartzLines);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedQuartzLines), "###", "###", "###", '#', CBlocks.triplecompressedQuartzLines);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedTNT), "###", "###", "###", '#', Blocks.TNT);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedTNT),  "###", "###", "###", '#', CBlocks.compressedTNT);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedTNT), "###", "###", "###", '#', CBlocks.doublecompressedTNT);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedTNT), "###", "###", "###", '#', CBlocks.triplecompressedTNT);
		if(CompactBlocks.config.cache.activateCompressedSoulSand){
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedSoulSand), "###", "###", "###", '#', Blocks.SOUL_SAND);
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedSoulSand),  "###", "###", "###", '#', CBlocks.compressedSoulSand);
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedSoulSand), "###", "###", "###", '#', CBlocks.doublecompressedSoulSand);
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedSoulSand), "###", "###", "###", '#', CBlocks.triplecompressedSoulSand);
		}
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedMelon), "###", "###", "###", '#', Blocks.MELON_BLOCK);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedMelon),  "###", "###", "###", '#', CBlocks.compressedMelon);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedMelon), "###", "###", "###", '#', CBlocks.doublecompressedMelon);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedMelon), "###", "###", "###", '#', CBlocks.triplecompressedMelon);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedJackOLantern), "###", "###", "###", '#', Blocks.LIT_PUMPKIN);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedJackOLantern),  "###", "###", "###", '#', CBlocks.compressedJackOLantern);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedJackOLantern), "###", "###", "###", '#', CBlocks.doublecompressedJackOLantern);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedJackOLantern), "###", "###", "###", '#', CBlocks.triplecompressedJackOLantern);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedPumpkin), "###", "###", "###", '#', Blocks.PUMPKIN);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedPumpkin),  "###", "###", "###", '#', CBlocks.compressedPumpkin);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedPumpkin), "###", "###", "###", '#', CBlocks.doublecompressedPumpkin);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedPumpkin), "###", "###", "###", '#', CBlocks.triplecompressedPumpkin);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedSnow), "###", "###", "###", '#', Blocks.SNOW);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedSnow),  "###", "###", "###", '#', CBlocks.compressedSnow);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedSnow), "###", "###", "###", '#', CBlocks.doublecompressedSnow);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedSnow), "###", "###", "###", '#', CBlocks.triplecompressedSnow);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedCactus), "###", "###", "###", '#', Blocks.CACTUS);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedCactus),  "###", "###", "###", '#', CBlocks.compressedCactus);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedCactus), "###", "###", "###", '#', CBlocks.doublecompressedCactus);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedCactus), "###", "###", "###", '#', CBlocks.triplecompressedCactus);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedEndBricks), "###", "###", "###", '#', Blocks.END_BRICKS);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedEndBricks),  "###", "###", "###", '#', CBlocks.compressedEndBricks);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedEndBricks), "###", "###", "###", '#', CBlocks.doublecompressedEndBricks);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedEndBricks), "###", "###", "###", '#', CBlocks.triplecompressedEndBricks);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedGrassPath), "###", "###", "###", '#', Blocks.GRASS_PATH);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedGrassPath),  "###", "###", "###", '#', CBlocks.compressedGrassPath);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedGrassPath), "###", "###", "###", '#', CBlocks.doublecompressedGrassPath);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedGrassPath), "###", "###", "###", '#', CBlocks.triplecompressedGrassPath);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedCoarseDirt), "###", "###", "###", '#', new ItemStack(Blocks.DIRT, 1, 1));
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedCoarseDirt),  "###", "###", "###", '#', CBlocks.compressedCoarseDirt);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedCoarseDirt), "###", "###", "###", '#', CBlocks.doublecompressedCoarseDirt);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedCoarseDirt), "###", "###", "###", '#', CBlocks.triplecompressedCoarseDirt);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedSeaLantern), "###", "###", "###", '#', Blocks.SEA_LANTERN);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedSeaLantern),  "###", "###", "###", '#', CBlocks.compressedSeaLantern);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedSeaLantern), "###", "###", "###", '#', CBlocks.doublecompressedSeaLantern);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedSeaLantern), "###", "###", "###", '#', CBlocks.triplecompressedSeaLantern);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedNetherWartBlock), "###", "###", "###", '#', Blocks.NETHER_WART_BLOCK);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedNetherWartBlock),  "###", "###", "###", '#', CBlocks.compressedNetherWartBlock);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedNetherWartBlock), "###", "###", "###", '#', CBlocks.doublecompressedNetherWartBlock);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedNetherWartBlock), "###", "###", "###", '#', CBlocks.triplecompressedNetherWartBlock);
		
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedMagmaBlock), "###", "###", "###", '#', Blocks.MAGMA);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedMagmaBlock),  "###", "###", "###", '#', CBlocks.compressedMagmaBlock);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedMagmaBlock), "###", "###", "###", '#', CBlocks.doublecompressedMagmaBlock);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedMagmaBlock), "###", "###", "###", '#', CBlocks.triplecompressedMagmaBlock);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedMycelium), "###", "###", "###", '#', Blocks.MYCELIUM);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedMycelium),  "###", "###", "###", '#', CBlocks.compressedMycelium);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedMycelium), "###", "###", "###", '#', CBlocks.doublecompressedMycelium);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedMycelium), "###", "###", "###", '#', CBlocks.triplecompressedMycelium);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedPrismarineBricks), "###", "###", "###", '#', new ItemStack(Blocks.PRISMARINE, 1, 1));
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedPrismarineBricks),  "###", "###", "###", '#', CBlocks.compressedPrismarineBricks);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedPrismarineBricks), "###", "###", "###", '#', CBlocks.doublecompressedPrismarineBricks);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedPrismarineBricks), "###", "###", "###", '#', CBlocks.triplecompressedPrismarineBricks);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedPrismarineDark), "###", "###", "###", '#', new ItemStack(Blocks.PRISMARINE, 1, 2));
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedPrismarineDark),  "###", "###", "###", '#', CBlocks.compressedPrismarineDark);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedPrismarineDark), "###", "###", "###", '#', CBlocks.doublecompressedPrismarineDark);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedPrismarineDark), "###", "###", "###", '#', CBlocks.triplecompressedPrismarineDark);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedPrismarineRough), "###", "###", "###", '#', new ItemStack(Blocks.PRISMARINE, 1, 0));
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedPrismarineRough),  "###", "###", "###", '#', CBlocks.compressedPrismarineRough);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedPrismarineRough), "###", "###", "###", '#', CBlocks.doublecompressedPrismarineRough);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedPrismarineRough), "###", "###", "###", '#', CBlocks.triplecompressedPrismarineRough);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedPurpurBlock), "###", "###", "###", '#', Blocks.PURPUR_BLOCK);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedPurpurBlock),  "###", "###", "###", '#', CBlocks.compressedPurpurBlock);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedPurpurBlock), "###", "###", "###", '#', CBlocks.doublecompressedPurpurBlock);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedPurpurBlock), "###", "###", "###", '#', CBlocks.triplecompressedPurpurBlock);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedPurpurPillar), "###", "###", "###", '#', Blocks.PURPUR_PILLAR);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedPurpurPillar),  "###", "###", "###", '#', CBlocks.compressedPurpurPillar);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedPurpurPillar), "###", "###", "###", '#', CBlocks.doublecompressedPurpurPillar);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedPurpurPillar), "###", "###", "###", '#', CBlocks.triplecompressedPurpurPillar);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedQuartzOre), "###", "###", "###", '#', Blocks.QUARTZ_ORE);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedQuartzOre),  "###", "###", "###", '#', CBlocks.compressedQuartzOre);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedQuartzOre), "###", "###", "###", '#', CBlocks.doublecompressedQuartzOre);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedQuartzOre), "###", "###", "###", '#', CBlocks.triplecompressedQuartzOre);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedSlime), "###", "###", "###", '#', Blocks.SLIME_BLOCK);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedSlime),  "###", "###", "###", '#', CBlocks.compressedSlime);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedSlime), "###", "###", "###", '#', CBlocks.doublecompressedSlime);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedSlime), "###", "###", "###", '#', CBlocks.triplecompressedSlime);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedRedSandstone), "###", "###", "###", '#', new ItemStack(Blocks.RED_SANDSTONE, 1, 0));
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedRedSandstone),  "###", "###", "###", '#', CBlocks.compressedRedSandstone);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedRedSandstone), "###", "###", "###", '#', CBlocks.doublecompressedRedSandstone);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedRedSandstone), "###", "###", "###", '#', CBlocks.triplecompressedRedSandstone);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedRedSandstoneCarved), "###", "###", "###", '#', new ItemStack(Blocks.RED_SANDSTONE, 1, 1));
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedRedSandstoneCarved),  "###", "###", "###", '#', CBlocks.compressedRedSandstoneCarved);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedRedSandstoneCarved), "###", "###", "###", '#', CBlocks.doublecompressedRedSandstoneCarved);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedRedSandstoneCarved), "###", "###", "###", '#', CBlocks.triplecompressedRedSandstoneCarved);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedRedSandstoneSmooth), "###", "###", "###", '#', new ItemStack(Blocks.RED_SANDSTONE, 1, 2));
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedRedSandstoneSmooth),  "###", "###", "###", '#', CBlocks.compressedRedSandstoneSmooth);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedRedSandstoneSmooth), "###", "###", "###", '#', CBlocks.doublecompressedRedSandstoneSmooth);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedRedSandstoneSmooth), "###", "###", "###", '#', CBlocks.triplecompressedRedSandstoneSmooth);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedSpongeWet), "###", "###", "###", '#', new ItemStack(Blocks.SPONGE, 1, 1));
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedSpongeWet),  "###", "###", "###", '#', CBlocks.compressedSpongeWet);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedSpongeWet), "###", "###", "###", '#', CBlocks.doublecompressedSpongeWet);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedSpongeWet), "###", "###", "###", '#', CBlocks.triplecompressedSpongeWet);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedAndersite), "###", "###", "###", '#', new ItemStack(Blocks.STONE, 1, 5));
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedAndersite),  "###", "###", "###", '#', CBlocks.compressedAndersite);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedAndersite), "###", "###", "###", '#', CBlocks.doublecompressedAndersite);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedAndersite), "###", "###", "###", '#', CBlocks.triplecompressedAndersite);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedAndersiteSmooth), "###", "###", "###", '#', new ItemStack(Blocks.STONE, 1, 6));
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedAndersiteSmooth),  "###", "###", "###", '#', CBlocks.compressedAndersiteSmooth);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedAndersiteSmooth), "###", "###", "###", '#', CBlocks.doublecompressedAndersiteSmooth);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedAndersiteSmooth), "###", "###", "###", '#', CBlocks.triplecompressedAndersiteSmooth);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedDiorite), "###", "###", "###", '#', new ItemStack(Blocks.STONE, 1, 3));
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedDiorite),  "###", "###", "###", '#', CBlocks.compressedDiorite);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedDiorite), "###", "###", "###", '#', CBlocks.doublecompressedDiorite);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedDiorite), "###", "###", "###", '#', CBlocks.triplecompressedDiorite);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedDioriteSmooth), "###", "###", "###", '#', new ItemStack(Blocks.STONE, 1, 4));
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedDioriteSmooth),  "###", "###", "###", '#', CBlocks.compressedDioriteSmooth);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedDioriteSmooth), "###", "###", "###", '#', CBlocks.doublecompressedDioriteSmooth);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedDioriteSmooth), "###", "###", "###", '#', CBlocks.triplecompressedDioriteSmooth);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedGranite), "###", "###", "###", '#', new ItemStack(Blocks.STONE, 1, 1));
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedGranite),  "###", "###", "###", '#', CBlocks.compressedGranite);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedGranite), "###", "###", "###", '#', CBlocks.doublecompressedGranite);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedGranite), "###", "###", "###", '#', CBlocks.triplecompressedGranite);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedGraniteSmooth), "###", "###", "###", '#', new ItemStack(Blocks.STONE, 1, 2));
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedGraniteSmooth),  "###", "###", "###", '#', CBlocks.compressedGraniteSmooth);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedGraniteSmooth), "###", "###", "###", '#', CBlocks.doublecompressedGraniteSmooth);
		GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedGraniteSmooth), "###", "###", "###", '#', CBlocks.triplecompressedGraniteSmooth);
		
		for (int i = 0; i < EnumHandler.ColorTypes.values().length; i++)
	    {
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedWool, 1, i), "###", "###", "###", '#', new ItemStack(Blocks.WOOL, 1, i));
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedWool, 1, i),  "###", "###", "###", '#', new ItemStack(CBlocks.compressedWool, 1, i));
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedWool, 1, i), "###", "###", "###", '#', new ItemStack(CBlocks.doublecompressedWool, 1, i));
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedWool, 1, i), "###", "###", "###", '#', new ItemStack(CBlocks.triplecompressedWool, 1, i));
	    }
		for (int i = 0; i < EnumHandler.ColorTypes.values().length; i++)
	    {
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedHardenedClay, 1, i), "###", "###", "###", '#', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, i));
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedHardenedClay, 1, i),  "###", "###", "###", '#', new ItemStack(CBlocks.compressedHardenedClay, 1, i));
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedHardenedClay, 1, i), "###", "###", "###", '#', new ItemStack(CBlocks.doublecompressedHardenedClay, 1, i));
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedHardenedClay, 1, i), "###", "###", "###", '#', new ItemStack(CBlocks.triplecompressedHardenedClay, 1, i));
	    }
		for (int i = 0; i < EnumHandler.ColorTypes.values().length; i++)
	    {
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedColorGlass, 1, i), "###", "###", "###", '#', new ItemStack(Blocks.STAINED_GLASS, 1, i));
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedColorGlass, 1, i),  "###", "###", "###", '#', new ItemStack(CBlocks.compressedColorGlass, 1, i));
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedColorGlass, 1, i), "###", "###", "###", '#', new ItemStack(CBlocks.doublecompressedColorGlass, 1, i));
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedColorGlass, 1, i), "###", "###", "###", '#', new ItemStack(CBlocks.triplecompressedColorGlass, 1, i));
	    }
		for (int i = 0; i < EnumHandler.WoodTypes.values().length; i++)
	    {
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedWoodPlanks, 1, i), "###", "###", "###", '#', new ItemStack(Blocks.PLANKS, 1, i));
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedWoodPlanks, 1, i),  "###", "###", "###", '#', new ItemStack(CBlocks.compressedWoodPlanks, 1, i));
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedWoodPlanks, 1, i), "###", "###", "###", '#', new ItemStack(CBlocks.doublecompressedWoodPlanks, 1, i));
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedWoodPlanks, 1, i), "###", "###", "###", '#', new ItemStack(CBlocks.triplecompressedWoodPlanks, 1, i));
	    }
		for (int i = 0; i < EnumHandler.WoodTypes.values().length - 2; i++)
	    {
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedWoodLog, 1, i), "###", "###", "###", '#', new ItemStack(Blocks.LOG, 1, i));
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedWoodLog, 1, i),  "###", "###", "###", '#', new ItemStack(CBlocks.compressedWoodLog, 1, i));
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedWoodLog, 1, i), "###", "###", "###", '#', new ItemStack(CBlocks.doublecompressedWoodLog, 1, i));
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedWoodLog, 1, i), "###", "###", "###", '#', new ItemStack(CBlocks.triplecompressedWoodLog, 1, i));
	    }
		for (int i = 0; i < EnumHandler.WoodTypes.values().length - 4; i++)
	    {
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.compressedWoodLog, 1, i + 4), "###", "###", "###", '#', new ItemStack(Blocks.LOG2, 1, i));
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.doublecompressedWoodLog, 1, i + 4),  "###", "###", "###", '#', new ItemStack(CBlocks.compressedWoodLog, 1, i + 4));
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.triplecompressedWoodLog, 1, i + 4), "###", "###", "###", '#', new ItemStack(CBlocks.doublecompressedWoodLog, 1, i + 4));
			GameRegistry.addShapedRecipe(new ItemStack(CBlocks.quadruplecompressedWoodLog, 1, i + 4), "###", "###", "###", '#', new ItemStack(CBlocks.triplecompressedWoodLog, 1, i + 4));
	    }
			
		if(CompactBlocks.config.cache.activateCobblestonePickaxe){
			GameRegistry.addShapedRecipe(new ItemStack(CItems.compressedCobblestonePickaxe), "###", " I ", " I ", '#', CBlocks.quadruplecompressedCobblestone, 'I', Items.STICK);
		}
		if(CompactBlocks.config.cache.activateSandPickaxe){
			GameRegistry.addShapedRecipe(new ItemStack(CItems.compressedSandPickaxe), "###", " I ", " I ", '#', CBlocks.quadruplecompressedSand, 'I', Items.STICK);
		}
		if(CompactBlocks.config.cache.activateDirtPickaxe){
			GameRegistry.addShapedRecipe(new ItemStack(CItems.compressedDirtPickaxe), "###", " I ", " I ", '#', CBlocks.quadruplecompressedDirt, 'I', Items.STICK);
		}
		if(CompactBlocks.config.cache.activateGravelPickaxe){
			GameRegistry.addShapedRecipe(new ItemStack(CItems.compressedGravelPickaxe), "###", " I ",  " I ", '#', CBlocks.quadruplecompressedGravel, 'I', Items.STICK);
		}
	    
	    
		CLogger.getLogger().info("Shaped Recipes loaded");
		}
	}



