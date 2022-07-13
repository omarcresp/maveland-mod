package net.jackcres.maveland_mod;

import net.fabricmc.api.ModInitializer;
import net.jackcres.maveland_mod.block.ModBlocks;
import net.jackcres.maveland_mod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MavelandMod implements ModInitializer {
	public static final String MOD_ID = "maveland_mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
