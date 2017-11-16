package com.asher9.CompactBlocks.item.tools;

import com.asher9.CompactBlocks.CompactBlocks;
import com.asher9.CompactBlocks.Reference;
import com.asher9.CompactBlocks.init.CItems;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class ToolEnderiumShovel extends ItemSpade {

	public ToolEnderiumShovel(ToolMaterial material, String unlocalizedName) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.getModid(), unlocalizedName));

	}
	
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {

    	if(repair.getItem().equals(CItems.ingotEnderium))
    		return true;
    	else
    		return false;
    }

}
