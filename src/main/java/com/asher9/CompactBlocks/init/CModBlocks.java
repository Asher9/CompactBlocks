package com.asher9.CompactBlocks.init;

import com.asher9.CompactBlocks.Reference;
import com.asher9.CompactBlocks.ItemBlocks.ItemBlockMeta;
import com.asher9.CompactBlocks.api.EnumHandler;
import com.asher9.CompactBlocks.util.Utils;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CModBlocks {
	
	public static void register() {
		registerBlock(CBlocks.compressedCobblestone);
		registerBlock(CBlocks.doublecompressedCobblestone);
		registerBlock(CBlocks.triplecompressedCobblestone);
		registerBlock(CBlocks.quadruplecompressedCobblestone);
		registerBlock(CBlocks.compressedDirt);
		registerBlock(CBlocks.doublecompressedDirt);
		registerBlock(CBlocks.triplecompressedDirt);
		registerBlock(CBlocks.quadruplecompressedDirt);
		registerBlock(CBlocks.compressedSand);
		registerBlock(CBlocks.doublecompressedSand);
		registerBlock(CBlocks.triplecompressedSand);
		registerBlock(CBlocks.quadruplecompressedSand);
		registerBlock(CBlocks.compressedGravel);
		registerBlock(CBlocks.doublecompressedGravel);
		registerBlock(CBlocks.triplecompressedGravel);
		registerBlock(CBlocks.quadruplecompressedGravel);
		registerBlock(CBlocks.compressedCoalBlock);
		registerBlock(CBlocks.doublecompressedCoalBlock);
		registerBlock(CBlocks.triplecompressedCoalBlock);
		registerBlock(CBlocks.quadruplecompressedCoalBlock);
		registerBlock(CBlocks.blockEnderium);
		registerBlock(CBlocks.oreEnderium);
		registerBlock(CBlocks.oreNetherEnderium);
		registerBlock(CBlocks.oreEndEnderium);
		registerBlock(CBlocks.compressedObsidian);
		registerBlock(CBlocks.doublecompressedObsidian);
		registerBlock(CBlocks.triplecompressedObsidian);
		registerBlock(CBlocks.quadruplecompressedObsidian);
		registerBlock(CBlocks.compressedEnderium);
		registerBlock(CBlocks.doublecompressedEnderium);
		registerBlock(CBlocks.triplecompressedEnderium);
		registerBlock(CBlocks.quadruplecompressedEnderium);
		registerBlock(CBlocks.testSidedBlock);
		registerBlock(CBlocks.compressedStone);
		registerBlock(CBlocks.doublecompressedStone);
		registerBlock(CBlocks.triplecompressedStone);
		registerBlock(CBlocks.quadruplecompressedStone);
		registerBlock(CBlocks.compressedClay);
		registerBlock(CBlocks.doublecompressedClay);
		registerBlock(CBlocks.triplecompressedClay);
		registerBlock(CBlocks.quadruplecompressedClay);
		registerBlock(CBlocks.compressedBrick);
		registerBlock(CBlocks.doublecompressedBrick);
		registerBlock(CBlocks.triplecompressedBrick);
		registerBlock(CBlocks.quadruplecompressedBrick);
		registerBlock(CBlocks.compressedBedrock);
		registerBlock(CBlocks.doublecompressedBedrock);
		registerBlock(CBlocks.triplecompressedBedrock);
		registerBlock(CBlocks.quadruplecompressedBedrock);
		registerBlock(CBlocks.compressedCobblestone_mossy);
		registerBlock(CBlocks.doublecompressedCobblestone_mossy);
		registerBlock(CBlocks.triplecompressedCobblestone_mossy);
		registerBlock(CBlocks.quadruplecompressedCobblestone_mossy);
		registerBlock(CBlocks.compressedDiamondBlock);
		registerBlock(CBlocks.doublecompressedDiamondBlock);
		registerBlock(CBlocks.triplecompressedDiamondBlock);
		registerBlock(CBlocks.quadruplecompressedDiamondBlock);
		registerBlock(CBlocks.compressedEmeraldBlock);
		registerBlock(CBlocks.doublecompressedEmeraldBlock);
		registerBlock(CBlocks.triplecompressedEmeraldBlock);
		registerBlock(CBlocks.quadruplecompressedEmeraldBlock);
		registerBlock(CBlocks.compressedEndStone);
		registerBlock(CBlocks.doublecompressedEndStone);
		registerBlock(CBlocks.triplecompressedEndStone);
		registerBlock(CBlocks.quadruplecompressedEndStone);
		registerBlock(CBlocks.compressedGlowstone);
		registerBlock(CBlocks.doublecompressedGlowstone);
		registerBlock(CBlocks.triplecompressedGlowstone);
		registerBlock(CBlocks.quadruplecompressedGlowstone);
		registerBlock(CBlocks.compressedGlassBlock);
		registerBlock(CBlocks.doublecompressedGlassBlock);
		registerBlock(CBlocks.triplecompressedGlassBlock);
		registerBlock(CBlocks.quadruplecompressedGlassBlock);
		registerBlock(CBlocks.compressedGoldBlock);
		registerBlock(CBlocks.doublecompressedGoldBlock);
		registerBlock(CBlocks.triplecompressedGoldBlock);
		registerBlock(CBlocks.quadruplecompressedGoldBlock);
		registerBlock(CBlocks.compressedHayBlock);
		registerBlock(CBlocks.doublecompressedHayBlock);
		registerBlock(CBlocks.triplecompressedHayBlock);
		registerBlock(CBlocks.quadruplecompressedHayBlock);
		registerBlock(CBlocks.compressedIce);
		registerBlock(CBlocks.doublecompressedIce);
		registerBlock(CBlocks.triplecompressedIce);
		registerBlock(CBlocks.quadruplecompressedIce);
		registerBlock(CBlocks.compressedIronBlock);
		registerBlock(CBlocks.doublecompressedIronBlock);
		registerBlock(CBlocks.triplecompressedIronBlock);
		registerBlock(CBlocks.quadruplecompressedIronBlock);
		registerBlock(CBlocks.compressedLapisBlock);
		registerBlock(CBlocks.doublecompressedLapisBlock);
		registerBlock(CBlocks.triplecompressedLapisBlock);
		registerBlock(CBlocks.quadruplecompressedLapisBlock);
		registerBlock(CBlocks.compressedNetherBrick);
		registerBlock(CBlocks.doublecompressedNetherBrick);
		registerBlock(CBlocks.triplecompressedNetherBrick);
		registerBlock(CBlocks.quadruplecompressedNetherBrick);
		registerBlock(CBlocks.compressedWoodPlanks, new ItemBlockMeta(CBlocks.compressedWoodPlanks));
		registerBlock(CBlocks.doublecompressedWoodPlanks, new ItemBlockMeta(CBlocks.doublecompressedWoodPlanks));
		registerBlock(CBlocks.triplecompressedWoodPlanks, new ItemBlockMeta(CBlocks.triplecompressedWoodPlanks));
		registerBlock(CBlocks.quadruplecompressedWoodPlanks, new ItemBlockMeta(CBlocks.quadruplecompressedWoodPlanks));
		registerBlock(CBlocks.compressedNetherrack);
		registerBlock(CBlocks.doublecompressedNetherrack);
		registerBlock(CBlocks.triplecompressedNetherrack);
		registerBlock(CBlocks.quadruplecompressedNetherrack);
		registerBlock(CBlocks.compressedRedstoneBlock);
		registerBlock(CBlocks.doublecompressedRedstoneBlock);
		registerBlock(CBlocks.triplecompressedRedstoneBlock);
		registerBlock(CBlocks.quadruplecompressedRedstoneBlock);
		registerBlock(CBlocks.compressedRedSand);
		registerBlock(CBlocks.doublecompressedRedSand);
		registerBlock(CBlocks.triplecompressedRedSand);
		registerBlock(CBlocks.quadruplecompressedRedSand);
		registerBlock(CBlocks.compressedStoneBrick);
		registerBlock(CBlocks.doublecompressedStoneBrick);
		registerBlock(CBlocks.triplecompressedStoneBrick);
		registerBlock(CBlocks.quadruplecompressedStoneBrick);
		registerBlock(CBlocks.compressedStoneBrickChiseled);
		registerBlock(CBlocks.doublecompressedStoneBrickChiseled);
		registerBlock(CBlocks.triplecompressedStoneBrickChiseled);
		registerBlock(CBlocks.quadruplecompressedStoneBrickChiseled);
		registerBlock(CBlocks.compressedStoneBrickCracked);
		registerBlock(CBlocks.doublecompressedStoneBrickCracked);
		registerBlock(CBlocks.triplecompressedStoneBrickCracked);
		registerBlock(CBlocks.quadruplecompressedStoneBrickCracked);
		registerBlock(CBlocks.compressedStoneBrickMossy);
		registerBlock(CBlocks.doublecompressedStoneBrickMossy);
		registerBlock(CBlocks.triplecompressedStoneBrickMossy);
		registerBlock(CBlocks.quadruplecompressedStoneBrickMossy);
		registerBlock(CBlocks.compressedSponge);
		registerBlock(CBlocks.doublecompressedSponge);
		registerBlock(CBlocks.triplecompressedSponge);
		registerBlock(CBlocks.quadruplecompressedSponge);
		registerBlock(CBlocks.compressedWool, new ItemBlockMeta(CBlocks.compressedWool));
		registerBlock(CBlocks.doublecompressedWool, new ItemBlockMeta(CBlocks.doublecompressedWool));
		registerBlock(CBlocks.triplecompressedWool, new ItemBlockMeta(CBlocks.triplecompressedWool));
		registerBlock(CBlocks.quadruplecompressedWool, new ItemBlockMeta(CBlocks.quadruplecompressedWool));
		registerBlock(CBlocks.compressedBookshelf);
		registerBlock(CBlocks.doublecompressedBookshelf);
		registerBlock(CBlocks.triplecompressedBookshelf);
		registerBlock(CBlocks.quadruplecompressedBookshelf);
		registerBlock(CBlocks.compressedCraftingTable);
		registerBlock(CBlocks.doublecompressedCraftingTable);
		registerBlock(CBlocks.triplecompressedCraftingTable);
		registerBlock(CBlocks.quadruplecompressedCraftingTable);
		registerBlock(CBlocks.compressedColorGlass, new ItemBlockMeta(CBlocks.compressedColorGlass));
		registerBlock(CBlocks.doublecompressedColorGlass, new ItemBlockMeta(CBlocks.doublecompressedColorGlass));
		registerBlock(CBlocks.triplecompressedColorGlass, new ItemBlockMeta(CBlocks.triplecompressedColorGlass));
		registerBlock(CBlocks.quadruplecompressedColorGlass, new ItemBlockMeta(CBlocks.quadruplecompressedColorGlass));
		registerBlock(CBlocks.compressedHardenedClay, new ItemBlockMeta(CBlocks.compressedHardenedClay));
		registerBlock(CBlocks.doublecompressedHardenedClay, new ItemBlockMeta(CBlocks.doublecompressedHardenedClay));
		registerBlock(CBlocks.triplecompressedHardenedClay, new ItemBlockMeta(CBlocks.triplecompressedHardenedClay));
		registerBlock(CBlocks.quadruplecompressedHardenedClay, new ItemBlockMeta(CBlocks.quadruplecompressedHardenedClay));
		registerBlock(CBlocks.compressedHardenedClay_ST);
		registerBlock(CBlocks.doublecompressedHardenedClay_ST);
		registerBlock(CBlocks.triplecompressedHardenedClay_ST);
		registerBlock(CBlocks.quadruplecompressedHardenedClay_ST);
		registerBlock(CBlocks.compressedCoalOre);
		registerBlock(CBlocks.doublecompressedCoalOre);
		registerBlock(CBlocks.triplecompressedCoalOre);
		registerBlock(CBlocks.quadruplecompressedCoalOre);
		registerBlock(CBlocks.compressedDiamondOre);
		registerBlock(CBlocks.doublecompressedDiamondOre);
		registerBlock(CBlocks.triplecompressedDiamondOre);
		registerBlock(CBlocks.quadruplecompressedDiamondOre);
		registerBlock(CBlocks.compressedEmeraldOre);
		registerBlock(CBlocks.doublecompressedEmeraldOre);
		registerBlock(CBlocks.triplecompressedEmeraldOre);
		registerBlock(CBlocks.quadruplecompressedEmeraldOre);
		registerBlock(CBlocks.compressedGoldOre);
		registerBlock(CBlocks.doublecompressedGoldOre);
		registerBlock(CBlocks.triplecompressedGoldOre);
		registerBlock(CBlocks.quadruplecompressedGoldOre);
		registerBlock(CBlocks.compressedIronOre);
		registerBlock(CBlocks.doublecompressedIronOre);
		registerBlock(CBlocks.triplecompressedIronOre);
		registerBlock(CBlocks.quadruplecompressedIronOre);
		registerBlock(CBlocks.compressedPodzol);
		registerBlock(CBlocks.doublecompressedPodzol);
		registerBlock(CBlocks.triplecompressedPodzol);
		registerBlock(CBlocks.quadruplecompressedPodzol);
		registerBlock(CBlocks.compressedQuartzBlock);
		registerBlock(CBlocks.doublecompressedQuartzBlock);
		registerBlock(CBlocks.triplecompressedQuartzBlock);
		registerBlock(CBlocks.quadruplecompressedQuartzBlock);
		registerBlock(CBlocks.compressedQuartzChiseled);
		registerBlock(CBlocks.doublecompressedQuartzChiseled);
		registerBlock(CBlocks.triplecompressedQuartzChiseled);
		registerBlock(CBlocks.quadruplecompressedQuartzChiseled);
		registerBlock(CBlocks.compressedQuartzLines);
		registerBlock(CBlocks.doublecompressedQuartzLines);
		registerBlock(CBlocks.triplecompressedQuartzLines);
		registerBlock(CBlocks.quadruplecompressedQuartzLines);
		registerBlock(CBlocks.compressedTNT);
		registerBlock(CBlocks.doublecompressedTNT);
		registerBlock(CBlocks.triplecompressedTNT);
		registerBlock(CBlocks.quadruplecompressedTNT);
		registerBlock(CBlocks.compressedSoulSand);
		registerBlock(CBlocks.doublecompressedSoulSand);
		registerBlock(CBlocks.triplecompressedSoulSand);
		registerBlock(CBlocks.quadruplecompressedSoulSand);
		
		registerBlock(CBlocks.compressedWoodLog, new ItemBlockMeta(CBlocks.compressedWoodLog));
		registerBlock(CBlocks.doublecompressedWoodLog, new ItemBlockMeta(CBlocks.doublecompressedWoodLog));
		registerBlock(CBlocks.triplecompressedWoodLog, new ItemBlockMeta(CBlocks.triplecompressedWoodLog));
		registerBlock(CBlocks.quadruplecompressedWoodLog, new ItemBlockMeta(CBlocks.quadruplecompressedWoodLog));
		
		registerBlock(CBlocks.compressedMelon);
		registerBlock(CBlocks.doublecompressedMelon);
		registerBlock(CBlocks.triplecompressedMelon);
		registerBlock(CBlocks.quadruplecompressedMelon);
		registerBlock(CBlocks.compressedJackOLantern);
		registerBlock(CBlocks.doublecompressedJackOLantern);
		registerBlock(CBlocks.triplecompressedJackOLantern);
		registerBlock(CBlocks.quadruplecompressedJackOLantern);
		registerBlock(CBlocks.compressedPumpkin);
		registerBlock(CBlocks.doublecompressedPumpkin);
		registerBlock(CBlocks.triplecompressedPumpkin);
		registerBlock(CBlocks.quadruplecompressedPumpkin);
		registerBlock(CBlocks.compressedSnow);
		registerBlock(CBlocks.doublecompressedSnow);
		registerBlock(CBlocks.triplecompressedSnow);
		registerBlock(CBlocks.quadruplecompressedSnow);
		registerBlock(CBlocks.compressedCactus);
		registerBlock(CBlocks.doublecompressedCactus);
		registerBlock(CBlocks.triplecompressedCactus);
		registerBlock(CBlocks.quadruplecompressedCactus);
		registerBlock(CBlocks.compressedEndBricks);
		registerBlock(CBlocks.doublecompressedEndBricks);
		registerBlock(CBlocks.triplecompressedEndBricks);
		registerBlock(CBlocks.quadruplecompressedEndBricks);
		registerBlock(CBlocks.compressedGrassPath);
		registerBlock(CBlocks.doublecompressedGrassPath);
		registerBlock(CBlocks.triplecompressedGrassPath);
		registerBlock(CBlocks.quadruplecompressedGrassPath);
		registerBlock(CBlocks.compressedCoarseDirt);
		registerBlock(CBlocks.doublecompressedCoarseDirt);
		registerBlock(CBlocks.triplecompressedCoarseDirt);
		registerBlock(CBlocks.quadruplecompressedCoarseDirt);
		registerBlock(CBlocks.compressedSeaLantern);
		registerBlock(CBlocks.doublecompressedSeaLantern);
		registerBlock(CBlocks.triplecompressedSeaLantern);
		registerBlock(CBlocks.quadruplecompressedSeaLantern);
		registerBlock(CBlocks.compressedNetherWartBlock);
		registerBlock(CBlocks.doublecompressedNetherWartBlock);
		registerBlock(CBlocks.triplecompressedNetherWartBlock);
		registerBlock(CBlocks.quadruplecompressedNetherWartBlock);
		registerBlock(CBlocks.compressedMagmaBlock);
		registerBlock(CBlocks.doublecompressedMagmaBlock);
		registerBlock(CBlocks.triplecompressedMagmaBlock);
		registerBlock(CBlocks.quadruplecompressedMagmaBlock);
		registerBlock(CBlocks.compressedMycelium);
		registerBlock(CBlocks.doublecompressedMycelium);
		registerBlock(CBlocks.triplecompressedMycelium);
		registerBlock(CBlocks.quadruplecompressedMycelium);
		registerBlock(CBlocks.compressedPrismarineBricks);
		registerBlock(CBlocks.doublecompressedPrismarineBricks);
		registerBlock(CBlocks.triplecompressedPrismarineBricks);
		registerBlock(CBlocks.quadruplecompressedPrismarineBricks);
		registerBlock(CBlocks.compressedPrismarineDark);
		registerBlock(CBlocks.doublecompressedPrismarineDark);
		registerBlock(CBlocks.triplecompressedPrismarineDark);
		registerBlock(CBlocks.quadruplecompressedPrismarineDark);
		registerBlock(CBlocks.compressedPrismarineRough);
		registerBlock(CBlocks.doublecompressedPrismarineRough);
		registerBlock(CBlocks.triplecompressedPrismarineRough);
		registerBlock(CBlocks.quadruplecompressedPrismarineRough);
		registerBlock(CBlocks.compressedPurpurBlock);
		registerBlock(CBlocks.doublecompressedPurpurBlock);
		registerBlock(CBlocks.triplecompressedPurpurBlock);
		registerBlock(CBlocks.quadruplecompressedPurpurBlock);
		registerBlock(CBlocks.compressedPurpurPillar);
		registerBlock(CBlocks.doublecompressedPurpurPillar);
		registerBlock(CBlocks.triplecompressedPurpurPillar);
		registerBlock(CBlocks.quadruplecompressedPurpurPillar);
		registerBlock(CBlocks.compressedQuartzOre);
		registerBlock(CBlocks.doublecompressedQuartzOre);
		registerBlock(CBlocks.triplecompressedQuartzOre);
		registerBlock(CBlocks.quadruplecompressedQuartzOre);
		registerBlock(CBlocks.compressedSlime);
		registerBlock(CBlocks.doublecompressedSlime);
		registerBlock(CBlocks.triplecompressedSlime);
		registerBlock(CBlocks.quadruplecompressedSlime);
		registerBlock(CBlocks.compressedRedSandstone);
		registerBlock(CBlocks.doublecompressedRedSandstone);
		registerBlock(CBlocks.triplecompressedRedSandstone);
		registerBlock(CBlocks.quadruplecompressedRedSandstone);
		registerBlock(CBlocks.compressedRedSandstoneCarved);
		registerBlock(CBlocks.doublecompressedRedSandstoneCarved);
		registerBlock(CBlocks.triplecompressedRedSandstoneCarved);
		registerBlock(CBlocks.quadruplecompressedRedSandstoneCarved);
		registerBlock(CBlocks.compressedRedSandstoneSmooth);
		registerBlock(CBlocks.doublecompressedRedSandstoneSmooth);
		registerBlock(CBlocks.triplecompressedRedSandstoneSmooth);
		registerBlock(CBlocks.quadruplecompressedRedSandstoneSmooth);
		registerBlock(CBlocks.compressedSpongeWet);
		registerBlock(CBlocks.doublecompressedSpongeWet);
		registerBlock(CBlocks.triplecompressedSpongeWet);
		registerBlock(CBlocks.quadruplecompressedSpongeWet);
		registerBlock(CBlocks.compressedAndersite);
		registerBlock(CBlocks.doublecompressedAndersite);
		registerBlock(CBlocks.triplecompressedAndersite);
		registerBlock(CBlocks.quadruplecompressedAndersite);
		registerBlock(CBlocks.compressedAndersiteSmooth);
		registerBlock(CBlocks.doublecompressedAndersiteSmooth);
		registerBlock(CBlocks.triplecompressedAndersiteSmooth);
		registerBlock(CBlocks.quadruplecompressedAndersiteSmooth);
		registerBlock(CBlocks.compressedDiorite);
		registerBlock(CBlocks.doublecompressedDiorite);
		registerBlock(CBlocks.triplecompressedDiorite);
		registerBlock(CBlocks.quadruplecompressedDiorite);
		registerBlock(CBlocks.compressedDioriteSmooth);
		registerBlock(CBlocks.doublecompressedDioriteSmooth);
		registerBlock(CBlocks.triplecompressedDioriteSmooth);
		registerBlock(CBlocks.quadruplecompressedDioriteSmooth);
		registerBlock(CBlocks.compressedGranite);
		registerBlock(CBlocks.doublecompressedGranite);
		registerBlock(CBlocks.triplecompressedGranite);
		registerBlock(CBlocks.quadruplecompressedGranite);
		registerBlock(CBlocks.compressedGraniteSmooth);
		registerBlock(CBlocks.doublecompressedGraniteSmooth);
		registerBlock(CBlocks.triplecompressedGraniteSmooth);
		registerBlock(CBlocks.quadruplecompressedGraniteSmooth);
	}
	
	public static void registerRenders() {
		registerRender(CBlocks.compressedCobblestone);
		registerRender(CBlocks.doublecompressedCobblestone);
		registerRender(CBlocks.triplecompressedCobblestone);
		registerRender(CBlocks.quadruplecompressedCobblestone);
		registerRender(CBlocks.compressedDirt);
		registerRender(CBlocks.doublecompressedDirt);
		registerRender(CBlocks.triplecompressedDirt);
		registerRender(CBlocks.quadruplecompressedDirt);
		registerRender(CBlocks.compressedSand);
		registerRender(CBlocks.doublecompressedSand);
		registerRender(CBlocks.triplecompressedSand);
		registerRender(CBlocks.quadruplecompressedSand);
		registerRender(CBlocks.compressedGravel);
		registerRender(CBlocks.doublecompressedGravel);
		registerRender(CBlocks.triplecompressedGravel);
		registerRender(CBlocks.quadruplecompressedGravel);
		registerRender(CBlocks.compressedCoalBlock);
		registerRender(CBlocks.doublecompressedCoalBlock);
		registerRender(CBlocks.triplecompressedCoalBlock);
		registerRender(CBlocks.quadruplecompressedCoalBlock);
		registerRender(CBlocks.blockEnderium);
		registerRender(CBlocks.oreEnderium);
		registerRender(CBlocks.oreNetherEnderium);
		registerRender(CBlocks.oreEndEnderium);
		registerRender(CBlocks.compressedObsidian);
		registerRender(CBlocks.doublecompressedObsidian);
		registerRender(CBlocks.triplecompressedObsidian);
		registerRender(CBlocks.quadruplecompressedObsidian);
		registerRender(CBlocks.compressedEnderium);
		registerRender(CBlocks.doublecompressedEnderium);
		registerRender(CBlocks.triplecompressedEnderium);
		registerRender(CBlocks.quadruplecompressedEnderium);
		registerRender(CBlocks.testSidedBlock);
		registerRender(CBlocks.compressedStone);
		registerRender(CBlocks.doublecompressedStone);
		registerRender(CBlocks.triplecompressedStone);
		registerRender(CBlocks.quadruplecompressedStone);
		registerRender(CBlocks.compressedClay);
		registerRender(CBlocks.doublecompressedClay);
		registerRender(CBlocks.triplecompressedClay);
		registerRender(CBlocks.quadruplecompressedClay);
		registerRender(CBlocks.compressedBrick);
		registerRender(CBlocks.doublecompressedBrick);
		registerRender(CBlocks.triplecompressedBrick);
		registerRender(CBlocks.quadruplecompressedBrick);
		registerRender(CBlocks.compressedBedrock);
		registerRender(CBlocks.doublecompressedBedrock);
		registerRender(CBlocks.triplecompressedBedrock);
		registerRender(CBlocks.quadruplecompressedBedrock);
		registerRender(CBlocks.compressedCobblestone_mossy);
		registerRender(CBlocks.doublecompressedCobblestone_mossy);
		registerRender(CBlocks.triplecompressedCobblestone_mossy);
		registerRender(CBlocks.quadruplecompressedCobblestone_mossy);
		registerRender(CBlocks.compressedDiamondBlock);
		registerRender(CBlocks.doublecompressedDiamondBlock);
		registerRender(CBlocks.triplecompressedDiamondBlock);
		registerRender(CBlocks.quadruplecompressedDiamondBlock);
		registerRender(CBlocks.compressedEmeraldBlock);
		registerRender(CBlocks.doublecompressedEmeraldBlock);
		registerRender(CBlocks.triplecompressedEmeraldBlock);
		registerRender(CBlocks.quadruplecompressedEmeraldBlock);
		registerRender(CBlocks.compressedEndStone);
		registerRender(CBlocks.doublecompressedEndStone);
		registerRender(CBlocks.triplecompressedEndStone);
		registerRender(CBlocks.quadruplecompressedEndStone);
		registerRender(CBlocks.compressedGlowstone);
		registerRender(CBlocks.doublecompressedGlowstone);
		registerRender(CBlocks.triplecompressedGlowstone);
		registerRender(CBlocks.quadruplecompressedGlowstone);
		registerRender(CBlocks.compressedGlassBlock);
		registerRender(CBlocks.doublecompressedGlassBlock);
		registerRender(CBlocks.triplecompressedGlassBlock);
		registerRender(CBlocks.quadruplecompressedGlassBlock);
		registerRender(CBlocks.compressedGoldBlock);
		registerRender(CBlocks.doublecompressedGoldBlock);
		registerRender(CBlocks.triplecompressedGoldBlock);
		registerRender(CBlocks.quadruplecompressedGoldBlock);
		registerRender(CBlocks.compressedHayBlock);
		registerRender(CBlocks.doublecompressedHayBlock);
		registerRender(CBlocks.triplecompressedHayBlock);
		registerRender(CBlocks.quadruplecompressedHayBlock);
		registerRender(CBlocks.compressedIce);
		registerRender(CBlocks.doublecompressedIce);
		registerRender(CBlocks.triplecompressedIce);
		registerRender(CBlocks.quadruplecompressedIce);
		registerRender(CBlocks.compressedIronBlock);
		registerRender(CBlocks.doublecompressedIronBlock);
		registerRender(CBlocks.triplecompressedIronBlock);
		registerRender(CBlocks.quadruplecompressedIronBlock);
		registerRender(CBlocks.compressedLapisBlock);
		registerRender(CBlocks.doublecompressedLapisBlock);
		registerRender(CBlocks.triplecompressedLapisBlock);
		registerRender(CBlocks.quadruplecompressedLapisBlock);
		registerRender(CBlocks.compressedNetherBrick);
		registerRender(CBlocks.doublecompressedNetherBrick);
		registerRender(CBlocks.triplecompressedNetherBrick);
		registerRender(CBlocks.quadruplecompressedNetherBrick);
		registerRender(CBlocks.compressedNetherrack);
		registerRender(CBlocks.doublecompressedNetherrack);
		registerRender(CBlocks.triplecompressedNetherrack);
		registerRender(CBlocks.quadruplecompressedNetherrack);
		registerRender(CBlocks.compressedRedstoneBlock);
		registerRender(CBlocks.doublecompressedRedstoneBlock);
		registerRender(CBlocks.triplecompressedRedstoneBlock);
		registerRender(CBlocks.quadruplecompressedRedstoneBlock);
		registerRender(CBlocks.compressedRedSand);
		registerRender(CBlocks.doublecompressedRedSand);
		registerRender(CBlocks.triplecompressedRedSand);
		registerRender(CBlocks.quadruplecompressedRedSand);
		registerRender(CBlocks.compressedStoneBrick);
		registerRender(CBlocks.doublecompressedStoneBrick);
		registerRender(CBlocks.triplecompressedStoneBrick);
		registerRender(CBlocks.quadruplecompressedStoneBrick);
		registerRender(CBlocks.compressedStoneBrickChiseled);
		registerRender(CBlocks.doublecompressedStoneBrickChiseled);
		registerRender(CBlocks.triplecompressedStoneBrickChiseled);
		registerRender(CBlocks.quadruplecompressedStoneBrickChiseled);
		registerRender(CBlocks.compressedStoneBrickCracked);
		registerRender(CBlocks.doublecompressedStoneBrickCracked);
		registerRender(CBlocks.triplecompressedStoneBrickCracked);
		registerRender(CBlocks.quadruplecompressedStoneBrickCracked);
		registerRender(CBlocks.compressedStoneBrickMossy);
		registerRender(CBlocks.doublecompressedStoneBrickMossy);
		registerRender(CBlocks.triplecompressedStoneBrickMossy);
		registerRender(CBlocks.quadruplecompressedStoneBrickMossy);
		registerRender(CBlocks.compressedSponge);
		registerRender(CBlocks.doublecompressedSponge);
		registerRender(CBlocks.triplecompressedSponge);
		registerRender(CBlocks.quadruplecompressedSponge);
		registerRender(CBlocks.compressedBookshelf);
		registerRender(CBlocks.doublecompressedBookshelf);
		registerRender(CBlocks.triplecompressedBookshelf);
		registerRender(CBlocks.quadruplecompressedBookshelf);
		registerRender(CBlocks.compressedCraftingTable);
		registerRender(CBlocks.doublecompressedCraftingTable);
		registerRender(CBlocks.triplecompressedCraftingTable);
		registerRender(CBlocks.quadruplecompressedCraftingTable);
		registerRender(CBlocks.compressedHardenedClay_ST);
		registerRender(CBlocks.doublecompressedHardenedClay_ST);
		registerRender(CBlocks.triplecompressedHardenedClay_ST);
		registerRender(CBlocks.quadruplecompressedHardenedClay_ST);
		registerRender(CBlocks.compressedCoalOre);
		registerRender(CBlocks.doublecompressedCoalOre);
		registerRender(CBlocks.triplecompressedCoalOre);
		registerRender(CBlocks.quadruplecompressedCoalOre);
		registerRender(CBlocks.compressedDiamondOre);
		registerRender(CBlocks.doublecompressedDiamondOre);
		registerRender(CBlocks.triplecompressedDiamondOre);
		registerRender(CBlocks.quadruplecompressedDiamondOre);
		registerRender(CBlocks.compressedEmeraldOre);
		registerRender(CBlocks.doublecompressedEmeraldOre);
		registerRender(CBlocks.triplecompressedEmeraldOre);
		registerRender(CBlocks.quadruplecompressedEmeraldOre);
		registerRender(CBlocks.compressedGoldOre);
		registerRender(CBlocks.doublecompressedGoldOre);
		registerRender(CBlocks.triplecompressedGoldOre);
		registerRender(CBlocks.quadruplecompressedGoldOre);
		registerRender(CBlocks.compressedIronOre);
		registerRender(CBlocks.doublecompressedIronOre);
		registerRender(CBlocks.triplecompressedIronOre);
		registerRender(CBlocks.quadruplecompressedIronOre);
		registerRender(CBlocks.compressedPodzol);
		registerRender(CBlocks.doublecompressedPodzol);
		registerRender(CBlocks.triplecompressedPodzol);
		registerRender(CBlocks.quadruplecompressedPodzol);
		registerRender(CBlocks.compressedQuartzBlock);
		registerRender(CBlocks.doublecompressedQuartzBlock);
		registerRender(CBlocks.triplecompressedQuartzBlock);
		registerRender(CBlocks.quadruplecompressedQuartzBlock);
		registerRender(CBlocks.compressedQuartzChiseled);
		registerRender(CBlocks.doublecompressedQuartzChiseled);
		registerRender(CBlocks.triplecompressedQuartzChiseled);
		registerRender(CBlocks.quadruplecompressedQuartzChiseled);
		registerRender(CBlocks.compressedQuartzLines);
		registerRender(CBlocks.doublecompressedQuartzLines);
		registerRender(CBlocks.triplecompressedQuartzLines);
		registerRender(CBlocks.quadruplecompressedQuartzLines);
		registerRender(CBlocks.compressedTNT);
		registerRender(CBlocks.doublecompressedTNT);
		registerRender(CBlocks.triplecompressedTNT);
		registerRender(CBlocks.quadruplecompressedTNT);
		registerRender(CBlocks.compressedSoulSand);
		registerRender(CBlocks.doublecompressedSoulSand);
		registerRender(CBlocks.triplecompressedSoulSand);
		registerRender(CBlocks.quadruplecompressedSoulSand);
		registerRender(CBlocks.compressedMelon);
		registerRender(CBlocks.doublecompressedMelon);
		registerRender(CBlocks.triplecompressedMelon);
		registerRender(CBlocks.quadruplecompressedMelon);
		registerRender(CBlocks.compressedJackOLantern);
		registerRender(CBlocks.doublecompressedJackOLantern);
		registerRender(CBlocks.triplecompressedJackOLantern);
		registerRender(CBlocks.quadruplecompressedJackOLantern);
		registerRender(CBlocks.compressedPumpkin);
		registerRender(CBlocks.doublecompressedPumpkin);
		registerRender(CBlocks.triplecompressedPumpkin);
		registerRender(CBlocks.quadruplecompressedPumpkin);
		registerRender(CBlocks.compressedSnow);
		registerRender(CBlocks.doublecompressedSnow);
		registerRender(CBlocks.triplecompressedSnow);
		registerRender(CBlocks.quadruplecompressedSnow);
		registerRender(CBlocks.compressedCactus);
		registerRender(CBlocks.doublecompressedCactus);
		registerRender(CBlocks.triplecompressedCactus);
		registerRender(CBlocks.quadruplecompressedCactus);
		registerRender(CBlocks.compressedEndBricks);
		registerRender(CBlocks.doublecompressedEndBricks);
		registerRender(CBlocks.triplecompressedEndBricks);
		registerRender(CBlocks.quadruplecompressedEndBricks);
		registerRender(CBlocks.compressedGrassPath);
		registerRender(CBlocks.doublecompressedGrassPath);
		registerRender(CBlocks.triplecompressedGrassPath);
		registerRender(CBlocks.quadruplecompressedGrassPath);
		registerRender(CBlocks.compressedCoarseDirt);
		registerRender(CBlocks.doublecompressedCoarseDirt);
		registerRender(CBlocks.triplecompressedCoarseDirt);
		registerRender(CBlocks.quadruplecompressedCoarseDirt);
		registerRender(CBlocks.compressedSeaLantern);
		registerRender(CBlocks.doublecompressedSeaLantern);
		registerRender(CBlocks.triplecompressedSeaLantern);
		registerRender(CBlocks.quadruplecompressedSeaLantern);
		registerRender(CBlocks.compressedNetherWartBlock);
		registerRender(CBlocks.doublecompressedNetherWartBlock);
		registerRender(CBlocks.triplecompressedNetherWartBlock);
		registerRender(CBlocks.quadruplecompressedNetherWartBlock);
		registerRender(CBlocks.compressedMagmaBlock);
		registerRender(CBlocks.doublecompressedMagmaBlock);
		registerRender(CBlocks.triplecompressedMagmaBlock);
		registerRender(CBlocks.quadruplecompressedMagmaBlock);
		registerRender(CBlocks.compressedMycelium);
		registerRender(CBlocks.doublecompressedMycelium);
		registerRender(CBlocks.triplecompressedMycelium);
		registerRender(CBlocks.quadruplecompressedMycelium);
		registerRender(CBlocks.compressedPrismarineBricks);
		registerRender(CBlocks.doublecompressedPrismarineBricks);
		registerRender(CBlocks.triplecompressedPrismarineBricks);
		registerRender(CBlocks.quadruplecompressedPrismarineBricks);
		registerRender(CBlocks.compressedPrismarineDark);
		registerRender(CBlocks.doublecompressedPrismarineDark);
		registerRender(CBlocks.triplecompressedPrismarineDark);
		registerRender(CBlocks.quadruplecompressedPrismarineDark);
		registerRender(CBlocks.compressedPrismarineRough);
		registerRender(CBlocks.doublecompressedPrismarineRough);
		registerRender(CBlocks.triplecompressedPrismarineRough);
		registerRender(CBlocks.quadruplecompressedPrismarineRough);
		registerRender(CBlocks.compressedPurpurBlock);
		registerRender(CBlocks.doublecompressedPurpurBlock);
		registerRender(CBlocks.triplecompressedPurpurBlock);
		registerRender(CBlocks.quadruplecompressedPurpurBlock);
		registerRender(CBlocks.compressedPurpurPillar);
		registerRender(CBlocks.doublecompressedPurpurPillar);
		registerRender(CBlocks.triplecompressedPurpurPillar);
		registerRender(CBlocks.quadruplecompressedPurpurPillar);
		registerRender(CBlocks.compressedQuartzOre);
		registerRender(CBlocks.doublecompressedQuartzOre);
		registerRender(CBlocks.triplecompressedQuartzOre);
		registerRender(CBlocks.quadruplecompressedQuartzOre);
		registerRender(CBlocks.compressedSlime);
		registerRender(CBlocks.doublecompressedSlime);
		registerRender(CBlocks.triplecompressedSlime);
		registerRender(CBlocks.quadruplecompressedSlime);
		registerRender(CBlocks.compressedRedSandstone);
		registerRender(CBlocks.doublecompressedRedSandstone);
		registerRender(CBlocks.triplecompressedRedSandstone);
		registerRender(CBlocks.quadruplecompressedRedSandstone);
		registerRender(CBlocks.compressedRedSandstoneCarved);
		registerRender(CBlocks.doublecompressedRedSandstoneCarved);
		registerRender(CBlocks.triplecompressedRedSandstoneCarved);
		registerRender(CBlocks.quadruplecompressedRedSandstoneCarved);
		registerRender(CBlocks.compressedRedSandstoneSmooth);
		registerRender(CBlocks.doublecompressedRedSandstoneSmooth);
		registerRender(CBlocks.triplecompressedRedSandstoneSmooth);
		registerRender(CBlocks.quadruplecompressedRedSandstoneSmooth);
		registerRender(CBlocks.compressedSpongeWet);
		registerRender(CBlocks.doublecompressedSpongeWet);
		registerRender(CBlocks.triplecompressedSpongeWet);
		registerRender(CBlocks.quadruplecompressedSpongeWet);
		registerRender(CBlocks.compressedAndersite);
		registerRender(CBlocks.doublecompressedAndersite);
		registerRender(CBlocks.triplecompressedAndersite);
		registerRender(CBlocks.quadruplecompressedAndersite);
		registerRender(CBlocks.compressedAndersiteSmooth);
		registerRender(CBlocks.doublecompressedAndersiteSmooth);
		registerRender(CBlocks.triplecompressedAndersiteSmooth);
		registerRender(CBlocks.quadruplecompressedAndersiteSmooth);
		registerRender(CBlocks.compressedDiorite);
		registerRender(CBlocks.doublecompressedDiorite);
		registerRender(CBlocks.triplecompressedDiorite);
		registerRender(CBlocks.quadruplecompressedDiorite);
		registerRender(CBlocks.compressedDioriteSmooth);
		registerRender(CBlocks.doublecompressedDioriteSmooth);
		registerRender(CBlocks.triplecompressedDioriteSmooth);
		registerRender(CBlocks.quadruplecompressedDioriteSmooth);
		registerRender(CBlocks.compressedGranite);
		registerRender(CBlocks.doublecompressedGranite);
		registerRender(CBlocks.triplecompressedGranite);
		registerRender(CBlocks.quadruplecompressedGranite);
		registerRender(CBlocks.compressedGraniteSmooth);
		registerRender(CBlocks.doublecompressedGraniteSmooth);
		registerRender(CBlocks.triplecompressedGraniteSmooth);
		registerRender(CBlocks.quadruplecompressedGraniteSmooth);
		
		for(int i = 0; i < EnumHandler.ColorTypes.values().length; i++) {
			registerRender(CBlocks.compressedColorGlass, i, "compressedColorGlass" + EnumHandler.ColorTypes.values()[i].getName());
			registerRender(CBlocks.doublecompressedColorGlass, i, "doublecompressedColorGlass" + EnumHandler.ColorTypes.values()[i].getName());
			registerRender(CBlocks.triplecompressedColorGlass, i, "triplecompressedColorGlass" + EnumHandler.ColorTypes.values()[i].getName());
			registerRender(CBlocks.quadruplecompressedColorGlass, i, "quadruplecompressedColorGlass" + EnumHandler.ColorTypes.values()[i].getName());	
		}
		for(int i = 0; i < EnumHandler.ColorTypes.values().length; i++) {
			registerRender(CBlocks.compressedWool, i, "compressedWool" + EnumHandler.ColorTypes.values()[i].getName());
			registerRender(CBlocks.doublecompressedWool, i, "doublecompressedWool" + EnumHandler.ColorTypes.values()[i].getName());
			registerRender(CBlocks.triplecompressedWool, i, "triplecompressedWool" + EnumHandler.ColorTypes.values()[i].getName());
			registerRender(CBlocks.quadruplecompressedWool, i, "quadruplecompressedWool" + EnumHandler.ColorTypes.values()[i].getName());
		}
		
		for(int i = 0; i < EnumHandler.ColorTypes.values().length; i++) {
			registerRender(CBlocks.compressedHardenedClay, i, "compressedHardenedClay" + EnumHandler.ColorTypes.values()[i].getName());
			registerRender(CBlocks.doublecompressedHardenedClay, i, "doublecompressedHardenedClay" + EnumHandler.ColorTypes.values()[i].getName());
			registerRender(CBlocks.triplecompressedHardenedClay, i, "triplecompressedHardenedClay" + EnumHandler.ColorTypes.values()[i].getName());
			registerRender(CBlocks.quadruplecompressedHardenedClay, i, "quadruplecompressedHardenedClay" + EnumHandler.ColorTypes.values()[i].getName());
		}
		
		for(int i = 0; i < EnumHandler.WoodTypes.values().length; i++) {
			registerRender(CBlocks.compressedWoodPlanks, i, "compressedWoodPlanks" + EnumHandler.WoodTypes.values()[i].getName());
			registerRender(CBlocks.doublecompressedWoodPlanks, i, "doublecompressedWoodPlanks" + EnumHandler.WoodTypes.values()[i].getName());
			registerRender(CBlocks.triplecompressedWoodPlanks, i, "triplecompressedWoodPlanks" + EnumHandler.WoodTypes.values()[i].getName());
			registerRender(CBlocks.quadruplecompressedWoodPlanks, i, "quadruplecompressedWoodPlanks" + EnumHandler.WoodTypes.values()[i].getName());
		}
		
		for(int i = 0; i < EnumHandler.WoodTypes.values().length; i++) {
			registerRender(CBlocks.compressedWoodLog, i, "compressed" + EnumHandler.WoodTypes.values()[i].getName() + "Log");
			registerRender(CBlocks.doublecompressedWoodLog, i, "doublecompressed" + EnumHandler.WoodTypes.values()[i].getName() + "Log");
			registerRender(CBlocks.triplecompressedWoodLog, i, "triplecompressed" + EnumHandler.WoodTypes.values()[i].getName() + "Log");
			registerRender(CBlocks.quadruplecompressedWoodLog, i, "quadruplecompressed" + EnumHandler.WoodTypes.values()[i].getName() + "Log");
		}
	}
	
	private static void registerBlock(Block block) {
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
		Utils.getLogger().info("Registered Block: " + block.getUnlocalizedName().substring(5));
	}
	
	private static void registerBlock(Block block, ItemBlock itemBlock) {
		GameRegistry.register(block);
		GameRegistry.register(itemBlock.setRegistryName(block.getRegistryName()));
		Utils.getLogger().info("Registered Block: " + block.getUnlocalizedName().substring(5));
	}
	
	private static void registerRender(Block block) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(Reference.getModid(), block.getUnlocalizedName().substring(5)), "inventory"));
		Utils.getLogger().info(new ResourceLocation(Reference.getModid(), block.getUnlocalizedName().substring(5)));
		Utils.getLogger().info("Registered Render for: " + block.getUnlocalizedName().substring(5));
	}

	private static void registerRender(Block block, int meta, String fileName) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(new ResourceLocation(Reference.getModid(), fileName), "inventory"));
		Utils.getLogger().info("Registered Render for: " + block.getUnlocalizedName().substring(5));
	}
	
}
