package com.asher9.CompactBlocks.config;

import com.asher9.CompactBlocks.Reference;
import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.Configuration;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CConfig {

    public class ConfigSection {
        public final ConfigSection parent;
        public final String name;
        public final String Lang;

        private ConfigCategory category;

        public ConfigSection(List<ConfigSection> list, ConfigSection parent, String name, String lang) {
            this.parent = parent;
            this.name = name;
            this.Lang = lang;

            list.add(this);
        }

        public ConfigSection (List<ConfigSection> list, String name, String lang) {
            this(list, null, name, lang);
        }

        public ConfigCategory getCategory() {
            if (category != null)
                return category;

            if (parent != null)
                category = config.getCategory(parent.getCategory().getQualifiedName() + "." + name.toLowerCase());

            else
                category = config.getCategory(name.toLowerCase());

            category.setLanguageKey(Lang);
            return category;
        }

        public String getQualifiedName() {
            return getCategory().getQualifiedName();
        }
    }

    public class ConfigCache {

        //Recipes

        //Block Settings

        //General Settings
        public boolean creativeTabSearch;
        public double blockHardness;
        public double blockResistance;

        //Update Settings
        public String updateAddress;
        public boolean checkUpdates;
    }

    public static Configuration config;
    public final ConfigCache cache;

    public final List<ConfigSection> sections = new ArrayList<>();
    private final ConfigSection worldList = new ConfigSection(sections, "worldSettings", "config.worldSettings");
    private final ConfigSection recipeList = new ConfigSection(sections, "recipes", "config.recipes");
    private final ConfigSection updateList = new ConfigSection(sections, "updateSettings", "config.updateSettings");
    private final ConfigSection blockList = new ConfigSection(sections, "blockSettings", "config.blockSettings");
    private final ConfigSection settingsList = new ConfigSection(sections, "generalSettings", "config.generalSettings");

    public CConfig(File file) {
        config = new Configuration(file);
        cache = new ConfigCache();

        for (ConfigSection section : sections)
            section.getCategory();

        syncConfig();
    }

    public void syncConfig() {

        cache.checkUpdates = config.get(updateList.getQualifiedName(), "checkUpdates", true).setLanguageKey("config.checkUpdates").setRequiresWorldRestart(true).getBoolean();
        cache.updateAddress = config.get(updateList.getQualifiedName(), "updateAddress", Reference.getUpdateURL()).setLanguageKey("config.updateAddress").setRequiresMcRestart(true).getString();

        cache.creativeTabSearch = config.get(settingsList.getQualifiedName(), "creativeTabSearch", false).setLanguageKey("config.creativeTabSearch").setRequiresMcRestart(true).getBoolean();
        cache.blockHardness = config.get(settingsList.getQualifiedName(), "blockHardness", 3.0F).setLanguageKey("config.blockHardness").setRequiresMcRestart(true).getDouble();
        cache.blockResistance = config.get(settingsList.getQualifiedName(), "blockResistance", 20.0F).setLanguageKey("config.blockResistance").setRequiresMcRestart(true).getDouble();

        if (config.hasChanged())
            config.save();
    }
}
