package net.captainaxolotl.feyrune.item.custom.trinket;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FireballEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class OrbOftheCreeper extends Item
{

    public OrbOftheCreeper(Settings settings) {
        super(settings);
    }

    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack stack, World world, List<Text> list, TooltipContext context) {
        list.add(new LiteralText("Use at your own risk").formatted(Formatting.LIGHT_PURPLE));
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        int cooldown = 120;
        world.playSound(null, user.getX(), user.getY(), user.getZ(),
                SoundEvents.ENTITY_CREEPER_PRIMED, SoundCategory.HOSTILE, 1f, 0.4f / (world.getRandom().nextFloat() * 0.4f + 0.8f));
        user.getItemCooldownManager().set(this, cooldown);
        detonate(world, itemStack, user);
        user.incrementStat(Stats.USED.getOrCreateStat(this));
        return TypedActionResult.success(itemStack, world.isClient());

    }
    private void projectileDelete(FireballEntity fireballEntity)
    {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                fireballEntity.discard();
            }
        }, 1200);
    }

    private void detonate(World world, ItemStack itemStack, PlayerEntity user)
    {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (!world.isClient) {
                    FireballEntity fireballEntity = new FireballEntity(world, user, 0, 0, 0, 3);
                    fireballEntity.setItem(itemStack);
                    fireballEntity.setVelocity(user, 90, 0, 0.0f, 5, 0);
                    world.spawnEntity(fireballEntity);
                    projectileDelete(fireballEntity);
                }
            }
        }, 2000);



    }
}
