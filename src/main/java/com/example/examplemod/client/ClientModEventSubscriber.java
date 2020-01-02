package com.example.examplemod.client;


import com.example.examplemod.Reference;
import com.example.examplemod.client.render.tileentity.MiniModelTileEntityRenderer;
import com.example.examplemod.init.ModTileEntityTypes;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Reference.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEventSubscriber {

    @SubscribeEvent
    public static void onFMLClientSetupEvent(final FMLClientSetupEvent event) {

        ClientRegistry.bindTileEntityRenderer(ModTileEntityTypes.MINI_MODEL, new MiniModelTileEntityRenderer(TileEntityRendererDispatcher.instance));
    }
}
