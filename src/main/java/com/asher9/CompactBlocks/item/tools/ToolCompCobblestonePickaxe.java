package com.asher9.CompactBlocks.item.tools;

import com.asher9.CompactBlocks.Reference;
import com.asher9.CompactBlocks.init.CBlocks;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class ToolCompCobblestonePickaxe extends ItemPickaxe {
     
	public ToolCompCobblestonePickaxe(ToolMaterial material, String unlocalizedName) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.getModid(), unlocalizedName));
	}
    
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {

    	if(repair.getItem().equals(Item.getItemFromBlock(CBlocks.quadruplecompressedCobblestone)))
    		return true;
    	else
    		return false;
    }
}