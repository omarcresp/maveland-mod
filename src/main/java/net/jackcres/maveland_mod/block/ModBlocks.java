package net.jackcres.maveland_mod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.jackcres.maveland_mod.MavelandMod;
import net.jackcres.maveland_mod.item.ModItemsGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block MYTHRIL_BLOCK = registerBlock(
            "mythril_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()),
            ModItemsGroup.MYTHRIL
    );
    public static final Block MYTHRIL_ORE = registerBlock(
            "mythril_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()),
            ModItemsGroup.MYTHRIL
    );
    public static final Block DEEPSLATE_MYTHRIL_ORE = registerBlock(
            "deepslate_mythril_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(5f).requiresTool()),
            ModItemsGroup.MYTHRIL
    );
    public static final Block NETHERRACK_MYTHRIL_ORE = registerBlock(
            "netherrack_mythril_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()),
            ModItemsGroup.MYTHRIL
    );

    public static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);

        return Registry.register(
                Registry.BLOCK,
                new Identifier(MavelandMod.MOD_ID, name),
                block
        );
    }

    public static void registerBlockItem(String name, Block block, ItemGroup group) {
        Registry.register(
                Registry.ITEM,
                new Identifier(MavelandMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group))
        );
    }

    public static void registerModBlocks() {
        MavelandMod.LOGGER.info("Registering blocks for mod " + MavelandMod.MOD_ID);
    }
}
