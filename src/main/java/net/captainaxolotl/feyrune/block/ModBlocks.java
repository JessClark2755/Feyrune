package net.captainaxolotl.feyrune.block;

import net.captainaxolotl.feyrune.FeyruneMod;
import net.captainaxolotl.feyrune.item.ModItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks
{

    //ADAMANTINE BLOCKS
    public static final Block ADAMANTINE_BLOCK = registerBlock("adamantine_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroups.FEYRUNE);
    public static final Block RAW_ADAMANTINE_BLOCK = registerBlock("raw_adamantine_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroups.FEYRUNE);
    public static final Block ADAMANTINE_ORE = registerBlock("adamantine_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroups.FEYRUNE);
    public static final Block DEEPSLATE_ADAMANTINE_ORE = registerBlock("deepslate_adamantine_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroups.FEYRUNE);

    //ARCANE BLOCKS
    public static final Block ARCANE_CRYSTAL_ORE = registerBlock("arcane_crystal_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroups.FEYRUNE);

    private static Block registerBlock(String name, Block block, ItemGroup group)
    {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(FeyruneMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group)
    {
        return Registry.register(Registry.ITEM, new Identifier(FeyruneMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks()
    {
        FeyruneMod.LOGGER.info("Registering ModBlocks for " + FeyruneMod.MOD_ID);
    }
}
