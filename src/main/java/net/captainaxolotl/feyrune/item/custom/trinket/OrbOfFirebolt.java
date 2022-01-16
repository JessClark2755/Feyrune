package net.captainaxolotl.feyrune.item.custom.trinket;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.SmallFireballEntity;
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

public class OrbOfFirebolt extends Item
{

    public OrbOfFirebolt(Settings settings) {
        super(settings);
    }

    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack stack, World world, List<Text> list, TooltipContext context) {
        list.add(new LiteralText("Fires a firebolt").formatted(Formatting.AQUA));
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        int cooldown = 120;
        world.playSound(null, user.getX(), user.getY(), user.getZ(),
                SoundEvents.ENTITY_BLAZE_SHOOT, SoundCategory.HOSTILE, 1f, 0.4f / (world.getRandom().nextFloat() * 0.4f + 0.8f));
        user.getItemCooldownManager().set(this, cooldown);
        if (!world.isClient) {
            SmallFireballEntity smallFireballEntity = new SmallFireballEntity(world, user.getX(), user.getY() + 1f, user.getZ(), 0, 0, 0);
            smallFireballEntity.setItem(itemStack);
            smallFireballEntity.setVelocity(user, user.getPitch() -10f, user.getYaw(), 0.0f, 3f, 2.0f);
            world.spawnEntity(smallFireballEntity);
            user.incrementStat(Stats.USED.getOrCreateStat(this));

            timerMethod(smallFireballEntity);
        }
        return TypedActionResult.success(itemStack, world.isClient());

    }
    private void timerMethod(SmallFireballEntity smallFireballEntity)
    {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                smallFireballEntity.discard();
            }
        }, 1200);
    }
}
