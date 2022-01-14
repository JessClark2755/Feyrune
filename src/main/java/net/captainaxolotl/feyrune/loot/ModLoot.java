package net.captainaxolotl.feyrune.loot;

import net.captainaxolotl.feyrune.FeyruneMod;
import net.captainaxolotl.feyrune.item.ModItems;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.item.Items;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLoot
{
    private static final Identifier MINESHAFT_CHEST = new Identifier("minecraft", "chests/abandoned_mineshaft");
    private static final Identifier TREASURE_CHEST = new Identifier("minecraft", "chests/buried_treasure");
    private static final Identifier BASTION_TREASURE_CHEST = new Identifier("minecraft", "chests/bastion_treasure");
    private static final Identifier DESERT_PYRAMID_CHEST = new Identifier("minecraft", "chests/desert_pyramid");
    private static final Identifier END_CITY_TREASURE_CHEST = new Identifier("minecraft", "chests/end_city_treasure");
    private static final Identifier IGLOO_CHEST = new Identifier("minecraft", "chests/igloo_chest");
    private static final Identifier JUNGLE_TEMPLE_TREASURE_CHEST = new Identifier("minecraft", "chests/jungle_temple");
    private static final Identifier NETHER_BRIDGE_TREASURE_CHEST = new Identifier("minecraft", "chests/nether_bridge");
    private static final Identifier PILLAGER_OUTPOST_CHEST = new Identifier("minecraft", "chests/pillager_outpost");
    private static final Identifier RUINED_PORTAL_CHEST = new Identifier("minecraft", "chests/ruined_portal");
    private static final Identifier SHIPWRECK_CHEST = new Identifier("minecraft", "chests/shipwreck_treasure");
    private static final Identifier SIMPLE_DUNGEON_CHEST = new Identifier("minecraft", "chests/simple_dungeon");
    private static final Identifier STRONGHOLD_CORRIDOR_CHEST = new Identifier("minecraft", "chests/stronghold_corridor");
    private static final Identifier STRONGHOLD_CROSSING_CHEST = new Identifier("minecraft", "chests/stronghold_crossing");
    private static final Identifier UNDERWATER_RUIN_BIG_CHEST = new Identifier("minecraft", "chests/underwater_ruin_big");
    private static final Identifier UNDERWATER_RUIN_SMALL_CHEST = new Identifier("minecraft", "chests/underwater_ruin_small");
    private static final Identifier VILLAGE_TEMPLE_CHEST = new Identifier("minecraft", "chests/village/village_temple");
    private static final Identifier VILLAGE_ARMORER_CHEST = new Identifier("minecraft", "chests/village/village_armorer");
    private static final Identifier VILLAGE_TOOLSMITH_CHEST = new Identifier("minecraft", "chests/village/village_toolsmith");
    private static final Identifier VILLAGE_WEAPONSMITH_CHEST = new Identifier("minecraft", "chests/village/village_weaponsmith");
    private static final Identifier WOODLAND_MANSION_CHEST = new Identifier("minecraft", "chests/woodland_mansion");

    private static final int uncommon = 50;
    private static final int rare = 25;
    private static final int veryRare = 5;



    public static void registerLootTables()
    {
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, supplier, setter) ->
        {
            if (MINESHAFT_CHEST.equals(id))
            {
                FabricLootPoolBuilder poolBuilder1 = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_INGOT).weight(80))
                        .with(ItemEntry.builder(ModItems.GOGGLES_OF_NIGHT).weight(uncommon))
                        .with(ItemEntry.builder(ModItems.CLOAK_OF_INVISIBILITY).weight(veryRare))
                        .with(ItemEntry.builder(ModItems.AMULET_OF_HEALTH).weight(rare));

                FabricLootPoolBuilder poolBuilder2 = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_INGOT).weight(80))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_AXE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_BOOTS).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_HELMET).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_HOE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_LEGGINGS).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_PICKAXE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_SHOVEL).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_SWORD).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_DAGGER).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_MACE).weight(rare))
                        .with(ItemEntry.builder(ModItems.IRON_DAGGER).weight(rare))
                        .with(ItemEntry.builder(ModItems.IRON_MACE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_CHESTPLATE).weight(rare));

                supplier.withPool(poolBuilder2.build());
                supplier.withPool(poolBuilder1.build());
            } else
            if (TREASURE_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_INGOT).weight(80))
                        .with(ItemEntry.builder(ModItems.GOGGLES_OF_NIGHT).weight(uncommon))
                        .with(ItemEntry.builder(ModItems.CLOAK_OF_INVISIBILITY).weight(veryRare))
                        .with(ItemEntry.builder(ModItems.AMULET_OF_HEALTH).weight(rare));

                FabricLootPoolBuilder poolBuilder2 = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_INGOT).weight(80))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_AXE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_BOOTS).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_HELMET).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_HOE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_LEGGINGS).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_PICKAXE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_SHOVEL).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_SWORD).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_DAGGER).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_MACE).weight(rare))
                        .with(ItemEntry.builder(ModItems.IRON_DAGGER).weight(rare))
                        .with(ItemEntry.builder(ModItems.IRON_MACE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_CHESTPLATE).weight(rare));

                supplier.withPool(poolBuilder2.build());
                supplier.withPool(poolBuilder.build());
            } else
            if (BASTION_TREASURE_CHEST.equals(id)) {
            FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .with(ItemEntry.builder(ModItems.ADAMANTINE_INGOT).weight(50))
                    .with(ItemEntry.builder(ModItems.GOGGLES_OF_NIGHT).weight(rare))
                    .with(ItemEntry.builder(ModItems.CLOAK_OF_INVISIBILITY).weight(rare))
                    .with(ItemEntry.builder(ModItems.AMULET_OF_HEALTH).weight(uncommon));

            supplier.withPool(poolBuilder.build());
            } else
            if (DESERT_PYRAMID_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_INGOT).weight(80))
                        .with(ItemEntry.builder(ModItems.GOGGLES_OF_NIGHT).weight(uncommon))
                        .with(ItemEntry.builder(ModItems.CLOAK_OF_INVISIBILITY).weight(veryRare))
                        .with(ItemEntry.builder(ModItems.AMULET_OF_HEALTH).weight(rare));

                FabricLootPoolBuilder poolBuilder2 = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_INGOT).weight(80))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_AXE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_BOOTS).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_HELMET).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_HOE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_LEGGINGS).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_PICKAXE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_SHOVEL).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_SWORD).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_DAGGER).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_MACE).weight(rare))
                        .with(ItemEntry.builder(ModItems.IRON_DAGGER).weight(rare))
                        .with(ItemEntry.builder(ModItems.IRON_MACE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_CHESTPLATE).weight(rare));

                supplier.withPool(poolBuilder2.build());

                supplier.withPool(poolBuilder.build());
            } else
            if (END_CITY_TREASURE_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_INGOT).weight(20))
                        .with(ItemEntry.builder(ModItems.GOGGLES_OF_NIGHT).weight(veryRare))
                        .with(ItemEntry.builder(ModItems.CLOAK_OF_INVISIBILITY).weight(uncommon))
                        .with(ItemEntry.builder(ModItems.AMULET_OF_HEALTH).weight(rare));

                supplier.withPool(poolBuilder.build());
            } else
            if (IGLOO_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_INGOT).weight(80))
                        .with(ItemEntry.builder(ModItems.GOGGLES_OF_NIGHT).weight(uncommon))
                        .with(ItemEntry.builder(ModItems.CLOAK_OF_INVISIBILITY).weight(veryRare))
                        .with(ItemEntry.builder(ModItems.AMULET_OF_HEALTH).weight(veryRare));

                FabricLootPoolBuilder poolBuilder2 = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_INGOT).weight(80))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_AXE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_BOOTS).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_HELMET).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_HOE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_LEGGINGS).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_PICKAXE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_SHOVEL).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_SWORD).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_DAGGER).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_MACE).weight(rare))
                        .with(ItemEntry.builder(ModItems.IRON_DAGGER).weight(rare))
                        .with(ItemEntry.builder(ModItems.IRON_MACE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_CHESTPLATE).weight(rare));

                supplier.withPool(poolBuilder2.build());

                supplier.withPool(poolBuilder.build());
            } else
            if (JUNGLE_TEMPLE_TREASURE_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_INGOT).weight(80))
                        .with(ItemEntry.builder(ModItems.GOGGLES_OF_NIGHT).weight(uncommon))
                        .with(ItemEntry.builder(ModItems.CLOAK_OF_INVISIBILITY).weight(veryRare))
                        .with(ItemEntry.builder(ModItems.AMULET_OF_HEALTH).weight(rare));

                FabricLootPoolBuilder poolBuilder2 = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_INGOT).weight(80))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_AXE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_BOOTS).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_HELMET).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_HOE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_LEGGINGS).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_PICKAXE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_SHOVEL).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_SWORD).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_DAGGER).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_MACE).weight(rare))
                        .with(ItemEntry.builder(ModItems.IRON_DAGGER).weight(rare))
                        .with(ItemEntry.builder(ModItems.IRON_MACE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_CHESTPLATE).weight(rare));

                supplier.withPool(poolBuilder2.build());

                supplier.withPool(poolBuilder.build());
            } else
            if (NETHER_BRIDGE_TREASURE_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_INGOT).weight(50))
                        .with(ItemEntry.builder(ModItems.GOGGLES_OF_NIGHT).weight(uncommon))
                        .with(ItemEntry.builder(ModItems.CLOAK_OF_INVISIBILITY).weight(rare))
                        .with(ItemEntry.builder(ModItems.AMULET_OF_HEALTH).weight(rare));

                supplier.withPool(poolBuilder.build());
            } else
            if (PILLAGER_OUTPOST_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_INGOT).weight(80))
                        .with(ItemEntry.builder(ModItems.GOGGLES_OF_NIGHT).weight(uncommon))
                        .with(ItemEntry.builder(ModItems.CLOAK_OF_INVISIBILITY).weight(veryRare))
                        .with(ItemEntry.builder(ModItems.AMULET_OF_HEALTH).weight(rare));

                FabricLootPoolBuilder poolBuilder2 = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_INGOT).weight(80))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_AXE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_BOOTS).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_HELMET).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_HOE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_LEGGINGS).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_PICKAXE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_SHOVEL).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_SWORD).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_DAGGER).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_MACE).weight(rare))
                        .with(ItemEntry.builder(ModItems.IRON_DAGGER).weight(rare))
                        .with(ItemEntry.builder(ModItems.IRON_MACE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_CHESTPLATE).weight(rare));

                supplier.withPool(poolBuilder2.build());

                supplier.withPool(poolBuilder.build());
            } else
            if (RUINED_PORTAL_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_INGOT).weight(80))
                        .with(ItemEntry.builder(ModItems.GOGGLES_OF_NIGHT).weight(uncommon))
                        .with(ItemEntry.builder(ModItems.CLOAK_OF_INVISIBILITY).weight(veryRare))
                        .with(ItemEntry.builder(ModItems.AMULET_OF_HEALTH).weight(rare));

                supplier.withPool(poolBuilder.build());
            } else
            if (SHIPWRECK_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_INGOT).weight(80))
                        .with(ItemEntry.builder(ModItems.GOGGLES_OF_NIGHT).weight(uncommon))
                        .with(ItemEntry.builder(ModItems.CLOAK_OF_INVISIBILITY).weight(veryRare))
                        .with(ItemEntry.builder(ModItems.AMULET_OF_HEALTH).weight(rare));

                FabricLootPoolBuilder poolBuilder2 = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_INGOT).weight(80))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_AXE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_BOOTS).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_HELMET).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_HOE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_LEGGINGS).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_PICKAXE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_SHOVEL).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_SWORD).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_DAGGER).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_MACE).weight(rare))
                        .with(ItemEntry.builder(ModItems.IRON_DAGGER).weight(rare))
                        .with(ItemEntry.builder(ModItems.IRON_MACE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_CHESTPLATE).weight(rare));

                supplier.withPool(poolBuilder2.build());

                supplier.withPool(poolBuilder.build());
            } else
            if (SIMPLE_DUNGEON_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_INGOT).weight(80))
                        .with(ItemEntry.builder(ModItems.GOGGLES_OF_NIGHT).weight(uncommon))
                        .with(ItemEntry.builder(ModItems.CLOAK_OF_INVISIBILITY).weight(veryRare))
                        .with(ItemEntry.builder(ModItems.AMULET_OF_HEALTH).weight(rare));

                FabricLootPoolBuilder poolBuilder2 = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_INGOT).weight(80))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_AXE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_BOOTS).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_HELMET).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_HOE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_LEGGINGS).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_PICKAXE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_SHOVEL).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_SWORD).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_DAGGER).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_MACE).weight(rare))
                        .with(ItemEntry.builder(ModItems.IRON_DAGGER).weight(rare))
                        .with(ItemEntry.builder(ModItems.IRON_MACE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_CHESTPLATE).weight(rare));

                supplier.withPool(poolBuilder2.build());

                supplier.withPool(poolBuilder.build());
            } else
            if (STRONGHOLD_CORRIDOR_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_INGOT).weight(80))
                        .with(ItemEntry.builder(ModItems.GOGGLES_OF_NIGHT).weight(uncommon))
                        .with(ItemEntry.builder(ModItems.CLOAK_OF_INVISIBILITY).weight(veryRare))
                        .with(ItemEntry.builder(ModItems.AMULET_OF_HEALTH).weight(rare));

                FabricLootPoolBuilder poolBuilder2 = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_INGOT).weight(80))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_AXE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_BOOTS).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_HELMET).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_HOE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_LEGGINGS).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_PICKAXE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_SHOVEL).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_SWORD).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_DAGGER).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_MACE).weight(rare))
                        .with(ItemEntry.builder(ModItems.IRON_DAGGER).weight(rare))
                        .with(ItemEntry.builder(ModItems.IRON_MACE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_CHESTPLATE).weight(rare));

                supplier.withPool(poolBuilder2.build());

                supplier.withPool(poolBuilder.build());
            } else
            if (STRONGHOLD_CROSSING_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_INGOT).weight(80))
                        .with(ItemEntry.builder(ModItems.GOGGLES_OF_NIGHT).weight(uncommon))
                        .with(ItemEntry.builder(ModItems.CLOAK_OF_INVISIBILITY).weight(veryRare))
                        .with(ItemEntry.builder(ModItems.AMULET_OF_HEALTH).weight(rare));

                FabricLootPoolBuilder poolBuilder2 = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_INGOT).weight(80))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_AXE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_BOOTS).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_HELMET).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_HOE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_LEGGINGS).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_PICKAXE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_SHOVEL).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_SWORD).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_DAGGER).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_MACE).weight(rare))
                        .with(ItemEntry.builder(ModItems.IRON_DAGGER).weight(rare))
                        .with(ItemEntry.builder(ModItems.IRON_MACE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_CHESTPLATE).weight(rare));

                supplier.withPool(poolBuilder2.build());

                supplier.withPool(poolBuilder.build());
            } else
            if (WOODLAND_MANSION_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_INGOT).weight(50))
                        .with(ItemEntry.builder(ModItems.GOGGLES_OF_NIGHT).weight(uncommon))
                        .with(ItemEntry.builder(ModItems.CLOAK_OF_INVISIBILITY).weight(rare))
                        .with(ItemEntry.builder(ModItems.AMULET_OF_HEALTH).weight(rare));

                FabricLootPoolBuilder poolBuilder2 = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_INGOT).weight(80))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_AXE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_BOOTS).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_HELMET).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_HOE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_LEGGINGS).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_PICKAXE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_SHOVEL).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_SWORD).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_DAGGER).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_MACE).weight(rare))
                        .with(ItemEntry.builder(ModItems.IRON_DAGGER).weight(rare))
                        .with(ItemEntry.builder(ModItems.IRON_MACE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_CHESTPLATE).weight(rare));

                supplier.withPool(poolBuilder2.build());

                supplier.withPool(poolBuilder.build());
            } else
            if (UNDERWATER_RUIN_BIG_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_INGOT).weight(80))
                        .with(ItemEntry.builder(ModItems.GOGGLES_OF_NIGHT).weight(uncommon))
                        .with(ItemEntry.builder(ModItems.CLOAK_OF_INVISIBILITY).weight(veryRare))
                        .with(ItemEntry.builder(ModItems.AMULET_OF_HEALTH).weight(rare));

                FabricLootPoolBuilder poolBuilder2 = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_INGOT).weight(80))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_AXE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_BOOTS).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_HELMET).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_HOE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_LEGGINGS).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_PICKAXE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_SHOVEL).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_SWORD).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_DAGGER).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_MACE).weight(rare))
                        .with(ItemEntry.builder(ModItems.IRON_DAGGER).weight(rare))
                        .with(ItemEntry.builder(ModItems.IRON_MACE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_CHESTPLATE).weight(rare));

                supplier.withPool(poolBuilder2.build());

                supplier.withPool(poolBuilder.build());
            } else
            if (UNDERWATER_RUIN_SMALL_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_INGOT).weight(80))
                        .with(ItemEntry.builder(ModItems.GOGGLES_OF_NIGHT).weight(uncommon))
                        .with(ItemEntry.builder(ModItems.CLOAK_OF_INVISIBILITY).weight(veryRare))
                        .with(ItemEntry.builder(ModItems.AMULET_OF_HEALTH).weight(rare));

                FabricLootPoolBuilder poolBuilder2 = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_INGOT).weight(80))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_AXE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_BOOTS).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_HELMET).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_HOE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_LEGGINGS).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_PICKAXE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_SHOVEL).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_SWORD).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_DAGGER).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_MACE).weight(rare))
                        .with(ItemEntry.builder(ModItems.IRON_DAGGER).weight(rare))
                        .with(ItemEntry.builder(ModItems.IRON_MACE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_CHESTPLATE).weight(rare));

                supplier.withPool(poolBuilder2.build());

                supplier.withPool(poolBuilder.build());
            } else
            if (VILLAGE_TEMPLE_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_INGOT).weight(80))
                        .with(ItemEntry.builder(ModItems.GOGGLES_OF_NIGHT).weight(uncommon))
                        .with(ItemEntry.builder(ModItems.CLOAK_OF_INVISIBILITY).weight(veryRare))
                        .with(ItemEntry.builder(ModItems.AMULET_OF_HEALTH).weight(veryRare));

                supplier.withPool(poolBuilder.build());
            } else
            if (VILLAGE_ARMORER_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder2 = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_INGOT).weight(80))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_AXE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_BOOTS).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_HELMET).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_HOE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_LEGGINGS).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_PICKAXE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_SHOVEL).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_SWORD).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_DAGGER).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_MACE).weight(rare))
                        .with(ItemEntry.builder(ModItems.IRON_DAGGER).weight(rare))
                        .with(ItemEntry.builder(ModItems.IRON_MACE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_CHESTPLATE).weight(rare));

                supplier.withPool(poolBuilder2.build());
            } else
            if (VILLAGE_TOOLSMITH_CHEST.equals(id))
            {
                FabricLootPoolBuilder poolBuilder2 = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_INGOT).weight(80))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_AXE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_BOOTS).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_HELMET).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_HOE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_LEGGINGS).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_PICKAXE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_SHOVEL).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_SWORD).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_DAGGER).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_MACE).weight(rare))
                        .with(ItemEntry.builder(ModItems.IRON_DAGGER).weight(rare))
                        .with(ItemEntry.builder(ModItems.IRON_MACE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_CHESTPLATE).weight(rare));

                supplier.withPool(poolBuilder2.build());
            } else
            if (VILLAGE_WEAPONSMITH_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder2 = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_INGOT).weight(80))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_AXE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_BOOTS).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_HELMET).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_HOE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_LEGGINGS).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_PICKAXE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_SHOVEL).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_SWORD).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_DAGGER).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_MACE).weight(rare))
                        .with(ItemEntry.builder(ModItems.IRON_DAGGER).weight(rare))
                        .with(ItemEntry.builder(ModItems.IRON_MACE).weight(rare))
                        .with(ItemEntry.builder(ModItems.ADAMANTINE_CHESTPLATE).weight(rare));

                supplier.withPool(poolBuilder2.build());
            }
        });

        FeyruneMod.LOGGER.info("Registering loot tables for " + FeyruneMod.MOD_ID);
    }
}
