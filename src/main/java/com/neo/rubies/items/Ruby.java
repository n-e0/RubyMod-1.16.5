package com.neo.rubies.items;

import com.neo.rubies.Main;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Ruby {

    public static final Item RUBY = new Item(new Item.Settings());

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "ruby"), RUBY);
    }
}
