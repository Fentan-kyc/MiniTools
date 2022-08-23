package net.fentan.minitoolsmod.block;

import net.fentan.minitoolsmod.MiniToolsMod;
import net.fentan.minitoolsmod.item.ModCreativeModeTab;
import net.fentan.minitoolsmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
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
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MiniToolsMod.MOD_ID);


    public static final RegistryObject<Block> PERIDOT_BLOCK =
            registerBlock("peridot_block",
                    () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                            .strength(4f).requiresCorrectToolForDrops()),
                    ModCreativeModeTab.MOD_TOOLS);

    public static final RegistryObject<Block> RUBY_BLOCK =
            registerBlock("ruby_block",
                    () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                            .strength(4f).requiresCorrectToolForDrops()),
                    ModCreativeModeTab.MOD_TOOLS);

    public static final RegistryObject<Block> SAPPHIRE_BLOCK =
            registerBlock("sapphire_block",
                    () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                            .strength(4f).requiresCorrectToolForDrops()),
                    ModCreativeModeTab.MOD_TOOLS);




    private static <T extends Block> RegistryObject<T>
    registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    };

    private static <T extends Block> RegistryObject<Item> //добавляем предмет для блока
    registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    };

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
