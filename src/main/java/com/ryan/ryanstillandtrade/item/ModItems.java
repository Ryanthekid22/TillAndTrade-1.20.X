package com.ryan.ryanstillandtrade.item;

import com.ryan.ryanstillandtrade.RyansTillAndTrade;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item TOMATO = registerItem("tomato", new Item(new FabricItemSettings().food(ModFoodComponents.TOMATO)));
    public static final Item MANGO = registerItem("mango", new Item(new FabricItemSettings().food(ModFoodComponents.MANGO)));
    public static final Item PINEAPPLE = registerItem("pineapple", new Item(new FabricItemSettings().food(ModFoodComponents.PINEAPPLE)));
    public static final Item ORANGE = registerItem("orange", new Item(new FabricItemSettings().food(ModFoodComponents.ORANGE)));
    public static final Item GRAPE = registerItem("grape", new Item(new FabricItemSettings().food(ModFoodComponents.GRAPE)));


    public static final Item BROCCOLI = registerItem("broccoli", new Item(new FabricItemSettings().food(ModFoodComponents.BROCCOLI)));
    public static final Item CAULIFLOWER = registerItem("cauliflower", new Item(new FabricItemSettings().food(ModFoodComponents.CAULIFLOWER)));
    public static final Item ASPARAGUS = registerItem("asparagus", new Item(new FabricItemSettings().food(ModFoodComponents.ASPARAGUS)));
    public static final Item LETTUCE = registerItem("lettuce", new Item(new FabricItemSettings().food(ModFoodComponents.LETTUCE)));
    public static final Item ONION = registerItem("onion", new Item(new FabricItemSettings().food(ModFoodComponents.ONION)));

    public static final Item ROASTED_BEETROOT = registerItem("roasted_beetroot", new Item(new FabricItemSettings().food(ModFoodComponents.ROASTED_BEETROOT)));
    public static final Item ROASTED_CARROT = registerItem("roasted_carrot", new Item(new FabricItemSettings().food(ModFoodComponents.ROASTED_CARROT)));
    public static final Item ROASTED_BROCCOLI = registerItem("roasted_broccoli", new Item(new FabricItemSettings().food(ModFoodComponents.ROASTED_BROCCOLI)));
    public static final Item ROASTED_CAULIFLOWER = registerItem("roasted_cauliflower", new Item(new FabricItemSettings().food(ModFoodComponents.ROASTED_CAULIFLOWER)));
    public static final Item ROASTED_ASPARAGUS = registerItem("roasted_asparagus", new Item(new FabricItemSettings().food(ModFoodComponents.ROASTED_ASPARAGUS)));
    public static final Item ROASTED_ONION = registerItem("roasted_onion", new Item(new FabricItemSettings().food(ModFoodComponents.ROASTED_ONION)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(RyansTillAndTrade.MOD_ID, name), item);
    }
    public static void registerModItems(){
        RyansTillAndTrade.LOGGER.info("Registering Mod Items for " + RyansTillAndTrade.MOD_ID);
    }
}
