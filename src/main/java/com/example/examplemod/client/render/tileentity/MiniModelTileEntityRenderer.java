package com.example.examplemod.client.render.tileentity;

import com.example.examplemod.client.render.MiniModel;
import com.example.examplemod.tileentity.MiniModelTileEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.WorldVertexBufferUploader;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import org.lwjgl.opengl.GL11;

import java.nio.ByteBuffer;

public class MiniModelTileEntityRenderer extends TileEntityRenderer<MiniModelTileEntity> {

    public MiniModelTileEntityRenderer(final TileEntityRendererDispatcher tileEntityRendererDispatcher) {
        super(tileEntityRendererDispatcher);
    }

    @Override
    public void func_225616_a_(final MiniModelTileEntity tileEntityIn, final float partialTricks, final MatrixStack matrixStack, final IRenderTypeBuffer renderTypeBuffer, final int packedLight, final int backupPackedLight) {

        final MiniModel miniModel = tileEntityIn.miniModel;

        if (miniModel == null)
            return;

        if (!miniModel.isBuilt())
            miniModel.rebuild();

        RenderHelper.disableStandardItemLighting();

        RenderSystem.blendFunc(GL11.GL_ONE, GL11.GL_ONE);
        RenderSystem.enableBlend();

        if (Minecraft.isAmbientOcclusionEnabled()) {
            RenderSystem.shadeModel(GL11.GL_SMOOTH);
        } else {
            RenderSystem.shadeModel(GL11.GL_FLAT);
        }
    }

    @Override
    public boolean isGlobalRenderer(final MiniModelTileEntity te) {
        return true;
    }

    private void drawBufferWithoutResetting(final BufferBuilder bufferBuilder) {

        final ByteBuffer byteBuffer = bufferBuilder.func_227832_f_().getSecond();
        bufferBuilder.putBulkData(byteBuffer);
        WorldVertexBufferUploader.draw(bufferBuilder);
        bufferBuilder.putBulkData(byteBuffer);
    }
}
