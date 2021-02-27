package com.neo.rubies.items.rubytools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class RubyShovel extends ShovelItem {
    public RubyShovel(ToolMaterial toolMaterial) {
        super(toolMaterial,3f, -1, new Item.Settings().group(ItemGroup.TOOLS));


    }
}
