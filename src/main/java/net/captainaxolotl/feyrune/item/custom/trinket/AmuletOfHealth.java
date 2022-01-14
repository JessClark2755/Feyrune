package net.captainaxolotl.feyrune.item.custom.trinket;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

import static net.minecraft.entity.effect.StatusEffects.*;

public class AmuletOfHealth extends TrinketItem
{
    public AmuletOfHealth(Settings settings) {
        super(settings);
    }

    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack stack, World world, List<Text> list, TooltipContext context) {
        list.add(new LiteralText("More health").formatted(Formatting.AQUA));
    }

    @Override
    public void onEquip(ItemStack stack, SlotReference slot, LivingEntity entity)
    {
        super.onEquip(stack, slot, entity);
        entity.addStatusEffect(new StatusEffectInstance(HEALTH_BOOST, 999999, 0, true, false, false));
    }

    @Override
    public void onUnequip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        super.onUnequip(stack, slot, entity);
        entity.removeStatusEffect(HEALTH_BOOST);
    }
}
