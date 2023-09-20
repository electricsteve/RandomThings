package electricsteve.randomthings;

import com.google.common.base.Suppliers;
import dev.architectury.registry.registries.Registrar;
import dev.architectury.registry.registries.RegistrarManager;
import dev.architectury.registry.registries.RegistrySupplier;
import electricsteve.randomthings.Items.Bazooka;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import java.util.function.Supplier;

public class RandomThings {
    public static final String MOD_ID = "randomthings";
    public static final Supplier<RegistrarManager> MANAGER = Suppliers.memoize(() -> RegistrarManager.get(MOD_ID));
    public static final Registrar<Item> items = MANAGER.get().get(Registries.ITEM);
    public static final RegistrySupplier<Item> bazooka = items.register(new Identifier(MOD_ID, "bazooka"), () -> new Bazooka(new Item.Settings().maxDamage(256)));


    public static void init() {

    }
}
