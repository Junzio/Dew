package com.junzio.dew.Item;

import com.junzio.dew.Dew;
import com.junzio.dew.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup Dew_Group = Registry.register(Registries.ITEM_GROUP,new Identifier(Dew.MOD_ID,
            "dew_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.dew_group"))
                    .icon(()->new ItemStack(ModItems.ITEM_ESSENCE))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ITEM_ESSENCE);
                        entries.add(ModBlocks.Wirte_Block);

                    }).build());
    public static void registerModItemGroup(){

    }
}
