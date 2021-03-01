package com.neo.rubies.items.rubyarmour;

import com.neo.rubies.Main;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.neo.rubies.items.rubyarmour.RubyHelmet.RUBYHELMET;
import static com.neo.rubies.items.rubyarmour.RubyChestplate.RUBYCHESTPLATE;
import static com.neo.rubies.items.rubyarmour.RubyLeggings.RUBYLEGGINGS;
import static com.neo.rubies.items.rubyarmour.RubyBoots.RUBYBOOTS;

public class RubyArmourRegister {

    public static void register() {

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "ruby_helmet"), RUBYHELMET);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "ruby_chestplate"), RUBYCHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "ruby_leggings"), RUBYLEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "ruby_boots"), RUBYBOOTS);

    }

}
