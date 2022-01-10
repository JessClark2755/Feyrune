package net.captainaxolotl.feyrune.world.feature;

import net.captainaxolotl.feyrune.FeyruneMod;
import net.captainaxolotl.feyrune.block.ModBlocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

import java.util.List;

public class ModConfiguredFeatures
{

    public static final List<OreFeatureConfig.Target> OVERWORLD_ADAMANTINE_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ADAMANTINE_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_ADAMANTINE_ORE.getDefaultState()));

    public static final ConfiguredFeature<?, ?> ADAMANTINE_ORE = register("adamantine_ore",
            Feature.ORE.configure(new OreFeatureConfig(OVERWORLD_ADAMANTINE_ORES, 6)));

    public static final ConfiguredFeature<?, ?> DEEPSLATE_ADAMANTINE_ORE = register("deepslate_adamantine_ore",
            Feature.ORE.configure(new OreFeatureConfig(OVERWORLD_ADAMANTINE_ORES, 6)));

    public static <FC extends FeatureConfig> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(FeyruneMod.MOD_ID, name),
                configuredFeature);
    }

    private static RandomPatchFeatureConfig createRandomPatchFeatureConfig(BlockStateProvider block, int tries) {
        return ConfiguredFeatures.createRandomPatchFeatureConfig(tries,
                Feature.SIMPLE_BLOCK.configure(new SimpleBlockFeatureConfig(block)).withInAirFilter());
    }

    public static void registerConfiguredFeatures()
    {
        FeyruneMod.LOGGER.info("Registering ModConfiguredFeatures for " + FeyruneMod.MOD_ID);
    }
}
