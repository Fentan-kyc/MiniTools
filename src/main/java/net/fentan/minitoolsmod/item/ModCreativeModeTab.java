package net.fentan.minitoolsmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public  static  final CreativeModeTab MOD_TOOLS = new CreativeModeTab("modtools") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.PERIDOT.get());
        }
    };
}
