package com.asher9.CompactBlocks.util;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import com.asher9.CompactBlocks.CompactBlocks;
import com.asher9.CompactBlocks.Reference;
import com.asher9.CompactBlocks.config.Configurations;

import net.minecraft.client.Minecraft;
import net.minecraft.util.text.TextComponentScore;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

public class UpdateChecker {
	
	private static final String UPDATE_URL = Configurations.updateAddress;
	private static String currentVersion = Reference.getVersion();
	private static String newestVersion;
	
	private static int currentVersionInt;
	private static int newestVersionInt;

    private static String updateStatus = "NULL";
    private static boolean show = false;
	private static int a = 0;
	
	public static void init() {
		
		getNewestVersion();

		if(newestVersion != null) {
			if(newestVersion.equals(currentVersion)) {
				show = true;
				updateStatus = TextFormatting.GREEN + "[" + Reference.getModname() + "] is up to date";
				Utils.getLogger().info("is up to date");
			}
			else if (currentVersionInt > newestVersionInt) {
				show = true;
				updateStatus = TextFormatting.YELLOW + "[" + Reference.getModname() + "] your Version " + Reference.getVersion() + " is higher than the latest Version " + newestVersion;
				Utils.getLogger().info("your Version " + Reference.getVersion() + " is higher than the latest Version " + newestVersion);
			}
			else {
				show = true;
				updateStatus = TextFormatting.RED + "[" + Reference.getModname() + "] is out of date! Your Version: " + currentVersion + " Latest Version: " + newestVersion;  
				Utils.getLogger().info("is out of date! Your Version: " + currentVersion + " Latest Version: " + newestVersion);
			}
		}else {
			show = true;
			updateStatus = TextFormatting.RED + "[" + Reference.getModname() + "] Failed to connect to check if update is available";
			Utils.getLogger().error("Failed to connect to check if update is available");
		}	
	}
	
	public static void tick() {
        Minecraft mc = Minecraft.getMinecraft();
        if (!mc.inGameHasFocus) {
            return;
        }
        synchronized (updateStatus) {
  			if(a == 0){
  				mc.thePlayer.addChatMessage(new TextComponentString(updateStatus));
        		a++;
  			}
       	}
	}
	
	private static void getNewestVersion() {
		
		try {
			URL url = new URL(UPDATE_URL);
			Scanner s = new Scanner(url.openStream());
			newestVersion = s.nextLine();
			
			currentVersionInt = Integer.parseInt(currentVersion.substring(1, 4).replaceAll("[\\D]", ""));
			newestVersionInt = Integer.parseInt(newestVersion.substring(1, 4).replaceAll("[\\D]", ""));
			
			s.close();
		}
		catch(IOException e){
			e.getStackTrace();
			Utils.getLogger().error("Could not connect to determine if mod was up to date!");
		}	
	}
}
