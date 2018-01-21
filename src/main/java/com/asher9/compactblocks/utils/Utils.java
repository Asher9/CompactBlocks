package com.asher9.compactblocks.utils;

import com.asher9.compactblocks.Reference;
import net.minecraft.block.Block;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Utils {

    private static Logger logger;

    public static Logger getLogger() {
        if(logger == null) {
            logger = LogManager.getFormatterLogger(Reference.MODNAME);
        }
        return logger;
    }

    public static void main(Block[] args) {
        Block[] blockList = new Block[50];
    }

}
