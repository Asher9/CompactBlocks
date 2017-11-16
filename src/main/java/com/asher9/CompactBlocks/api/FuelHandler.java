package com.asher9.CompactBlocks.api;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler{

	@Override
	public int getBurnTime(ItemStack fuel) {
		//200 Ticks = 10 Second = 1 Melting
		
		//compressedBlocks.logger.info(fuel.toString());
		
		if(fuel.toString().contains("compressed1xCoalBlock")){
			return 144000;
		}
		if(fuel.toString().contains("compressed2xCoalBlock")){
			return 1296000;
		}
		if(fuel.toString().contains("compressed3xCoalBlock")){
			return 11664000;
		}
		if(fuel.toString().contains("compressed4xCoalBlock")){
			return 104976000;
		}	
		if(fuel.toString().contains("compressed1xWoodPlanks")){
			return 2700;
		}
		if(fuel.toString().contains("compressed2xWoodPlanks")){
			return 24300;
		}
		if(fuel.toString().contains("compressed3xWoodPlanks")){
			return 218700;
		}
		if(fuel.toString().contains("compressed4xWoodPlanks")){
			return 1968300;
		}
		return 0;
	}
}
