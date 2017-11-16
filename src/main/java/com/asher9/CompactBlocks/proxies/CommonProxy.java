package com.asher9.CompactBlocks.proxies;

import com.asher9.CompactBlocks.world.WorldGen;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
	
	public void init() {
		GameRegistry.registerWorldGenerator(new WorldGen(), 0);	
//		UpdateChecker.init();
//		MinecraftForge.EVENT_BUS.register(new Events());
		
	}
	
	public void registerRenders() {
		
	}
	
	public void registerModelBakery() {
		
	}

}
