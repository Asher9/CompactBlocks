package com.asher9.CompactBlocks.config;

import com.asher9.CompactBlocks.Reference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.client.config.ConfigGuiType;
import net.minecraftforge.fml.client.config.DummyConfigElement;
import net.minecraftforge.fml.client.config.DummyConfigElement.DummyCategoryElement;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;

import java.util.ArrayList;
import java.util.List;

public class ConfigGui extends GuiConfig {

    public ConfigGui(GuiScreen parentScreen) {
        super(parentScreen, getConfigElements(), Reference.getMODID(), false, false, Reference.getMODNAME());
    }

    private static List<IConfigElement> getConfigElements() {
        List<IConfigElement> list = new ArrayList<>();
        List<IConfigElement> worldList = new ArrayList<>();
        List<IConfigElement> recipeList = new ArrayList<>();
        List<IConfigElement> updateList = new ArrayList<>();
        List<IConfigElement> blockList = new ArrayList<>();
        List<IConfigElement> settingsList = new ArrayList<>();

        //World Settings

        //Recipe Settings

        //Update Settings
        updateList.add(new DummyConfigElement("checkForUpdates", true, ConfigGuiType.BOOLEAN, "config.checkForUpdates"));
        updateList.add(new DummyConfigElement("updateAddress", Reference.getUpdateURL(), ConfigGuiType.STRING, "config.updateAddress"));
        list.add(new DummyCategoryElement("lists", "config.updateSettings", updateList));

        //Block Settings

        //General Settings

        return list;
    }
}
