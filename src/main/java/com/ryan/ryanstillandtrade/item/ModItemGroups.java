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

                        //REST
                        entries.add(ModBlocks.MANGO_LOG);
                        entries.add(ModBlocks.MANGO_PLANKS);

                    }).build());

    public static void registerItemGroups(){
        RyansTillAndTrade.LOGGER.info("Registering Mod Item Groups for " + RyansTillAndTrade.MOD_ID);
    }
}
