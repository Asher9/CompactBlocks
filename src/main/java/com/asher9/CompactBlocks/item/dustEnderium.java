package com.asher9.CompactBlocks.item;

import com.asher9.CompactBlocks.CompactBlocks;
import com.asher9.CompactBlocks.Reference;
import com.asher9.CompactBlocks.init.CItems;
import com.asher9.CompactBlocks.util.UpdateChecker;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class dustEnderium extends Item {
	
	private static int a = 0;
	
	public dustEnderium(String unlocalizedName, CreativeTabs creativeTab){
		super();
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(creativeTab);
		this.setRegistryName(new ResourceLocation(Reference.getMODID(), unlocalizedName));
		
	}
	
//	@Override
//	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn,
//			EnumHand hand) {
//		
//		playerIn.setFire(3);
//		
//		return super.onItemRightClick(itemStackIn, worldIn, playerIn, hand);
//	}
}
