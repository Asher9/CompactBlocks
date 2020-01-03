package com.example.examplemod;

import com.example.examplemod.config.ConfigHolder;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Reference.MODID)
public class ExampleMod {

    public static final Logger LOGGER = LogManager.getLogger(Reference.MODID);

    public ExampleMod() {
        LOGGER.debug("Hello from Example Mod!");

        final ModLoadingContext modLoadingContext = ModLoadingContext.get();
        modLoadingContext.registerConfig(ModConfig.Type.CLIENT, ConfigHolder.CLIENT_SPEC);
        modLoadingContext.registerConfig(ModConfig.Type.SERVER, ConfigHolder.SERVER_SPEC);
    }
}
