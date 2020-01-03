package com.example.examplemod.config;

import net.minecraftforge.fml.config.ModConfig;

public final class ConfigHelper {

    private static ModConfig clientConfig;
    private static ModConfig serverConfig;

    public static void bakeClient(final ModConfig config) {
        clientConfig =config;

        ExampleModConfig.clientBoolean = ConfigHolder.CLIENT.clientBoolean.get();
        ExampleModConfig.clientStringList = ConfigHolder.CLIENT.clientStringList.get();
        ExampleModConfig.clientDyeColorEnum = ConfigHolder.CLIENT.clientDyeColorEnum.get();
    }

    public static void bakeServer(final ModConfig config) {
        serverConfig = config;

        ExampleModConfig.serverBoolean = ConfigHolder.SERVER.serverBoolean.get();
        ExampleModConfig.serverStringList = ConfigHolder.SERVER.serverStringList.get();
        ExampleModConfig.serverDyeColorEnum = ConfigHolder.SERVER.serverDyeColorEnum.get();
    }

    public static void setValueAndSave(final ModConfig modConfig, final String path, final Object newValue) {
        modConfig.getConfigData().set(path, newValue);
        modConfig.save();
    }
}
