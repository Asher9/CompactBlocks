package com.asher9.compactblocks.utils;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import com.asher9.compactblocks.CompactBlocks;
import com.asher9.compactblocks.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

public class UpdateChecker {

    private static final String UPDATE_URL = CompactBlocks.config.cache.updateAddress;
    private static String currentVersion = Reference.VERSION;
    private static String newestVersion;
    private static boolean beta_Status = false;

    private static int currentVersionInt;
    private static int newestVersionInt;

    private static String updateStatus = "NULL";
    private static boolean show = false;
    private static int a = 0;

    public static void init() {

        getNewestVersion();

        if(newestVersion != null) {
            if(newestVersion.equals(currentVersion) && !beta_Status) {
                show = true;
                updateStatus = TextFormatting.GREEN + "[" + Reference.MODNAME + "] is up to date";
                Utils.getLogger().info("is up to date");
            }
            else if (currentVersionInt > newestVersionInt && !beta_Status) {
                show = true;
                updateStatus = TextFormatting.YELLOW + "[" + Reference.MODNAME + "] your Version " + Reference.VERSION + " is higher than the latest Version " + newestVersion;
                Utils.getLogger().info("your Version " + Reference.VERSION + " is higher than the latest Version " + newestVersion);
            }
            else if (!beta_Status) {
                show = true;
                updateStatus = TextFormatting.RED + "[" + Reference.MODNAME + "] is out of date! Your Version: " + currentVersion + " Latest Version: " + newestVersion;
                Utils.getLogger().info("is out of date! Your Version: " + currentVersion + " Latest Version: " + newestVersion);
            }
            else if (beta_Status) {
                show = true;
                updateStatus = TextFormatting.GOLD + "[" + Reference.MODNAME + "] is in DEV mode";
                Utils.getLogger().info("is in DEV mode");
            }
        }else {
            show = true;
            updateStatus = TextFormatting.RED + "[" + Reference.MODNAME + "] Failed to connect to check if update is available";
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

            if (currentVersion.contains("beta")) {
                beta_Status = true;
            }
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
