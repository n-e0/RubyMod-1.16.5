package com.neo.rubies.items.rubytools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class RubySword extends SwordItem {
    public RubySword(ToolMaterial toolMaterial) {
        super(toolMaterial,5, -1.6f, new Item.Settings().group(ItemGroup.TOOLS));


    }
}
