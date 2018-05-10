package testMod.items;

import net.minecraft.item.Item;
import testMod.testMod;

public class ItemBase extends Item {

    public ItemBase(String unlocalizedName) {
        setCreativeTab(testMod.testModCTab);
        setMaxStackSize(1);
        setUnlocalizedName(unlocalizedName);
        setRegistryName(unlocalizedName);
    }
}
