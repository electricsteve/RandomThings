package electricsteve.randomthings.Items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FireballEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class Bazooka extends Item {
    public Bazooka(Item.Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        Vec3d Velocity = user.getRotationVec(1.0F);
        double y = user.getEyeY() - 0.5;
        if (world instanceof ServerWorld) {
            FireballEntity FireBall = new  FireballEntity(world, user, Velocity.getX(), Velocity.getY(), Velocity.getZ(), 10);
            FireBall.teleport(user.getX(), y, user.getZ());
            world.spawnEntity(FireBall);
        }

        return super.use(world, user, hand);
    }
}
