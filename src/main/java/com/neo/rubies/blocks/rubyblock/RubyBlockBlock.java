package com.neo.rubies.blocks.rubyblock;

import com.neo.rubies.Main;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RubyBlockBlock {

    public static final Block RUBY_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL)
            .breakByTool(FabricToolTags.PICKAXES, 3) //0 = wood, 4 = netherite//
            .requiresTool()
            /* see https://minecraftmodcustomstuff.fandom.com/wiki/Hardness*/
            .strength(5.0f , 30.0f)
            /*see https://minecraftmodcustomstuff.fandom.com/wiki/Resistance*/
            .sounds(BlockSoundGroup.METAL));

    public static void register() {
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "ruby_block"), RUBY_BLOCK);
    }
}
