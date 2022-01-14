package net.captainaxolotl.feyrune.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import java.util.Random;

public class MaceOfSmiting extends SwordItem
{
    public MaceOfSmiting(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        Random random = new Random();
        if (random.nextFloat() <= 0.05f)
        {
            target.damage(DamageSource.MAGIC, 6f);
            if (target.getName().getString().equals("Iron Golem"))
            {
                target.damage(DamageSource.MAGIC, 6f);
                target.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 100, 3));

            }
        }
        return super.postHit(stack, target, attacker);
    }
}
