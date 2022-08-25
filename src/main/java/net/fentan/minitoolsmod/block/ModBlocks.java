package net.fentan.minitoolsmod.block;

import net.fentan.minitoolsmod.MiniToolsMod;
import net.fentan.minitoolsmod.block.custom.ModRotatedPillarBlock;
import net.fentan.minitoolsmod.item.ModCreativeModeTab;
import net.fentan.minitoolsmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
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

    public static final RegistryObject<Block> PERIDOT_ORE =
            registerBlock("peridot_ore",
                    () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                            .strength(4f).requiresCorrectToolForDrops()),
                    ModCreativeModeTab.MOD_TOOLS);

    public static final RegistryObject<Block> DEEPSLATE_PERIDOT_ORE =
            registerBlock("deepslate_peridot_ore",
                    () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                            .strength(4f).requiresCorrectToolForDrops()),
                    ModCreativeModeTab.MOD_TOOLS);

    public static final RegistryObject<Block> RUBY_ORE =
            registerBlock("ruby_ore",
                    () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                            .strength(4f).requiresCorrectToolForDrops()),
                    ModCreativeModeTab.MOD_TOOLS);

    public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE =
            registerBlock("deepslate_ruby_ore",
                    () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                            .strength(4f).requiresCorrectToolForDrops()),
                    ModCreativeModeTab.MOD_TOOLS);

    public static final RegistryObject<Block> SAPPHIRE_ORE =
            registerBlock("sapphire_ore",
                    () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                            .strength(4f).requiresCorrectToolForDrops()),
                    ModCreativeModeTab.MOD_TOOLS);

    public static final RegistryObject<Block> DEEPSLATE_SAPPHIRE_ORE =
            registerBlock("deepslate_sapphire_ore",
                    () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                            .strength(4f).requiresCorrectToolForDrops()),
                    ModCreativeModeTab.MOD_TOOLS);

    //Trees
    public static final RegistryObject<Block> PERIDOT_LOG =
            registerBlock("peridot_log",
                    () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)),
                    ModCreativeModeTab.MOD_TOOLS);

    public static final RegistryObject<Block> STRIPPED_PERIDOT_LOG =
            registerBlock("stripped_peridot_log",
                    () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)),
                    ModCreativeModeTab.MOD_TOOLS);

    public static final RegistryObject<Block> PERIDOT_WOOD =
            registerBlock("peridot_wood",
                    () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)),
                    ModCreativeModeTab.MOD_TOOLS);

    public static final RegistryObject<Block> STRIPPED_PERIDOT_WOOD =
            registerBlock("stripped_peridot_wood",
                    () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)),
                    ModCreativeModeTab.MOD_TOOLS);

    public static final RegistryObject<Block> PERIDOT_PLANKS =
            registerBlock("peridot_planks",
                    () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)),
                    ModCreativeModeTab.MOD_TOOLS);


    public static final RegistryObject<Block> RUBY_LOG =
            registerBlock("ruby_log",
                    () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)),
                    ModCreativeModeTab.MOD_TOOLS);

    public static final RegistryObject<Block> STRIPPED_RUBY_LOG =
            registerBlock("stripped_ruby_log",
                    () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)),
                    ModCreativeModeTab.MOD_TOOLS);

    public static final RegistryObject<Block> RUBY_WOOD =
            registerBlock("ruby_wood",
                    () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)),
                    ModCreativeModeTab.MOD_TOOLS);

    public static final RegistryObject<Block> STRIPPED_RUBY_WOOD =
            registerBlock("stripped_ruby_wood",
                    () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)),
                    ModCreativeModeTab.MOD_TOOLS);

    public static final RegistryObject<Block> RUBY_PLANKS =
            registerBlock("ruby_planks",
                    () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)),
                    ModCreativeModeTab.MOD_TOOLS);


    public static final RegistryObject<Block> SAPPHIRE_LOG =
            registerBlock("sapphire_log",
                    () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)),
                    ModCreativeModeTab.MOD_TOOLS);

    public static final RegistryObject<Block> STRIPPED_SAPPHIRE_LOG =
            registerBlock("stripped_sapphire_log",
                    () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)),
                    ModCreativeModeTab.MOD_TOOLS);

    public static final RegistryObject<Block> SAPPHIRE_WOOD =
            registerBlock("sapphire_wood",
                    () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)),
                    ModCreativeModeTab.MOD_TOOLS);

    public static final RegistryObject<Block> STRIPPED_SAPPHIRE_WOOD =
            registerBlock("stripped_sapphire_wood",
                    () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)),
                    ModCreativeModeTab.MOD_TOOLS);

    public static final RegistryObject<Block> SAPPHIRE_PLANKS =
            registerBlock("sapphire_planks",
                    () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)),
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
