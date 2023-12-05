package com.vapaad.mythos.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ModCreativeModeTab {
    public static final CreativeModeTab MYTHOS_RESORCES_TAB = new CreativeModeTab("mythos_items") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ModItems.CELESTIAL_BRONZE.get());
        }
    };
}
