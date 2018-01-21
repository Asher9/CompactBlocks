package com.asher9.compactblocks.config;/*
package com.asher9.CompactBlocks.config;

import java.io.File;

import com.asher9.CompactBlocks.Reference;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Configurations {

	@SuppressWarnings("WeakerAccess")
	public static Configuration config;
	
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

	public static boolean oreGenEnderiumOre;
	public static boolean oreGenNetherEnderiumOre;
	public static boolean oreGenEndEnderiumOre;
	
	//Mod Update Check
	public static String updateAddress;

	private static final String UpdateURL = "https://raw.githubusercontent.com/Asher9/CompactBlocks/1.10.2/ModVersion.txt";
	
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
		
		//compressedBlockRecipes
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

		//World Settings
		oreGenEnderiumOre = config.get("WORLD SETTINGS", "Enderium Ore World Gen", true).getBoolean();
		oreGenNetherEnderiumOre = config.get("WORLD SETTINGS", "Nether Enderium Ore Gen", true).getBoolean();
		oreGenEndEnderiumOre = config.get("WORLD SETTINGS", "End Enderium Ore World Gen", true).getBoolean();
		
		//Settings
		creativeTabSearch = config.get("SETTINGS", "Searchbar in Creative Tabs", false).getBoolean();
		blockHardness = config.get("SETTINGS",  "Hardness of the Blocks", 3.0F).getDouble();
		blockResistance = config.get("SETTINGS", "Resistance of the Blocks", 20.0).getDouble();
		
		if (config.hasChanged()) {
			config.save();
		}
	}
}*/
