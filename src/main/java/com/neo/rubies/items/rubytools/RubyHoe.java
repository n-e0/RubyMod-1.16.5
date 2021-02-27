package com.neo.rubies.items.rubytools;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class RubyHoe extends HoeItem {

    public RubyHoe(ToolMaterial toolMaterial) {
        super(toolMaterial,4, -2, new Settings().group(ItemGroup.TOOLS));
    }
}