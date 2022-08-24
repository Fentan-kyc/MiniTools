package net.fentan.minitoolsmod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier PERIDOT = new ForgeTier(3, 1561,
            10.0F, 5.0F, 10,
            BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.PERIDOT.get()));//0 - wood, 1 - stone

    public static final ForgeTier RUBY = new ForgeTier(3, 1561,
            10.0F, 5.0F, 10,
            BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.PERIDOT.get()));//0 - wood, 1 - stone

    public static final ForgeTier SAPPHIRE = new ForgeTier(3, 1561,
            10.0F, 5.0F, 10,
            BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.PERIDOT.get()));//0 - wood, 1 - stone
}

