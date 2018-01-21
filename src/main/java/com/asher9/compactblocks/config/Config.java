package com.asher9.compactblocks.config;

import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.Configuration;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Config {

    public class ConfigSection {
        public final ConfigSection parent;
        public final String name;
        public final String lang;

        private ConfigCategory category;

        public ConfigSection (List<ConfigSection> list, ConfigSection parent, String name, String lang) {
            this.parent = parent;
            this.name = name;
            this.lang = lang;

            list.add(this);
        }

        public ConfigSection (List<ConfigSection> list, String name, String lang) {
            this(list, null, name, lang);
        }

        public ConfigCategory getCategory () {
            if (category != null)
                return  category;

            if (parent != null)
                category = config.getCategory(parent.getCategory().getQualifiedName() + "." + name.toLowerCase());
            else
                category = config.getCategory(name.toLowerCase());

            category.setLanguageKey(lang);
            return category;
        }

        public String getQualifiedName () {
            return getCategory().getQualifiedName();
        }
    }

    public class ConfigCache {
        //Recipes
        public boolean activateCobblestonePickaxe;
        public boolean activateSandPickaxe;
        public boolean activateDirtPickaxe;
        public boolean activateGravelPickaxe;

        //Block Settings
        public boolean activateCompressedCobblestone;
        public boolean activateCompressedGravel;
        public boolean activateCompressedSand;
        public boolean activateCompressedNetherrack;
        public boolean activateCompressedEndStone;
        public boolean activateCompressedDirt;
        public boolean activateCompressedSoulSand;

        //General Settings
        public boolean creativeTabSearch;
        public double blockHardness;
        public double blockResistance;

        public boolean oreGenEnderiumOre;
        public boolean oreGenNetherEnderiumOre;
        public boolean oreGenEndEnderiumOre;

        //Update Settings
        public String updateAddress;
        public boolean checkUpdates;
    }

    public static Configuration config;
    public final ConfigCache cache;

    @SuppressWarnings("WeakerAccess")
    public final List<ConfigSection> sections = new ArrayList<ConfigSection>();
    private final ConfigSection worldList = new ConfigSection(sections, "worldSettings", "config.worldSettings");
    private final ConfigSection recipeList = new ConfigSection(sections, "recipes", "config.recipes");
    private final ConfigSection updateList = new ConfigSection(sections, "updateSettings", "config.updateSettings");
    private final ConfigSection blockList = new ConfigSection(sections, "blockSettings", "config.blockSettings");
    private final ConfigSection settingsList = new ConfigSection(sections, "generalSettings", "config.generalSettings");

    public Config(File file) {
        config = new Configuration(file);
        cache = new ConfigCache();

        for (ConfigSection section : sections)
            section.getCategory();

        syncConfig();
    }

    public void syncConfig () {

        cache.activateCobblestonePickaxe = config.get(recipeList.getQualifiedName(), "activateCobblestonePickaxe", true).setLanguageKey("config.recipeCobblestonePickaxe").setRequiresMcRestart(true).getBoolean();
        cache.activateSandPickaxe = config.get(recipeList.getQualifiedName(), "activateSandPickaxe", true).setLanguageKey("config.recipeSandPickaxe").setRequiresMcRestart(true).getBoolean();
        cache.activateDirtPickaxe = config.get(recipeList.getQualifiedName(), "activateDirtPickaxe", true).setLanguageKey("config.recipeDirtPickaxe").setRequiresMcRestart(true).getBoolean();
        cache.activateGravelPickaxe = config.get(recipeList.getQualifiedName(), "activateGravelPickaxe", true).setLanguageKey("config.recipeGravelPickaxe").setRequiresMcRestart(true).getBoolean();

        cache.activateCompressedCobblestone = config.get(blockList.getQualifiedName(), "activateCompressedCobblestone", true).setLanguageKey("config.activateCompressedCobblestone").setRequiresMcRestart(true).getBoolean();
        cache.activateCompressedGravel = config.get(blockList.getQualifiedName(), "activateCompressedGravel", true).setLanguageKey("config.activateCompressedGravel").setRequiresMcRestart(true).getBoolean();
        cache.activateCompressedSand = config.get(blockList.getQualifiedName(), "activateCompressedSand", true).setLanguageKey("config.activateCompressedSand").setRequiresMcRestart(true).getBoolean();
        cache.activateCompressedNetherrack = config.get(blockList.getQualifiedName(), "activateCompressedNetherrack", true).setLanguageKey("config.activateCompressedNetherrack").setRequiresMcRestart(true).getBoolean();
        cache.activateCompressedEndStone = config.get(blockList.getQualifiedName(), "activateCompressedEndStone", true).setLanguageKey("config.activateCompressedEndStone").setRequiresMcRestart(true).getBoolean();
        cache.activateCompressedDirt = config.get(blockList.getQualifiedName(), "activateCompressedDirt", true).setLanguageKey("config.activateCompressedDirt").setRequiresMcRestart(true).getBoolean();
        cache.activateCompressedSoulSand = config.get(blockList.getQualifiedName(), "activateCompressedSoulSand", true).setLanguageKey("config.activateCompressedSoulSand").getBoolean();

        cache.checkUpdates = config.get(updateList.getQualifiedName(), "checkUpdates", true).setLanguageKey("config.checkForUpdates").setRequiresWorldRestart(true).getBoolean();
        cache.updateAddress = config.get(updateList.getQualifiedName(), "updateAddress", "https://raw.githubusercontent.com/Asher9/CompactBlocks/1.10.2/ModVersion.txt").setLanguageKey("config.updateAddress").setRequiresMcRestart(true).getString();

        cache.creativeTabSearch = config.get(settingsList.getQualifiedName(), "creativeTabSearch", false).setLanguageKey("config.creativeTabSearch").setRequiresMcRestart(true).getBoolean();
        cache.blockHardness = config.get(settingsList.getQualifiedName(), "blockHardness", 3.0F).setLanguageKey("config.blockHardness").setRequiresMcRestart(true).getDouble();
        cache.blockResistance = config.get(settingsList.getQualifiedName(), "blockResistance", 20.0F).setLanguageKey("config.blockResistance").setRequiresMcRestart(true).getDouble();

        cache.oreGenEnderiumOre = config.get(worldList.getQualifiedName(), "oreGenEnderiumOre", true).setLanguageKey("config.oreGenEnderiumOre").setRequiresMcRestart(true).getBoolean();
        cache.oreGenNetherEnderiumOre = config.get(worldList.getQualifiedName(), "oreGenNetherEnderiumOre", true).setLanguageKey("config.oreGenNetherEnderiumOre").setRequiresMcRestart(true).getBoolean();
        cache.oreGenEndEnderiumOre = config.get(worldList.getQualifiedName(), "oreGenEndEnderiumOre", true).setLanguageKey("config.oreGenEndEnderiumOre").setRequiresMcRestart(true).getBoolean();

        if (config.hasChanged())
            config.save();
    }
}
