package com.asher9.CompactBlocks.config;

import com.asher9.CompactBlocks.CompactBlocks;
import com.asher9.CompactBlocks.Reference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;

import java.util.ArrayList;
import java.util.List;

public class ModConfigGui extends GuiConfig {

    public ModConfigGui(GuiScreen parent) {
        super(parent, getConfigElements(), Reference.getModid(), false, false, Reference.getModname());
    }

    private static List<IConfigElement> getConfigElements() {
        List<IConfigElement> list = new ArrayList<IConfigElement>();

        for(Config.ConfigSection section : CompactBlocks.config.sections)
            list.add(new ConfigElement((section.getCategory())));

        return list;
    }
}