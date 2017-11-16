package com.asher9.CompactBlocks.api;

import com.asher9.CompactBlocks.util.UpdateChecker;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.Phase;

public class Events {
	
	private static int a = 0;
	
//	@SubscribeEvent
//	public void clientTick(TickEvent.ClientTickEvent event) {
//		if(event.phase == Phase.END) {
//			UpdateChecker.tick();+
//			if(a == 0 && UpdateChecker.show) {
//				for (a = 0; a < 1; a++){
//					Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new TextComponentString(UpdateChecker.updateStatus));
//				}
//			}
//		}
//	}
	
	@SubscribeEvent
	public void clientTick(TickEvent.ClientTickEvent event) {
		if (event.phase == Phase.END) {
			UpdateChecker.tick();
		}
	}
	
}
