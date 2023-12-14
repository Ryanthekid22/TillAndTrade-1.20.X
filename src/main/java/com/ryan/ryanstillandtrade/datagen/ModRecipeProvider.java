package com.ryan.ryanstillandtrade.datagen;

import com.ryan.ryanstillandtrade.block.ModBlocks;
import com.ryan.ryanstillandtrade.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerShapelessRecipe(exporter, ModBlocks.MANGO_PLANKS, ModBlocks.MANGO_LOG, "RYANSTILLANDTRADE_GROUP", 4);

        //ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DIAMOND_SCYTHE, 1)
        //        .pattern("b")
        //        .pattern("s")
        //        .pattern("s")
        //        .input('s', Items.STICK)
        //        .input('b', ModItems.DIAMOND_SCYTHE_BLADE)
        //        .criterion(hasItem(ModItems.DIAMOND_SCYTHE_BLADE), conditionsFromItem(ModItems.DIAMOND_SCYTHE_BLADE))
        //        .offerTo(exporter, new Identifier(getRecipeName(ModItems.DIAMOND_SCYTHE)));

        //ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GOLD_SCYTHE, 1)
        //        .pattern("b")
        //        .pattern("s")
        //        .pattern("s")
        //        .input('s', Items.STICK)
        //        .input('b', ModItems.GOLD_SCYTHE_BLADE)
        //        .criterion(hasItem(ModItems.GOLD_SCYTHE_BLADE), conditionsFromItem(ModItems.GOLD_SCYTHE_BLADE))
        //        .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOLD_SCYTHE)));

        //ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.IRON_SCYTHE, 1)
        //        .pattern("b")
        //        .pattern("s")
        //        .pattern("s")
        //        .input('s', Items.STICK)
        //        .input('b', ModItems.IRON_SCYTHE_BLADE)
        //        .criterion(hasItem(ModItems.IRON_SCYTHE_BLADE), conditionsFromItem(ModItems.IRON_SCYTHE_BLADE))
        //        .offerTo(exporter, new Identifier(getRecipeName(ModItems.IRON_SCYTHE)));
    }
}
