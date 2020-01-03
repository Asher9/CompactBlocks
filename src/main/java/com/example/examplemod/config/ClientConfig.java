package com.example.examplemod.config;

import com.example.examplemod.Reference;
import net.minecraft.item.DyeColor;
import net.minecraftforge.common.ForgeConfigSpec;

import java.util.ArrayList;
import java.util.List;

public class ClientConfig {

    final ForgeConfigSpec.BooleanValue clientBoolean;
    final ForgeConfigSpec.ConfigValue<List<String>> clientStringList;
    final ForgeConfigSpec.EnumValue<DyeColor> clientDyeColorEnum;

    ClientConfig(final ForgeConfigSpec.Builder builder) {
        builder.push("general");
        clientBoolean = builder
                .comment("An example boolean in the client config")
                .translation(Reference.MODID + ".config.clientBoolean")
                .define("clientBoolean", true);
        clientStringList = builder
                .comment("An example list of Strings in the client config")
                .translation(Reference.MODID + ".config.clientStringList")
                .define("clientStringList", new ArrayList<>());
        clientDyeColorEnum = builder
                .comment("An example DyeColor enum in the client config")
                .translation(Reference.MODID + ".config.clientDyeColorEnum")
                .defineEnum("clientDyeColorEnum", DyeColor.WHITE);
        builder.pop();
    }
}
