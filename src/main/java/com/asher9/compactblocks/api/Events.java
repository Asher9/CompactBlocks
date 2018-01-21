package com.asher9.compactblocks.api;

import com.asher9.compactblocks.utils.UpdateChecker;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class Events {

    @SubscribeEvent
    public void clientTick(TickEvent.ClientTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            UpdateChecker.tick();
        }
    }

}
