package com.ryan.ryanstillandtrade.item;

import com.ryan.ryanstillandtrade.RyansTillAndTrade;
import com.ryan.ryanstillandtrade.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RYANSTILLANDTRADE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(RyansTillAndTrade.MOD_ID, "tomato"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ryanstillandtrade_group"))
                    .icon(() -> new ItemStack(ModItems.TOMATO)).entries((displayContext, entries) -> {
                        //FRUITS
                        entries.add(ModItems.TOMATO);
                        entries.add(ModItems.MANGO);
                        entries.add(ModItems.PINEAPPLE);
                        entries.add(ModItems.ORANGE);
                        entries.add(ModItems.GRAPE);
                        //VEGIES
                        entries.add(ModItems.BROCCOLI);
                        entries.add(ModItems.CAULIFLOWER);
                        entries.add(ModItems.ASPARAGUS);
                        entries.add(ModItems.LETTUCE);
                        entries.add(ModItems.ONION);
                        //ROASTED
                        entries.add(ModItems.ROASTED_BEETROOT);
                        entries.add(ModItems.ROASTED_CARROT);
                        entries.add(ModItems.ROASTED_BROCCOLI);
                        entries.add(ModItems.ROASTED_CAULIFLOWER);
                        entries.add(ModItems.ROASTED_ASPARAGUS);
                        entries.add(ModItems.ROASTED_ONION);
                        //OTHER
                        entries.add(ModItems.CHEESE);
                        entries.add(ModItems.BUTTER);
                        entries.add(ModItems.POTATO_SLICES);
                        entries.add(ModItems.MASHED_POTATO);
                        entries.add(ModItems.RICE);
                        entries.add(ModItems.BAMBOO_SHOOTS);
                        entries.add(ModItems.FRIED_EGG);
                        entries.add(ModItems.OMELETTE);
                        //JAM
                        entries.add(ModItems.KETCHUP);
                        entries.add(ModItems.APPLE_SAUCE);
                        entries.add(ModItems.MANGO_JAM);
                        entries.add(ModItems.GRAPE_JAM);
                        entries.add(ModItems.SWEET_BERRY_JAM);
                        entries.add(ModItems.GLOW_BERRY_JAM);
                        //JUICES
                        entries.add(ModItems.CARROT_JUICE);
                        entries.add(ModItems.BEETROOT_JUICE);
                        entries.add(ModItems.MELON_JUICE);
                        entries.add(ModItems.GRAPE_JUICE);
                        entries.add(ModItems.PINEAPPLE_JUICE);
                        entries.add(ModItems.TOMATO_JUICE);
                        entries.add(ModItems.MANGO_JUICE);
                        entries.add(ModItems.ORANGE_JUICE);
                        entries.add(ModItems.APPLE_JUICE);
                        entries.add(ModItems.GLOW_BERRY_JUICE);
                        entries.add(ModItems.SWEET_BERRY_JUICE);
                        entries.add(ModItems.KELP_JUICE);
                        //MEALS
                        entries.add(ModItems.FRIED_RICE);
                        entries.add(ModItems.FISH_AND_CHIPS);
                        entries.add(ModItems.FRUIT_SALAD);
                        entries.add(ModItems.CARROT_CAKE);
                        entries.add(ModItems.APPLE_PIE);
                        //SANDWICHES
                        entries.add(ModItems.FISH_BURGER);
                        entries.add(ModItems.VEGGIE_SANDWICH);
                        entries.add(ModItems.HAM_AND_CHEESE_SANDWICH);
                        entries.add(ModItems.BACONATOR);
                        entries.add(ModItems.BACON_LETTUCE_TOMATO);
                        entries.add(ModItems.HAMBURGER);
                        entries.add(ModItems.GRAPE_JAM_SANDWICH);
                        entries.add(ModItems.SWEET_BERRY_JAM_SANDWICH);
                        entries.add(ModItems.GLOW_BERRY_JAM_SANDWICH);
                        entries.add(ModItems.MANGO_JAM_SANDWICH);
                        //SOUPS
                        entries.add(ModItems.ONION_SOUP);
                        entries.add(ModItems.VEGGIE_SOUP);
                        entries.add(ModItems.CHICKEN_SOUP);
                        entries.add(ModItems.FISH_SOUP);
                        entries.add(ModItems.PUMPKIN_SOUP);
                        entries.add(ModItems.TOMATO_SOUP);
                        //SUSHI
                        entries.add(ModItems.FISH_SUSHI);
                        entries.add(ModItems.CHICKEN_SUSHI);
                        entries.add(ModItems.VEGGIE_SUSHI);
                        //MEAT
                        entries.add(ModItems.HAM);
                        entries.add(ModItems.COOKED_HAM);
                        entries.add(ModItems.BACON);
                        entries.add(ModItems.COOKED_BACON);
                        entries.add(ModItems.PATTY);
                        entries.add(ModItems.COOKED_PATTY);
                        entries.add(ModItems.DRUMSTICK);
                        entries.add(ModItems.COOKED_DRUMSTICK);
                        entries.add(ModItems.DUCK);
                        entries.add(ModItems.COOKED_DUCK);
                        entries.add(ModItems.FISH_FILLET);
                        //FARMING
                        entries.add(ModItems.IRON_SCYTHE_BLADE);
                        entries.add(ModItems.GOLD_SCYTHE_BLADE);
                        entries.add(ModItems.DIAMOND_SCYTHE_BLADE);
                        entries.add(ModItems.NETHERITE_SCYTHE_BLADE);
                        entries.add(ModItems.IRON_SCYTHE);
                        entries.add(ModItems.GOLD_SCYTHE);
                        entries.add(ModItems.DIAMOND_SCYTHE);
                        entries.add(ModItems.NETHERITE_SCYTHE);
                        entries.add(ModItems.IRON_KNIFE);
                        entries.add(ModItems.GOLD_KNIFE);
                        entries.add(ModItems.DIAMOND_KNIFE);
                        entries.add(ModItems.NETHERITE_KNIFE);
                        entries.add(ModItems.FRUIT_STICK);
                        //MEALPREP
                        entries.add(ModItems.CHURN_BASE);
                        //MINING
                        entries.add(ModItems.CHISEL);
                        entries.add(ModItems.CRUSHING_WHEEL);
                        entries.add(ModItems.SIEVE);
                        //WEARABLES
                        entries.add(ModItems.RUBY_ARMOR_TRIM);
                        entries.add(ModItems.TOPAZ_ARMOR_TRIM);
                        entries.add(ModItems.SAPPHIRE_ARMOR_TRIM);
                        entries.add(ModItems.AMETHYST_ARMOR_TRIM);
                        //CROWN
                        entries.add(ModItems.RUBY_CROWN);
                        entries.add(ModItems.TOPAZ_CROWN);
                        entries.add(ModItems.SAPPHIRE_CROWN);
                        entries.add(ModItems.AMETHYST_CROWN);
                        entries.add(ModItems.GOLD_CROWN);
                        entries.add(ModItems.DIAMOND_CROWN);
                        entries.add(ModItems.EMERALD_CROWN);
                        //misc
                        entries.add(ModItems.CUT_RUBY);
                        entries.add(ModItems.CUT_TOPAZ);
                        entries.add(ModItems.CUT_SAPPHIRE);
                        entries.add(ModItems.CUT_AMETHYST);

                        //REST
                        entries.add(ModBlocks.MANGO_LOG);
                        entries.add(ModBlocks.MANGO_PLANKS);

                    }).build());

    public static void registerItemGroups(){
        RyansTillAndTrade.LOGGER.info("Registering Mod Item Groups for " + RyansTillAndTrade.MOD_ID);
    }
}
