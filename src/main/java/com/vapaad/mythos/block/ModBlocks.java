package com.vapaad.mythos.block;

import com.vapaad.mythos.Mythos;
import com.vapaad.mythos.item.ModCreativeModeTab;
import com.vapaad.mythos.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    private static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Mythos.MODID);

    public static final RegistryObject<Block> CELESTIAL_BRONZE_BLOCK = registryBlock(
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()));


    private static <T extends Block> RegistryObject<T> registryBlock(Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register("celestial_bronze_block", block);
        registerBlockItem(toReturn);
               return toReturn;
    }


    private static <T extends Block> void registerBlockItem(RegistryObject<T> block) {
        ModItems.ITEMS.register("celestial_bronze_block", () -> new BlockItem(block.get(), new Item.Properties().tab(ModCreativeModeTab.MYTHOS_BLOCKS_TAB)));
    }



    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
