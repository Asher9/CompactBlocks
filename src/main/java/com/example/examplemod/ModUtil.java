package com.example.examplemod;

import net.minecraft.util.Direction;
import net.minecraftforge.energy.EnergyStorage;

import javax.annotation.Nonnull;

public final class ModUtil {

    public static final Direction[] DIRECTIONS = Direction.values();

    @Nonnull
    @SuppressWarnings("ConstantConditions")
    public static <T> T _null() {
        return null;
    }

    public static int calcRedstoneFromEnergyStorage(final EnergyStorage energy) {
        if (energy == null)
            return 0;
        return Math.round(energy.getEnergyStored() / ((float) energy.getMaxEnergyStored()) * 15F);
    }
}
