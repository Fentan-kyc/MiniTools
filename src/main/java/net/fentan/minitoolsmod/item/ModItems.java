package net.fentan.minitoolsmod.item;

import net.fentan.minitoolsmod.MiniToolsMod;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MiniToolsMod.MOD_ID);

    public static final RegistryObject<Item> PERIDOT = ITEMS.register("peridot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOD_TOOLS)));
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOD_TOOLS)));
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOD_TOOLS)));

    public static final RegistryObject<Item> PERIDOT_SWORD = ITEMS.register("peridot_sword",
            () -> new SwordItem(ModTiers.PERIDOT, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.MOD_TOOLS)));
    public static final RegistryObject<Item> PERIDOT_PICKAXE = ITEMS.register("peridot_pickaxe",
            () -> new PickaxeItem(ModTiers.PERIDOT, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.MOD_TOOLS)));
    public static final RegistryObject<Item> PERIDOT_SHOVEL = ITEMS.register("peridot_shovel",
            () -> new ShovelItem(ModTiers.PERIDOT, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.MOD_TOOLS)));
    public static final RegistryObject<Item> PERIDOT_AXE = ITEMS.register("peridot_axe",
            () -> new AxeItem(ModTiers.PERIDOT, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.MOD_TOOLS)));
    public static final RegistryObject<Item> PERIDOT_HOE = ITEMS.register("peridot_hoe",
            () -> new HoeItem(ModTiers.PERIDOT, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.MOD_TOOLS)));

    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(ModTiers.RUBY, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.MOD_TOOLS)));
    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(ModTiers.RUBY, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.MOD_TOOLS)));
    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ShovelItem(ModTiers.RUBY, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.MOD_TOOLS)));
    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new AxeItem(ModTiers.RUBY, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.MOD_TOOLS)));
    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe",
            () -> new HoeItem(ModTiers.RUBY, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.MOD_TOOLS)));

    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword",
            () -> new SwordItem(ModTiers.SAPPHIRE, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.MOD_TOOLS)));
    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",
            () -> new PickaxeItem(ModTiers.SAPPHIRE, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.MOD_TOOLS)));
    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel",
            () -> new ShovelItem(ModTiers.SAPPHIRE, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.MOD_TOOLS)));
    public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe",
            () -> new AxeItem(ModTiers.SAPPHIRE, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.MOD_TOOLS)));
    public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe",
            () -> new HoeItem(ModTiers.SAPPHIRE, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.MOD_TOOLS)));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
