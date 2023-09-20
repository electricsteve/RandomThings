package electricsteve.randomthings.fabric;

import electricsteve.randomthings.RandomThings;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;

public class RandomThingsFabric implements ModInitializer {
    MinecraftClient mc = MinecraftClient.getInstance();
    @Override
    public void onInitialize() {
        RandomThings.init();
    }
}