package com.asher9.CompactBlocks.item.tools;

import java.util.Set;

import com.asher9.CompactBlocks.Reference;
import com.asher9.CompactBlocks.init.CItems;
import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.ResourceLocation;
 
public class ToolEnderiumAxe extends ItemTool {
     
    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] {Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE});
    private static final float[] ATTACK_DAMAGES = new float[] {6.0F, 8.0F, 8.0F, 8.0F, 6.0F};
    private static final float[] ATTACK_SPEEDS = new float[] { -3.2F, -3.2F, -3.1F, -3.0F, -3.0F};
     
    public ToolEnderiumAxe(ToolMaterial material, String unlocalizedName) {
        super(material, EFFECTIVE_ON);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(Reference.getModid(), unlocalizedName));
    }
    
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        return repair.getItem().equals(CItems.ingotEnderium);
    }
 
}