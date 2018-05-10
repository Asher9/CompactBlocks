package testMod.util;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import testMod.testMod;

public class testModTab extends CreativeTabs {

    public testModTab() {
        super("testModTab");
    }

    @Override
    public ItemStack getIconItemStack() {
        return new ItemStack(testMod.compressedPickaxe);
    }

    @Override
    public Item getTabIconItem() {
        return new Item();
    }
}
