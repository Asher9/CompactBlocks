package com.asher9.CompactBlocks.api;

import com.asher9.CompactBlocks.CompactBlocks;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;


public class CMaterial extends EnumHelper{
	
	public static final ToolMaterial Enderium = addToolMaterial("Enderium", 4, 2000, 10.0F, 3.0F, 15);
	public static final ToolMaterial Compressed = addToolMaterial("Compressed", 5, 10000, 20.0F, 3.0F, 30);
	
}
