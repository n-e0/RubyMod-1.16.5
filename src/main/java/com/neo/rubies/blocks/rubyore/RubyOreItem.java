package com.neo.rubies.blocks.rubyore;

import com.neo.rubies.Main;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RubyOreItem {
    public static final BlockItem RUBY_ORE = new BlockItem(RubyOreBlock.RUBY_ORE, new Item.Settings());

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "ruby_ore"), RUBY_ORE);
    }
}
