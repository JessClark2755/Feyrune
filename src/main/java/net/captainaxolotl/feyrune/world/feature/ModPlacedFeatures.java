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

    public static final RegistryKey<PlacedFeature> ADAMANTINE_ORE_PLACED_KEY = registerKey("adamantine_ore_placed");

    public static final RegistryKey<PlacedFeature> DEEPSLATE_ADAMANTINE_ORE_PLACED_KEY = registerKey("deepslate_adamantine_ore_placed");

    public static final PlacedFeature ADAMANTINE_ORE_PLACED = registerPlacedFeature("adamantine_ore_placed",
            ModConfiguredFeatures.ADAMANTINE_ORE.withPlacement(ModOreFeatures.modifiersWithCount(7,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80)))));

    public static final PlacedFeature DEEPSLATE_ADAMANTINE_ORE_PLACED = registerPlacedFeature("deepslate_adamantine_ore_placed",
            ModConfiguredFeatures.DEEPSLATE_ADAMANTINE_ORE.withPlacement(ModOreFeatures.modifiersWithCount(7,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80)))));

    private static PlacedFeature registerPlacedFeature(String name, PlacedFeature placedFeature) {
        return Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(FeyruneMod.MOD_ID, name), placedFeature);
    }

    private static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(FeyruneMod.MOD_ID, name));
    }
}
