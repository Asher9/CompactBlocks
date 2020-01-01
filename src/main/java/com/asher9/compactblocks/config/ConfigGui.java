/*package com.asher9.CompactBlocks.config;

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
        worldList.add(new DummyConfigElement("oreGenEnderiumOre", true, ConfigGuiType.BOOLEAN, "config.oreGenEnderiumOre").setRequiresWorldRestart(true));
        worldList.add(new DummyConfigElement("oreGenNetherEnderiumOre", true, ConfigGuiType.BOOLEAN, "config.oreGenNetherEnderiumOre").setRequiresWorldRestart(true));
        worldList.add(new DummyConfigElement("oreGenEndEnderiumOre", true, ConfigGuiType.BOOLEAN, "config.oreGenEndEnderiumOre").setRequiresWorldRestart(true));
        list.add(new DummyCategoryElement("lists", "config.worldSettings", worldList));

        //Recipe Settings
        recipeList.add(new DummyConfigElement("recipeCobblestonePickaxe", true, ConfigGuiType.BOOLEAN, "config.recipeCobblestonePickaxe").setRequiresMcRestart(true));
        recipeList.add(new DummyConfigElement("recipeDirtPickaxe", true, ConfigGuiType.BOOLEAN, "config.recipeDirtPickaxe").setRequiresMcRestart(true));
        recipeList.add(new DummyConfigElement("recipeSandPickaxe", true, ConfigGuiType.BOOLEAN, "config.recipeSandPickaxe").setRequiresMcRestart(true));
        recipeList.add(new DummyConfigElement("recipeGravelPickaxe", true, ConfigGuiType.BOOLEAN, "config.recipeGravelPickaxe").setRequiresMcRestart(true));
        list.add(new DummyCategoryElement("lists", "config.recipes", recipeList));

        //Update Settings
        updateList.add(new DummyConfigElement("checkUpdates", true, ConfigGuiType.BOOLEAN, "config.checkUpdates"));
        updateList.add(new DummyConfigElement("updateAddress", Reference.getUpdateURL(), ConfigGuiType.STRING, "config.updateAddress"));
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
        settingsList.add(new DummyConfigElement("blockHardness", true, ConfigGuiType.DOUBLE, "config.blockHardness").setRequiresMcRestart(true));
        settingsList.add(new DummyConfigElement("blockResistance", true, ConfigGuiType.DOUBLE, "config.blockResistance").setRequiresMcRestart(true));
        list.add(new DummyCategoryElement("lists", "config.generalSettings", settingsList));

        return list;
    }
}
*/