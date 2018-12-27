package com.asher9.CompactBlocks.config;

import com.asher9.CompactBlocks.Reference;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = Reference.MODID)
@Config.LangKey("compactblocks.config.title")
public class CConfig {

    public static final WorldSettings worldSettings = new WorldSettings();
    public static final Recipes recipes = new Recipes();
    public static final UpdateSettings updateSettings = new UpdateSettings();
    public static final BlockSettings blockSettings = new BlockSettings();
    public static final GeneralSettings generalSettings = new GeneralSettings();

    public static class WorldSettings {
        @Config.Comment("Turn off Enderium Ore World Gen")
        public boolean oreGenEnderiumOre = true;

        @Config.Comment("Turn off Nether Enderium Ore World Gen")
        public boolean oreGenNetherEnderiumOre = true;

        @Config.Comment("Turn off End Enderium Ore World Gen")
        public boolean oreGenEndEnderiumOre = true;
    }

    public static class Recipes {
        @Config.Comment("Turn off Compressed Cobblestone Pickaxe")
        @Config.RequiresMcRestart
        public boolean activateCobblestonePickaxe = true;

        @Config.Comment("Turn off Compressed Dirt Pickaxe")
        @Config.RequiresMcRestart
        public boolean activateDirtPickaxe = true;

        @Config.Comment("Turn off Compressed Sand Pickaxe")
        @Config.RequiresMcRestart
        public boolean activateSandPickaxe = true;

        @Config.Comment("Turn off Compressed Gravel Pickaxe")
        @Config.RequiresMcRestart
        public boolean activateGravelPickaxe = true;
    }

    public static class UpdateSettings {
        @Config.Comment("Turn off Update Check")
        @Config.RequiresMcRestart
        public boolean checkUpdates = true;

        @Config.Comment("Update Address")
        @Config.RequiresMcRestart
        public String updateAddress = Reference.getUpdateURL();
    }

    public static class BlockSettings {
        @Config.Comment("Turn off Compressed Cobblestone")
        @Config.RequiresMcRestart
        public boolean activateCompressedCobblestone = true;

        @Config.Comment("Turn off Compressed Dirt")
        @Config.RequiresMcRestart
        public boolean activateCompressedDirt = true;

        @Config.Comment("Turn off Compressed Sand")
        @Config.RequiresMcRestart
        public boolean activateCompressedSand = true;

        @Config.Comment("Turn off Compressed Gravel")
        @Config.RequiresMcRestart
        public boolean activateCompressedGravel = true;

        @Config.Comment("Turn off Compressed End Stone")
        @Config.RequiresMcRestart
        public boolean activateCompressedEndStone = true;

        @Config.Comment("Turn off Compressed Netherrack")
        @Config.RequiresMcRestart
        public boolean activateCompressedNetherrack = true;

        @Config.Comment("Turn off Compressed Soul Sand")
        @Config.RequiresMcRestart
        public boolean activateCompressedSoulSand = true;
    }

    public static class GeneralSettings {
        @Config.Comment("Display a Searchbar in the Creative Tab")
        public boolean creativeTabSearch = false;

        @Config.Comment("Change Block Hardness")
        @Config.RequiresMcRestart
        public double blockHardness = 3.0F;

        @Config.Comment("Change Block Resistance")
        @Config.RequiresMcRestart
        public double blockResistance = 20.0F;

    }

    @Mod.EventBusSubscriber(modid = Reference.MODID)
    private static class EventHandler {

        /**
         * Inject the new values and save to the config file when the config has been changed from the GUI.
         *
         * @param event The event
         */
        @SubscribeEvent
        public static void onConfigChanged(final ConfigChangedEvent.OnConfigChangedEvent event) {
            if (event.getModID().equals(Reference.MODID)) {
                ConfigManager.sync(Reference.MODID, Config.Type.INSTANCE);
            }
        }
    }
}
