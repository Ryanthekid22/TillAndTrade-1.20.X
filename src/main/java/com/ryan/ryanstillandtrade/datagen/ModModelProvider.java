package com.ryan.ryanstillandtrade.datagen;

import com.ryan.ryanstillandtrade.block.ModBlocks;
import com.ryan.ryanstillandtrade.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MANGO_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MANGO_LOG);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        //FRUITS
        itemModelGenerator.register(ModItems.TOMATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.MANGO, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINEAPPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORANGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRAPE, Models.GENERATED);
        //VEGIES
        itemModelGenerator.register(ModItems.BROCCOLI, Models.GENERATED);
        itemModelGenerator.register(ModItems.CAULIFLOWER, Models.GENERATED);
        itemModelGenerator.register(ModItems.ASPARAGUS, Models.GENERATED);
        itemModelGenerator.register(ModItems.LETTUCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ONION, Models.GENERATED);
        //ROASTED
        itemModelGenerator.register(ModItems.ROASTED_BEETROOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROASTED_CARROT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROASTED_BROCCOLI, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROASTED_CAULIFLOWER, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROASTED_ASPARAGUS, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROASTED_ONION, Models.GENERATED);
        //OTHER
        itemModelGenerator.register(ModItems.CHEESE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BUTTER, Models.GENERATED);
        itemModelGenerator.register(ModItems.POTATO_SLICES, Models.GENERATED);
        itemModelGenerator.register(ModItems.MASHED_POTATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.RICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BAMBOO_SHOOTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.FRIED_EGG, Models.GENERATED);
        itemModelGenerator.register(ModItems.OMELETTE, Models.GENERATED);
        //JAM
        itemModelGenerator.register(ModItems.KETCHUP, Models.GENERATED);
        itemModelGenerator.register(ModItems.APPLE_SAUCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MANGO_JAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRAPE_JAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.SWEET_BERRY_JAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLOW_BERRY_JAM, Models.GENERATED);
        //JUICES
        itemModelGenerator.register(ModItems.CARROT_JUICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BEETROOT_JUICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MELON_JUICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRAPE_JUICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINEAPPLE_JUICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOMATO_JUICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MANGO_JUICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORANGE_JUICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.APPLE_JUICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLOW_BERRY_JUICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SWEET_BERRY_JUICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.KELP_JUICE, Models.GENERATED);

    }
}
