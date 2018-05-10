package testMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import testMod.blocks.baseBlock;
import testMod.items.ItemBase;
import testMod.proxies.CommonProxy;
import testMod.util.testModTab;

@Mod(modid = testMod.MODID, name = testMod.MODNAME, version = testMod.VERSION)

public class testMod {

    public static final String MODID = "testmod";
    public static final String MODNAME = "Test Mod";
    public static final String VERSION = "v0.1_1.12.2";

    public static CreativeTabs testModCTab = new testModTab();

    public static final Item compressedCobblestonePickaxe = new ItemBase("compressedCobblestonePickaxe");
    public static final Block compressedSand = new baseBlock(Material.IRON, "compressedSand");

    @SidedProxy(clientSide = "testMod.proxies.ClientProxy", serverSide = "testMod.proxies.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ForgeRegistries.ITEMS.register(compressedCobblestonePickaxe);
        ForgeRegistries.BLOCKS.register(compressedSand);
        ForgeRegistries.ITEMS.register(new ItemBlock(compressedSand).setRegistryName(compressedSand.getRegistryName()));
        proxy.registerRenderers();

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
