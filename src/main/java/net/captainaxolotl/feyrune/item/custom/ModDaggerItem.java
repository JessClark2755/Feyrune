package net.captainaxolotl.feyrune.item.custom;

import net.minecraft.block.Material;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class ModDaggerItem extends SwordItem
{
    public ModDaggerItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
}
