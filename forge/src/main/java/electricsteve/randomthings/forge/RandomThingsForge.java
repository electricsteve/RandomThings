package electricsteve.randomthings.forge;

import dev.architectury.platform.forge.EventBuses;
import electricsteve.randomthings.RandomThings;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(RandomThings.MOD_ID)
public class RandomThingsForge {
    public RandomThingsForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(RandomThings.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        RandomThings.init();
    }
}