package com.asher9.CompactBlocks.init;

import com.asher9.CompactBlocks.CompactBlocks;
import com.asher9.CompactBlocks.Reference;
import com.asher9.CompactBlocks.api.EnumHandler;
import com.asher9.CompactBlocks.util.CLogger;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CShapedCrafting {

    public static void init() {
        CLogger.getLogger().info("Loading Shaped Recipes...");

        //Items
        AddShapedRecipe(new ItemStack(CItems.ingotEnderium), new Object[]{"###", "###", "###", '#', "nuggetEnderium"});
        AddShapedRecipe(new ItemStack(CItems.enderiumPickaxe), new Object[]{"###", " I ", " I ", '#', "ingotEnderium", Character.valueOf('I'), Items.STICK});
        AddShapedRecipe(new ItemStack(CItems.enderiumAxe), new Object[]{"## ", "#I ", " I ", '#', "ingotEnderium", Character.valueOf('I'), Items.STICK});
        AddShapedRecipe(new ItemStack(CItems.enderiumShovel), new Object[]{" # ", " I ", " I ", '#', "ingotEnderium", Character.valueOf('I'), Items.STICK});
        AddShapedRecipe(new ItemStack(CBlocks.blockEnderium), new Object[]{"###", "###", "###", '#', "ingotEnderium"});

        if(CompactBlocks.config.cache.activateCompressedCobblestone) {
            CLogger.getLogger().info("hjfghshjfvhbshfvbshfbh");
            AddShapedRecipe(new ItemStack(CBlocks.compressedCobblestone), new Object[]{"###", "###", "###", '#', Blocks.COBBLESTONE});
            AddShapedRecipe(new ItemStack(CBlocks.doublecompressedCobblestone), new Object[]{"###", "###", "###", '#', CBlocks.compressedCobblestone});
            AddShapedRecipe(new ItemStack(CBlocks.triplecompressedCobblestone), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedCobblestone});
            AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedCobblestone), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedCobblestone});
        }

        if(CompactBlocks.config.cache.activateCompressedDirt) {
            AddShapedRecipe(new ItemStack(CBlocks.compressedDirt), new Object[]{"###", "###", "###", '#', new ItemStack(Blocks.DIRT, 1, 0)});
            AddShapedRecipe(new ItemStack(CBlocks.doublecompressedDirt), new Object[]{"###", "###", "###", '#', CBlocks.compressedDirt});
            AddShapedRecipe(new ItemStack(CBlocks.triplecompressedDirt), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedDirt});
            AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedDirt), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedDirt});
        }

        if(CompactBlocks.config.cache.activateCompressedSand) {
            AddShapedRecipe(new ItemStack(CBlocks.compressedSand), new Object[]{"###", "###", "###", '#', new ItemStack(Blocks.SAND, 1 ,0)});
            AddShapedRecipe(new ItemStack(CBlocks.doublecompressedSand), new Object[]{"###", "###", "###", '#', CBlocks.compressedSand});
            AddShapedRecipe(new ItemStack(CBlocks.triplecompressedSand), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedSand});
            AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedSand), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedSand});
        }

        if(CompactBlocks.config.cache.activateCompressedGravel) {
            AddShapedRecipe(new ItemStack(CBlocks.compressedGravel), new Object[]{"###", "###", "###", '#', Blocks.GRAVEL});
            AddShapedRecipe(new ItemStack(CBlocks.doublecompressedGravel), new Object[]{"###", "###", "###", '#', CBlocks.compressedGravel});
            AddShapedRecipe(new ItemStack(CBlocks.triplecompressedGravel), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedGravel});
            AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedGravel), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedGravel});
        }

        //Coal Block
        AddShapedRecipe(new ItemStack(CBlocks.compressedCoalBlock), new Object[]{"###", "###", "###", '#', Blocks.COAL_BLOCK});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedCoalBlock), new Object[]{"###", "###", "###", '#', CBlocks.compressedCoalBlock});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedCoalBlock), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedCoalBlock});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedCoalBlock), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedCoalBlock});

        //Obsidian
        AddShapedRecipe(new ItemStack(CBlocks.compressedObsidian), new Object[]{"###", "###", "###", '#', Blocks.OBSIDIAN});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedObsidian), new Object[]{"###", "###", "###", '#', CBlocks.compressedObsidian});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedObsidian), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedObsidian});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedObsidian), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedObsidian});

        //Enderium
        AddShapedRecipe(new ItemStack(CBlocks.compressedEnderium), new Object[]{"###", "###", "###", '#', CBlocks.blockEnderium});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedEnderium), new Object[]{"###", "###", "###", '#', CBlocks.compressedEnderium});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedEnderium), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedEnderium});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedEnderium), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedEnderium});

        //Stone
        AddShapedRecipe(new ItemStack(CBlocks.compressedStone), new Object[]{"###", "###", "###", '#', new ItemStack(Blocks.STONE, 1, 0)});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedStone), new Object[]{"###", "###", "###", '#', CBlocks.compressedStone});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedStone), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedStone});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedStone), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedStone});

        //Clay
        AddShapedRecipe(new ItemStack(CBlocks.compressedClay), new Object[]{"###", "###", "###", '#', Blocks.CLAY});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedClay), new Object[]{"###", "###", "###", '#', CBlocks.compressedClay});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedClay), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedClay});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedClay), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedClay});

        //Brick
        AddShapedRecipe(new ItemStack(CBlocks.compressedBrick), new Object[]{"###", "###", "###", '#', Blocks.BRICK_BLOCK});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedBrick), new Object[]{"###", "###", "###", '#', CBlocks.compressedBrick});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedBrick), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedBrick});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedBrick), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedBrick});

        //Bedrock
        AddShapedRecipe(new ItemStack(CBlocks.compressedBedrock), new Object[]{"###", "###", "###", '#', Blocks.BEDROCK});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedBedrock), new Object[]{"###", "###", "###", '#', CBlocks.compressedBedrock});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedBedrock), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedBedrock});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedBedrock), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedBedrock});

        //Mossy Cobblestone
        AddShapedRecipe(new ItemStack(CBlocks.compressedCobblestone_mossy), new Object[]{"###", "###", "###", '#', Blocks.MOSSY_COBBLESTONE});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedCobblestone_mossy), new Object[]{"###", "###", "###", '#', CBlocks.compressedCobblestone_mossy});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedCobblestone_mossy), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedCobblestone_mossy});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedCobblestone_mossy), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedCobblestone_mossy});

        //Diamond
        AddShapedRecipe(new ItemStack(CBlocks.compressedDiamondBlock), new Object[]{"###", "###", "###", '#', Blocks.DIAMOND_BLOCK});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedDiamondBlock), new Object[]{"###", "###", "###", '#', CBlocks.compressedDiamondBlock});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedDiamondBlock), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedDiamondBlock});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedDiamondBlock), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedDiamondBlock});

        //Emerald
        AddShapedRecipe(new ItemStack(CBlocks.compressedEmeraldBlock), new Object[]{"###", "###", "###", '#', Blocks.EMERALD_BLOCK});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedEmeraldBlock), new Object[]{"###", "###", "###", '#', CBlocks.compressedEmeraldBlock});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedEmeraldBlock), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedEmeraldBlock});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedEmeraldBlock), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedEmeraldBlock});

        //End Stone
        if(CompactBlocks.config.cache.activateCompressedEndStone) {
            AddShapedRecipe(new ItemStack(CBlocks.compressedEndStone), new Object[]{"###", "###", "###", '#', Blocks.END_STONE});
            AddShapedRecipe(new ItemStack(CBlocks.doublecompressedEndStone), new Object[]{"###", "###", "###", '#', CBlocks.compressedEndStone});
            AddShapedRecipe(new ItemStack(CBlocks.triplecompressedEndStone), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedEndStone});
            AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedEndStone), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedEndStone});
        }

        //Glowstone
        AddShapedRecipe(new ItemStack(CBlocks.compressedGlowstone), new Object[]{"###", "###", "###", '#', Blocks.GLOWSTONE});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedGlowstone), new Object[]{"###", "###", "###", '#', CBlocks.compressedGlowstone});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedGlowstone), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedGlowstone});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedGlowstone), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedGlowstone});

        //Glass
        AddShapedRecipe(new ItemStack(CBlocks.compressedGlassBlock), new Object[]{"###", "###", "###", '#', Blocks.GLASS});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedGlassBlock), new Object[]{"###", "###", "###", '#', CBlocks.compressedGlassBlock});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedGlassBlock), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedGlassBlock});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedGlassBlock), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedGlassBlock});

        //Gold
        AddShapedRecipe(new ItemStack(CBlocks.compressedGoldBlock), new Object[]{"###", "###", "###", '#', Blocks.GOLD_BLOCK});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedGoldBlock), new Object[]{"###", "###", "###", '#', CBlocks.compressedGoldBlock});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedGoldBlock), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedGoldBlock});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedGoldBlock), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedGoldBlock});

        //Hay
        AddShapedRecipe(new ItemStack(CBlocks.compressedHayBlock), new Object[]{"###", "###", "###", '#', Blocks.HAY_BLOCK});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedHayBlock), new Object[]{"###", "###", "###", '#', CBlocks.compressedHayBlock});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedHayBlock), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedHayBlock});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedHayBlock), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedHayBlock});

        //Ice
        AddShapedRecipe(new ItemStack(CBlocks.compressedIce), new Object[]{"###", "###", "###", '#', Blocks.ICE});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedIce), new Object[]{"###", "###", "###", '#', CBlocks.compressedIce});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedIce), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedIce});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedIce), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedIce});

        //Iron
        AddShapedRecipe(new ItemStack(CBlocks.compressedIronBlock), new Object[]{"###", "###", "###", '#', Blocks.IRON_BLOCK});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedIronBlock), new Object[]{"###", "###", "###", '#', CBlocks.compressedIronBlock});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedIronBlock), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedIronBlock});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedIronBlock), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedIronBlock});

        //Lapis
        AddShapedRecipe(new ItemStack(CBlocks.compressedLapisBlock), new Object[]{"###", "###", "###", '#', Blocks.LAPIS_BLOCK});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedLapisBlock), new Object[]{"###", "###", "###", '#', CBlocks.compressedLapisBlock});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedLapisBlock), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedLapisBlock});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedLapisBlock), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedLapisBlock});

        //Nether Brick
        AddShapedRecipe(new ItemStack(CBlocks.compressedNetherBrick), new Object[]{"###", "###", "###", '#', Blocks.NETHER_BRICK});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedNetherBrick), new Object[]{"###", "###", "###", '#', CBlocks.compressedNetherBrick});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedNetherBrick), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedNetherBrick});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedNetherBrick), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedNetherBrick});

        //Netherrack
        if(CompactBlocks.config.cache.activateCompressedNetherrack) {
            AddShapedRecipe(new ItemStack(CBlocks.compressedNetherrack), new Object[]{"###", "###", "###", '#', Blocks.NETHERRACK});
            AddShapedRecipe(new ItemStack(CBlocks.doublecompressedNetherrack), new Object[]{"###", "###", "###", '#', CBlocks.compressedNetherrack});
            AddShapedRecipe(new ItemStack(CBlocks.triplecompressedNetherrack), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedNetherrack});
            AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedNetherrack), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedNetherrack});
        }

        //Redstone
        AddShapedRecipe(new ItemStack(CBlocks.compressedRedstoneBlock), new Object[]{"###", "###", "###", '#', Blocks.REDSTONE_BLOCK});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedRedstoneBlock), new Object[]{"###", "###", "###", '#', CBlocks.compressedRedstoneBlock});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedRedstoneBlock), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedRedstoneBlock});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedRedstoneBlock), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedRedstoneBlock});

        //Red Sand
        AddShapedRecipe(new ItemStack(CBlocks.compressedRedSand), new Object[]{"###", "###", "###", '#', new ItemStack(Blocks.SAND, 1, 1)});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedRedSand), new Object[]{"###", "###", "###", '#', CBlocks.compressedRedSand});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedRedSand), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedRedSand});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedRedSand), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedRedSand});

        //Stone Brick
        AddShapedRecipe(new ItemStack(CBlocks.compressedStoneBrick), new Object[]{"###", "###", "###", '#', new ItemStack(Blocks.STONEBRICK, 1, 0)});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedStoneBrick), new Object[]{"###", "###", "###", '#', CBlocks.compressedStoneBrick});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedStoneBrick), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedStoneBrick});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedStoneBrick), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedStoneBrick});

        //Stone Brick Mossy
        AddShapedRecipe(new ItemStack(CBlocks.compressedStoneBrickMossy), new Object[]{"###", "###", "###", '#', new ItemStack(Blocks.STONEBRICK, 1, 1)});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedStoneBrickMossy), new Object[]{"###", "###", "###", '#', CBlocks.compressedStoneBrickMossy});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedStoneBrickMossy), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedStoneBrickMossy});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedStoneBrickMossy), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedStoneBrickMossy});

        //Stone Brick Cracked
        AddShapedRecipe(new ItemStack(CBlocks.compressedStoneBrickCracked), new Object[]{"###", "###", "###", '#', new ItemStack(Blocks.STONEBRICK, 1, 2)});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedStoneBrickCracked), new Object[]{"###", "###", "###", '#', CBlocks.compressedStoneBrickCracked});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedStoneBrickCracked), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedStoneBrickCracked});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedStoneBrickCracked), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedStoneBrickCracked});

        //Stone Brick Chiseled
        AddShapedRecipe(new ItemStack(CBlocks.compressedStoneBrickChiseled), new Object[]{"###", "###", "###", '#', new ItemStack(Blocks.STONEBRICK, 1, 3)});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedStoneBrickChiseled), new Object[]{"###", "###", "###", '#', CBlocks.compressedStoneBrickChiseled});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedStoneBrickChiseled), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedStoneBrickChiseled});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedStoneBrickChiseled), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedStoneBrickChiseled});

        //Sponge
        AddShapedRecipe(new ItemStack(CBlocks.compressedSponge), new Object[]{"###", "###", "###", '#', Blocks.SPONGE});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedSponge), new Object[]{"###", "###", "###", '#', CBlocks.compressedSponge});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedSponge), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedSponge});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedSponge), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedSponge});

        //Bookshelf
        AddShapedRecipe(new ItemStack(CBlocks.compressedBookshelf), new Object[]{"###", "###", "###", '#', Blocks.BOOKSHELF});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedBookshelf), new Object[]{"###", "###", "###", '#', CBlocks.compressedBookshelf});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedBookshelf), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedBookshelf});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedBookshelf), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedBookshelf});

        //Crafting Table
        AddShapedRecipe(new ItemStack(CBlocks.compressedCraftingTable), new Object[]{"###", "###", "###", '#', Blocks.CRAFTING_TABLE});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedCraftingTable), new Object[]{"###", "###", "###", '#', CBlocks.compressedCraftingTable});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedCraftingTable), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedCraftingTable});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedCraftingTable), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedCraftingTable});

        //Hardened Clay
        AddShapedRecipe(new ItemStack(CBlocks.compressedHardenedClay_ST), new Object[]{"###", "###", "###", '#', Blocks.HARDENED_CLAY});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedHardenedClay_ST), new Object[]{"###", "###", "###", '#', CBlocks.compressedHardenedClay_ST});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedHardenedClay_ST), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedHardenedClay_ST});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedHardenedClay_ST), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedHardenedClay_ST});

        //Coal Ore
        AddShapedRecipe(new ItemStack(CBlocks.compressedCoalOre), new Object[]{"###", "###", "###", '#', Blocks.COAL_ORE});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedCoalOre), new Object[]{"###", "###", "###", '#', CBlocks.compressedCoalOre});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedCoalOre), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedCoalOre});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedCoalOre), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedCoalOre});

        //Diamond Ore
        AddShapedRecipe(new ItemStack(CBlocks.compressedDiamondOre), new Object[]{"###", "###", "###", '#', Blocks.DIAMOND_ORE});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedDiamondOre), new Object[]{"###", "###", "###", '#', CBlocks.compressedDiamondOre});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedDiamondOre), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedDiamondOre});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedDiamondOre), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedDiamondOre});

        //Emerald Ore
        AddShapedRecipe(new ItemStack(CBlocks.compressedEmeraldOre), new Object[]{"###", "###", "###", '#', Blocks.EMERALD_ORE});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedEmeraldOre), new Object[]{"###", "###", "###", '#', CBlocks.compressedEmeraldOre});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedEmeraldOre), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedEmeraldOre});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedEmeraldOre), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedEmeraldOre});

        //Gold Ore
        AddShapedRecipe(new ItemStack(CBlocks.compressedGoldOre), new Object[]{"###", "###", "###", '#', Blocks.GOLD_ORE});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedGoldOre), new Object[]{"###", "###", "###", '#', CBlocks.compressedGoldOre});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedGoldOre), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedGoldOre});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedGoldOre), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedGoldOre});

        //Iron Ore
        AddShapedRecipe(new ItemStack(CBlocks.compressedIronOre), new Object[]{"###", "###", "###", '#', Blocks.IRON_ORE});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedIronOre), new Object[]{"###", "###", "###", '#', CBlocks.compressedIronOre});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedIronOre), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedIronOre});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedIronOre), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedIronOre});

        //Podzol
        AddShapedRecipe(new ItemStack(CBlocks.compressedPodzol), new Object[]{"###", "###", "###", '#', new ItemStack(Blocks.DIRT, 1, 2)});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedPodzol), new Object[]{"###", "###", "###", '#', CBlocks.compressedPodzol});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedPodzol), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedPodzol});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedPodzol), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedPodzol});

        //Quartz
        AddShapedRecipe(new ItemStack(CBlocks.compressedQuartzBlock), new Object[]{"###", "###", "###", '#', new ItemStack(Blocks.QUARTZ_BLOCK, 1, 0)});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedQuartzBlock), new Object[]{"###", "###", "###", '#', CBlocks.compressedQuartzBlock});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedQuartzBlock), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedQuartzBlock});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedQuartzBlock), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedQuartzBlock});

        //Quartz Chiseled
        AddShapedRecipe(new ItemStack(CBlocks.compressedQuartzChiseled), new Object[]{"###", "###", "###", '#', new ItemStack(Blocks.QUARTZ_BLOCK, 1, 1)});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedQuartzChiseled), new Object[]{"###", "###", "###", '#', CBlocks.compressedQuartzChiseled});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedQuartzChiseled), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedQuartzChiseled});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedQuartzChiseled), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedQuartzChiseled});

        //Quartz Lines
        AddShapedRecipe(new ItemStack(CBlocks.compressedQuartzLines), new Object[]{"###", "###", "###", '#', new ItemStack(Blocks.QUARTZ_BLOCK, 1, 2)});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedQuartzLines), new Object[]{"###", "###", "###", '#', CBlocks.compressedQuartzLines});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedQuartzLines), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedQuartzLines});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedQuartzLines), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedQuartzLines});

        //TNT
        AddShapedRecipe(new ItemStack(CBlocks.compressedTNT), new Object[]{"###", "###", "###", '#', Blocks.TNT});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedTNT), new Object[]{"###", "###", "###", '#', CBlocks.compressedTNT});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedTNT), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedTNT});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedTNT), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedTNT});

        //Soul Sand
        if(CompactBlocks.config.cache.activateCompressedSoulSand) {
            AddShapedRecipe(new ItemStack(CBlocks.compressedSoulSand), new Object[]{"###", "###", "###", '#', Blocks.SOUL_SAND});
            AddShapedRecipe(new ItemStack(CBlocks.doublecompressedSoulSand), new Object[]{"###", "###", "###", '#', CBlocks.compressedSoulSand});
            AddShapedRecipe(new ItemStack(CBlocks.triplecompressedSoulSand), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedSoulSand});
            AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedSoulSand), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedSoulSand});
        }

        //Melon
        AddShapedRecipe(new ItemStack(CBlocks.compressedMelon), new Object[]{"###", "###", "###", '#', Blocks.MELON_BLOCK});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedMelon), new Object[]{"###", "###", "###", '#', CBlocks.compressedMelon});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedMelon), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedMelon});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedMelon), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedMelon});

        //Lit Pumpkin
        AddShapedRecipe(new ItemStack(CBlocks.compressedJackOLantern), new Object[]{"###", "###", "###", '#', Blocks.LIT_PUMPKIN});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedJackOLantern), new Object[]{"###", "###", "###", '#', CBlocks.compressedJackOLantern});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedJackOLantern), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedJackOLantern});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedJackOLantern), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedJackOLantern});

        //Pumpkin
        AddShapedRecipe(new ItemStack(CBlocks.compressedPumpkin), new Object[]{"###", "###", "###", '#', Blocks.PUMPKIN});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedPumpkin), new Object[]{"###", "###", "###", '#', CBlocks.compressedPumpkin});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedPumpkin), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedPumpkin});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedPumpkin), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedPumpkin});

        //Snow
        AddShapedRecipe(new ItemStack(CBlocks.compressedSnow), new Object[]{"###", "###", "###", '#', Blocks.SNOW});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedSnow), new Object[]{"###", "###", "###", '#', CBlocks.compressedSnow});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedSnow), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedSnow});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedSnow), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedSnow});

        //Cactus
        AddShapedRecipe(new ItemStack(CBlocks.compressedCactus), new Object[]{"###", "###", "###", '#', Blocks.CACTUS});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedCactus), new Object[]{"###", "###", "###", '#', CBlocks.compressedCactus});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedCactus), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedCactus});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedCactus), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedCactus});

        //End Brick
        AddShapedRecipe(new ItemStack(CBlocks.compressedEndBricks), new Object[]{"###", "###", "###", '#', Blocks.END_BRICKS});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedEndBricks), new Object[]{"###", "###", "###", '#', CBlocks.compressedEndBricks});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedEndBricks), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedEndBricks});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedEndBricks), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedEndBricks});

        //Grass Path
        AddShapedRecipe(new ItemStack(CBlocks.compressedGrassPath), new Object[]{"###", "###", "###", '#', Blocks.GRASS_PATH});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedGrassPath), new Object[]{"###", "###", "###", '#', CBlocks.compressedGrassPath});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedGrassPath), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedGrassPath});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedGrassPath), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedGrassPath});

        //Coarse Dirt
        AddShapedRecipe(new ItemStack(CBlocks.compressedCoarseDirt), new Object[]{"###", "###", "###", '#', new ItemStack(Blocks.DIRT, 1, 1)});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedCoarseDirt), new Object[]{"###", "###", "###", '#', CBlocks.compressedCoarseDirt});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedCoarseDirt), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedCoarseDirt});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedCoarseDirt), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedCoarseDirt});

        //Sea Lantern
        AddShapedRecipe(new ItemStack(CBlocks.compressedSeaLantern), new Object[]{"###", "###", "###", '#', Blocks.SEA_LANTERN});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedSeaLantern), new Object[]{"###", "###", "###", '#', CBlocks.compressedSeaLantern});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedSeaLantern), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedSeaLantern});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedSeaLantern), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedSeaLantern});

        //Nether Wart
        AddShapedRecipe(new ItemStack(CBlocks.compressedNetherWartBlock), new Object[]{"###", "###", "###", '#', Blocks.NETHER_WART_BLOCK});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedNetherWartBlock), new Object[]{"###", "###", "###", '#', CBlocks.compressedNetherWartBlock});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedNetherWartBlock), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedNetherWartBlock});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedNetherWartBlock), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedNetherWartBlock});

        //Magma
        AddShapedRecipe(new ItemStack(CBlocks.compressedMagmaBlock), new Object[]{"###", "###", "###", '#', Blocks.MAGMA});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedMagmaBlock), new Object[]{"###", "###", "###", '#', CBlocks.compressedMagmaBlock});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedMagmaBlock), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedMagmaBlock});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedMagmaBlock), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedMagmaBlock});

        //Mycelium
        AddShapedRecipe(new ItemStack(CBlocks.compressedMycelium), new Object[]{"###", "###", "###", '#', Blocks.MYCELIUM});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedMycelium), new Object[]{"###", "###", "###", '#', CBlocks.compressedMycelium});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedMycelium), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedMycelium});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedMycelium), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedMycelium});

        //Prismarin Brick
        AddShapedRecipe(new ItemStack(CBlocks.compressedPrismarineBricks), new Object[]{"###", "###", "###", '#', new ItemStack(Blocks.PRISMARINE, 1, 1)});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedPrismarineBricks), new Object[]{"###", "###", "###", '#', CBlocks.compressedPrismarineBricks});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedPrismarineBricks), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedPrismarineBricks});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedPrismarineBricks), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedPrismarineBricks});

        //Prismarin Dark
        AddShapedRecipe(new ItemStack(CBlocks.compressedPrismarineDark), new Object[]{"###", "###", "###", '#', new ItemStack(Blocks.PRISMARINE, 1, 2)});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedPrismarineDark), new Object[]{"###", "###", "###", '#', CBlocks.compressedPrismarineDark});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedPrismarineDark), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedPrismarineDark});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedPrismarineDark), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedPrismarineDark});

        //Prismarin Rough
        AddShapedRecipe(new ItemStack(CBlocks.compressedPrismarineRough), new Object[]{"###", "###", "###", '#', new ItemStack(Blocks.PRISMARINE, 1, 0)});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedPrismarineRough), new Object[]{"###", "###", "###", '#', CBlocks.compressedPrismarineRough});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedPrismarineRough), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedPrismarineRough});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedPrismarineRough), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedPrismarineRough});

        //Purpur
        AddShapedRecipe(new ItemStack(CBlocks.compressedPurpurBlock), new Object[]{"###", "###", "###", '#', Blocks.PURPUR_BLOCK});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedPurpurBlock), new Object[]{"###", "###", "###", '#', CBlocks.compressedPurpurBlock});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedPurpurBlock), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedPurpurBlock});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedPurpurBlock), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedPurpurBlock});

        //Purpur Pillar
        AddShapedRecipe(new ItemStack(CBlocks.compressedPurpurPillar), new Object[]{"###", "###", "###", '#', Blocks.PURPUR_PILLAR});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedPurpurPillar), new Object[]{"###", "###", "###", '#', CBlocks.compressedPurpurPillar});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedPurpurPillar), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedPurpurPillar});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedPurpurPillar), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedPurpurPillar});

        //Quartz Ore
        AddShapedRecipe(new ItemStack(CBlocks.compressedQuartzOre), new Object[]{"###", "###", "###", '#', Blocks.QUARTZ_ORE});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedQuartzOre), new Object[]{"###", "###", "###", '#', CBlocks.compressedQuartzOre});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedQuartzOre), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedQuartzOre});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedQuartzOre), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedQuartzOre});

        //Slime
        AddShapedRecipe(new ItemStack(CBlocks.compressedSlime), new Object[]{"###", "###", "###", '#', Blocks.SLIME_BLOCK});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedSlime), new Object[]{"###", "###", "###", '#', CBlocks.compressedSlime});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedSlime), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedSlime});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedSlime), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedSlime});

        //Red Sandstone
        AddShapedRecipe(new ItemStack(CBlocks.compressedRedSandstone), new Object[]{"###", "###", "###", '#', new ItemStack(Blocks.RED_SANDSTONE, 1, 0)});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedRedSandstone), new Object[]{"###", "###", "###", '#', CBlocks.compressedRedSandstone});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedRedSandstone), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedRedSandstone});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedRedSandstone), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedRedSandstone});

        //Red Sandstone Carved
        AddShapedRecipe(new ItemStack(CBlocks.compressedRedSandstoneCarved), new Object[]{"###", "###", "###", '#', new ItemStack(Blocks.RED_SANDSTONE, 1, 1)});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedRedSandstoneCarved), new Object[]{"###", "###", "###", '#', CBlocks.compressedRedSandstoneCarved});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedRedSandstoneCarved), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedRedSandstoneCarved});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedRedSandstoneCarved), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedRedSandstoneCarved});

        //Red Sandstone Smooth
        AddShapedRecipe(new ItemStack(CBlocks.compressedRedSandstoneSmooth), new Object[]{"###", "###", "###", '#', new ItemStack(Blocks.RED_SANDSTONE, 1, 2)});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedRedSandstoneSmooth), new Object[]{"###", "###", "###", '#', CBlocks.compressedRedSandstoneSmooth});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedRedSandstoneSmooth), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedRedSandstoneSmooth});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedRedSandstoneSmooth), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedRedSandstoneSmooth});

        //Wet Sponge
        AddShapedRecipe(new ItemStack(CBlocks.compressedSpongeWet), new Object[]{"###", "###", "###", '#', new ItemStack(Blocks.SPONGE, 1, 1)});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedSpongeWet), new Object[]{"###", "###", "###", '#', CBlocks.compressedSpongeWet});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedSpongeWet), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedSpongeWet});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedSpongeWet), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedSpongeWet});

        //Andersite
        AddShapedRecipe(new ItemStack(CBlocks.compressedAndersite), new Object[]{"###", "###", "###", '#', new ItemStack(Blocks.STONE, 1, 5)});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedAndersite), new Object[]{"###", "###", "###", '#', CBlocks.compressedAndersite});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedAndersite), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedAndersite});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedAndersite), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedAndersite});

        //Andersite Smooth
        AddShapedRecipe(new ItemStack(CBlocks.compressedAndersiteSmooth), new Object[]{"###", "###", "###", '#', new ItemStack(Blocks.STONE, 1, 6)});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedAndersiteSmooth), new Object[]{"###", "###", "###", '#', CBlocks.compressedAndersiteSmooth});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedAndersiteSmooth), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedAndersiteSmooth});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedAndersiteSmooth), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedAndersiteSmooth});

        //Diorite
        AddShapedRecipe(new ItemStack(CBlocks.compressedDiorite), new Object[]{"###", "###", "###", '#', new ItemStack(Blocks.STONE, 1, 3)});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedDiorite), new Object[]{"###", "###", "###", '#', CBlocks.compressedDiorite});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedDiorite), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedDiorite});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedDiorite), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedDiorite});

        //Diorite Smooth
        AddShapedRecipe(new ItemStack(CBlocks.compressedDioriteSmooth), new Object[]{"###", "###", "###", '#', new ItemStack(Blocks.STONE, 1, 4)});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedDioriteSmooth), new Object[]{"###", "###", "###", '#', CBlocks.compressedDioriteSmooth});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedDioriteSmooth), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedDioriteSmooth});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedDioriteSmooth), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedDioriteSmooth});

        //Granite
        AddShapedRecipe(new ItemStack(CBlocks.compressedGranite), new Object[]{"###", "###", "###", '#', new ItemStack(Blocks.STONE, 1, 1)});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedGranite), new Object[]{"###", "###", "###", '#', CBlocks.compressedGranite});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedGranite), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedGranite});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedGranite), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedGranite});

        //Granite Smooth
        AddShapedRecipe(new ItemStack(CBlocks.compressedGraniteSmooth), new Object[]{"###", "###", "###", '#', new ItemStack(Blocks.STONE, 1, 2)});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedGraniteSmooth), new Object[]{"###", "###", "###", '#', CBlocks.compressedGraniteSmooth});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedGraniteSmooth), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedGraniteSmooth});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedGraniteSmooth), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedGraniteSmooth});

        //Wool
        for(int i = 0; i < EnumHandler.ColorTypes.values().length; i++) {
            AddShapedRecipe(new ItemStack(CBlocks.compressedWool, 1, i), new Object[]{"###", "###", "###", '#', new ItemStack(Blocks.WOOL, 1, i)});
            AddShapedRecipe(new ItemStack(CBlocks.doublecompressedWool, 1, i), new Object[]{"###", "###", "###", '#', new ItemStack(CBlocks.compressedWool, 1, i)});
            AddShapedRecipe(new ItemStack(CBlocks.triplecompressedWool, 1, i), new Object[]{"###", "###", "###", '#', new ItemStack(CBlocks.doublecompressedWool, 1, i)});
            AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedWool, 1, i), new Object[]{"###", "###", "###", '#', new ItemStack(CBlocks.triplecompressedWool, 1, i)});
        }

        //Hardened Clay Color
        for(int i = 0; i < EnumHandler.ColorTypes.values().length; i++) {
            AddShapedRecipe(new ItemStack(CBlocks.compressedHardenedClay, 1, i), new Object[]{"###", "###", "###", '#', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, i)});
            AddShapedRecipe(new ItemStack(CBlocks.doublecompressedHardenedClay, 1, i), new Object[]{"###", "###", "###", '#', new ItemStack(CBlocks.compressedHardenedClay, 1, i)});
            AddShapedRecipe(new ItemStack(CBlocks.triplecompressedHardenedClay, 1, i), new Object[]{"###", "###", "###", '#', new ItemStack(CBlocks.doublecompressedHardenedClay, 1, i)});
            AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedHardenedClay, 1, i), new Object[]{"###", "###", "###", '#', new ItemStack(CBlocks.triplecompressedHardenedClay, 1, i)});
        }

        //Glass Color
        for(int i = 0; i < EnumHandler.ColorTypes.values().length; i++) {
            AddShapedRecipe(new ItemStack(CBlocks.compressedColorGlass, 1, i), new Object[]{"###", "###", "###", '#', new ItemStack(Blocks.STAINED_GLASS, 1, i)});
            AddShapedRecipe(new ItemStack(CBlocks.doublecompressedColorGlass, 1, i), new Object[]{"###", "###", "###", '#', new ItemStack(CBlocks.compressedColorGlass, 1, i)});
            AddShapedRecipe(new ItemStack(CBlocks.triplecompressedColorGlass, 1, i), new Object[]{"###", "###", "###", '#', new ItemStack(CBlocks.doublecompressedColorGlass, 1, i)});
            AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedColorGlass, 1, i), new Object[]{"###", "###", "###", '#', new ItemStack(CBlocks.triplecompressedColorGlass, 1, i)});
        }

        //Planks
        for(int i = 0; i < EnumHandler.WoodTypes.values().length; i++) {
            AddShapedRecipe(new ItemStack(CBlocks.compressedWoodPlanks, 1, i), new Object[]{"###", "###", "###", '#', new ItemStack(Blocks.PLANKS, 1, i)});
            AddShapedRecipe(new ItemStack(CBlocks.doublecompressedWoodPlanks, 1, i), new Object[]{"###", "###", "###", '#', new ItemStack(CBlocks.compressedWoodPlanks, 1, i)});
            AddShapedRecipe(new ItemStack(CBlocks.triplecompressedWoodPlanks, 1, i), new Object[]{"###", "###", "###", '#', new ItemStack(CBlocks.doublecompressedWoodPlanks, 1, i)});
            AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedWoodPlanks, 1, i), new Object[]{"###", "###", "###", '#', new ItemStack(CBlocks.triplecompressedWoodPlanks, 1, i)});
        }

        //Log
        for(int i = 0; i < EnumHandler.WoodTypes.values().length - 2; i++) {
            AddShapedRecipe(new ItemStack(CBlocks.compressedWoodLog, 1, i), new Object[]{"###", "###", "###", '#', new ItemStack(Blocks.LOG, 1, i)});
            AddShapedRecipe(new ItemStack(CBlocks.doublecompressedWoodLog, 1, i), new Object[]{"###", "###", "###", '#', new ItemStack(CBlocks.compressedWoodLog, 1, i)});
            AddShapedRecipe(new ItemStack(CBlocks.triplecompressedWoodLog, 1, i), new Object[]{"###", "###", "###", '#', new ItemStack(CBlocks.doublecompressedWoodLog, 1, i)});
            AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedWoodLog, 1, i), new Object[]{"###", "###", "###", '#', new ItemStack(CBlocks.triplecompressedWoodLog, 1, i)});
        }

        //Log2
        for(int i = 0; i < EnumHandler.WoodTypes.values().length - 4; i++) {
            AddShapedRecipe(new ItemStack(CBlocks.compressedWoodLog, 1, i + 4), new Object[]{"###", "###", "###", '#', new ItemStack(Blocks.LOG2, 1, i)});
            AddShapedRecipe(new ItemStack(CBlocks.doublecompressedWoodLog, 1, i + 4), new Object[]{"###", "###", "###", '#', new ItemStack(CBlocks.compressedWoodLog, 1, i + 4)});
            AddShapedRecipe(new ItemStack(CBlocks.triplecompressedWoodLog, 1, i + 4), new Object[]{"###", "###", "###", '#', new ItemStack(CBlocks.doublecompressedWoodLog, 1, i + 4)});
            AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedWoodLog, 1, i + 4), new Object[]{"###", "###", "###", '#', new ItemStack(CBlocks.triplecompressedWoodLog, 1, i + 4)});
        }

        //Compressed Cobblestone Pickaxe
        if(CompactBlocks.config.cache.activateCobblestonePickaxe) {
            AddShapedRecipe(new ItemStack(CItems.compressedCobblestonePickaxe), new Object[]{"###", " I ", " I ", '#', CBlocks.quadruplecompressedCobblestone, 'I', Items.STICK});
        }

        //Compressed Dirt Pickaxe
        if(CompactBlocks.config.cache.activateDirtPickaxe) {
            AddShapedRecipe(new ItemStack(CItems.compressedDirtPickaxe), new Object[]{"###", " I ", " I ", '#', CBlocks.quadruplecompressedDirt, 'I', Items.STICK});
        }

        //Compressed Sand Pickaxe
        if(CompactBlocks.config.cache.activateSandPickaxe) {
            AddShapedRecipe(new ItemStack(CItems.compressedSandPickaxe), new Object[]{"###", " I ", " I ", '#', CBlocks.quadruplecompressedSand, 'I', Items.STICK});
        }

        //Compressed Gravel Pickaxe
        if(CompactBlocks.config.cache.activateGravelPickaxe) {
            AddShapedRecipe(new ItemStack(CItems.compressedGravelPickaxe), new Object[]{"###", " I ", " I ", '#', CBlocks.quadruplecompressedGravel, 'I', Items.STICK});
        }

        CLogger.getLogger().info("Shaped Recipes loaded");
    }

    private static void AddShapedRecipe(ItemStack output, Object... input) {
        ResourceLocation name = new ResourceLocation(Reference.MODID + ":shaped/" + output.getUnlocalizedName().substring(5));
        ResourceLocation group = null;
        GameRegistry.addShapedRecipe(name, group, output, input);
    }
}
