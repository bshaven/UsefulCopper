package net.bshaven.usefulcopper;

import net.bshaven.usefulcopper.block.ModBlocks;
import net.bshaven.usefulcopper.item.ModItemGroups;
import net.bshaven.usefulcopper.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UsefulCopper implements ModInitializer {
	public static final String MOD_ID = "usefulcopper";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}