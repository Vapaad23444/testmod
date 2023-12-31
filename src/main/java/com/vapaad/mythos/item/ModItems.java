package com.vapaad.mythos.item;

import com.vapaad.mythos.Mythos;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Mythos.MODID);

    public static final RegistryObject<Item> CELESTIAL_BRONZE = ITEMS.register("celestial_bronze",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MYTHOS_RESORCES_TAB)));
    public static final RegistryObject<Item> RAW_CELESTIAL_BRONZE = ITEMS.register("raw_celestial_bronze",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MYTHOS_RESORCES_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
