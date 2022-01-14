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
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

import static net.minecraft.entity.effect.StatusEffects.*;

public class CloakOfTheDolphin extends TrinketItem
{
    public CloakOfTheDolphin(Settings settings) {
        super(settings);
    }

    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack stack, World world, List<Text> list, TooltipContext context)
    {
        list.add(new LiteralText("Swim like a dolphin").formatted(Formatting.GREEN));
    }

    @Override
    public void onEquip(ItemStack stack, SlotReference slot, LivingEntity entity)
    {
        super.onEquip(stack, slot, entity);
        entity.addStatusEffect(new StatusEffectInstance(WATER_BREATHING, 999999, 0, true, false, false));
    }

    @Override
    public void onUnequip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        super.onUnequip(stack, slot, entity);
        entity.removeStatusEffect(WATER_BREATHING);
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity)
    {
        super.tick(stack, slot, entity);
        if (entity.isInSwimmingPose())
        {
            entity.addStatusEffect(new StatusEffectInstance(DOLPHINS_GRACE, 999999, 0, true, false, false));
        } else
        {
            entity.removeStatusEffect(DOLPHINS_GRACE);
        }
    }
}