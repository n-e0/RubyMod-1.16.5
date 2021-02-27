package com.neo.rubies.items.rubytools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class RubyPickaxe extends PickaxeItem {

    public RubyPickaxe(ToolMaterial toolMaterial) {
        super(toolMaterial,1, -1.2f, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
