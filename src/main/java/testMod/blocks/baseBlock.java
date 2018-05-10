package testMod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import testMod.testMod;

public class baseBlock extends Block {
    public baseBlock(Material blockMaterialIn, String name) {
        super(blockMaterialIn);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(testMod.testModCTab);
        setHardness(3.0F);
        setResistance(5.0F);
        setLightLevel(15);
        setHarvestLevel("pickaxe", 2);
    }
}
