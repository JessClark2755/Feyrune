package net.captainaxolotl.feyrune.config;

import com.mojang.datafixers.util.Pair;
import net.captainaxolotl.feyrune.FeyruneMod;

public class ModConfigs
{
    public static SimpleConfig CONFIG;
    private static ModConfigProvider configs;

    public static int MAGIC_BASE;
    public static int ADAMANTINE_BASE;
    public static int UNCOMMON;
    public static int RARE;
    public static int VERY_RARE;
    public static int LEGENDARY;

    public static void registerConfigs()
    {
        configs = new ModConfigProvider();
        createConfigs();

        CONFIG = SimpleConfig.of(FeyruneMod.MOD_ID + "config").provider(configs).request();

        assignConfigs();
    }

    private static void createConfigs()
    {
        configs.addKeyValuePair(new Pair<>("magic.item.base.rarity", 200), "Probability of getting an adamantine ingot instead of a magic item.");
        configs.addKeyValuePair(new Pair<>("adamantine.base.rarity", 80), "Probability of getting an adamantine ingot instead of an armor piece/weapon.");
        configs.addKeyValuePair(new Pair<>("uncommon", 50), "Probability of getting an uncommon item.");
        configs.addKeyValuePair(new Pair<>("rare", 25), "Probability of getting a rare item.");
        configs.addKeyValuePair(new Pair<>("very.rare", 5), "Probability of getting a very rare item.");
        configs.addKeyValuePair(new Pair<>("legendary", 1), "Probability of getting a legendary item.");
    }

    private static void assignConfigs() {
        MAGIC_BASE = CONFIG.getOrDefault("magic.item.base.rarity", 200);
        ADAMANTINE_BASE = CONFIG.getOrDefault("adamantine.base.rarity", 80);
        UNCOMMON = CONFIG.getOrDefault("uncommon", 50);
        RARE = CONFIG.getOrDefault("rare", 25);
        VERY_RARE = CONFIG.getOrDefault("very.rare", 5);
        LEGENDARY = CONFIG.getOrDefault("legendary", 1);

        FeyruneMod.LOGGER.info("All " + configs.getConfigsList().size() + " have been set properly");
    }
}
