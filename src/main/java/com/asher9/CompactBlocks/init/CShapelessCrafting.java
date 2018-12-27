package com.asher9.CompactBlocks.init;

import com.asher9.CompactBlocks.Reference;
import com.asher9.CompactBlocks.api.EnumHandler;
import com.asher9.CompactBlocks.util.CLogger;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CShapelessCrafting {

    public static void init() {
        CLogger.getLogger().info("Loading Shapeless Recipes...");

        //Cobblestone
        AddRecipe(new ItemStack(Blocks.COBBLESTONE, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedCobblestone)));
        AddRecipe(new ItemStack(CBlocks.compressedCobblestone, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedCobblestone)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedCobblestone, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedCobblestone)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedCobblestone, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedCobblestone)));

        //Dirt
        AddRecipe(new ItemStack(Blocks.DIRT, 9, 0), Ingredient.fromStacks(new ItemStack(CBlocks.compressedDirt)));
        AddRecipe(new ItemStack(CBlocks.compressedDirt, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedDirt)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedDirt, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedDirt)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedDirt, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedDirt)));

        //Sand
        AddRecipe(new ItemStack(Blocks.SAND, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedSand)));
        AddRecipe(new ItemStack(CBlocks.compressedSand, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedSand)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedSand, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedSand)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedSand, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedSand)));

        //Gravel
        AddRecipe(new ItemStack(Blocks.GRAVEL, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedGravel)));
        AddRecipe(new ItemStack(CBlocks.compressedGravel, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedGravel)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedGravel, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedGravel)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedGravel, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedGravel)));

        //Coal
        AddRecipe(new ItemStack(Blocks.COAL_BLOCK, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedCoalBlock)));
        AddRecipe(new ItemStack(CBlocks.compressedCoalBlock, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedCoalBlock)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedCoalBlock, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedCoalBlock)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedCoalBlock, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedCoalBlock)));

        //Enderium
        AddRecipe(new ItemStack(CItems.ingotEnderium, 9), Ingredient.fromStacks(new ItemStack(CBlocks.blockEnderium)));
        AddRecipe(new ItemStack(CItems.nuggetEnderium, 9), Ingredient.fromStacks(new ItemStack(CItems.ingotEnderium)));

        //Obsidian
        AddRecipe(new ItemStack(Blocks.OBSIDIAN, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedObsidian)));
        AddRecipe(new ItemStack(CBlocks.compressedObsidian, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedObsidian)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedObsidian, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedObsidian)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedObsidian, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedObsidian)));

        //Enderium
        AddRecipe(new ItemStack(CBlocks.blockEnderium, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedEnderium)));
        AddRecipe(new ItemStack(CBlocks.compressedEnderium, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedEnderium)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedEnderium, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedEnderium)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedEnderium, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedEnderium)));

        //Stone
        AddRecipe(new ItemStack(Blocks.STONE, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedStone)));
        AddRecipe(new ItemStack(CBlocks.compressedStone, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedStone)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedStone, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedStone)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedStone, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedStone)));

        //Clay
        AddRecipe(new ItemStack(Blocks.CLAY, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedClay)));
        AddRecipe(new ItemStack(CBlocks.compressedClay, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedClay)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedClay, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedClay)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedClay, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedClay)));

        //Brick
        AddRecipe(new ItemStack(Blocks.BRICK_BLOCK, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedBrick)));
        AddRecipe(new ItemStack(CBlocks.compressedBrick, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedBrick)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedBrick, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedBrick)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedBrick, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedBrick)));

        //Bedrock
        AddRecipe(new ItemStack(Blocks.BEDROCK, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedBedrock)));
        AddRecipe(new ItemStack(CBlocks.compressedBedrock, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedBedrock)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedBedrock, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedBedrock)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedBedrock, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedBedrock)));

        //Mossy Cobblestone
        AddRecipe(new ItemStack(Blocks.MOSSY_COBBLESTONE, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedCobblestone_mossy)));
        AddRecipe(new ItemStack(CBlocks.compressedCobblestone_mossy, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedCobblestone_mossy)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedCobblestone_mossy, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedCobblestone_mossy)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedCobblestone_mossy, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedCobblestone_mossy)));

        //Diamond
        AddRecipe(new ItemStack(Blocks.DIAMOND_BLOCK, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedDiamondBlock)));
        AddRecipe(new ItemStack(CBlocks.compressedDiamondBlock, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedDiamondBlock)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedDiamondBlock, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedDiamondBlock)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedDiamondBlock, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedDiamondBlock)));

        //Emerald
        AddRecipe(new ItemStack(Blocks.EMERALD_BLOCK, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedEmeraldBlock)));
        AddRecipe(new ItemStack(CBlocks.compressedEmeraldBlock, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedEmeraldBlock)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedEmeraldBlock, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedEmeraldBlock)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedEmeraldBlock, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedEmeraldBlock)));

        //End Stone
        AddRecipe(new ItemStack(Blocks.END_STONE, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedEndStone)));
        AddRecipe(new ItemStack(CBlocks.compressedEndStone, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedEndStone)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedEndStone, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedEndStone)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedEndStone, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedEndStone)));

        //Glowstone
        AddRecipe(new ItemStack(Blocks.GLOWSTONE, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedGlowstone)));
        AddRecipe(new ItemStack(CBlocks.compressedGlowstone, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedGlowstone)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedGlowstone, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedGlowstone)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedGlowstone, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedGlowstone)));

        //Glass
        AddRecipe(new ItemStack(Blocks.GLASS, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedGlassBlock)));
        AddRecipe(new ItemStack(CBlocks.compressedGlassBlock, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedGlassBlock)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedGlassBlock, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedGlassBlock)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedGlassBlock, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedGlassBlock)));

        //Gold
        AddRecipe(new ItemStack(Blocks.GOLD_BLOCK, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedGoldBlock)));
        AddRecipe(new ItemStack(CBlocks.compressedGoldBlock, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedGoldBlock)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedGoldBlock, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedGoldBlock)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedGoldBlock, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedGoldBlock)));

        //Hay
        AddRecipe(new ItemStack(Blocks.HAY_BLOCK, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedHayBlock)));
        AddRecipe(new ItemStack(CBlocks.compressedHayBlock, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedHayBlock)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedHayBlock, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedHayBlock)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedHayBlock, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedHayBlock)));

        //Ice
        AddRecipe(new ItemStack(Blocks.ICE, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedIce)));
        AddRecipe(new ItemStack(CBlocks.compressedIce, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedIce)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedIce, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedIce)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedIce, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedIce)));

        //Iron
        AddRecipe(new ItemStack(Blocks.IRON_BLOCK, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedIronBlock)));
        AddRecipe(new ItemStack(CBlocks.compressedIronBlock, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedIronBlock)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedIronBlock, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedIronBlock)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedIronBlock, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedIronBlock)));

        //Lapis
        AddRecipe(new ItemStack(Blocks.LAPIS_BLOCK, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedLapisBlock)));
        AddRecipe(new ItemStack(CBlocks.compressedLapisBlock, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedLapisBlock)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedLapisBlock, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedLapisBlock)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedLapisBlock, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedLapisBlock)));

        //Nether Brick
        AddRecipe(new ItemStack(Blocks.NETHER_BRICK, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedNetherBrick)));
        AddRecipe(new ItemStack(CBlocks.compressedNetherBrick, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedNetherBrick)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedNetherBrick, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedNetherBrick)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedNetherBrick, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedNetherBrick)));

        //Netherrack
        AddRecipe(new ItemStack(Blocks.NETHERRACK, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedNetherrack)));
        AddRecipe(new ItemStack(CBlocks.compressedNetherrack, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedNetherrack)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedNetherrack, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedNetherrack)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedNetherrack, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedNetherrack)));

        //Redstone
        AddRecipe(new ItemStack(Blocks.REDSTONE_BLOCK, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedRedstoneBlock)));
        AddRecipe(new ItemStack(CBlocks.compressedRedstoneBlock, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedRedstoneBlock)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedRedstoneBlock, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedRedstoneBlock)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedRedstoneBlock, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedRedstoneBlock)));

        //Red Sand
        AddRecipe(new ItemStack(Blocks.SAND, 9, 1), Ingredient.fromStacks(new ItemStack(CBlocks.compressedRedSand)));
        AddRecipe(new ItemStack(CBlocks.compressedRedSand, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedRedSand)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedRedSand, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedRedSand)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedRedSand, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedRedSand)));

        //Stone Brick
        AddRecipe(new ItemStack(Blocks.STONEBRICK, 9, 0), Ingredient.fromStacks(new ItemStack(CBlocks.compressedStoneBrick)));
        AddRecipe(new ItemStack(CBlocks.compressedStoneBrick, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedStoneBrick)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedStoneBrick, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedStoneBrick)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedStoneBrick, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedStoneBrick)));

        //Stone Brick Chiseled
        AddRecipe(new ItemStack(Blocks.STONEBRICK, 9, 3), Ingredient.fromStacks(new ItemStack(CBlocks.compressedStoneBrickChiseled)));
        AddRecipe(new ItemStack(CBlocks.compressedStoneBrickChiseled, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedStoneBrickChiseled)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedStoneBrickChiseled, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedStoneBrickChiseled)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedStoneBrickChiseled, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedStoneBrickChiseled)));

        //Stone Brick Cracked
        AddRecipe(new ItemStack(Blocks.STONEBRICK, 9, 2), Ingredient.fromStacks(new ItemStack(CBlocks.compressedStoneBrickCracked)));
        AddRecipe(new ItemStack(CBlocks.compressedStoneBrickCracked, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedStoneBrickCracked)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedStoneBrickCracked, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedStoneBrickCracked)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedStoneBrickCracked, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedStoneBrickCracked)));

        //Stone Brick Mossy
        AddRecipe(new ItemStack(Blocks.STONEBRICK, 9, 1), Ingredient.fromStacks(new ItemStack(CBlocks.compressedStoneBrickMossy)));
        AddRecipe(new ItemStack(CBlocks.compressedStoneBrickMossy, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedStoneBrickMossy)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedStoneBrickMossy, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedStoneBrickMossy)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedStoneBrickMossy, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedStoneBrickMossy)));

        //Sponge
        AddRecipe(new ItemStack(Blocks.SPONGE, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedSponge)));
        AddRecipe(new ItemStack(CBlocks.compressedSponge, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedSponge)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedSponge, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedSponge)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedSponge, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedSponge)));

        //Bookshelf
        AddRecipe(new ItemStack(Blocks.BOOKSHELF, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedBookshelf)));
        AddRecipe(new ItemStack(CBlocks.compressedBookshelf, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedBookshelf)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedBookshelf, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedBookshelf)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedBookshelf, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedBookshelf)));

        //Crafting Table
        AddRecipe(new ItemStack(Blocks.CRAFTING_TABLE, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedCraftingTable)));
        AddRecipe(new ItemStack(CBlocks.compressedCraftingTable, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedCraftingTable)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedCraftingTable, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedCraftingTable)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedCraftingTable, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedCraftingTable)));

        //Hardened Clay
        AddRecipe(new ItemStack(Blocks.HARDENED_CLAY, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedHardenedClay_ST)));
        AddRecipe(new ItemStack(CBlocks.compressedHardenedClay_ST, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedHardenedClay_ST)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedHardenedClay_ST, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedHardenedClay_ST)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedHardenedClay_ST, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedHardenedClay_ST)));

        //Coal Ore
        AddRecipe(new ItemStack(Blocks.COAL_ORE, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedCoalOre)));
        AddRecipe(new ItemStack(CBlocks.compressedCoalOre, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedCoalOre)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedCoalOre, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedCoalOre)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedCoalOre, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedCoalOre)));

        //Diamond Ore
        AddRecipe(new ItemStack(Blocks.DIAMOND_ORE, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedDiamondOre)));
        AddRecipe(new ItemStack(CBlocks.compressedDiamondOre, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedDiamondOre)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedDiamondOre, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedDiamondOre)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedDiamondOre, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedDiamondOre)));

        //Emerald Ore
        AddRecipe(new ItemStack(Blocks.EMERALD_ORE, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedEmeraldOre)));
        AddRecipe(new ItemStack(CBlocks.compressedEmeraldOre, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedEmeraldOre)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedEmeraldOre, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedEmeraldOre)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedEmeraldOre, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedEmeraldOre)));

        //Gold Ore
        AddRecipe(new ItemStack(Blocks.GOLD_ORE, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedGoldOre)));
        AddRecipe(new ItemStack(CBlocks.compressedGoldOre, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedGoldOre)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedGoldOre, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedGoldOre)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedGoldOre, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedGoldOre)));

        //Iron Ore
        AddRecipe(new ItemStack(Blocks.IRON_ORE, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedIronOre)));
        AddRecipe(new ItemStack(CBlocks.compressedIronOre, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedIronOre)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedIronOre, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedIronOre)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedIronOre, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedIronOre)));

        //Podzol
        AddRecipe(new ItemStack(Blocks.DIRT, 9, 2), Ingredient.fromStacks(new ItemStack(CBlocks.compressedPodzol)));
        AddRecipe(new ItemStack(CBlocks.compressedPodzol, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedPodzol)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedPodzol, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedPodzol)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedPodzol, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedPodzol)));

        //Quartz
        AddRecipe(new ItemStack(Blocks.QUARTZ_BLOCK, 9, 0), Ingredient.fromStacks(new ItemStack(CBlocks.compressedQuartzBlock)));
        AddRecipe(new ItemStack(CBlocks.compressedQuartzBlock, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedQuartzBlock)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedQuartzBlock, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedQuartzBlock)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedQuartzBlock, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedQuartzBlock)));

        //Quartz Chiseled
        AddRecipe(new ItemStack(Blocks.QUARTZ_BLOCK, 9, 1), Ingredient.fromStacks(new ItemStack(CBlocks.compressedQuartzChiseled)));
        AddRecipe(new ItemStack(CBlocks.compressedQuartzChiseled, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedQuartzChiseled)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedQuartzChiseled, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedQuartzChiseled)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedQuartzChiseled, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedQuartzChiseled)));

        //Quartz Lines
        AddRecipe(new ItemStack(Blocks.QUARTZ_BLOCK, 9, 2), Ingredient.fromStacks(new ItemStack(CBlocks.compressedQuartzLines)));
        AddRecipe(new ItemStack(CBlocks.compressedQuartzLines, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedQuartzLines)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedQuartzLines, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedQuartzLines)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedQuartzLines, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedQuartzLines)));

        //TNT
        AddRecipe(new ItemStack(Blocks.TNT, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedTNT)));
        AddRecipe(new ItemStack(CBlocks.compressedTNT, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedTNT)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedTNT, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedTNT)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedTNT, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedTNT)));

        //Soul Sand
        AddRecipe(new ItemStack(Blocks.SOUL_SAND, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedSoulSand)));
        AddRecipe(new ItemStack(CBlocks.compressedSoulSand, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedSoulSand)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedSoulSand, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedSoulSand)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedSoulSand, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedSoulSand)));

        //Melon
        AddRecipe(new ItemStack(Blocks.MELON_BLOCK, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedMelon)));
        AddRecipe(new ItemStack(CBlocks.compressedMelon, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedMelon)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedMelon, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedMelon)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedMelon, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedMelon)));

        //Lit Pumpkin
        AddRecipe(new ItemStack(Blocks.LIT_PUMPKIN, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedJackOLantern)));
        AddRecipe(new ItemStack(CBlocks.compressedJackOLantern, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedJackOLantern)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedJackOLantern, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedJackOLantern)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedJackOLantern, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedJackOLantern)));

        //Pumpkin
        AddRecipe(new ItemStack(Blocks.PUMPKIN, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedPumpkin)));
        AddRecipe(new ItemStack(CBlocks.compressedPumpkin, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedPumpkin)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedPumpkin, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedPumpkin)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedPumpkin, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedPumpkin)));

        //Snow
        AddRecipe(new ItemStack(Blocks.SNOW, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedSnow)));
        AddRecipe(new ItemStack(CBlocks.compressedSnow, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedSnow)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedSnow, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedSnow)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedSnow, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedSnow)));

        //Cactus
        AddRecipe(new ItemStack(Blocks.CACTUS, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedCactus)));
        AddRecipe(new ItemStack(CBlocks.compressedCactus, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedCactus)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedCactus, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedCactus)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedCactus, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedCactus)));

        //End Brick
        AddRecipe(new ItemStack(Blocks.END_BRICKS, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedEndBricks)));
        AddRecipe(new ItemStack(CBlocks.compressedEndBricks, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedEndBricks)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedEndBricks, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedEndBricks)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedEndBricks, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedEndBricks)));

        //Grass Path
        AddRecipe(new ItemStack(Blocks.GRASS_PATH, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedGrassPath)));
        AddRecipe(new ItemStack(CBlocks.compressedGrassPath, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedGrassPath)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedGrassPath, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedGrassPath)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedGrassPath, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedGrassPath)));

        //Coarse Dirt
        AddRecipe(new ItemStack(Blocks.DIRT, 9, 1), Ingredient.fromStacks(new ItemStack(CBlocks.compressedCoarseDirt)));
        AddRecipe(new ItemStack(CBlocks.compressedCoarseDirt, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedCoarseDirt)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedCoarseDirt, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedCoarseDirt)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedCoarseDirt, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedCoarseDirt)));

        //Sea Lantern
        AddRecipe(new ItemStack(Blocks.SEA_LANTERN, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedSeaLantern)));
        AddRecipe(new ItemStack(CBlocks.compressedSeaLantern, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedSeaLantern)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedSeaLantern, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedSeaLantern)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedSeaLantern, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedSeaLantern)));

        //Nether Wart
        AddRecipe(new ItemStack(Blocks.NETHER_WART_BLOCK, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedNetherWartBlock)));
        AddRecipe(new ItemStack(CBlocks.compressedNetherWartBlock, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedNetherWartBlock)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedNetherWartBlock, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedNetherWartBlock)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedNetherWartBlock, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedNetherWartBlock)));

        //Magma
        AddRecipe(new ItemStack(Blocks.MAGMA, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedMagmaBlock)));
        AddRecipe(new ItemStack(CBlocks.compressedMagmaBlock, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedMagmaBlock)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedMagmaBlock, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedMagmaBlock)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedMagmaBlock, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedMagmaBlock)));

        //Mycelium
        AddRecipe(new ItemStack(Blocks.MYCELIUM, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedMycelium)));
        AddRecipe(new ItemStack(CBlocks.compressedMycelium, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedMycelium)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedMycelium, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedMycelium)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedMycelium, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedMycelium)));

        //Prismarine Brick
        AddRecipe(new ItemStack(Blocks.PRISMARINE, 9, 1), Ingredient.fromStacks(new ItemStack(CBlocks.compressedPrismarineBricks)));
        AddRecipe(new ItemStack(CBlocks.compressedPrismarineBricks, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedPrismarineBricks)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedPrismarineBricks, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedPrismarineBricks)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedPrismarineBricks, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedPrismarineBricks)));

        //Prismarine Dark
        AddRecipe(new ItemStack(Blocks.PRISMARINE, 9, 2), Ingredient.fromStacks(new ItemStack(CBlocks.compressedPrismarineDark)));
        AddRecipe(new ItemStack(CBlocks.compressedPrismarineDark, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedPrismarineDark)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedPrismarineDark, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedPrismarineDark)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedPrismarineDark, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedPrismarineDark)));

        //Prismarine Rough
        AddRecipe(new ItemStack(Blocks.PRISMARINE, 9, 0), Ingredient.fromStacks(new ItemStack(CBlocks.compressedPrismarineRough)));
        AddRecipe(new ItemStack(CBlocks.compressedPrismarineRough, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedPrismarineRough)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedPrismarineRough, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedPrismarineRough)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedPrismarineRough, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedPrismarineRough)));

        //Purpur
        AddRecipe(new ItemStack(Blocks.PURPUR_BLOCK, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedPurpurBlock)));
        AddRecipe(new ItemStack(CBlocks.compressedPurpurBlock, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedPurpurBlock)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedPurpurBlock, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedPurpurBlock)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedPurpurBlock, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedPurpurBlock)));

        //Purpur Pillar
        AddRecipe(new ItemStack(Blocks.PURPUR_PILLAR, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedPurpurPillar)));
        AddRecipe(new ItemStack(CBlocks.compressedPurpurPillar, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedPurpurPillar)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedPurpurPillar, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedPurpurPillar)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedPurpurPillar, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedPurpurPillar)));

        //Quartz Ore
        AddRecipe(new ItemStack(Blocks.QUARTZ_ORE, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedQuartzOre)));
        AddRecipe(new ItemStack(CBlocks.compressedQuartzOre, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedQuartzOre)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedQuartzOre, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedQuartzOre)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedQuartzOre, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedQuartzOre)));

        //Slime
        AddRecipe(new ItemStack(Blocks.SLIME_BLOCK, 9), Ingredient.fromStacks(new ItemStack(CBlocks.compressedSlime)));
        AddRecipe(new ItemStack(CBlocks.compressedSlime, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedSlime)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedSlime, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedSlime)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedSlime, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedSlime)));

        //Red Sandstone
        AddRecipe(new ItemStack(Blocks.RED_SANDSTONE, 9, 0), Ingredient.fromStacks(new ItemStack(CBlocks.compressedRedSandstone)));
        AddRecipe(new ItemStack(CBlocks.compressedRedSandstone, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedRedSandstone)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedRedSandstone, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedRedSandstone)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedRedSandstone, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedRedSandstone)));

        //Red Sandstone Carved
        AddRecipe(new ItemStack(Blocks.RED_SANDSTONE, 9, 1), Ingredient.fromStacks(new ItemStack(CBlocks.compressedRedSandstoneCarved)));
        AddRecipe(new ItemStack(CBlocks.compressedRedSandstoneCarved, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedRedSandstoneCarved)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedRedSandstoneCarved, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedRedSandstoneCarved)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedRedSandstoneCarved, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedRedSandstoneCarved)));

        //Red Sandstone Smooth
        AddRecipe(new ItemStack(Blocks.RED_SANDSTONE, 9, 2), Ingredient.fromStacks(new ItemStack(CBlocks.compressedRedSandstoneSmooth)));
        AddRecipe(new ItemStack(CBlocks.compressedRedSandstoneSmooth, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedRedSandstoneSmooth)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedRedSandstoneSmooth, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedRedSandstoneSmooth)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedRedSandstoneSmooth, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedRedSandstoneSmooth)));

        //Sponge Wet
        AddRecipe(new ItemStack(Blocks.SPONGE, 9, 1), Ingredient.fromStacks(new ItemStack(CBlocks.compressedSpongeWet)));
        AddRecipe(new ItemStack(CBlocks.compressedSpongeWet, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedSpongeWet)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedSpongeWet, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedSpongeWet)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedSpongeWet, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedSpongeWet)));

        //Andersite
        AddRecipe(new ItemStack(Blocks.STONE, 9, 5), Ingredient.fromStacks(new ItemStack(CBlocks.compressedAndersite)));
        AddRecipe(new ItemStack(CBlocks.compressedAndersite, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedAndersite)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedAndersite, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedAndersite)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedAndersite, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedAndersite)));

        //Andersite Smooth
        AddRecipe(new ItemStack(Blocks.STONE, 9, 6), Ingredient.fromStacks(new ItemStack(CBlocks.compressedAndersiteSmooth)));
        AddRecipe(new ItemStack(CBlocks.compressedAndersiteSmooth, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedAndersiteSmooth)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedAndersiteSmooth, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedAndersiteSmooth)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedAndersiteSmooth, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedAndersiteSmooth)));

        //Diorite
        AddRecipe(new ItemStack(Blocks.STONE, 9, 3), Ingredient.fromStacks(new ItemStack(CBlocks.compressedDiorite)));
        AddRecipe(new ItemStack(CBlocks.compressedDiorite, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedDiorite)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedDiorite, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedDiorite)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedDiorite, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedDiorite)));

        //Diorite Smooth
        AddRecipe(new ItemStack(Blocks.STONE, 9, 4), Ingredient.fromStacks(new ItemStack(CBlocks.compressedDioriteSmooth)));
        AddRecipe(new ItemStack(CBlocks.compressedDioriteSmooth, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedDioriteSmooth)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedDioriteSmooth, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedDioriteSmooth)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedDioriteSmooth, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedDioriteSmooth)));

        //Granite
        AddRecipe(new ItemStack(Blocks.STONE, 9, 1), Ingredient.fromStacks(new ItemStack(CBlocks.compressedGranite)));
        AddRecipe(new ItemStack(CBlocks.compressedGranite, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedGranite)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedGranite, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedGranite)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedGranite, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedGranite)));

        //Granite Smooth
        AddRecipe(new ItemStack(Blocks.STONE, 9, 2), Ingredient.fromStacks(new ItemStack(CBlocks.compressedGraniteSmooth)));
        AddRecipe(new ItemStack(CBlocks.compressedGraniteSmooth, 9), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedGraniteSmooth)));
        AddRecipe(new ItemStack(CBlocks.doublecompressedGraniteSmooth, 9), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedGraniteSmooth)));
        AddRecipe(new ItemStack(CBlocks.triplecompressedGraniteSmooth, 9), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedGraniteSmooth)));

        //Wool
        for (int i = 0; i < EnumHandler.ColorTypes.values().length; i++)
        {
            AddRecipe(new ItemStack(Blocks.WOOL, 9, i), Ingredient.fromStacks(new ItemStack(CBlocks.compressedWool, 1, i)));
            AddRecipe(new ItemStack(CBlocks.compressedWool, 9, i), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedWool, 1, i)));
            AddRecipe(new ItemStack(CBlocks.doublecompressedWool, 9, i), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedWool, 1, i)));
            AddRecipe(new ItemStack(CBlocks.triplecompressedWool, 9, i), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedWool, 1, i)));
        }

        //Wool Dye
        for (int i = 0; i < EnumHandler.ColorTypes.values().length; i++)
        {
            AddDyeRecipe(new ItemStack(CBlocks.compressedWool, 1, i), Ingredient.fromStacks(new ItemStack(Items.DYE, 1, 15 - i)), Ingredient.fromStacks(new ItemStack(Item.getItemFromBlock(CBlocks.compressedWool), 1, 0)));
            AddDyeRecipe(new ItemStack(CBlocks.doublecompressedWool, 1, i), Ingredient.fromStacks(new ItemStack(Items.DYE, 1, 15 - i)), Ingredient.fromStacks(new ItemStack(Item.getItemFromBlock(CBlocks.doublecompressedWool), 1, 0)));
            AddDyeRecipe(new ItemStack(CBlocks.triplecompressedWool, 1, i), Ingredient.fromStacks(new ItemStack(Items.DYE, 1, 15 - i)), Ingredient.fromStacks(new ItemStack(Item.getItemFromBlock(CBlocks.triplecompressedWool), 1, 0)));
            AddDyeRecipe(new ItemStack(CBlocks.quadruplecompressedWool, 1, i), Ingredient.fromStacks(new ItemStack(Items.DYE, 1, 15 - i)), Ingredient.fromStacks(new ItemStack(Item.getItemFromBlock(CBlocks.quadruplecompressedWool), 1, 0)));
        }

        //Glass
        for (int i = 0; i < EnumHandler.ColorTypes.values().length; i++)
        {
            AddRecipe(new ItemStack(Blocks.STAINED_GLASS, 9, i), Ingredient.fromStacks(new ItemStack(CBlocks.compressedColorGlass, 1, i)));
            AddRecipe(new ItemStack(CBlocks.compressedColorGlass, 9, i), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedColorGlass, 1, i)));
            AddRecipe(new ItemStack(CBlocks.doublecompressedColorGlass, 9, i), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedColorGlass, 1, i)));
            AddRecipe(new ItemStack(CBlocks.triplecompressedColorGlass, 9, i), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedColorGlass, 1, i)));
        }

        //Glass Dye
        for (int i = 0; i < EnumHandler.ColorTypes.values().length; i++)
        {
            AddDyeRecipe(new ItemStack(CBlocks.compressedColorGlass, 1, i), Ingredient.fromStacks(new ItemStack(Items.DYE, 1, 15 - i)), Ingredient.fromStacks(new ItemStack(Item.getItemFromBlock(CBlocks.compressedColorGlass), 1, 0)));
            AddDyeRecipe(new ItemStack(CBlocks.doublecompressedColorGlass, 1, i), Ingredient.fromStacks(new ItemStack(Items.DYE, 1, 15 - i)), Ingredient.fromStacks(new ItemStack(Item.getItemFromBlock(CBlocks.doublecompressedColorGlass), 1, 0)));
            AddDyeRecipe(new ItemStack(CBlocks.triplecompressedColorGlass, 1, i), Ingredient.fromStacks(new ItemStack(Items.DYE, 1, 15 - i)), Ingredient.fromStacks(new ItemStack(Item.getItemFromBlock(CBlocks.triplecompressedColorGlass), 1, 0)));
            AddDyeRecipe(new ItemStack(CBlocks.quadruplecompressedColorGlass, 1, i), Ingredient.fromStacks(new ItemStack(Items.DYE, 1, 15 - i)), Ingredient.fromStacks(new ItemStack(Item.getItemFromBlock(CBlocks.quadruplecompressedColorGlass), 1, 0)));
        }

        //Hardened Dye
        for (int i = 0; i < EnumHandler.ColorTypes.values().length; i++)
        {
            AddDyeRecipe(new ItemStack(CBlocks.compressedHardenedClay, 1, i), Ingredient.fromStacks(new ItemStack(Items.DYE, 1, 15 - i)), Ingredient.fromStacks(new ItemStack(Item.getItemFromBlock(CBlocks.compressedHardenedClay), 1, 0)));
            AddDyeRecipe(new ItemStack(CBlocks.doublecompressedHardenedClay, 1, i), Ingredient.fromStacks(new ItemStack(Items.DYE, 1, 15 - i)), Ingredient.fromStacks(new ItemStack(Item.getItemFromBlock(CBlocks.doublecompressedHardenedClay), 1, 0)));
            AddDyeRecipe(new ItemStack(CBlocks.triplecompressedHardenedClay, 1, i), Ingredient.fromStacks(new ItemStack(Items.DYE, 1, 15 - i)), Ingredient.fromStacks(new ItemStack(Item.getItemFromBlock(CBlocks.triplecompressedHardenedClay), 1, 0)));
            AddDyeRecipe(new ItemStack(CBlocks.quadruplecompressedHardenedClay, 1, i), Ingredient.fromStacks(new ItemStack(Items.DYE, 1, 15 - i)), Ingredient.fromStacks(new ItemStack(Item.getItemFromBlock(CBlocks.quadruplecompressedHardenedClay), 1, 0)));
        }

        //Hardened Clay
        for (int i = 0; i < EnumHandler.ColorTypes.values().length; i++)
        {
            AddRecipe(new ItemStack(Blocks.STAINED_HARDENED_CLAY, 9, i), Ingredient.fromStacks(new ItemStack(CBlocks.compressedHardenedClay, 1, i)));
            AddRecipe(new ItemStack(CBlocks.compressedHardenedClay, 9, i), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedHardenedClay, 1, i)));
            AddRecipe(new ItemStack(CBlocks.doublecompressedHardenedClay, 9, i), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedHardenedClay, 1, i)));
            AddRecipe(new ItemStack(CBlocks.triplecompressedHardenedClay, 9, i), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedHardenedClay, 1, i)));
        }

        //Planks
        for (int i = 0; i < EnumHandler.WoodTypes.values().length; i++)
        {
            AddRecipe(new ItemStack(Blocks.PLANKS, 9, i), Ingredient.fromStacks(new ItemStack(CBlocks.compressedWoodPlanks, 1, i)));
            AddRecipe(new ItemStack(CBlocks.compressedWoodPlanks, 9, i), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedWoodPlanks, 1, i)));
            AddRecipe(new ItemStack(CBlocks.doublecompressedWoodPlanks, 9, i), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedWoodPlanks, 1, i)));
            AddRecipe(new ItemStack(CBlocks.triplecompressedWoodPlanks, 9, i), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedWoodPlanks, 1, i)));
        }

        //Log
        for (int i = 0; i < EnumHandler.WoodTypes.values().length - 2; i++)
        {
            AddRecipe(new ItemStack(Blocks.LOG, 9, i), Ingredient.fromStacks(new ItemStack(CBlocks.compressedWoodLog, 1, i)));
            AddRecipe(new ItemStack(CBlocks.compressedWoodLog, 9, i), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedWoodLog, 1, i)));
            AddRecipe(new ItemStack(CBlocks.doublecompressedWoodLog, 9, i), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedWoodLog, 1, i)));
            AddRecipe(new ItemStack(CBlocks.triplecompressedWoodLog, 9, i), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedWoodLog, 1, i)));
        }

        //Log2
        for (int i = 0; i < EnumHandler.WoodTypes.values().length - 4; i++)
        {
            AddRecipe(new ItemStack(Blocks.LOG2, 9, i), Ingredient.fromStacks(new ItemStack(CBlocks.compressedWoodLog, 1, i + 4)));
            AddRecipe(new ItemStack(CBlocks.compressedWoodLog, 9, i + 4), Ingredient.fromStacks(new ItemStack(CBlocks.doublecompressedWoodLog, 1, i + 4)));
            AddRecipe(new ItemStack(CBlocks.doublecompressedWoodLog, 9, i + 4), Ingredient.fromStacks(new ItemStack(CBlocks.triplecompressedWoodLog, 1, i + 4)));
            AddRecipe(new ItemStack(CBlocks.triplecompressedWoodLog, 9, i + 4), Ingredient.fromStacks(new ItemStack(CBlocks.quadruplecompressedWoodLog, 1, i + 4)));
        }

        CLogger.getLogger().info("Shapeless Recipes loaded");
    }

    private static void AddRecipe(ItemStack output, Ingredient... input) {
        ResourceLocation name = new ResourceLocation(Reference.MODID + ":shapeless/" + output.getUnlocalizedName().substring(5));
        ResourceLocation group = null;
        GameRegistry.addShapelessRecipe(name, group, output, input);
    }

    private static void AddDyeRecipe(ItemStack output, Ingredient... input) {
        ResourceLocation name = new ResourceLocation(Reference.MODID + ":shapelessDye/" + output.getUnlocalizedName().substring(5));
        ResourceLocation group = null;
        GameRegistry.addShapelessRecipe(name, group, output, input);
    }
}
