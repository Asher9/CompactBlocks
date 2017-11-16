package com.asher9.CompactBlocks;

public class Reference {
	
    public static final String MODID = "compactblocks";
	public static final String MODNAME = "Compact Blocks";
	public static final String VERSION = "v3.5_1.10.2";
	public static final String ClientSide = "com.asher9.CompactBlocks.proxies.ClientProxy";
	public static final String ServerSide = "com.asher9.CompactBlocks.proxies.CommonProxy";
	public static final String GuiFactory = "com.asher9.CompactBlocks.config.GuiFactory";
	
	public static final String getGuiFactory() {
		return GuiFactory;
	}
	public static final String getModid() {
		return MODID;
	}
	public static final String getModname() {
		return MODNAME;
	}
	public static final String getVersion() {
		return VERSION;
	}
	public static final String getClientSide() {
		return ClientSide;
	}
	public static final String getServerSide() {
		return ServerSide;
	}

}
