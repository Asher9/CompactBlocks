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

        for(int i = 0; i < EnumHandler.ColorTypes.values().length; i++) {
            AddShapedRecipe(new ItemStack(CBlocks.compressedWool, 1, i), new Object[]{"###", "###", "###", '#', new ItemStack(Blocks.WOOL, 1, i)});
            AddShapedRecipe(new ItemStack(CBlocks.doublecompressedWool, 1, i), new Object[]{"###", "###", "###", '#', new ItemStack(CBlocks.compressedWool, 1, i)});
            AddShapedRecipe(new ItemStack(CBlocks.triplecompressedWool, 1, i), new Object[]{"###", "###", "###", '#', new ItemStack(CBlocks.doublecompressedWool, 1, i)});
            AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedWool, 1, i), new Object[]{"###", "###", "###", '#', new ItemStack(CBlocks.triplecompressedWool, 1, i)});
        }

        //Coal Block
        AddShapedRecipe(new ItemStack(CBlocks.compressedCoalBlock), new Object[]{"###", "###", "###", '#', Blocks.COAL_BLOCK});
        AddShapedRecipe(new ItemStack(CBlocks.doublecompressedCoalBlock), new Object[]{"###", "###", "###", '#', CBlocks.compressedCoalBlock});
        AddShapedRecipe(new ItemStack(CBlocks.triplecompressedCoalBlock), new Object[]{"###", "###", "###", '#', CBlocks.doublecompressedCoalBlock});
        AddShapedRecipe(new ItemStack(CBlocks.quadruplecompressedCoalBlock), new Object[]{"###", "###", "###", '#', CBlocks.triplecompressedCoalBlock});

        //GameRegistry.addShapedRecipe(new ResourceLocation(""), new ResourceLocation("recipes"), new ItemStack(CBlocks.compressedDiamondBlock), new Object[]{"###","XXX","###", '#', new ItemStack(Blocks.ANVIL, 1, 2), 'X', Blocks.DIAMOND_BLOCK});

        CLogger.getLogger().info("Shaped Recipes loaded");
    }

    private static void AddShapedRecipe(ItemStack output, Object... input) {
        ResourceLocation name = new ResourceLocation(Reference.MODID + ":" + output.getUnlocalizedName().substring(5));
        ResourceLocation group = null;
        GameRegistry.addShapedRecipe(name, group, output, input);
    }
}
