package net.fentan.minitoolsmod.item;

import net.fentan.minitoolsmod.MiniToolsMod;
import net.minecraft.world.entity.EquipmentSlot;
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

    //Tools
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

    //Armor
    public static final RegistryObject<Item> PERIDOT_HELMET = ITEMS.register("peridot_helmet",
            () -> new ArmorItem( ModArmorMaterials.PERIDOT, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.MOD_TOOLS)));
    public static final RegistryObject<Item> PERIDOT_CHESTPLATE = ITEMS.register("peridot_chestplate",
            () -> new ArmorItem( ModArmorMaterials.PERIDOT, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.MOD_TOOLS)));
    public static final RegistryObject<Item> PERIDOT_LEGGINGS = ITEMS.register("peridot_leggings",
            () -> new ArmorItem( ModArmorMaterials.PERIDOT, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.MOD_TOOLS)));
    public static final RegistryObject<Item> PERIDOT_BOOTS = ITEMS.register("peridot_boots",
            () -> new ArmorItem( ModArmorMaterials.PERIDOT, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.MOD_TOOLS)));

    public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet",
            () -> new ArmorItem( ModArmorMaterials.RUBY, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.MOD_TOOLS)));
    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",
            () -> new ArmorItem( ModArmorMaterials.RUBY, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.MOD_TOOLS)));
    public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings",
            () -> new ArmorItem( ModArmorMaterials.RUBY, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.MOD_TOOLS)));
    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots",
            () -> new ArmorItem( ModArmorMaterials.RUBY, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.MOD_TOOLS)));

    public static final RegistryObject<Item> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet",
            () -> new ArmorItem( ModArmorMaterials.SAPPHIRE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.MOD_TOOLS)));
    public static final RegistryObject<Item> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate",
            () -> new ArmorItem( ModArmorMaterials.SAPPHIRE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.MOD_TOOLS)));
    public static final RegistryObject<Item> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings",
            () -> new ArmorItem( ModArmorMaterials.SAPPHIRE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.MOD_TOOLS)));
    public static final RegistryObject<Item> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots",
            () -> new ArmorItem( ModArmorMaterials.SAPPHIRE, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.MOD_TOOLS)));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
