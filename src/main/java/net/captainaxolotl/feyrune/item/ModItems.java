package net.captainaxolotl.feyrune.item;

import net.captainaxolotl.feyrune.FeyruneMod;
import net.captainaxolotl.feyrune.item.custom.*;
import net.captainaxolotl.feyrune.item.custom.trinket.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems
{

    //ADAMANTINE MISC ITEMS
    public static final Item ADAMANTINE_INGOT = registerItem("adamantine_ingot",
            new Item(new FabricItemSettings().group(ModItemGroups.FEYRUNE)));
    public static final Item ADAMANTINE_NUGGET = registerItem("adamantine_nugget",
            new Item(new FabricItemSettings().group(ModItemGroups.FEYRUNE)));
    public static final Item RAW_ADAMANTINE = registerItem("raw_adamantine",
        new Item(new FabricItemSettings().group(ModItemGroups.FEYRUNE)));

    //ADAMANTINE TOOLS
    public static final Item ADAMANTINE_PICKAXE = registerItem("adamantine_pickaxe",
            new ModPickaxeItem(ModToolMaterial.ADAMANTINE, 3, -2.8f,
                    new FabricItemSettings().group(ModItemGroups.FEYRUNE)));
    public static final Item ADAMANTINE_AXE = registerItem("adamantine_axe",
            new ModAxeItem(ModToolMaterial.ADAMANTINE, 7, -3f,
                    new FabricItemSettings().group(ModItemGroups.FEYRUNE)));
    public static final Item ADAMANTINE_HOE = registerItem("adamantine_hoe",
            new ModHoeItem(ModToolMaterial.ADAMANTINE, -1, 0f,
                    new FabricItemSettings().group(ModItemGroups.FEYRUNE)));
    public static final Item ADAMANTINE_SHOVEL = registerItem("adamantine_shovel",
            new ShovelItem(ModToolMaterial.ADAMANTINE, 3, -3f,
                    new FabricItemSettings().group(ModItemGroups.FEYRUNE)));
    public static final Item ADAMANTINE_SWORD = registerItem("adamantine_sword",
            new SwordItem(ModToolMaterial.ADAMANTINE, 5, -2.4f,
                    new FabricItemSettings().group(ModItemGroups.FEYRUNE)));

    //ADAMANTINE ARMOR
    public static final Item ADAMANTINE_HELMET = registerItem("adamantine_helmet",
            new ArmorItem(AdamantineArmorMaterial.ADAMANTINE, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroups.FEYRUNE)));
    public static final Item ADAMANTINE_CHESTPLATE = registerItem("adamantine_chestplate",
            new ArmorItem(AdamantineArmorMaterial.ADAMANTINE, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroups.FEYRUNE)));
    public static final Item ADAMANTINE_LEGGINGS = registerItem("adamantine_leggings",
            new ArmorItem(AdamantineArmorMaterial.ADAMANTINE, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroups.FEYRUNE)));
    public static final Item ADAMANTINE_BOOTS = registerItem("adamantine_boots",
            new ArmorItem(AdamantineArmorMaterial.ADAMANTINE, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroups.FEYRUNE)));

    public static final Item ADAMANTINE_HORSE_ARMOR = registerItem("adamantine_horse_armor",
            new HorseArmorItem(9, "adamantine", new FabricItemSettings().group(ModItemGroups.FEYRUNE)));

    //ARCANE
    public static final Item ARCANE_DUST = registerItem("arcane_dust",
        new Item(new FabricItemSettings().group(ModItemGroups.FEYRUNE)));
    public static final Item ARCANE_CRYSTAL = registerItem("arcane_crystal",
            new Item(new FabricItemSettings().group(ModItemGroups.FEYRUNE)));

    //MAGIC ITEMS
    public static final Item GOGGLES_OF_NIGHT = registerItem("goggles_of_night", new GogglesOfNight(new FabricItemSettings().group(ModItemGroups.FEYRUNE)));
    public static final Item AMULET_OF_HEALTH = registerItem("amulet_of_health", new AmuletOfHealth(new FabricItemSettings().group(ModItemGroups.FEYRUNE)));
    public static final Item CLOAK_OF_INVISIBILITY = registerItem("cloak_of_invisibility", new CloakOfInvisibility(new FabricItemSettings().group(ModItemGroups.FEYRUNE)));
    public static final Item CLOAK_OF_PROTECTION = registerItem("cloak_of_protection", new CloakOfProtection(new FabricItemSettings().group(ModItemGroups.FEYRUNE)));
    public static final Item CLOAK_OF_THE_DOLPHIN = registerItem("cloak_of_the_dolphin", new CloakOfTheDolphin(new FabricItemSettings().group(ModItemGroups.FEYRUNE)));
    public static final Item RING_OF_SWIMMING = registerItem("ring_of_swimming", new RingOfSwimming(new FabricItemSettings().group(ModItemGroups.FEYRUNE)));
    public static final Item RING_OF_JUMPING = registerItem("ring_of_jumping", new RingOfJumping(new FabricItemSettings().group(ModItemGroups.FEYRUNE)));
    public static final Item GAUNTLETS_OF_GOLEM_POWER = registerItem("gauntlets_of_golem_power", new GauntletsOfGolemPower(new FabricItemSettings().group(ModItemGroups.FEYRUNE)));
    public static final Item BAG_OF_USEFUL_ITEMS = registerItem("bag_of_useful_items", new BagOfUsefulItems(new FabricItemSettings().group(ModItemGroups.FEYRUNE)));
    public static final Item BUCKET_OF_ENDLESS_WATER =
            registerItem("bucket_of_endless_water", new BucketOfEndlessWater(new FabricItemSettings().group(ModItemGroups.FEYRUNE).maxCount(1)));
    public static final Item BUCKET_OF_ENDLESS_LAVA =
            registerItem("bucket_of_endless_lava", new BucketOfEndlessLava(new FabricItemSettings().group(ModItemGroups.FEYRUNE).maxCount(1)));
    public static final Item ORB_OF_FIREBOLT = registerItem("orb_of_firebolt", new OrbOfFirebolt(new FabricItemSettings().group(ModItemGroups.FEYRUNE)));
    public static final Item ORB_OF_THE_CREEPER = registerItem("orb_of_the_creeper", new OrbOftheCreeper(new FabricItemSettings().group(ModItemGroups.FEYRUNE)));

    //FEYRUNE WEAPONS
    public static final Item ADAMANTINE_DAGGER = registerItem("adamantine_dagger",
            new ModDaggerItem(ModToolMaterial.ADAMANTINE, 2, 0f,
                    new FabricItemSettings().group(ModItemGroups.FEYRUNE)));
    public static final Item ADAMANTINE_MACE = registerItem("adamantine_mace",
            new ModMaceItem(ModToolMaterial.ADAMANTINE, 8, -3f,
                    new FabricItemSettings().group(ModItemGroups.FEYRUNE)));
    public static final Item WOODEN_DAGGER = registerItem("wooden_dagger",
            new ModDaggerItem(ToolMaterials.WOOD, 1, 0f,
                    new FabricItemSettings().group(ModItemGroups.FEYRUNE)));
    public static final Item WOODEN_MACE = registerItem("wooden_mace",
            new ModMaceItem(ToolMaterials.WOOD, 7, -3f,
                    new FabricItemSettings().group(ModItemGroups.FEYRUNE)));
    public static final Item STONE_DAGGER = registerItem("stone_dagger",
            new ModDaggerItem(ToolMaterials.STONE, 1, 0f,
                    new FabricItemSettings().group(ModItemGroups.FEYRUNE)));
    public static final Item STONE_MACE = registerItem("stone_mace",
            new ModMaceItem(ToolMaterials.STONE, 7, -3f,
                    new FabricItemSettings().group(ModItemGroups.FEYRUNE)));
    public static final Item IRON_DAGGER = registerItem("iron_dagger",
            new ModDaggerItem(ToolMaterials.IRON, 1, 0f,
                    new FabricItemSettings().group(ModItemGroups.FEYRUNE)));
    public static final Item IRON_MACE = registerItem("iron_mace",
            new ModMaceItem(ToolMaterials.IRON, 7, -3f,
                    new FabricItemSettings().group(ModItemGroups.FEYRUNE)));
    public static final Item GOLDEN_DAGGER = registerItem("golden_dagger",
            new ModDaggerItem(ToolMaterials.GOLD, 1, 0f,
                    new FabricItemSettings().group(ModItemGroups.FEYRUNE)));
    public static final Item GOLDEN_MACE = registerItem("golden_mace",
            new ModMaceItem(ToolMaterials.GOLD, 7, -3f,
                    new FabricItemSettings().group(ModItemGroups.FEYRUNE)));
    public static final Item DIAMOND_DAGGER = registerItem("diamond_dagger",
            new ModDaggerItem(ToolMaterials.DIAMOND, 1, 0f,
                    new FabricItemSettings().group(ModItemGroups.FEYRUNE)));
    public static final Item DIAMOND_MACE = registerItem("diamond_mace",
            new ModMaceItem(ToolMaterials.DIAMOND, 7, -3f,
                    new FabricItemSettings().group(ModItemGroups.FEYRUNE)));
    public static final Item NETHERITE_DAGGER = registerItem("netherite_dagger",
            new ModDaggerItem(ToolMaterials.NETHERITE, 1, 0f,
                    new FabricItemSettings().group(ModItemGroups.FEYRUNE)));
    public static final Item NETHERITE_MACE = registerItem("netherite_mace",
            new ModMaceItem(ToolMaterials.NETHERITE, 7, -3f,
                    new FabricItemSettings().group(ModItemGroups.FEYRUNE)));

    //MAGIC WEAPONS
    public static final Item DAGGER_OF_VENOM = registerItem("dagger_of_venom",
            new DaggerOfVenom(ModToolMaterial.ADAMANTINE, 2, 0f,
                    new FabricItemSettings().group(ModItemGroups.FEYRUNE)));
    public static final Item MACE_OF_SMITING = registerItem("mace_of_smiting",
            new MaceOfSmiting(ModToolMaterial.ADAMANTINE, 10, -3f,
                    new FabricItemSettings().group(ModItemGroups.FEYRUNE)));
        public static final Item STAFF_OF_TELEPORTATION = registerItem("staff_of_teleportation",
            new StaffOfTeleportation(ModToolMaterial.ADAMANTINE, 5, -4f,
                    new FabricItemSettings().group(ModItemGroups.FEYRUNE)));
    
    //MAGIC ARMOR
    public static final Item BOOTS_OF_WINTERLANDS = registerItem("boots_of_winterlands",
           new ArmorItem(AdamantineArmorMaterial.ADAMANTINE, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroups.FEYRUNE)));
    
    
    private static <T extends Item> T registerItem(String name, T item){
        return Registry.register(Registry.ITEM, new Identifier(FeyruneMod.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        FeyruneMod.LOGGER.info("Registering ModItems for " + FeyruneMod.MOD_ID);
    }
}
