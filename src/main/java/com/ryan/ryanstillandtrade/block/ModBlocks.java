package com.ryan.ryanstillandtrade.block;

import com.ryan.ryanstillandtrade.RyansTillAndTrade;
import com.ryan.ryanstillandtrade.block.custom.TomatoCropBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block MANGO_LOG = registerBlock("mango_log",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block MANGO_PLANKS = registerBlock("mango_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block TOMATO_CROP = Registry.register(Registries.BLOCK, new Identifier(RyansTillAndTrade.MOD_ID, "tomato_crop"),
            new TomatoCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block PINEAPPLE_CROP = Registry.register(Registries.BLOCK, new Identifier(RyansTillAndTrade.MOD_ID, "pineapple_crop"),
            new TomatoCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block LETTUCE_CROP = Registry.register(Registries.BLOCK, new Identifier(RyansTillAndTrade.MOD_ID, "lettuce_crop"),
            new TomatoCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block GRAPE_CROP = Registry.register(Registries.BLOCK, new Identifier(RyansTillAndTrade.MOD_ID, "grape_crop"),
            new TomatoCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block CAULIFLOWER_CROP = Registry.register(Registries.BLOCK, new Identifier(RyansTillAndTrade.MOD_ID, "cauliflower_crop"),
            new TomatoCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block BROCCOLI_CROP = Registry.register(Registries.BLOCK, new Identifier(RyansTillAndTrade.MOD_ID, "broccoli_crop"),
            new TomatoCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block ASPARAGUS_CROP = Registry.register(Registries.BLOCK, new Identifier(RyansTillAndTrade.MOD_ID, "asparagus_crop"),
            new TomatoCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(RyansTillAndTrade.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(RyansTillAndTrade.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        RyansTillAndTrade.LOGGER.info("Registering ModBlocks for " + RyansTillAndTrade.MOD_ID);
    }
}
