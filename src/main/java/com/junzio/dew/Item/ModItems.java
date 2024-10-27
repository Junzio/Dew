package com.junzio.dew.Item;

import com.junzio.dew.Dew;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item ITEM_ESSENCE = registerItems("item_essence",new Item(new FabricItemSettings().maxCount(16)));
    private static void addItemsToIG(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(ITEM_ESSENCE);
    }
    private static Item registerItems(String Item_Id,Item item){
        return Registry.register(Registries.ITEM,new Identifier(Dew.MOD_ID,Item_Id),item);
    }

    public static void registerModItems(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIG);
    }
}
