package net.captainaxolotl.feyrune.item.custom.trinket;


import dev.emi.trinkets.api.TrinketItem;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

import static net.captainaxolotl.feyrune.item.ModItems.IRON_DAGGER;
import static net.minecraft.item.Items.*;

//BROKEN

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

        Item item;

        switch (value)
        {
            case 0: item = IRON_DAGGER;
                break;
            case 1: item = LANTERN;
                break;
            case 2: item = STICK;
                break;
            case 3: item = LADDER;
                break;
            case 4: item = GOLD_NUGGET;
                break;
            case 5: item = IRON_DOOR;
                break;
            case 6: item = SADDLE;
                break;
            case 7: item = OAK_BOAT;
                break;
            case 8: item = GLASS_PANE;
                break;
            case 9: item = APPLE;
                break;
            default: item = OAK_SAPLING;
        }

        ServerCommandSource commandSource = user.getCommandSource();
        String name = user.getDisplayName().getString();

        CommandManager manager = new CommandManager(CommandManager.RegistrationEnvironment.ALL);

        manager.execute(commandSource, "/give " + name + " minecraft:apple");

        return super.use(world, user, hand);
    }
}