package com.asher9.CompactBlocks.item.tools;

import com.asher9.CompactBlocks.Reference;
import com.asher9.CompactBlocks.init.CItems;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class ToolEnderiumPickaxe extends ItemPickaxe {
     
    public ToolEnderiumPickaxe(ToolMaterial material, String unlocalizedName) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.getModid(), unlocalizedName));
	}
    
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
		return repair.getItem().equals(CItems.ingotEnderium);
    }
}