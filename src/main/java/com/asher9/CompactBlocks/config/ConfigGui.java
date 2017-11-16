package com.asher9.CompactBlocks.config;

import java.util.ArrayList;
import java.util.List;

import com.asher9.CompactBlocks.Reference;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;

public class ConfigGui extends GuiConfig{

	public ConfigGui(GuiScreen parentScreen) {
		super(parentScreen, getConfigElements(parentScreen), Reference.MODID, false, false, Reference.getModname());
	}

	private static List<IConfigElement> getConfigElements(GuiScreen parentScreen){
		List<IConfigElement> list = new ArrayList<IConfigElement>();
		
		list.add(new ConfigElement(Configurations.config.getCategory("RECIPES")));
		list.add(new ConfigElement(Configurations.config.getCategory("UPDATE SETTINGS")));
		list.add(new ConfigElement(Configurations.config.getCategory("SETTINGS")));
		
		return list;
	}

}