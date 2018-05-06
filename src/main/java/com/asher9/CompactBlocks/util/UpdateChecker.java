package com.asher9.CompactBlocks.util;

import com.asher9.CompactBlocks.CompactBlocks;
import com.asher9.CompactBlocks.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextFormatting;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class UpdateChecker {

    private static final String UPDATE_URL = CompactBlocks.config.cache.updateAddress;
    private static String currentVersion = Reference.getVERSION();
    private static String newestVersion;

    private static int currentVersionInt;
    private static int newestVersionInt;

    private static String updateStatus = "NULL";
    private static boolean show = false;
    private static int a = 0;

    public static void init() {

        getNewestVersion();

        if (newestVersion != null) {
            if (newestVersion.equals(currentVersion)) {
                show = true;
                updateStatus = TextFormatting.GREEN + "[" + Reference.getMODNAME()+ "] is up to date";
                ModLogger.getLogger().info("is up to date");
            }
            else if (currentVersionInt > newestVersionInt) {
                show = true;
                updateStatus= TextFormatting.YELLOW + "[" + Reference.getMODNAME() + "] your Version " + Reference.getVERSION() + " is higher than the latest Version " + newestVersion;
                ModLogger.getLogger().info("your Version " + Reference.getVERSION() + " is higher than your latest Version " + newestVersion);
            }
            else {
                show = true;
                updateStatus = TextFormatting.RED + "[" + Reference.getMODNAME() + "] is out of date! Your Version: " + currentVersion + " Latest Version: " + newestVersion;
                ModLogger.getLogger().info("is out of date! Your Version: " + currentVersion + " Latest Version: " + newestVersion);
            }
        }
        else {
            show = true;
            updateStatus = TextFormatting.DARK_RED + "[" + Reference.getMODNAME() + "] Failed to connect to check if update is available";
            ModLogger.getLogger().error("Failed to connect to check if update is available");
        }
    }

    public static void tick() {
        Minecraft mc = Minecraft.getMinecraft();
        EntityPlayer player;
        if (!mc.inGameHasFocus) {
            return;
        }
        synchronized (updateStatus) {
            if (a == 0) {
                mc.player.sendChatMessage(updateStatus);
                a++;
            }
        }
    }

    private static void getNewestVersion() {

        try {
            URL url = new URL(UPDATE_URL);
            Scanner s =new Scanner(url.openStream());
            newestVersion = s.nextLine();

            currentVersionInt = Integer.parseInt(currentVersion.substring(1, 4).replaceAll("[\\D]", ""));
            newestVersionInt = Integer.parseInt(currentVersion.substring(1, 4).replaceAll("[\\D]", ""));

            s.close();
        }
        catch (IOException e) {
            e.getStackTrace();
            ModLogger.getLogger().error("Could not connect to determine if mod was up to date!");
        }
    }
}
