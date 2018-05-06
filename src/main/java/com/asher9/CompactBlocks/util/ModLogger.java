package com.asher9.CompactBlocks.util;

import com.asher9.CompactBlocks.Reference;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ModLogger {

    public static Logger getLogger() {
        if(logger == null) {
            logger = LogManager.getFormatterLogger(Reference.getMODNAME());
        }
        return logger;
    }

    private static Logger logger;

}
