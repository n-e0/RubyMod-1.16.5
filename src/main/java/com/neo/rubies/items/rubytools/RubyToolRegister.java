package com.neo.rubies.items.rubytools;

import com.neo.rubies.Main;
import com.neo.rubies.modmaterials.ModToolMaterial;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RubyToolRegister {



    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "ruby_pickaxe"), new RubyPickaxe(new ModToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "ruby_axe.json"), new RubyAxe(new ModToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "ruby_sword"), new RubySword(new ModToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "ruby_shovel"), new RubyShovel(new ModToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "ruby_hoe.json"), new RubyHoe(new ModToolMaterial()));
    }
}
