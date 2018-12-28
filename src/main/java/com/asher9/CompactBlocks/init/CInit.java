package com.asher9.CompactBlocks.init;

import com.asher9.CompactBlocks.api.CMaterial;
import com.asher9.CompactBlocks.api.CreativeTabCreator;
import com.asher9.CompactBlocks.block.*;
import com.asher9.CompactBlocks.config.CConfig;
import com.asher9.CompactBlocks.item.*;
import com.asher9.CompactBlocks.item.tools.ToolCompCobblestonePickaxe;
import com.asher9.CompactBlocks.item.tools.ToolCompDirtPickaxe;
import com.asher9.CompactBlocks.item.tools.ToolCompGravelPickaxe;
import com.asher9.CompactBlocks.item.tools.ToolCompSandPickaxe;
import com.asher9.CompactBlocks.item.tools.*;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CInit {
	
	private static final String Tool = "pickaxe";
	private static final float Hardness = (float) CConfig.generalSettings.blockHardness;
	private static final float Resistance = (float) CConfig.generalSettings.blockResistance;
	private static final int ToolLevel = 0;
	
	public static void initAll() {

		// Items
		CItems.dustEnderium = new dustEnderium("dustEnderium", CreativeTabCreator.tabcompressedItems);
		CItems.ingotEnderium = new ingotEnderium("ingotEnderium", CreativeTabCreator.tabcompressedItems);
		CItems.nuggetEnderium = new nuggetEnderium("nuggetEnderium", CreativeTabCreator.tabcompressedItems);
		CItems.compressedCobblestonePickaxe = new ToolCompCobblestonePickaxe(CMaterial.Compressed, "compressedCobblestonePickaxe");
		CItems.compressedDirtPickaxe = new ToolCompDirtPickaxe(CMaterial.Compressed, "compressedDirtPickaxe");
		CItems.compressedSandPickaxe = new ToolCompSandPickaxe(CMaterial.Compressed, "compressedSandPickaxe");
		CItems.compressedGravelPickaxe = new ToolCompGravelPickaxe(CMaterial.Compressed, "compressedGravelPickaxe");
		CItems.enderiumPickaxe = new ToolEnderiumPickaxe(CMaterial.Enderium, "enderiumPickaxe");
		CItems.enderiumAxe = new ToolEnderiumAxe(CMaterial.Enderium, "enderiumAxe");
		CItems.enderiumShovel = new ToolEnderiumShovel(CMaterial.Enderium, "enderiumShovel");
		
		//Blocks
		CBlocks.compressedCobblestone = new compressedCobblestone(Material.ROCK, "compressedCobblestone", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
		CBlocks.doublecompressedCobblestone = new compressedCobblestone(Material.ROCK, "doublecompressedCobblestone", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks,SoundType.STONE);
		CBlocks.triplecompressedCobblestone = new compressedCobblestone(Material.ROCK, "triplecompressedCobblestone", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks,SoundType.STONE);
        CBlocks.quadruplecompressedCobblestone = new compressedCobblestone(Material.ROCK, "quadruplecompressedCobblestone", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks,SoundType.STONE);
        
        CBlocks.compressedDirt = new compressedDirt(Material.ROCK, "compressedDirt", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.GROUND);
        CBlocks.doublecompressedDirt = new compressedDirt(Material.ROCK, "doublecompressedDirt", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.GROUND);
        CBlocks.triplecompressedDirt = new compressedDirt(Material.ROCK, "triplecompressedDirt", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.GROUND);
        CBlocks.quadruplecompressedDirt = new compressedDirt(Material.ROCK, "quadruplecompressedDirt", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.GROUND);
       
        CBlocks.compressedSand = new compressedSand(Material.ROCK, "compressedSand", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.SAND);
        CBlocks.doublecompressedSand = new compressedSand(Material.ROCK, "doublecompressedSand", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.SAND);
        CBlocks.triplecompressedSand = new compressedSand(Material.ROCK, "triplecompressedSand", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.SAND);
        CBlocks.quadruplecompressedSand = new compressedSand(Material.ROCK, "quadruplecompressedSand", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.SAND);
        
        CBlocks.compressedGravel = new compressedGravel(Material.ROCK, "compressedGravel", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.GROUND);
        CBlocks.doublecompressedGravel = new compressedGravel(Material.ROCK, "doublecompressedGravel", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.GROUND);
        CBlocks.triplecompressedGravel = new compressedGravel(Material.ROCK, "triplecompressedGravel", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.GROUND);
        CBlocks.quadruplecompressedGravel = new compressedGravel(Material.ROCK, "quadruplecompressedGravel", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.GROUND);
       
        CBlocks.compressedCoalBlock = new compressedCoalBlock(Material.ROCK, "compressedCoalBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.doublecompressedCoalBlock = new compressedCoalBlock(Material.ROCK, "doublecompressedCoalBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.triplecompressedCoalBlock = new compressedCoalBlock(Material.ROCK, "triplecompressedCoalBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.quadruplecompressedCoalBlock = new compressedCoalBlock(Material.ROCK, "quadruplecompressedCoalBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        
        CBlocks.blockEnderium = new blockEnderium(Material.ROCK, "blockEnderium", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.oreEnderium = new oreEnderium(Material.ROCK, "oreEnderium", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE, CItems.dustEnderium, 2, 6);
        CBlocks.oreNetherEnderium = new oreNetherEnderium(Material.ROCK, "oreNetherEnderium", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE, CItems.dustEnderium, 2, 6);
        CBlocks.oreEndEnderium = new oreEndEnderium(Material.ROCK, "oreEndEnderium", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE, CItems.dustEnderium, 2, 6); 
       
        CBlocks.compressedObsidian = new compressedObsidian(Material.ROCK, "compressedObsidian", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.doublecompressedObsidian = new compressedObsidian(Material.ROCK, "doublecompressedObsidian", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.triplecompressedObsidian = new compressedObsidian(Material.ROCK, "triplecompressedObsidian", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.quadruplecompressedObsidian = new compressedObsidian(Material.ROCK, "quadruplecompressedObsidian", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        
        CBlocks.compressedStone = new compressedStone(Material.ROCK, "compressedStone", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.doublecompressedStone = new compressedStone(Material.ROCK, "doublecompressedStone", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.triplecompressedStone = new compressedStone(Material.ROCK, "triplecompressedStone", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.quadruplecompressedStone = new compressedStone(Material.ROCK, "quadruplecompressedStone", 13.5F, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        
        CBlocks.testSidedBlock = new testSidedBlock(Material.ROCK, "testSidedBlock", Hardness, Resistance, 1.0F, Tool, 0, CreativeTabCreator.tabcompressedBlocks, SoundType.ANVIL);
        
        CBlocks.compressedEnderium = new compressedEnderium(Material.ROCK, "compressedEnderium", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.METAL);
        CBlocks.doublecompressedEnderium = new compressedEnderium(Material.ROCK, "doublecompressedEnderium", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.METAL);
        CBlocks.triplecompressedEnderium = new compressedEnderium(Material.ROCK, "triplecompressedEnderium", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.METAL);
        CBlocks.quadruplecompressedEnderium = new compressedEnderium(Material.ROCK, "quadruplecompressedEnderium", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.METAL);   
        
        CBlocks.compressedClay = new compressedClay(Material.ROCK, "compressedClay", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.GROUND);
        CBlocks.doublecompressedClay = new compressedClay(Material.ROCK, "doublecompressedClay", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.GROUND);
        CBlocks.triplecompressedClay = new compressedClay(Material.ROCK, "triplecompressedClay", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.GROUND);
        CBlocks.quadruplecompressedClay = new compressedClay(Material.ROCK, "quadruplecompressedClay", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.GROUND); 
        
        CBlocks.compressedBrick = new compressedBrick(Material.ROCK, "compressedBrick", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.doublecompressedBrick = new compressedBrick(Material.ROCK, "doublecompressedBrick", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.triplecompressedBrick = new compressedBrick(Material.ROCK, "triplecompressedBrick", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.quadruplecompressedBrick = new compressedBrick(Material.ROCK, "quadruplecompressedBrick", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE); 
        
        CBlocks.compressedBedrock = new compressedBedrock(Material.ROCK, "compressedBedrock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.doublecompressedBedrock = new compressedBedrock(Material.ROCK, "doublecompressedBedrock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.triplecompressedBedrock = new compressedBedrock(Material.ROCK, "triplecompressedBedrock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.quadruplecompressedBedrock = new compressedBedrock(Material.ROCK, "quadruplecompressedBedrock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE); 
        
        CBlocks.compressedCobblestone_mossy = new compressedCobblestone_mossy(Material.ROCK, "compressedCobblestone_mossy", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.doublecompressedCobblestone_mossy = new compressedCobblestone_mossy(Material.ROCK, "doublecompressedCobblestone_mossy", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.triplecompressedCobblestone_mossy = new compressedCobblestone_mossy(Material.ROCK, "triplecompressedCobblestone_mossy", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.quadruplecompressedCobblestone_mossy = new compressedCobblestone_mossy(Material.ROCK, "quadruplecompressedCobblestone_mossy", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE); 
		
        CBlocks.compressedDiamondBlock = new compressedDiamondBlock(Material.ROCK, "compressedDiamondBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.METAL);
        CBlocks.doublecompressedDiamondBlock = new compressedDiamondBlock(Material.ROCK, "doublecompressedDiamondBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.METAL);
        CBlocks.triplecompressedDiamondBlock = new compressedDiamondBlock(Material.ROCK, "triplecompressedDiamondBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.METAL);
        CBlocks.quadruplecompressedDiamondBlock = new compressedDiamondBlock(Material.ROCK, "quadruplecompressedDiamondBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.METAL);
        
        CBlocks.compressedEmeraldBlock = new compressedEmeraldBlock(Material.ROCK, "compressedEmeraldBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.METAL);
        CBlocks.doublecompressedEmeraldBlock = new compressedEmeraldBlock(Material.ROCK, "doublecompressedEmeraldBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.METAL);
        CBlocks.triplecompressedEmeraldBlock = new compressedEmeraldBlock(Material.ROCK, "triplecompressedEmeraldBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.METAL);
        CBlocks.quadruplecompressedEmeraldBlock = new compressedEmeraldBlock(Material.ROCK, "quadruplecompressedEmeraldBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.METAL);
        
        CBlocks.compressedEndStone = new compressedEndStone(Material.ROCK, "compressedEndStone", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.doublecompressedEndStone= new compressedEndStone(Material.ROCK, "doublecompressedEndStone", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.triplecompressedEndStone = new compressedEndStone(Material.ROCK, "triplecompressedEndStone", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.quadruplecompressedEndStone= new compressedEndStone(Material.ROCK, "quadruplecompressedEndStone", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
       
        CBlocks.compressedGlowstone = new compressedGlowstone(Material.ROCK, "compressedGlowstone", Hardness, Resistance, 1.0F, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.GLASS);
        CBlocks.doublecompressedGlowstone= new compressedGlowstone(Material.ROCK, "doublecompressedGlowstone", Hardness, Resistance, 1.0F, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.GLASS);
        CBlocks.triplecompressedGlowstone = new compressedGlowstone(Material.ROCK, "triplecompressedGlowstone", Hardness, Resistance, 1.0F, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.GLASS);
        CBlocks.quadruplecompressedGlowstone= new compressedGlowstone(Material.ROCK, "quadruplecompressedGlowstone", Hardness, Resistance, 1.0F, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.GLASS);
        
        CBlocks.compressedGlassBlock = new compressedGlassBlock(Material.ROCK, false, "compressedGlassBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.GLASS);
        CBlocks.doublecompressedGlassBlock= new compressedGlassBlock(Material.ROCK, false, "doublecompressedGlassBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.GLASS);
        CBlocks.triplecompressedGlassBlock = new compressedGlassBlock(Material.ROCK, false, "triplecompressedGlassBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.GLASS);
        CBlocks.quadruplecompressedGlassBlock= new compressedGlassBlock(Material.ROCK, false, "quadruplecompressedGlassBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.GLASS);
        
        CBlocks.compressedGoldBlock = new compressedGoldBlock(Material.ROCK, "compressedGoldBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.METAL);
        CBlocks.doublecompressedGoldBlock= new compressedGoldBlock(Material.ROCK, "doublecompressedGoldBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.METAL);
        CBlocks.triplecompressedGoldBlock = new compressedGoldBlock(Material.ROCK, "triplecompressedGoldBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.METAL);
        CBlocks.quadruplecompressedGoldBlock= new compressedGoldBlock(Material.ROCK, "quadruplecompressedGoldBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.METAL);
        
        CBlocks.compressedHayBlock = new compressedHayBlock(Material.ROCK, "compressedHayBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.PLANT);
        CBlocks.doublecompressedHayBlock= new compressedHayBlock(Material.ROCK, "doublecompressedHayBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.PLANT);
        CBlocks.triplecompressedHayBlock = new compressedHayBlock(Material.ROCK, "triplecompressedHayBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.PLANT);
        CBlocks.quadruplecompressedHayBlock= new compressedHayBlock(Material.ROCK, "quadruplecompressedHayBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.PLANT);
        
        CBlocks.compressedIce = new compressedIce(Material.ROCK, false, "compressedIce", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.GLASS);
        CBlocks.doublecompressedIce= new compressedIce(Material.ROCK, false, "doublecompressedIce", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.GLASS);
        CBlocks.triplecompressedIce= new compressedIce(Material.ROCK, false, "triplecompressedIce", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.GLASS);
        CBlocks.quadruplecompressedIce= new compressedIce(Material.ROCK, false, "quadruplecompressedIce", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.GLASS);
        
        CBlocks.compressedIronBlock = new compressedIronBlock(Material.ROCK, "compressedIronBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.METAL);
        CBlocks.doublecompressedIronBlock= new compressedIronBlock(Material.ROCK, "doublecompressedIronBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.METAL);
        CBlocks.triplecompressedIronBlock = new compressedIronBlock(Material.ROCK, "triplecompressedIronBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.METAL);
        CBlocks.quadruplecompressedIronBlock= new compressedIronBlock(Material.ROCK, "quadruplecompressedIronBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.METAL);
        
        CBlocks.compressedLapisBlock = new compressedLapisBlock(Material.ROCK, "compressedLapisBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.doublecompressedLapisBlock= new compressedLapisBlock(Material.ROCK, "doublecompressedLapisBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.triplecompressedLapisBlock = new compressedLapisBlock(Material.ROCK, "triplecompressedLapisBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.quadruplecompressedLapisBlock= new compressedLapisBlock(Material.ROCK, "quadruplecompressedLapisBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        
        CBlocks.compressedNetherBrick = new compressedNetherBrick(Material.ROCK, "compressedNetherBrick", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.doublecompressedNetherBrick= new compressedNetherBrick(Material.ROCK, "doublecompressedNetherBrick", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.triplecompressedNetherBrick = new compressedNetherBrick(Material.ROCK, "triplecompressedNetherBrick", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.quadruplecompressedNetherBrick= new compressedNetherBrick(Material.ROCK, "quadruplecompressedNetherBrick", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        
        CBlocks.compressedWoodPlanks = new compressedWoodPlanks(Material.WOOD, "compressedWoodPlanks", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedWoodBlocks, SoundType.WOOD);
        CBlocks.doublecompressedWoodPlanks = new compressedWoodPlanks(Material.WOOD, "doublecompressedWoodPlanks", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedWoodBlocks, SoundType.WOOD);
        CBlocks.triplecompressedWoodPlanks = new compressedWoodPlanks(Material.WOOD, "triplecompressedWoodPlanks", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedWoodBlocks, SoundType.WOOD);
        CBlocks.quadruplecompressedWoodPlanks = new compressedWoodPlanks(Material.WOOD, "quadruplecompressedWoodPlanks", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedWoodBlocks, SoundType.WOOD);
        
        CBlocks.compressedNetherrack = new compressedNetherrack(Material.ROCK, "compressedNetherrack", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.doublecompressedNetherrack = new compressedNetherrack(Material.ROCK, "doublecompressedNetherrack", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.triplecompressedNetherrack = new compressedNetherrack(Material.ROCK, "triplecompressedNetherrack", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.quadruplecompressedNetherrack = new compressedNetherrack(Material.ROCK, "quadruplecompressedNetherrack", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        
        CBlocks.compressedRedstoneBlock = new compressedRedstoneBlock(Material.ROCK, "compressedRedstoneBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.METAL);
        CBlocks.doublecompressedRedstoneBlock = new compressedRedstoneBlock(Material.ROCK, "doublecompressedRedstoneBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.METAL);
        CBlocks.triplecompressedRedstoneBlock = new compressedRedstoneBlock(Material.ROCK, "triplecompressedRedstoneBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.METAL);
        CBlocks.quadruplecompressedRedstoneBlock = new compressedRedstoneBlock(Material.ROCK, "quadruplecompressedRedstoneBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.METAL);
        
        CBlocks.compressedRedSand = new compressedRedSand(Material.ROCK, "compressedRedSand", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.SAND);
        CBlocks.doublecompressedRedSand = new compressedRedSand(Material.ROCK, "doublecompressedRedSand", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.SAND);
        CBlocks.triplecompressedRedSand = new compressedRedSand(Material.ROCK, "triplecompressedRedSand", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.SAND);
        CBlocks.quadruplecompressedRedSand = new compressedRedSand(Material.ROCK, "quadruplecompressedRedSand", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.SAND);
        
        CBlocks.compressedStoneBrick = new compressedStoneBrick(Material.ROCK, "compressedStoneBrick", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.doublecompressedStoneBrick = new compressedStoneBrick(Material.ROCK, "doublecompressedStoneBrick", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.triplecompressedStoneBrick = new compressedStoneBrick(Material.ROCK, "triplecompressedStoneBrick", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.quadruplecompressedStoneBrick = new compressedStoneBrick(Material.ROCK, "quadruplecompressedStoneBrick", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        
        CBlocks.compressedStoneBrickChiseled = new compressedStoneBrickChiseled(Material.ROCK, "compressedStoneBrickChiseled", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.doublecompressedStoneBrickChiseled = new compressedStoneBrickChiseled(Material.ROCK, "doublecompressedStoneBrickChiseled", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.triplecompressedStoneBrickChiseled = new compressedStoneBrickChiseled(Material.ROCK, "triplecompressedStoneBrickChiseled", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.quadruplecompressedStoneBrickChiseled = new compressedStoneBrickChiseled(Material.ROCK, "quadruplecompressedStoneBrickChiseled", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        
        CBlocks.compressedStoneBrickCracked = new compressedStoneBrickCracked(Material.ROCK, "compressedStoneBrickCracked", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.doublecompressedStoneBrickCracked = new compressedStoneBrickCracked(Material.ROCK, "doublecompressedStoneBrickCracked", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.triplecompressedStoneBrickCracked = new compressedStoneBrickCracked(Material.ROCK, "triplecompressedStoneBrickCracked", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.quadruplecompressedStoneBrickCracked = new compressedStoneBrickCracked(Material.ROCK, "quadruplecompressedStoneBrickCracked", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        
        CBlocks.compressedStoneBrickMossy = new compressedStoneBrickMossy(Material.ROCK, "compressedStoneBrickMossy", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.doublecompressedStoneBrickMossy = new compressedStoneBrickMossy(Material.ROCK, "doublecompressedStoneBrickMossy", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.triplecompressedStoneBrickMossy = new compressedStoneBrickMossy(Material.ROCK, "triplecompressedStoneBrickMossy", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.quadruplecompressedStoneBrickMossy = new compressedStoneBrickMossy(Material.ROCK, "quadruplecompressedStoneBrickMossy", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        
        CBlocks.compressedSponge = new compressedSponge(Material.ROCK, "compressedSponge", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.PLANT);
        CBlocks.doublecompressedSponge = new compressedSponge(Material.ROCK, "doublecompressedSponge", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.PLANT);
        CBlocks.triplecompressedSponge = new compressedSponge(Material.ROCK, "triplecompressedSponge", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.PLANT);
        CBlocks.quadruplecompressedSponge = new compressedSponge(Material.ROCK, "quadruplecompressedSponge", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.PLANT);
        
        CBlocks.compressedWool = new compressedWool(Material.CLOTH, "compressedWool", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedWoolBlocks, SoundType.CLOTH);
        CBlocks.doublecompressedWool = new compressedWool(Material.CLOTH, "doublecompressedWool", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedWoolBlocks, SoundType.CLOTH);
        CBlocks.triplecompressedWool = new compressedWool(Material.CLOTH, "triplecompressedWool", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedWoolBlocks, SoundType.CLOTH);
        CBlocks.quadruplecompressedWool = new compressedWool(Material.CLOTH, "quadruplecompressedWool", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedWoolBlocks, SoundType.CLOTH);

        CBlocks.compressedBookshelf = new compressedBookshelf(Material.ROCK, "compressedBookshelf", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.WOOD);
        CBlocks.doublecompressedBookshelf = new compressedBookshelf(Material.ROCK, "doublecompressedBookshelf", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.WOOD);
        CBlocks.triplecompressedBookshelf = new compressedBookshelf(Material.ROCK, "triplecompressedBookshelf", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.WOOD);
        CBlocks.quadruplecompressedBookshelf = new compressedBookshelf(Material.ROCK, "quadruplecompressedBookshelf", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.WOOD);
        
        CBlocks.compressedCraftingTable = new compressedCraftingTable(Material.ROCK, "compressedCraftingTable", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.WOOD);
        CBlocks.doublecompressedCraftingTable = new compressedCraftingTable(Material.ROCK, "doublecompressedCraftingTable", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.WOOD);
        CBlocks.triplecompressedCraftingTable = new compressedCraftingTable(Material.ROCK, "triplecompressedCraftingTable", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.WOOD);
        CBlocks.quadruplecompressedCraftingTable = new compressedCraftingTable(Material.ROCK, "quadruplecompressedCraftingTable", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.WOOD);
        
        CBlocks.compressedColorGlass = new compressedColorGlass(Material.ROCK, false, "compressedColorGlass", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedGlassBlocks, SoundType.GLASS);
        CBlocks.doublecompressedColorGlass = new compressedColorGlass(Material.ROCK, false, "doublecompressedColorGlass", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedGlassBlocks, SoundType.GLASS);
        CBlocks.triplecompressedColorGlass = new compressedColorGlass(Material.ROCK, false, "triplecompressedColorGlass", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedGlassBlocks, SoundType.GLASS);
        CBlocks.quadruplecompressedColorGlass = new compressedColorGlass(Material.ROCK, false, "quadruplecompressedColorGlass", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedGlassBlocks, SoundType.GLASS);
        
        CBlocks.compressedHardenedClay = new compressedHardenedClay(Material.ROCK, "compressedHardenedClay", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedClayBlocks, SoundType.STONE);
        CBlocks.doublecompressedHardenedClay = new compressedHardenedClay(Material.ROCK, "doublecompressedHardenedClay", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedClayBlocks, SoundType.STONE);
        CBlocks.triplecompressedHardenedClay = new compressedHardenedClay(Material.ROCK, "triplecompressedHardenedClay", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedClayBlocks, SoundType.STONE);
        CBlocks.quadruplecompressedHardenedClay = new compressedHardenedClay(Material.ROCK, "quadruplecompressedHardenedClay", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedClayBlocks, SoundType.STONE);
        
        CBlocks.compressedHardenedClay_ST = new compressedHardenedClay_ST(Material.ROCK, "compressedHardenedClay_ST", Hardness, 63.0F, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.doublecompressedHardenedClay_ST = new compressedHardenedClay_ST(Material.ROCK, "doublecompressedHardenedClay_ST", Hardness, 63.0F, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.triplecompressedHardenedClay_ST = new compressedHardenedClay_ST(Material.ROCK, "triplecompressedHardenedClay_ST", Hardness, 63.0F, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.quadruplecompressedHardenedClay_ST = new compressedHardenedClay_ST(Material.ROCK, "quadruplecompressedHardenedClay_ST", Hardness, 63.0F, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        
        CBlocks.compressedCoalOre = new compressedCoalOre(Material.ROCK, "compressedCoalOre", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.doublecompressedCoalOre = new compressedCoalOre(Material.ROCK, "doublecompressedCoalOre", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.triplecompressedCoalOre = new compressedCoalOre(Material.ROCK, "triplecompressedCoalOre", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.quadruplecompressedCoalOre = new compressedCoalOre(Material.ROCK, "quadruplecompressedCoalOre", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        
        CBlocks.compressedDiamondOre = new compressedDiamondOre(Material.ROCK, "compressedDiamondOre", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.doublecompressedDiamondOre = new compressedDiamondOre(Material.ROCK, "doublecompressedDiamondOre", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.triplecompressedDiamondOre = new compressedDiamondOre(Material.ROCK, "triplecompressedDiamondOre", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.quadruplecompressedDiamondOre = new compressedDiamondOre(Material.ROCK, "quadruplecompressedDiamondOre", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        
        CBlocks.compressedEmeraldOre = new compressedEmeraldOre(Material.ROCK, "compressedEmeraldOre", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.doublecompressedEmeraldOre = new compressedEmeraldOre(Material.ROCK, "doublecompressedEmeraldOre", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.triplecompressedEmeraldOre = new compressedEmeraldOre(Material.ROCK, "triplecompressedEmeraldOre", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.quadruplecompressedEmeraldOre = new compressedEmeraldOre(Material.ROCK, "quadruplecompressedEmeraldOre", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        
        CBlocks.compressedGoldOre = new compressedGoldOre(Material.ROCK, "compressedGoldOre", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.doublecompressedGoldOre = new compressedGoldOre(Material.ROCK, "doublecompressedGoldOre", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.triplecompressedGoldOre = new compressedGoldOre(Material.ROCK, "triplecompressedGoldOre", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.quadruplecompressedGoldOre = new compressedGoldOre(Material.ROCK, "quadruplecompressedGoldOre", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        
        CBlocks.compressedIronOre = new compressedIronOre(Material.ROCK, "compressedIronOre", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.doublecompressedIronOre = new compressedIronOre(Material.ROCK, "doublecompressedIronOre", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.triplecompressedIronOre = new compressedIronOre(Material.ROCK, "triplecompressedIronOre", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.quadruplecompressedIronOre = new compressedIronOre(Material.ROCK, "quadruplecompressedIronOre", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        
        CBlocks.compressedPodzol = new compressedPodzol(Material.ROCK, "compressedPodzol", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.GROUND);
        CBlocks.doublecompressedPodzol = new compressedPodzol(Material.ROCK, "doublecompressedPodzol", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.GROUND);
        CBlocks.triplecompressedPodzol = new compressedPodzol(Material.ROCK, "triplecompressedPodzol", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.GROUND);
        CBlocks.quadruplecompressedPodzol = new compressedPodzol(Material.ROCK, "quadruplecompressedPodzol", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.GROUND);

        CBlocks.compressedQuartzBlock = new compressedQuartzBlock(Material.ROCK, "compressedQuartzBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.doublecompressedQuartzBlock = new compressedQuartzBlock(Material.ROCK, "doublecompressedQuartzBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.triplecompressedQuartzBlock = new compressedQuartzBlock(Material.ROCK, "triplecompressedQuartzBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.quadruplecompressedQuartzBlock = new compressedQuartzBlock(Material.ROCK, "quadruplecompressedQuartzBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        
        CBlocks.compressedQuartzChiseled = new compressedQuartzChiseled(Material.ROCK, "compressedQuartzChiseled", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.doublecompressedQuartzChiseled = new compressedQuartzChiseled(Material.ROCK, "doublecompressedQuartzChiseled", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.triplecompressedQuartzChiseled = new compressedQuartzChiseled(Material.ROCK, "triplecompressedQuartzChiseled", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.quadruplecompressedQuartzChiseled = new compressedQuartzChiseled(Material.ROCK, "quadruplecompressedQuartzChiseled", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        
        CBlocks.compressedQuartzLines = new compressedQuartzLines(Material.ROCK, "compressedQuartzLines", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.doublecompressedQuartzLines = new compressedQuartzLines(Material.ROCK, "doublecompressedQuartzLines", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.triplecompressedQuartzLines = new compressedQuartzLines(Material.ROCK, "triplecompressedQuartzLines", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.quadruplecompressedQuartzLines = new compressedQuartzLines(Material.ROCK, "quadruplecompressedQuartzLines", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        
        CBlocks.compressedTNT = new compressedTNT(Material.ROCK, "compressedTNT", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.PLANT);
        CBlocks.doublecompressedTNT = new compressedTNT(Material.ROCK, "doublecompressedTNT", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.PLANT);
        CBlocks.triplecompressedTNT = new compressedTNT(Material.ROCK, "triplecompressedTNT", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.PLANT);
        CBlocks.quadruplecompressedTNT = new compressedTNT(Material.ROCK, "quadruplecompressedTNT", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.PLANT);
        
        CBlocks.compressedSoulSand = new compressedSoulSand(Material.ROCK, "compressedSoulSand", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.SAND);
        CBlocks.doublecompressedSoulSand = new compressedSoulSand(Material.ROCK, "doublecompressedSoulSand", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.SAND);
        CBlocks.triplecompressedSoulSand = new compressedSoulSand(Material.ROCK, "triplecompressedSoulSand", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.SAND);
        CBlocks.quadruplecompressedSoulSand = new compressedSoulSand(Material.ROCK, "quadruplecompressedSoulSand", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.SAND);
        
        CBlocks.compressedWoodLog = new compressedWoodLog(Material.ROCK, "compressedWoodLog", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedWoodBlocks, SoundType.WOOD);
        CBlocks.doublecompressedWoodLog = new compressedWoodLog(Material.ROCK, "doublecompressedWoodLog", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedWoodBlocks, SoundType.WOOD);
        CBlocks.triplecompressedWoodLog = new compressedWoodLog(Material.ROCK, "triplecompressedWoodLog", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedWoodBlocks, SoundType.WOOD);
        CBlocks.quadruplecompressedWoodLog = new compressedWoodLog(Material.ROCK, "quadruplecompressedWoodLog", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedWoodBlocks, SoundType.WOOD);
        
        CBlocks.compressedMelon = new compressedMelon(Material.ROCK, "compressedMelon", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.WOOD);
        CBlocks.doublecompressedMelon = new compressedMelon(Material.ROCK, "doublecompressedMelon", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.WOOD);
        CBlocks.triplecompressedMelon = new compressedMelon(Material.ROCK, "triplecompressedMelon", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.WOOD);
        CBlocks.quadruplecompressedMelon = new compressedMelon(Material.ROCK, "quadruplecompressedMelon", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.WOOD);
        
        CBlocks.compressedJackOLantern = new compressedJackOLantern(Material.ROCK, "compressedJackOLantern", Hardness, Resistance, 1.0F, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.WOOD);
        CBlocks.doublecompressedJackOLantern = new compressedJackOLantern(Material.ROCK, "doublecompressedJackOLantern", Hardness, Resistance, 1.0F, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.WOOD);
        CBlocks.triplecompressedJackOLantern = new compressedJackOLantern(Material.ROCK, "triplecompressedJackOLantern", Hardness, Resistance, 1.0F, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.WOOD);
        CBlocks.quadruplecompressedJackOLantern = new compressedJackOLantern(Material.ROCK, "quadruplecompressedJackOLantern", Hardness, Resistance, 1.0F, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.WOOD);
        
        CBlocks.compressedPumpkin = new compressedPumpkin(Material.ROCK, "compressedPumpkin", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.WOOD);
        CBlocks.doublecompressedPumpkin = new compressedPumpkin(Material.ROCK, "doublecompressedPumpkin", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.WOOD);
        CBlocks.triplecompressedPumpkin = new compressedPumpkin(Material.ROCK, "triplecompressedPumpkin", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.WOOD);
        CBlocks.quadruplecompressedPumpkin = new compressedPumpkin(Material.ROCK, "quadruplecompressedPumpkin", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.WOOD);

        CBlocks.compressedSnow = new compressedSnow(Material.ROCK, "compressedSnow", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.SNOW);
        CBlocks.doublecompressedSnow = new compressedSnow(Material.ROCK, "doublecompressedSnow", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.SNOW);
        CBlocks.triplecompressedSnow = new compressedSnow(Material.ROCK, "triplecompressedSnow", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.SNOW);
        CBlocks.quadruplecompressedSnow = new compressedSnow(Material.ROCK, "quadruplecompressedSnow", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.SNOW);
        
        CBlocks.compressedCactus = new compressedCactus(Material.ROCK, "compressedCactus", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.CLOTH);
        CBlocks.doublecompressedCactus = new compressedCactus(Material.ROCK, "doublecompressedCactus", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.CLOTH);
        CBlocks.triplecompressedCactus = new compressedCactus(Material.ROCK, "triplecompressedCactus", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.CLOTH);
        CBlocks.quadruplecompressedCactus = new compressedCactus(Material.ROCK, "quadruplecompressedCactus", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.CLOTH);
        
        CBlocks.compressedEndBricks = new compressedEndBricks(Material.ROCK, "compressedEndBricks", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.doublecompressedEndBricks = new compressedEndBricks(Material.ROCK, "doublecompressedEndBricks", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.triplecompressedEndBricks = new compressedEndBricks(Material.ROCK, "triplecompressedEndBricks", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.quadruplecompressedEndBricks = new compressedEndBricks(Material.ROCK, "quadruplecompressedEndBricks", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        
        CBlocks.compressedGrassPath = new compressedGrassPath(Material.ROCK, "compressedGrassPath", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.PLANT);
        CBlocks.doublecompressedGrassPath = new compressedGrassPath(Material.ROCK, "doublecompressedGrassPath", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.PLANT);
        CBlocks.triplecompressedGrassPath = new compressedGrassPath(Material.ROCK, "triplecompressedGrassPath", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.PLANT);
        CBlocks.quadruplecompressedGrassPath = new compressedGrassPath(Material.ROCK, "quadruplecompressedGrassPath", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.PLANT);
        
        CBlocks.compressedCoarseDirt = new compressedCoarseDirt(Material.ROCK, "compressedCoarseDirt", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.GROUND);
        CBlocks.doublecompressedCoarseDirt = new compressedCoarseDirt(Material.ROCK, "doublecompressedCoarseDirt", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.GROUND);
        CBlocks.triplecompressedCoarseDirt = new compressedCoarseDirt(Material.ROCK, "triplecompressedCoarseDirt", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.GROUND);
        CBlocks.quadruplecompressedCoarseDirt = new compressedCoarseDirt(Material.ROCK, "quadruplecompressedCoarseDirt", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.GROUND);
	
        CBlocks.compressedSeaLantern = new compressedSeaLantern(Material.ROCK, "compressedSeaLantern", Hardness, Resistance, 1, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.GLASS);
        CBlocks.doublecompressedSeaLantern = new compressedSeaLantern(Material.ROCK, "doublecompressedSeaLantern", Hardness, Resistance, 1, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.GLASS);
        CBlocks.triplecompressedSeaLantern = new compressedSeaLantern(Material.ROCK, "triplecompressedSeaLantern", Hardness, Resistance, 1, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.GLASS);
        CBlocks.quadruplecompressedSeaLantern = new compressedSeaLantern(Material.ROCK, "quadruplecompressedSeaLantern", Hardness, Resistance, 1, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.GLASS);
        
        CBlocks.compressedNetherWartBlock = new compressedNetherWartBlock(Material.ROCK, "compressedNetherWartBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.WOOD);
        CBlocks.doublecompressedNetherWartBlock = new compressedNetherWartBlock(Material.ROCK, "doublecompressedNetherWartBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.WOOD);
        CBlocks.triplecompressedNetherWartBlock = new compressedNetherWartBlock(Material.ROCK, "triplecompressedNetherWartBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.WOOD);
        CBlocks.quadruplecompressedNetherWartBlock = new compressedNetherWartBlock(Material.ROCK, "quadruplecompressedNetherWartBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.WOOD);
        
        CBlocks.compressedMagmaBlock = new compressedMagmaBlock(Material.ROCK, "compressedMagmaBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.doublecompressedMagmaBlock = new compressedMagmaBlock(Material.ROCK, "doublecompressedMagmaBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.triplecompressedMagmaBlock = new compressedMagmaBlock(Material.ROCK, "triplecompressedMagmaBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.quadruplecompressedMagmaBlock = new compressedMagmaBlock(Material.ROCK, "quadruplecompressedMagmaBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        
        CBlocks.compressedMycelium = new compressedMycelium(Material.ROCK, "compressedMycelium", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.GROUND);
        CBlocks.doublecompressedMycelium = new compressedMycelium(Material.ROCK, "doublecompressedMycelium", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.GROUND);
        CBlocks.triplecompressedMycelium = new compressedMycelium(Material.ROCK, "triplecompressedMycelium", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.GROUND);
        CBlocks.quadruplecompressedMycelium = new compressedMycelium(Material.ROCK, "quadruplecompressedMycelium", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.GROUND);
        
        CBlocks.compressedPrismarineBricks = new compressedPrismarineBricks(Material.ROCK, "compressedPrismarineBricks", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.doublecompressedPrismarineBricks = new compressedPrismarineBricks(Material.ROCK, "doublecompressedPrismarineBricks", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.triplecompressedPrismarineBricks = new compressedPrismarineBricks(Material.ROCK, "triplecompressedPrismarineBricks", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.quadruplecompressedPrismarineBricks = new compressedPrismarineBricks(Material.ROCK, "quadruplecompressedPrismarineBricks", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        
        CBlocks.compressedPrismarineDark = new compressedPrismarineDark(Material.ROCK, "compressedPrismarineDark", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.doublecompressedPrismarineDark = new compressedPrismarineDark(Material.ROCK, "doublecompressedPrismarineDark", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.triplecompressedPrismarineDark = new compressedPrismarineDark(Material.ROCK, "triplecompressedPrismarineDark", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.quadruplecompressedPrismarineDark = new compressedPrismarineDark(Material.ROCK, "quadruplecompressedPrismarineDark", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        
        CBlocks.compressedPrismarineRough = new compressedPrismarineRough(Material.ROCK, "compressedPrismarine", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.doublecompressedPrismarineRough = new compressedPrismarineRough(Material.ROCK, "doublecompressedPrismarine", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.triplecompressedPrismarineRough = new compressedPrismarineRough(Material.ROCK, "triplecompressedPrismarine", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.quadruplecompressedPrismarineRough = new compressedPrismarineRough(Material.ROCK, "quadruplecompressedPrismarine", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        
        CBlocks.compressedPurpurBlock = new compressedPurpurBlock(Material.ROCK, "compressedPurpurBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.doublecompressedPurpurBlock = new compressedPurpurBlock(Material.ROCK, "doublecompressedPurpurBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.triplecompressedPurpurBlock = new compressedPurpurBlock(Material.ROCK, "triplecompressedPurpurBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.quadruplecompressedPurpurBlock = new compressedPurpurBlock(Material.ROCK, "quadruplecompressedPurpurBlock", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        
        CBlocks.compressedPurpurPillar = new compressedPurpurPillar(Material.ROCK, "compressedPurpurPillar", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.doublecompressedPurpurPillar = new compressedPurpurPillar(Material.ROCK, "doublecompressedPurpurPillar", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.triplecompressedPurpurPillar = new compressedPurpurPillar(Material.ROCK, "triplecompressedPurpurPillar", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.quadruplecompressedPurpurPillar = new compressedPurpurPillar(Material.ROCK, "quadruplecompressedPurpurPillar", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        
        CBlocks.compressedQuartzOre = new compressedQuartzOre(Material.ROCK, "compressedQuartzOre", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.doublecompressedQuartzOre = new compressedQuartzOre(Material.ROCK, "doublecompressedQuartzOre", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.triplecompressedQuartzOre = new compressedQuartzOre(Material.ROCK, "triplecompressedQuartzOre", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.quadruplecompressedQuartzOre = new compressedQuartzOre(Material.ROCK, "quadruplecompressedQuartzOre", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        
        CBlocks.compressedSlime = new compressedSlime(Material.ROCK, false, "compressedSlime", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.SLIME);
        CBlocks.doublecompressedSlime = new compressedSlime(Material.ROCK, false, "doublecompressedSlime", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.SLIME);
        CBlocks.triplecompressedSlime = new compressedSlime(Material.ROCK, false, "triplecompressedSlime", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.SLIME);
        CBlocks.quadruplecompressedSlime = new compressedSlime(Material.ROCK, false, "quadruplecompressedSlime", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.SLIME);
        
        CBlocks.compressedRedSandstone = new compressedRedSandstone(Material.ROCK, "compressedRedSandstone", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.doublecompressedRedSandstone = new compressedRedSandstone(Material.ROCK, "doublecompressedRedSandstone", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.triplecompressedRedSandstone = new compressedRedSandstone(Material.ROCK, "triplecompressedRedSandstone", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.quadruplecompressedRedSandstone = new compressedRedSandstone(Material.ROCK, "quadruplecompressedRedSandstone", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        
        CBlocks.compressedRedSandstoneCarved = new compressedRedSandstoneCarved(Material.ROCK, "compressedRedSandstoneChiseled", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.doublecompressedRedSandstoneCarved = new compressedRedSandstoneCarved(Material.ROCK, "doublecompressedRedSandstoneChiseled", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.triplecompressedRedSandstoneCarved = new compressedRedSandstoneCarved(Material.ROCK, "triplecompressedRedSandstoneChiseled", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.quadruplecompressedRedSandstoneCarved = new compressedRedSandstoneCarved(Material.ROCK, "quadruplecompressedRedSandstoneChiseled", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        
        CBlocks.compressedRedSandstoneSmooth = new compressedRedSandstoneSmooth(Material.ROCK, "compressedRedSandstoneSmooth", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.doublecompressedRedSandstoneSmooth = new compressedRedSandstoneSmooth(Material.ROCK, "doublecompressedRedSandstoneSmooth", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.triplecompressedRedSandstoneSmooth = new compressedRedSandstoneSmooth(Material.ROCK, "triplecompressedRedSandstoneSmooth", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.quadruplecompressedRedSandstoneSmooth = new compressedRedSandstoneSmooth(Material.ROCK, "quadruplecompressedRedSandstoneSmooth", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        
        CBlocks.compressedSpongeWet = new compressedSpongeWet(Material.ROCK, "compressedSpongeWet", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.PLANT);
        CBlocks.doublecompressedSpongeWet = new compressedSpongeWet(Material.ROCK, "doublecompressedSpongeWet", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.PLANT);
        CBlocks.triplecompressedSpongeWet = new compressedSpongeWet(Material.ROCK, "triplecompressedSpongeWet", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.PLANT);
        CBlocks.quadruplecompressedSpongeWet = new compressedSpongeWet(Material.ROCK, "quadruplecompressedSpongeWet", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.PLANT);
        
        CBlocks.compressedAndersite = new compressedAndersite(Material.ROCK, "compressedAndersite", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.doublecompressedAndersite = new compressedAndersite(Material.ROCK, "doublecompressedAndersite", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.triplecompressedAndersite = new compressedAndersite(Material.ROCK, "triplecompressedAndersite", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.quadruplecompressedAndersite = new compressedAndersite(Material.ROCK, "quadruplecompressedAndersite", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        
        CBlocks.compressedAndersiteSmooth = new compressedAndersiteSmooth(Material.ROCK, "compressedAndersiteSmooth", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.doublecompressedAndersiteSmooth = new compressedAndersiteSmooth(Material.ROCK, "doublecompressedAndersiteSmooth", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.triplecompressedAndersiteSmooth = new compressedAndersiteSmooth(Material.ROCK, "triplecompressedAndersiteSmooth", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.quadruplecompressedAndersiteSmooth = new compressedAndersiteSmooth(Material.ROCK, "quadruplecompressedAndersiteSmooth", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        
        CBlocks.compressedDiorite = new compressedDiorite(Material.ROCK, "compressedDiorite", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.doublecompressedDiorite = new compressedDiorite(Material.ROCK, "doublecompressedDiorite", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.triplecompressedDiorite = new compressedDiorite(Material.ROCK, "triplecompressedDiorite", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.quadruplecompressedDiorite = new compressedDiorite(Material.ROCK, "quadruplecompressedDiorite", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        
        CBlocks.compressedDioriteSmooth = new compressedDioriteSmooth(Material.ROCK, "compressedDioriteSmooth", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.doublecompressedDioriteSmooth = new compressedDioriteSmooth(Material.ROCK, "doublecompressedDioriteSmooth", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.triplecompressedDioriteSmooth = new compressedDioriteSmooth(Material.ROCK, "triplecompressedDioriteSmooth", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.quadruplecompressedDioriteSmooth = new compressedDioriteSmooth(Material.ROCK, "quadruplecompressedDioriteSmooth", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        
        CBlocks.compressedGranite = new compressedGranite(Material.ROCK, "compressedGranite", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.doublecompressedGranite = new compressedGranite(Material.ROCK, "doublecompressedGranite", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.triplecompressedGranite = new compressedGranite(Material.ROCK, "triplecompressedGranite", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.quadruplecompressedGranite = new compressedGranite(Material.ROCK, "quadruplecompressedGranite", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        
        CBlocks.compressedGraniteSmooth = new compressedGraniteSmooth(Material.ROCK, "compressedGraniteSmooth", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.doublecompressedGraniteSmooth = new compressedGraniteSmooth(Material.ROCK, "doublecompressedGraniteSmooth", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.triplecompressedGraniteSmooth = new compressedGraniteSmooth(Material.ROCK, "triplecompressedGraniteSmooth", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
        CBlocks.quadruplecompressedGraniteSmooth = new compressedGraniteSmooth(Material.ROCK, "quadruplecompressedGraniteSmooth", Hardness, Resistance, 0, Tool, ToolLevel, CreativeTabCreator.tabcompressedBlocks, SoundType.STONE);
	}

}
