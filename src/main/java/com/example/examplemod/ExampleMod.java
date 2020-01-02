package com.example.examplemod;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Reference.MODID)
public class ExampleMod {

    public static final Logger LOGGER = LogManager.getLogger(Reference.MODID);

    public ExampleMod() {
        LOGGER.debug("Hello from Example Mod!");
    }
}
