package com.asher9.CompactBlocks.proxies;

import com.asher9.CompactBlocks.CompactBlocks;
import com.asher9.CompactBlocks.Reference;
import com.asher9.CompactBlocks.api.EnumHandler;
import com.asher9.CompactBlocks.init.CBlocks;
import com.asher9.CompactBlocks.init.CInit;
import com.asher9.CompactBlocks.init.CItems;
import com.asher9.CompactBlocks.init.CModBlocks;
import com.asher9.CompactBlocks.init.CModItems;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

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
    
    public static void modelBakery() {
    	for (int i = 0; i < EnumHandler.ColorTypes.values().length; i++) {
    		ModelBakery.registerItemVariants(Item.getItemFromBlock(CBlocks.compressedColorGlass), new ResourceLocation(Reference.getModid(), "compressedColorGlass" + EnumHandler.ColorTypes.values()[i].getName()));
    		ModelBakery.registerItemVariants(Item.getItemFromBlock(CBlocks.doublecompressedColorGlass), new ResourceLocation(Reference.getModid(), "doublecompressedColorGlass" + EnumHandler.ColorTypes.values()[i].getName()));
    		ModelBakery.registerItemVariants(Item.getItemFromBlock(CBlocks.triplecompressedColorGlass), new ResourceLocation(Reference.getModid(), "triplecompressedColorGlass" + EnumHandler.ColorTypes.values()[i].getName()));
    		ModelBakery.registerItemVariants(Item.getItemFromBlock(CBlocks.quadruplecompressedColorGlass), new ResourceLocation(Reference.getModid(), "quadruplecompressedColorGlass" + EnumHandler.ColorTypes.values()[i].getName()));
    	}
    	
    	for (int i = 0; i < EnumHandler.ColorTypes.values().length; i++) {
    		ModelBakery.registerItemVariants(Item.getItemFromBlock(CBlocks.compressedWool), new ResourceLocation(Reference.getModid(), "compressedWool" + EnumHandler.ColorTypes.values()[i].getName()));
    		ModelBakery.registerItemVariants(Item.getItemFromBlock(CBlocks.doublecompressedWool), new ResourceLocation(Reference.getModid(), "doublecompressedWool" + EnumHandler.ColorTypes.values()[i].getName()));
    		ModelBakery.registerItemVariants(Item.getItemFromBlock(CBlocks.triplecompressedWool), new ResourceLocation(Reference.getModid(), "triplecompressedWool" + EnumHandler.ColorTypes.values()[i].getName()));
    		ModelBakery.registerItemVariants(Item.getItemFromBlock(CBlocks.quadruplecompressedWool), new ResourceLocation(Reference.getModid(), "quadruplecompressedWool" + EnumHandler.ColorTypes.values()[i].getName()));
    	}
    	
    	for (int i = 0; i < EnumHandler.WoodTypes.values().length; i++) {
    		ModelBakery.registerItemVariants(Item.getItemFromBlock(CBlocks.compressedWoodPlanks), new ResourceLocation(Reference.getModid(), "compressedWoodPlanks" + EnumHandler.WoodTypes.values()[i].getName()));
    		ModelBakery.registerItemVariants(Item.getItemFromBlock(CBlocks.doublecompressedWoodPlanks), new ResourceLocation(Reference.getModid(), "doublecompressedWoodPlanks" + EnumHandler.WoodTypes.values()[i].getName()));
    		ModelBakery.registerItemVariants(Item.getItemFromBlock(CBlocks.triplecompressedWoodPlanks), new ResourceLocation(Reference.getModid(), "triplecompressedWoodPlanks" + EnumHandler.WoodTypes.values()[i].getName()));
    		ModelBakery.registerItemVariants(Item.getItemFromBlock(CBlocks.quadruplecompressedWoodPlanks), new ResourceLocation(Reference.getModid(), "quadruplecompressedWoodPlanks" + EnumHandler.WoodTypes.values()[i].getName()));
    	}
    	
    	for(int i = 0; i < EnumHandler.WoodTypes.values().length; i++) {
    		ModelBakery.registerItemVariants(Item.getItemFromBlock(CBlocks.compressedWoodLog), new ResourceLocation(Reference.getModid(), "compressed" + EnumHandler.WoodTypes.values()[i].getName() + "Log"));
    		ModelBakery.registerItemVariants(Item.getItemFromBlock(CBlocks.doublecompressedWoodLog), new ResourceLocation(Reference.getModid(), "doublecompressed" + EnumHandler.WoodTypes.values()[i].getName() + "Log"));
    		ModelBakery.registerItemVariants(Item.getItemFromBlock(CBlocks.triplecompressedWoodLog), new ResourceLocation(Reference.getModid(), "triplecompressed" + EnumHandler.WoodTypes.values()[i].getName() + "Log"));
    		ModelBakery.registerItemVariants(Item.getItemFromBlock(CBlocks.quadruplecompressedWoodLog), new ResourceLocation(Reference.getModid(), "quadruplecompressed" + EnumHandler.WoodTypes.values()[i].getName() + "Log"));
		}
    }

}
