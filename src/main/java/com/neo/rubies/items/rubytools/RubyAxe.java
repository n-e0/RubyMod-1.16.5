package com.neo.rubies.items.rubytools;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class RubyAxe extends AxeItem {

    public RubyAxe(ToolMaterial toolMaterial) {
        super(toolMaterial,8, -0.8f, new Item.Settings().group(ItemGroup.TOOLS));


    }

}
