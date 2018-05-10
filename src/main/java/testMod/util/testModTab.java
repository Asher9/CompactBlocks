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
    public ItemStack getTabIconItem() {
        return new ItemStack(testMod.compressedCobblestonePickaxe);
    }
}
