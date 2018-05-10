package com.asher9.CompactBlocks.init;

import com.asher9.CompactBlocks.util.CLogger;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CFurnaceRecipes {

    public static void furnaceRecipes() {
        CLogger.getLogger().info("Loading Furnace Recipes..");

        GameRegistry.addSmelting(CBlocks.oreEndEnderium, new ItemStack(CItems.ingotEnderium), 10);
        GameRegistry.addSmelting(CBlocks.oreNetherEnderium, new ItemStack(CItems.ingotEnderium), 10);
        GameRegistry.addSmelting(CBlocks.oreEndEnderium, new ItemStack(CItems.ingotEnderium),10);
        GameRegistry.addSmelting(CItems.dustEnderium, new ItemStack(CItems.ingotEnderium), 10);

        CLogger.getLogger().info("Furnace Recipes loaded");
    }
}
