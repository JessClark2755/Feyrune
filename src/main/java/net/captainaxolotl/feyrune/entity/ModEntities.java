package net.captainaxolotl.feyrune.entity;

import net.captainaxolotl.feyrune.FeyruneMod;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities
{
    public static final EntityType<RatEntity> RAT = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(FeyruneMod.MOD_ID, "rat"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, RatEntity::new).dimensions(EntityDimensions.fixed(1f, 0.5f)).build()
    );

    public static void registerModEntities()
    {
        FeyruneMod.LOGGER.info("Registering ModEntities for " + FeyruneMod.MOD_ID);
        FabricDefaultAttributeRegistry.register(RAT, RatEntity.createMobAttributes());
    }
}
