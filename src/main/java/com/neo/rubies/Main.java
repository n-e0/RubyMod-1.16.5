package com.neo.rubies;

import com.neo.rubies.blocks.rubyblock.RubyBlockBlock;
import com.neo.rubies.blocks.rubyblock.RubyBlockItem;
import com.neo.rubies.blocks.rubyore.RubyOreBlock;
import com.neo.rubies.items.Ruby;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;



public class Main implements ModInitializer {

    public static final String MOD_ID = "ruby";

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "main"))
            .icon(() -> new ItemStack(RubyBlockItem.RUBY_BLOCK))
            .appendItems(stacks ->{

                //items
                stacks.add(new ItemStack(Ruby.RUBY));

                //blocks
                stacks.add(new ItemStack(RubyBlockBlock.RUBY_BLOCK));
                stacks.add(new ItemStack(RubyOreBlock.RUBY_ORE));
            })
            .build();

    @Override
    public void onInitialize() {
        Registry.register();
    }
}
