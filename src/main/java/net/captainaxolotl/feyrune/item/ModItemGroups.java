package net.captainaxolotl.feyrune.item;

import net.captainaxolotl.feyrune.FeyruneMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroups
{
    //public static final ItemGroup ADAMANTINE = FabricItemGroupBuilder.build(new Identifier(FeyruneMod.MOD_ID, "adamantine"),
            //() -> new ItemStack(ModItems.ADAMANTINE_INGOT));
    //public static final ItemGroup MAGIC_ITEMS = FabricItemGroupBuilder.build(new Identifier(FeyruneMod.MOD_ID, "magic_items"),
        //() -> new ItemStack(ModItems.ARCANE_CRYSTAL));
    public static final ItemGroup FEYRUNE = FabricItemGroupBuilder.build(new Identifier(FeyruneMod.MOD_ID, "feyrune"),
            () -> new ItemStack(ModItems.ARCANE_CRYSTAL));
}
