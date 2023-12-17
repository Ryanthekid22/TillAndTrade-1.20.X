package com.ryan.ryanstillandtrade.datagen;

import com.ryan.ryanstillandtrade.block.ModBlocks;
import com.ryan.ryanstillandtrade.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.AbstractCookingRecipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.recipe.SmeltingRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerShapelessRecipe(exporter, ModBlocks.MANGO_PLANKS, ModBlocks.MANGO_LOG, "RYANSTILLANDTRADE_GROUP", 4);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DIAMOND_SCYTHE, 1)
                .pattern("bbb")
                .pattern("s b")
                .pattern("s  ")
                .input('s', Items.STICK)
                .input('b', Items.DIAMOND)
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DIAMOND_SCYTHE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GOLD_SCYTHE, 1)
                .pattern("bbb")
                .pattern("s b")
                .pattern("s  ")
                .input('s', Items.STICK)
                .input('b', Items.GOLD_INGOT)
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOLD_SCYTHE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.IRON_SCYTHE, 1)
                .pattern("bbb")
                .pattern("s b")
                .pattern("s  ")
                .input('s', Items.STICK)
                .input('b', Items.IRON_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.IRON_SCYTHE)));

        offerNetheriteUpgradeRecipe(exporter, ModItems.DIAMOND_SCYTHE,RecipeCategory.TOOLS,ModItems.NETHERITE_SCYTHE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.IRON_KNIFE, 1)
                .pattern("b")
                .pattern("s")
                .input('s', Items.STICK)
                .input('b', Items.IRON_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.IRON_KNIFE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GOLD_KNIFE, 1)
                .pattern("b")
                .pattern("s")
                .input('s', Items.STICK)
                .input('b', Items.GOLD_INGOT)
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOLD_KNIFE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DIAMOND_KNIFE, 1)
                .pattern("b")
                .pattern("s")
                .input('s', Items.STICK)
                .input('b', Items.DIAMOND)
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DIAMOND_KNIFE)));

        offerNetheriteUpgradeRecipe(exporter, ModItems.DIAMOND_KNIFE,RecipeCategory.TOOLS,ModItems.NETHERITE_KNIFE);

    }
}
