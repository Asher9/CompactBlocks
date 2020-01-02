package com.example.examplemod.init;

import com.example.examplemod.Reference;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import java.util.function.Supplier;

public class ModItemGroups {

    public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup(Reference.MODID, () -> new ItemStack(ModItems.EXAMPLE_ITEM));

    public static class ModItemGroup extends ItemGroup {
        private final Supplier<ItemStack> iconSupplier;
        public ModItemGroup(final String name, final Supplier<ItemStack> iconSupplier) {
            super(name);
            this.iconSupplier = iconSupplier;
        }

        @Override
        public ItemStack createIcon() {
            return iconSupplier.get();
        }
    }

}
