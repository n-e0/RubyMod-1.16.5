package com.neo.rubies.blocks.rubyore;

import com.neo.rubies.Main;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RubyOreBlock {
    public static final Block RUBY_ORE = new RubyOre(FabricBlockSettings.copy(Blocks.EMERALD_ORE));

    public static void register () {
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "ruby_ore"), RUBY_ORE);
    }
}
