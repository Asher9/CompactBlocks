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

public class ConfigGUI extends GuiConfig{

    private static final String updateURL = "https://raw.githubusercontent.com/Asher9/CompactBlocks/1.10.2/ModVersion.txt";

    public ConfigGUI(GuiScreen parentScreen) {
        super(parentScreen, getConfigElements(), Reference.MODID, false, false, Reference.MODNAME);
    }

    private static List<IConfigElement> getConfigElements(){

        List<IConfigElement> list = new ArrayList<IConfigElement>();
        List<IConfigElement> worldList = new ArrayList<IConfigElement>();
        List<IConfigElement> recipeList = new ArrayList<IConfigElement>();
        List<IConfigElement> updateList =  new ArrayList<IConfigElement>();
        List<IConfigElement> blockList = new ArrayList<IConfigElement>();
        List<IConfigElement> settingsList = new ArrayList<IConfigElement>();

//		list.add(new ConfigElement(Configurations.config.getCategory("config.worldSettings")));
//		list.add(new ConfigElement(Configurations.config.getCategory(recipeList)));
//		list.add(new ConfigElement(Configurations.config.getCategory(updateList)));
//		list.add(new ConfigElement(Configurations.config.getCategory(settingsList)));

        //World Settings
        worldList.add(new DummyConfigElement("oreGenEnderiumOre", true, ConfigGuiType.BOOLEAN, "config.oreGenEnderiumOre").setRequiresWorldRestart(true));
        worldList.add(new DummyConfigElement("oreGenNetherEnderiumOre", true, ConfigGuiType.BOOLEAN, "config.oreGenNetherEnderiumOre").setRequiresWorldRestart(true));
        worldList.add(new DummyConfigElement("oreGenEndEnderiumOre", true, ConfigGuiType.BOOLEAN, "config.oreGenEndEnderiumOre").setRequiresWorldRestart(true));

        list.add(new DummyCategoryElement("lists", "config.worldSettings",worldList));

        //Recipes Settings
        recipeList.add(new DummyConfigElement("recipeCobblestonePickaxe", true, ConfigGuiType.BOOLEAN, "config.recipeCobblestonePickaxe").setRequiresMcRestart(true));
        recipeList.add(new DummyConfigElement("recipeDirtPickaxe", true, ConfigGuiType.BOOLEAN, "config.recipeDirtPickaxe").setRequiresMcRestart(true));
        recipeList.add(new DummyConfigElement("recipeSandPickaxe", true, ConfigGuiType.BOOLEAN, "config.recipeSandPickaxe").setRequiresMcRestart(true));
        recipeList.add(new DummyConfigElement("recipeGravelPickaxe", true, ConfigGuiType.BOOLEAN, "config.recipeGravelPickaxe").setRequiresMcRestart(true));

        list.add(new DummyCategoryElement("lists", "config.recipes", recipeList));

        //Update Settings
        updateList.add(new DummyConfigElement("checkForUpdates", true, ConfigGuiType.BOOLEAN, "config.checkForUpdates"));
        updateList.add(new DummyConfigElement("updateAddress", updateURL, ConfigGuiType.STRING, "config.updateAddress"));

        list.add(new DummyCategoryElement("lists", "config.updateSettings", updateList));

        //Block Settings
        blockList.add(new DummyConfigElement("activateCompressedCobblestone", true, ConfigGuiType.BOOLEAN, "config.activateCompressedCobblestone").setRequiresMcRestart(true));
        blockList.add(new DummyConfigElement("activateCompressedGravel", true, ConfigGuiType.BOOLEAN, "config.activateCompressedGravel").setRequiresMcRestart(true));
        blockList.add(new DummyConfigElement("activateCompressedSand", true, ConfigGuiType.BOOLEAN, "config.activateCompressedSand").setRequiresMcRestart(true));
        blockList.add(new DummyConfigElement("activateCompressedNetherrack", true, ConfigGuiType.BOOLEAN, "config.activateCompressedNetherrack").setRequiresMcRestart(true));
        blockList.add(new DummyConfigElement("activateCompressedEndStone", true, ConfigGuiType.BOOLEAN, "config.activateCompressedEndStone").setRequiresMcRestart(true));
        blockList.add(new DummyConfigElement("activateCompressedDirt", true, ConfigGuiType.BOOLEAN, "config.activateCompressedDirt").setRequiresMcRestart(true));
        blockList.add(new DummyConfigElement("activateCompressedSoulSand", true, ConfigGuiType.BOOLEAN, "config.activateCompressedSoulSand").setRequiresMcRestart(true));

        list.add(new DummyCategoryElement("lists", "config.blockSettings", blockList));

        //General Settings
        settingsList.add(new DummyConfigElement("creativeTabSearch", true, ConfigGuiType.BOOLEAN, "config.creativeTabSearch"));
        settingsList.add(new DummyConfigElement("blockHardness", 3.0F, ConfigGuiType.DOUBLE, "config.blockHardness").setRequiresMcRestart(true));
        settingsList.add(new DummyConfigElement("blockResistance", 20.0F, ConfigGuiType.DOUBLE, "config.blockResistance").setRequiresMcRestart(true));

        list.add(new DummyCategoryElement("lists", "config.generalSettings", settingsList));

        return list;
    }

}