package net.captainaxolotl.feyrune.item;

import net.captainaxolotl.feyrune.FeyruneMod;
import net.captainaxolotl.feyrune.item.custom.ModAxeItem;
import net.captainaxolotl.feyrune.item.custom.ModHoeItem;
import net.captainaxolotl.feyrune.item.custom.ModPickaxeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems
{

    //ADAMANTINE MISC ITEMS
    public static final Item ADAMANTINE_INGOT = registerItem("adamantine_ingot",
            new Item(new FabricItemSettings().group(ModItemGroups.ADAMANTINE)));
    public static final Item ADAMANTINE_NUGGET = registerItem("adamantine_nugget",
            new Item(new FabricItemSettings().group(ModItemGroups.ADAMANTINE)));
    public static final Item RAW_ADAMANTINE = registerItem("raw_adamantine",
        new Item(new FabricItemSettings().group(ModItemGroups.ADAMANTINE)));

    //ADAMANTINE TOOLS
    public static final Item ADAMANTINE_PICKAXE = registerItem("adamantine_pickaxe",
            new ModPickaxeItem(ModToolMaterial.ADAMANTINE, 3, -2.8f,
                    new FabricItemSettings().group(ModItemGroups.ADAMANTINE)));
    public static final Item ADAMANTINE_AXE = registerItem("adamantine_axe",
            new ModAxeItem(ModToolMaterial.ADAMANTINE, 7, -3f,
                    new FabricItemSettings().group(ModItemGroups.ADAMANTINE)));
    public static final Item ADAMANTINE_HOE = registerItem("adamantine_hoe",
            new ModHoeItem(ModToolMaterial.ADAMANTINE, -1, 0f,
                    new FabricItemSettings().group(ModItemGroups.ADAMANTINE)));
    public static final Item ADAMANTINE_SHOVEL = registerItem("adamantine_shovel",
            new ShovelItem(ModToolMaterial.ADAMANTINE, 3, -3f,
                    new FabricItemSettings().group(ModItemGroups.ADAMANTINE)));
    public static final Item ADAMANTINE_SWORD = registerItem("adamantine_sword",
            new SwordItem(ModToolMaterial.ADAMANTINE, 5, -2.4f,
                    new FabricItemSettings().group(ModItemGroups.ADAMANTINE)));

    //ADAMANTINE ARMOR
    public static final Item ADAMANTINE_HELMET = registerItem("adamantine_helmet",
            new ArmorItem(ModArmorMaterials.ADAMANTINE, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroups.ADAMANTINE)));
    public static final Item ADAMANTINE_CHESTPLATE = registerItem("adamantine_chestplate",
            new ArmorItem(ModArmorMaterials.ADAMANTINE, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroups.ADAMANTINE)));
    public static final Item ORICHALCUM_LEGGINGS = registerItem("adamantine_leggings",
            new ArmorItem(ModArmorMaterials.ADAMANTINE, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroups.ADAMANTINE)));
    public static final Item ORICHALCUM_BOOTS = registerItem("adamantine_boots",
            new ArmorItem(ModArmorMaterials.ADAMANTINE, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroups.ADAMANTINE)));


    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registry.ITEM, new Identifier(FeyruneMod.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        FeyruneMod.LOGGER.info("Registering ModItems for " + FeyruneMod.MOD_ID);
    }
}
