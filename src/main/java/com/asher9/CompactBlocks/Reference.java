package com.asher9.CompactBlocks;

public class Reference {

    public static String getMODID() {
        return MODID;
    }

    public static String getMODNAME() {
        return MODNAME;
    }

    public static String getVERSION() {
        return VERSION;
    }

    public static String getUpdateURL() {
        return updateURL;
    }

    public static final String MODID = "compactblocks";
    public static final String MODNAME = "Compact Blocks";
    public static final String VERSION = "v4.1_1.12.2";
    public static final String ClientSide = "com.asher9.CompactBlocks.proxies.ClientProxy";
    public static final String ServerSide = "com.asher9.CompactBlocks.proxies.CommonProxy";
    public static final String GuiFactory = "";
    public static final String updateURL = "https://raw.githubusercontent.com/Asher9/CompactBlocks/1.12.2/ModVersion.txt";

}
