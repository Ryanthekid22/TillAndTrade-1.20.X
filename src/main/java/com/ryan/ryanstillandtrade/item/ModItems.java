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

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(RyansTillAndTrade.MOD_ID, name), item);
    }
    public static void registerModItems(){
        RyansTillAndTrade.LOGGER.info("Registering Mod Items for " + RyansTillAndTrade.MOD_ID);
    }
}
