package com.example.examplemod.init;

import com.example.examplemod.ModUtil;
import com.example.examplemod.Reference;
import com.example.examplemod.tileentity.MiniModelTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(Reference.MODID)
public final class ModTileEntityTypes {

    public static final TileEntityType<MiniModelTileEntity> MINI_MODEL = ModUtil._null();
}
