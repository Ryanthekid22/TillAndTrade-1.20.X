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
                        entries.add(ModItems.TOMATO);
                        entries.add(ModItems.MANGO);
                        entries.add(ModItems.PINEAPPLE);
                        entries.add(ModItems.ORANGE);
                        entries.add(ModItems.GRAPE);

                        entries.add(ModBlocks.MANGO_LOG);
                        entries.add(ModBlocks.MANGO_PLANKS);

                    }).build());

    public static void registerItemGroups(){
        RyansTillAndTrade.LOGGER.info("Registering Mod Item Groups for " + RyansTillAndTrade.MOD_ID);
    }
}
