package net.captainaxolotl.feyrune;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.captainaxolotl.feyrune.block.ModBlocks;
import net.captainaxolotl.feyrune.item.ModItems;

public class FeyruneMod implements ModInitializer
{
	public static final String MOD_ID = "feyrune";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		LOGGER.info("Loading Feyrune!");

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
