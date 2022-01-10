package net.captainaxolotl.feyrune.item;

import net.captainaxolotl.feyrune.FeyruneMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroups
{
    public static final ItemGroup ADAMANTINE = FabricItemGroupBuilder.build(new Identifier(FeyruneMod.MOD_ID, "adamantine"),
            () -> new ItemStack(ModItems.ADAMANTINE_INGOT));
}
