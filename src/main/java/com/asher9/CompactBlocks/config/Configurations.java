package com.asher9.CompactBlocks.config;

import java.io.File;

import com.asher9.CompactBlocks.Reference;
import com.ibm.icu.util.ULocale.Category;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Configurations {

	public static Configuration config;

	public static boolean configExists;
	
	//activate Items
	public static boolean activateCobblestonePickaxe;
	public static boolean activateSandPickaxe;
	public static boolean activateDirtPickaxe;
	public static boolean activateGravelPickaxe;
	
	//activate Blocks
	public static boolean activateCompressedCobblestone;
	public static boolean activateCompressedGravel;
	public static boolean activateCompressedSand;
	public static boolean activateCompressedNetherrack;
	public static boolean activateCompressedEndStone;
	public static boolean activateCompressedDirt;
	public static boolean activateCompressedSoulSand;
	
	
	public static boolean creativeTabSearch;
	public static boolean checkUpdates;
	public static double blockHardness;
	public static double blockResistance;
	
	//Mod Update Check
	public static String updateAddress;
	private static String UpdateURL = "https://pastebin.com/raw/CdjXKmdm";
	
	@SubscribeEvent
	public void configChanged(ConfigChangedEvent event){
		if(event.getModID().equals(Reference.MODID)){
			refreshConfig();
		}
	}
	
	public static void init(File file) {
		config = new Configuration(file);
		refreshConfig();
	}

	private static void refreshConfig() {

		//compressedPickaxeRecipes
		activateCobblestonePickaxe = config.get("RECIPES", "ActivateCobblestonePickaxe", true).getBoolean();
		activateSandPickaxe = config.get("RECIPES", "ActivateSandPickaxe", true).getBoolean();
		activateDirtPickaxe = config.get("RECIPES", "ActivateDirtPickaxe", true).getBoolean();
		activateGravelPickaxe = config.get("RECIPES", "ActivateGravelPickaxe", true).getBoolean();	
		
		//compressedBlockReceipes
		activateCompressedCobblestone = config.get("RECIPES", "ActivateCompressedCobblestone", true).getBoolean();
		activateCompressedGravel = config.get("RECIPES", "ActivateCompressedGravel", true).getBoolean();
		activateCompressedSand = config.get("RECIPES", "ActivateCompressedSand", true).getBoolean();
		activateCompressedNetherrack = config.get("RECIPES", "ActivateCompressedNetherrack", true).getBoolean();
		activateCompressedEndStone = config.get("RECIPES", "ActivateCompressedEndStone", true).getBoolean();
		activateCompressedDirt = config.get("RECIPES", "ActivateCompressedDirt", true).getBoolean();
		activateCompressedSoulSand = config.get("RECIPES", "ActivateCompressedSoulSand", true).getBoolean();
		
		//Update Settings
		checkUpdates = config.get("UPDATE SETTINGS", "CheckForUpdates", true).getBoolean();
		updateAddress = config.get("UPDATE SETTINGS", "Address for Update Checking", UpdateURL).getString();
		
		//Settings
		creativeTabSearch = config.get("SETTINGS", "Searchbar in Creative Tabs", false).getBoolean();
		blockHardness = config.get("SETTINGS",  "Hardness of the Blocks", 3.0F).getDouble();
		blockResistance = config.get("SETTINGS", "Resistance of the Blocks", 20.0).getDouble();
		
		if (config.hasChanged()) {
			config.save();
		}
	}
}