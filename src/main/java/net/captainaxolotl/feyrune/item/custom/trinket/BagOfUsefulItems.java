package net.captainaxolotl.feyrune.item.custom.trinket;


import dev.emi.trinkets.api.TrinketItem;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.sound.SoundCategory;
import net.minecraft.stat.Stats;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

import static net.minecraft.sound.SoundEvents.*;

public class BagOfUsefulItems extends TrinketItem
{


    public BagOfUsefulItems(Settings settings) {
        super(settings);
    }

    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack stack, World world, List<Text> list, TooltipContext context) {
        list.add(new LiteralText("What's in here?").formatted(Formatting.GREEN));
    }


    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand)
    {

        Random random = new Random();
        int value = random.nextInt(0,10);
        int cooldown = 600;

        String itemName = switch (value) {
            case 0 -> "feyrune:iron_dagger";
            case 1 -> "minecraft:lantern";
            case 2 -> "minecraft:bow";
            case 3 -> "minecraft:name_tag";
            case 4 -> "minecraft:gold_ingot";
            case 5 -> "minecraft:bread";
            case 6 -> "minecraft:saddle";
            case 7 -> "minecraft:oak_boat";
            case 8 -> "minecraft:water_bucket";
            case 9 -> "minecraft:apple";
            default -> "minecraft:apple";
        };

        ItemStack itemStack = user.getStackInHand(hand);
        world.playSound((PlayerEntity) null, user.getX(), user.getY(), user.getZ(),
                BLOCK_AMETHYST_BLOCK_CHIME, SoundCategory.NEUTRAL, 1F,
                1F / (world.getRandom().nextFloat() * 0.4F + 0.8F));

        user.getItemCooldownManager().set(this, cooldown);
        user.incrementStat(Stats.USED.getOrCreateStat(this));
        if (!world.isClient) {
            ServerCommandSource commandSource = user.getCommandSource();
            String name = user.getDisplayName().getString();

            CommandManager manager = new CommandManager(CommandManager.RegistrationEnvironment.ALL);

            manager.execute(commandSource, "/give " + name + " " + itemName);

            return super.use(world, user, hand);
        }

        if (!user.getAbilities().creativeMode) {;
        }
        return TypedActionResult.success(itemStack, world.isClient());
    }
}