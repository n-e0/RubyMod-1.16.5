package com.neo.rubies.blocks.rubyblock;

import com.neo.rubies.Main;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RubyBlockItem {
    public static final BlockItem RUBY_BLOCK = new BlockItem(RubyBlockBlock.RUBY_BLOCK, new Item.Settings());

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "ruby_block"), RUBY_BLOCK);
    }

}
