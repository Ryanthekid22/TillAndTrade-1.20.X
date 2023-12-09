package com.ryan.ryanstillandtrade.item;

import com.ryan.ryanstillandtrade.RyansTillAndTrade;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    //FRUITS
    public static final Item TOMATO = registerItem("tomato", new Item(new FabricItemSettings().food(ModFoodComponents.TOMATO)));
    public static final Item MANGO = registerItem("mango", new Item(new FabricItemSettings().food(ModFoodComponents.MANGO)));
    public static final Item PINEAPPLE = registerItem("pineapple", new Item(new FabricItemSettings().food(ModFoodComponents.PINEAPPLE)));
    public static final Item ORANGE = registerItem("orange", new Item(new FabricItemSettings().food(ModFoodComponents.ORANGE)));
    public static final Item GRAPE = registerItem("grape", new Item(new FabricItemSettings().food(ModFoodComponents.GRAPE)));
    //VEGIES
    public static final Item BROCCOLI = registerItem("broccoli", new Item(new FabricItemSettings().food(ModFoodComponents.BROCCOLI)));
    public static final Item CAULIFLOWER = registerItem("cauliflower", new Item(new FabricItemSettings().food(ModFoodComponents.CAULIFLOWER)));
    public static final Item ASPARAGUS = registerItem("asparagus", new Item(new FabricItemSettings().food(ModFoodComponents.ASPARAGUS)));
    public static final Item LETTUCE = registerItem("lettuce", new Item(new FabricItemSettings().food(ModFoodComponents.LETTUCE)));
    public static final Item ONION = registerItem("onion", new Item(new FabricItemSettings().food(ModFoodComponents.ONION)));
    //ROASTED
    public static final Item ROASTED_BEETROOT = registerItem("roasted_beetroot", new Item(new FabricItemSettings().food(ModFoodComponents.ROASTED_BEETROOT)));
    public static final Item ROASTED_CARROT = registerItem("roasted_carrot", new Item(new FabricItemSettings().food(ModFoodComponents.ROASTED_CARROT)));
    public static final Item ROASTED_BROCCOLI = registerItem("roasted_broccoli", new Item(new FabricItemSettings().food(ModFoodComponents.ROASTED_BROCCOLI)));
    public static final Item ROASTED_CAULIFLOWER = registerItem("roasted_cauliflower", new Item(new FabricItemSettings().food(ModFoodComponents.ROASTED_CAULIFLOWER)));
    public static final Item ROASTED_ASPARAGUS = registerItem("roasted_asparagus", new Item(new FabricItemSettings().food(ModFoodComponents.ROASTED_ASPARAGUS)));
    public static final Item ROASTED_ONION = registerItem("roasted_onion", new Item(new FabricItemSettings().food(ModFoodComponents.ROASTED_ONION)));
    //OTHER
    public static final Item CHEESE = registerItem("cheese", new Item(new FabricItemSettings().food(ModFoodComponents.CHEESE)));
    public static final Item BUTTER = registerItem("butter", new Item(new FabricItemSettings().food(ModFoodComponents.BUTTER)));
    public static final Item POTATO_SLICES = registerItem("potato_slices", new Item(new FabricItemSettings().food(ModFoodComponents.POTATO_SLICES)));
    public static final Item MASHED_POTATO = registerItem("mashed_potato", new Item(new FabricItemSettings().food(ModFoodComponents.MASHED_POTATO)));
    public static final Item RICE = registerItem("rice", new Item(new FabricItemSettings().food(ModFoodComponents.RICE)));
    public static final Item BAMBOO_SHOOTS = registerItem("bamboo_shoots", new Item(new FabricItemSettings().food(ModFoodComponents.BAMBOO_SHOOTS)));
    public static final Item FRIED_EGG = registerItem("fried_egg", new Item(new FabricItemSettings().food(ModFoodComponents.FRIED_EGG)));
    public static final Item OMELETTE = registerItem("omelette", new Item(new FabricItemSettings().food(ModFoodComponents.OMELETTE)));
    //JAM
    public static final Item KETCHUP = registerItem("ketchup", new Item(new FabricItemSettings().food(ModFoodComponents.KETCHUP)));
    public static final Item APPLE_SAUCE = registerItem("apple_sauce", new Item(new FabricItemSettings().food(ModFoodComponents.APPLE_SAUCE)));
    public static final Item MANGO_JAM = registerItem("mango_jam", new Item(new FabricItemSettings().food(ModFoodComponents.MANGO_JAM)));
    public static final Item GRAPE_JAM = registerItem("grape_jam", new Item(new FabricItemSettings().food(ModFoodComponents.GRAPE_JAM)));
    public static final Item SWEET_BERRY_JAM = registerItem("sweet_berry_jam", new Item(new FabricItemSettings().food(ModFoodComponents.SWEET_BERRY_JAM)));
    public static final Item GLOW_BERRY_JAM = registerItem("glow_berry_jam", new Item(new FabricItemSettings().food(ModFoodComponents.GLOW_BERRY_JAM)));
    //JUICES
    public static final Item CARROT_JUICE = registerItem("carrot_juice", new Item(new FabricItemSettings().food(ModFoodComponents.CARROT_JUICE)));
    public static final Item BEETROOT_JUICE = registerItem("beetroot_juice", new Item(new FabricItemSettings().food(ModFoodComponents.BEETROOT_JUICE)));
    public static final Item MELON_JUICE = registerItem("melon_juice", new Item(new FabricItemSettings().food(ModFoodComponents.MELON_JUICE)));
    public static final Item GRAPE_JUICE = registerItem("grape_juice", new Item(new FabricItemSettings().food(ModFoodComponents.GRAPE_JUICE)));
    public static final Item PINEAPPLE_JUICE = registerItem("pineapple_juice", new Item(new FabricItemSettings().food(ModFoodComponents.PINEAPPLE_JUICE)));
    public static final Item TOMATO_JUICE = registerItem("tomato_juice", new Item(new FabricItemSettings().food(ModFoodComponents.TOMATO_JUICE)));
    public static final Item MANGO_JUICE = registerItem("mango_juice", new Item(new FabricItemSettings().food(ModFoodComponents.MANGO_JUICE)));
    public static final Item ORANGE_JUICE = registerItem("orange_juice", new Item(new FabricItemSettings().food(ModFoodComponents.ORANGE_JUICE)));
    public static final Item APPLE_JUICE = registerItem("apple_juice", new Item(new FabricItemSettings().food(ModFoodComponents.APPLE_JUICE)));
    public static final Item GLOW_BERRY_JUICE = registerItem("glow_berry_juice", new Item(new FabricItemSettings().food(ModFoodComponents.GLOW_BERRY_JUICE)));
    public static final Item SWEET_BERRY_JUICE = registerItem("sweet_berry_juice", new Item(new FabricItemSettings().food(ModFoodComponents.SWEET_BERRY_JUICE)));
    public static final Item KELP_JUICE = registerItem("kelp_juice", new Item(new FabricItemSettings().food(ModFoodComponents.KELP_JUICE)));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(RyansTillAndTrade.MOD_ID, name), item);
    }
    public static void registerModItems(){
        RyansTillAndTrade.LOGGER.info("Registering Mod Items for " + RyansTillAndTrade.MOD_ID);
    }
}
