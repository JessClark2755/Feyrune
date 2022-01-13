package net.captainaxolotl.feyrune.item.custom.trinket;

import dev.emi.trinkets.TrinketSlot;
import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;
import java.util.UUID;

import com.google.common.collect.Multimap;

import static net.minecraft.entity.EquipmentSlot.HEAD;
import static net.minecraft.entity.effect.StatusEffects.NIGHT_VISION;

public class GogglesOfNight extends TrinketItem
{
    public GogglesOfNight(Settings settings)
    {
        super(settings);
    }

    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack stack, World world, List<Text> list, TooltipContext context) {
        list.add(new LiteralText("See in the dark").formatted(Formatting.GREEN));
    }

    @Override
    public void onEquip(ItemStack stack, SlotReference slot, LivingEntity entity)
    {
        super.onEquip(stack, slot, entity);
        //Check if we have the trinket equipped, a janky way of doing it but I'm dumb
        if (!entity.hasStatusEffect(NIGHT_VISION))
        {
            entity.playSound(SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 1f, 1f);
        }
        entity.addStatusEffect(new StatusEffectInstance(NIGHT_VISION, 999999, 0, true, false, false));
    }

    @Override
    public void onUnequip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        super.onUnequip(stack, slot, entity);
        entity.removeStatusEffect(NIGHT_VISION);
    }
}
