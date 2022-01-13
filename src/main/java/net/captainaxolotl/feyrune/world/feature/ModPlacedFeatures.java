package net.captainaxolotl.feyrune.world.feature;

import net.captainaxolotl.feyrune.FeyruneMod;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier;
import net.minecraft.world.gen.feature.PlacedFeature;

public class ModPlacedFeatures
{
    public static final RegistryKey<PlacedFeature> ADAMANTINE_ORE_UPPER_KEY = registerKey("adamantine_ore_upper");
    public static final RegistryKey<PlacedFeature> ADAMANTINE_ORE_LOWER_KEY = registerKey("adamantine_ore_lower");
    public static final RegistryKey<PlacedFeature> ARCANE_CRYSTAL_ORE_KEY = registerKey("arcane_crystal_ore");

    public static final PlacedFeature ADAMANTINE_ORE_UPPER = registerPlacedFeature("adamantine_ore_upper",
            ModConfiguredFeatures.ADAMANTINE_ORE.withPlacement(ModOreFeatures.modifiersWithCount(10,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(384)))));
    public static final PlacedFeature ADAMANTINE_ORE_LOWER = registerPlacedFeature("adamantine_ore_lower",
            ModConfiguredFeatures.ADAMANTINE_ORE.withPlacement(ModOreFeatures.modifiersWithCount(20,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80)))));
    public static final PlacedFeature ARCANE_CRYSTAL_ORE = registerPlacedFeature("arcane_crystal_ore",
            ModConfiguredFeatures.ARCANE_CRYSTAL_ORE.withPlacement(ModOreFeatures.modifiersWithCount(10,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80)))));



    private static PlacedFeature registerPlacedFeature(String name, PlacedFeature placedFeature) {
        return Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(FeyruneMod.MOD_ID, name), placedFeature);
    }

    private static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(FeyruneMod.MOD_ID, name));
    }
}
