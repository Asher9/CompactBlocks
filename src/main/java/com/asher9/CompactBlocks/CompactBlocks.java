package com.asher9.CompactBlocks;

import java.io.File;

import com.asher9.CompactBlocks.api.CreativeTabCreator;
import com.asher9.CompactBlocks.api.Events;
import com.asher9.CompactBlocks.api.OreDictHandler;
import com.asher9.CompactBlocks.config.Config;
import com.asher9.CompactBlocks.init.CFurnaceRecipes;
import com.asher9.CompactBlocks.init.CInit;
import com.asher9.CompactBlocks.init.CShapedCraftingRecipe;
import com.asher9.CompactBlocks.init.CShapelessCraftingRecipe;
import com.asher9.CompactBlocks.init.CModBlocks;
import com.asher9.CompactBlocks.init.CModItems;
import com.asher9.CompactBlocks.proxies.CommonProxy;
import com.asher9.CompactBlocks.util.UpdateChecker;

import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION,
	guiFactory = Reference.GuiFactory)

public class CompactBlocks {

	public static Config config;
	
	@SidedProxy(clientSide = Reference.ClientSide, serverSide = Reference.ServerSide)
	private static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		//Mod Info
		ModMetadata data = event.getModMetadata();
    	data.autogenerated = false;
    	data.name = TextFormatting.GREEN + Reference.getModname();
    	//data.description = "";
    	data.credits = TextFormatting.BLUE + "Asher_9";
    	//data.logoFile = "";
    	//data.url = "";
    	data.authorList.add("Asher_9");
		
		//Config File	
    	File configDir = new File(event.getModConfigurationDirectory(), "CompactBlocks");
    	//Config.init(new File(configDir, "CompactBlocks.cfg"));
    	config = new Config(new File(configDir, "CompactBlocks.cfg"));
    	//MinecraftForge.EVENT_BUS.register(new Configurations());
		
		CInit.initAll();
		CModItems.register();
		CModBlocks.register();
		
		proxy.registerRenders();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		if(event.getSide().isClient() && CompactBlocks.config.cache.checkUpdates) {
				MinecraftForge.EVENT_BUS.register(new Events());	
				UpdateChecker.init();				
		}
		
		proxy.init();
		OreDictHandler.OreDictionary();
		proxy.registerModelBakery();
		CreativeTabCreator.Init();
		CShapelessCraftingRecipe.ShapelessCraftingRecipe();
		CShapedCraftingRecipe.ShapedRecipe();
		CFurnaceRecipes.furnaceRecipes();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {


		
	}

	@SubscribeEvent
	public void onConfigChanged (ConfigChangedEvent.OnConfigChangedEvent event) {
		if (event.getModID().equals(Reference.getModid()))
			config.syncConfig();
	}
}