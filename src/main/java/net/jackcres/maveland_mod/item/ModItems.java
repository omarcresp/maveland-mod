package net.jackcres.maveland_mod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import net.jackcres.maveland_mod.MavelandMod;

public class ModItems {
    public static final Item MYTHRIL_INGOT = registerItem(
        "mythril_ingot",
        new FabricItemSettings().group(ItemGroup.MISC)
    );

    public static final Item MYTHRIL_NUGGET = registerItem(
        "mythril_nugget",
        new FabricItemSettings().group(ItemGroup.MISC)
    );

    public static final Item RAW_MYTHRIL = registerItem(
        "raw_mythril",
        new FabricItemSettings().group(ItemGroup.MISC)
    );

    public static Item registerItem(String name, Item.Settings itemSetting) {
        return Registry.register(
            Registry.ITEM,
            new Identifier(MavelandMod.MOD_ID, name),
            new Item(itemSetting)
        );
    }

    public static void registerModItems() {
        MavelandMod.LOGGER.info("Registering items for mod " + MavelandMod.MOD_ID);
    }
}
