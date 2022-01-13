package net.captainaxolotl.feyrune.config;

import draylar.omegaconfig.api.Config;
import net.captainaxolotl.feyrune.FeyruneMod;
import org.jetbrains.annotations.Nullable;

public class FeyruneConfig implements Config
{
    @Override
    public String getName() {
        return "feyrune";
    }

    @Override
    public String getExtension() {
        return "json5";
    }

    @Override
    public @Nullable String getModid() {
        return FeyruneMod.MOD_ID;
    }
}
