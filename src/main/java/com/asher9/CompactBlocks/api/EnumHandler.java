package com.asher9.CompactBlocks.api;

import net.minecraft.block.material.MapColor;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.text.TextFormatting;

public class EnumHandler {

	public static enum ColorTypes implements IStringSerializable {
		WHITE("white", 0),
	    ORANGE("orange", 1),
	    MAGENTA("magenta", 2),
	    LIGHTBLUE("lightblue", 3),
	    YELLOW("yellow", 4),
	    LIME("lime", 5),
	    PINK("pink", 6),
	    GRAY("gray", 7),
	    LIGHTGRAY("lightgray", 8),
	    CYAN("cyan", 9),
	    PURPLE("purple", 10),
	    BLUE("blue", 11),
	    BROWN("brown", 12),
	    GREEN("green", 13),
	    RED("red", 14),
	    BLACK("black", 15);

		private int ID;
		private String name;

		private ColorTypes(String name, int ID) {
			this.ID = ID;
			this.name = name;
		}

		@Override
		public String getName() {
			return this.name;
		}
		
		public int getID() {
			return ID;
		}
		
		@Override
		public String toString() {
			return getName();
		}

	}
	
	public static enum WoodTypes implements IStringSerializable {
		OAK("oak", 0),
	    SPRUCE("spruce", 1),
	    BIRCH("birch", 2),
	    JUNGLE("jungle", 3),
	    ACACIA("acacia", 4),
	    DARKOAK("darkoak", 5);

		private int ID;
		private String name;

		private WoodTypes(String name, int ID) {
			this.ID = ID;
			this.name = name;
		}

		@Override
		public String getName() {
			return this.name;
		}
		
		public int getID() {
			return ID;
		}
		
		@Override
		public String toString() {
			return getName();
		}

	}

}
