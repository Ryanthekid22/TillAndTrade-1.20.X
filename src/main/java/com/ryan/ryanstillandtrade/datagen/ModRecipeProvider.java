package com.ryan.ryanstillandtrade.datagen;

import com.ryan.ryanstillandtrade.block.ModBlocks;
import com.ryan.ryanstillandtrade.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.recipe.book.RecipeCategory;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerShapelessRecipe(exporter, ModBlocks.MANGO_PLANKS, ModBlocks.MANGO_LOG, "RYANSTILLANDTRADE_GROUP", 4);
    }
}
