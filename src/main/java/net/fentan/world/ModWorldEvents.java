package net.fentan.world;

import net.fentan.minitoolsmod.MiniToolsMod;
import net.fentan.world.gen.ModOreGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MiniToolsMod.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);

        // ModTreeGeneration.generateTrees(event);
        // ModFlowerGeneration.generateFlowers(event);
    }
}
