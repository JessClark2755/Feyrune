package net.captainaxolotl.feyrune.item.custom.trinket;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

import static net.minecraft.entity.effect.StatusEffects.*;

public class GauntletsOfGolemPower extends TrinketItem
{
    public GauntletsOfGolemPower(Settings settings) {
        super(settings);
    }

    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack stack, World world, List<Text> list, TooltipContext context) {
        list.add(new LiteralText("Become stronger").formatted(Formatting.GREEN));
    }

    public void onEquip(ItemStack stack, SlotReference slot, LivingEntity entity)
    {
        super.onEquip(stack, slot, entity);
        entity.addStatusEffect(new StatusEffectInstance(STRENGTH, 999999, 0, true, false, false));
    }

    public void onUnequip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        super.onUnequip(stack, slot, entity);
        entity.removeStatusEffect(STRENGTH);
    }
}
