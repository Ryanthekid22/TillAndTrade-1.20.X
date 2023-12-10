package com.ryan.ryanstillandtrade.datagen;

import com.ryan.ryanstillandtrade.block.ModBlocks;
import com.ryan.ryanstillandtrade.block.custom.*;
import com.ryan.ryanstillandtrade.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.MANGO_LOG);
        addDrop(ModBlocks.MANGO_PLANKS);

        //CROP BLOCKS
        BlockStatePropertyLootCondition.Builder tomatoBuilder = BlockStatePropertyLootCondition.builder(ModBlocks.TOMATO_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(TomatoCropBlock.AGE,5));
        addDrop(ModBlocks.TOMATO_CROP, cropDrops(ModBlocks.TOMATO_CROP, ModItems.TOMATO, ModItems.TOMATO_SEEDS, tomatoBuilder));

        BlockStatePropertyLootCondition.Builder pineappleBuilder = BlockStatePropertyLootCondition.builder(ModBlocks.PINEAPPLE_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(PineappleCropBlock.AGE,5));
        addDrop(ModBlocks.PINEAPPLE_CROP, cropDrops(ModBlocks.PINEAPPLE_CROP, ModItems.PINEAPPLE, ModItems.PINEAPPLE_SEEDS, pineappleBuilder));

        BlockStatePropertyLootCondition.Builder lettuceBuilder = BlockStatePropertyLootCondition.builder(ModBlocks.LETTUCE_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(LettuceCropBlock.AGE,5));
        addDrop(ModBlocks.LETTUCE_CROP, cropDrops(ModBlocks.LETTUCE_CROP, ModItems.LETTUCE, ModItems.LETTUCE_SEEDS, lettuceBuilder));

        BlockStatePropertyLootCondition.Builder grapeBuilder = BlockStatePropertyLootCondition.builder(ModBlocks.GRAPE_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(GrapeCropBlock.AGE,5));
        addDrop(ModBlocks.GRAPE_CROP, cropDrops(ModBlocks.GRAPE_CROP, ModItems.GRAPE, ModItems.GRAPE_SEEDS, grapeBuilder));

        BlockStatePropertyLootCondition.Builder cauliflowerBuilder = BlockStatePropertyLootCondition.builder(ModBlocks.CAULIFLOWER_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(CauliflowerCropBlock.AGE,5));
        addDrop(ModBlocks.CAULIFLOWER_CROP, cropDrops(ModBlocks.CAULIFLOWER_CROP, ModItems.CAULIFLOWER, ModItems.CAULIFLOWER_SEEDS, cauliflowerBuilder));

        BlockStatePropertyLootCondition.Builder broccoliBuilder = BlockStatePropertyLootCondition.builder(ModBlocks.BROCCOLI_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(BroccoliCropBlock.AGE,5));
        addDrop(ModBlocks.BROCCOLI_CROP, cropDrops(ModBlocks.BROCCOLI_CROP, ModItems.BROCCOLI, ModItems.BROCCOLI_SEEDS, broccoliBuilder));

        BlockStatePropertyLootCondition.Builder asparagusBuilder = BlockStatePropertyLootCondition.builder(ModBlocks.ASPARAGUS_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(AsparagusCropBlock.AGE,5));
        addDrop(ModBlocks.ASPARAGUS_CROP, cropDrops(ModBlocks.ASPARAGUS_CROP, ModItems.ASPARAGUS, ModItems.ASPARAGUS_SEEDS, asparagusBuilder));


    }

}
