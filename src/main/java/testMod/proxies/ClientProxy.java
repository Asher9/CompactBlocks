package testMod.proxies;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import testMod.testMod;

public class ClientProxy extends CommonProxy{

    @Override
    public void registerRenderers() {
        ModelLoader.setCustomModelResourceLocation(testMod.compressedCobblestonePickaxe, 0, new ModelResourceLocation(new ResourceLocation("testmod:compressedCobblestonePickaxe"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(testMod.compressedSand), 0, new ModelResourceLocation(new ResourceLocation("testmod:compressedSand"),"inventory"));
    }
}
