package com.asher9.CompactBlocks.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.asher9.CompactBlocks.CompactBlocks;
import com.asher9.CompactBlocks.Reference;

public class Utils {
	
	private static Logger logger;
	
	public static Logger getLogger() {
		if(logger == null) {
			logger = LogManager.getFormatterLogger(Reference.getModname());
		}
		return logger;
	}

}
