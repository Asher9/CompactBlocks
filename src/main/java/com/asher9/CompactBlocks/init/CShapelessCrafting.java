package com.asher9.CompactBlocks.init;

import com.asher9.CompactBlocks.Reference;
import com.asher9.CompactBlocks.util.CLogger;
import net.minecraft.init.Blocks;
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

        CLogger.getLogger().info("Shapeless Recipes loaded");
    }

    private static void AddRecipe(ItemStack output, Ingredient... input) {
        ResourceLocation name = new ResourceLocation(Reference.MODID + ":shapeless/" + output.getUnlocalizedName().substring(5));
        ResourceLocation group = null;
        GameRegistry.addShapelessRecipe(name, group, output, input);
    }
}
