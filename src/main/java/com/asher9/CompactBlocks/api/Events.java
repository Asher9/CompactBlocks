package com.asher9.CompactBlocks.api;

import com.asher9.CompactBlocks.util.UpdateChecker;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.Phase;

public class Events {

    @SubscribeEvent
    public void clientTick(TickEvent.ClientTickEvent event) {
        if (event.phase == Phase.END) {
            UpdateChecker.tick();
        }
    }
}
