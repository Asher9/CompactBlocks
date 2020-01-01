package com.asher9.CompactBlocks.proxies;

import com.asher9.CompactBlocks.Reference;
import com.asher9.CompactBlocks.api.EnumHandler;
import com.asher9.CompactBlocks.init.CBlocks;
import com.asher9.CompactBlocks.init.CModBlocks;
import com.asher9.CompactBlocks.init.CModItems;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerRenders() {
        CModItems.registerRenders();
        CModBlocks.registerRenders();
    }

    @Override
    public void registerModelBakery() {
        modelBakery();
    }

    private static void modelBakery() {
        for (int i = 0; i < EnumHandler.ColorTypes.values().length; i++) {
            ModelBakery.registerItemVariants(Item.getItemFromBlock(CBlocks.compressedColorGlass), new ResourceLocation(Reference.getMODID(), "compressedColorGlass" + EnumHandler.ColorTypes.values()[i].getName()));
            ModelBakery.registerItemVariants(Item.getItemFromBlock(CBlocks.doublecompressedColorGlass), new ResourceLocation(Reference.getMODID(), "doublecompressedColorGlass" + EnumHandler.ColorTypes.values()[i].getName()));
            ModelBakery.registerItemVariants(Item.getItemFromBlock(CBlocks.triplecompressedColorGlass), new ResourceLocation(Reference.getMODID(), "triplecompressedColorGlass" + EnumHandler.ColorTypes.values()[i].getName()));
            ModelBakery.registerItemVariants(Item.getItemFromBlock(CBlocks.quadruplecompressedColorGlass), new ResourceLocation(Reference.getMODID(), "quadruplecompressedColorGlass" + EnumHandler.ColorTypes.values()[i].getName()));
        }

        for (int i = 0; i < EnumHandler.ColorTypes.values().length; i++) {
            ModelBakery.registerItemVariants(Item.getItemFromBlock(CBlocks.compressedWool), new ResourceLocation(Reference.getMODID(), "compressedWool" + EnumHandler.ColorTypes.values()[i].getName()));
            ModelBakery.registerItemVariants(Item.getItemFromBlock(CBlocks.doublecompressedWool), new ResourceLocation(Reference.getMODID(), "doublecompressedWool" + EnumHandler.ColorTypes.values()[i].getName()));
            ModelBakery.registerItemVariants(Item.getItemFromBlock(CBlocks.triplecompressedWool), new ResourceLocation(Reference.getMODID(), "triplecompressedWool" + EnumHandler.ColorTypes.values()[i].getName()));
            ModelBakery.registerItemVariants(Item.getItemFromBlock(CBlocks.quadruplecompressedWool), new ResourceLocation(Reference.getMODID(), "quadruplecompressedWool" + EnumHandler.ColorTypes.values()[i].getName()));
        }

        for (int i = 0; i < EnumHandler.ColorTypes.values().length; i++) {
            ModelBakery.registerItemVariants(Item.getItemFromBlock(CBlocks.compressedHardenedClay), new ResourceLocation(Reference.getMODID(), "compressedHardenedClay" + EnumHandler.ColorTypes.values()[i].getName()));
            ModelBakery.registerItemVariants(Item.getItemFromBlock(CBlocks.doublecompressedHardenedClay), new ResourceLocation(Reference.getMODID(), "doublecompressedHardenedClay" + EnumHandler.ColorTypes.values()[i].getName()));
            ModelBakery.registerItemVariants(Item.getItemFromBlock(CBlocks.triplecompressedHardenedClay), new ResourceLocation(Reference.getMODID(), "triplecompressedHardenedClay" + EnumHandler.ColorTypes.values()[i].getName()));
            ModelBakery.registerItemVariants(Item.getItemFromBlock(CBlocks.quadruplecompressedHardenedClay), new ResourceLocation(Reference.getMODID(), "quadruplecompressedHardenedClay" + EnumHandler.ColorTypes.values()[i].getName()));
        }

        for (int i = 0; i < EnumHandler.WoodTypes.values().length; i++) {
            ModelBakery.registerItemVariants(Item.getItemFromBlock(CBlocks.compressedWoodPlanks), new ResourceLocation(Reference.getMODID(), "compressedWoodPlanks" + EnumHandler.ColorTypes.values()[i].getName()));
            ModelBakery.registerItemVariants(Item.getItemFromBlock(CBlocks.doublecompressedWoodPlanks), new ResourceLocation(Reference.getMODID(), "doublecompressedWoodPlanks" + EnumHandler.ColorTypes.values()[i].getName()));
            ModelBakery.registerItemVariants(Item.getItemFromBlock(CBlocks.triplecompressedWoodPlanks), new ResourceLocation(Reference.getMODID(), "triplecompressedWoodPlanks" + EnumHandler.ColorTypes.values()[i].getName()));
            ModelBakery.registerItemVariants(Item.getItemFromBlock(CBlocks.quadruplecompressedWoodPlanks), new ResourceLocation(Reference.getMODID(), "quadruplecompressedWoodPlanks" + EnumHandler.ColorTypes.values()[i].getName()));
        }

        for (int i = 0; i < EnumHandler.WoodTypes.values().length; i++) {
            ModelBakery.registerItemVariants(Item.getItemFromBlock(CBlocks.compressedWoodLog), new ResourceLocation(Reference.getMODID(), "compressedWoodLog" + EnumHandler.ColorTypes.values()[i].getName()));
            ModelBakery.registerItemVariants(Item.getItemFromBlock(CBlocks.doublecompressedWoodLog), new ResourceLocation(Reference.getMODID(), "doublecompressedWoodLog" + EnumHandler.ColorTypes.values()[i].getName()));
            ModelBakery.registerItemVariants(Item.getItemFromBlock(CBlocks.triplecompressedWoodLog), new ResourceLocation(Reference.getMODID(), "triplecompressedWoodLog" + EnumHandler.ColorTypes.values()[i].getName()));
            ModelBakery.registerItemVariants(Item.getItemFromBlock(CBlocks.quadruplecompressedWoodLog), new ResourceLocation(Reference.getMODID(), "quadruplecompressedWoodLog" + EnumHandler.ColorTypes.values()[i].getName()));
        }

    }

}
