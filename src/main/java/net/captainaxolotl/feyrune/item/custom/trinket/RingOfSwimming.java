package net.captainaxolotl.feyrune.item.custom.trinket;

import com.google.common.collect.Multimap;
import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;
import java.util.UUID;

import static net.minecraft.entity.effect.StatusEffects.DOLPHINS_GRACE;
import static net.minecraft.entity.effect.StatusEffects.WATER_BREATHING;

public class RingOfSwimming extends TrinketItem
{
    public RingOfSwimming(Settings settings) {
        super(settings);
    }

    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack stack, World world, List<Text> list, TooltipContext context) {
        list.add(new LiteralText("Swim faster").formatted(Formatting.GREEN));
    }

    @Override
    public void onEquip(ItemStack stack, SlotReference slot, LivingEntity entity)
    {
        super.onEquip(stack, slot, entity);
    }

    @Override
    public void onUnequip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        super.onUnequip(stack, slot, entity);
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
