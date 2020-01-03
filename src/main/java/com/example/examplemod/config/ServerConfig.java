package com.example.examplemod.config;

import com.example.examplemod.Reference;
import net.minecraft.item.DyeColor;
import net.minecraftforge.common.ForgeConfigSpec;

import java.util.ArrayList;
import java.util.List;

public class ServerConfig {

    final ForgeConfigSpec.BooleanValue serverBoolean;
    final ForgeConfigSpec.ConfigValue<List<String>> serverStringList;
    final ForgeConfigSpec.ConfigValue<DyeColor> serverDyeColorEnum;

    ServerConfig(final ForgeConfigSpec.Builder builder) {
        builder.push("general");
        serverBoolean = builder
                .comment("An example boolean in the server config")
                .translation(Reference.MODID + ".config.serverBoolean")
                .define("serverBoolean", true);
        serverStringList = builder
                .comment("An example list of Strings in the server config")
                .translation(Reference.MODID + ".config.serverStringList")
                .define("serverStringList", new ArrayList<>());
        serverDyeColorEnum = builder
                .comment("An example enum DyeColor in the server config")
                .translation(Reference.MODID + ".config.serverEnumDyeColor")
                .defineEnum("serverEnumDyeColor", DyeColor.WHITE);
        builder.pop();
    }
}
