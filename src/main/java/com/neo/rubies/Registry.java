package com.neo.rubies;

import com.neo.rubies.blocks.rubyblock.RubyBlockRegister;
import com.neo.rubies.blocks.rubyore.RubyOreRegister;
import com.neo.rubies.items.Ruby;
import com.neo.rubies.items.rubyarmour.RubyArmourRegister;
import com.neo.rubies.items.rubytools.RubyToolRegister;
import com.neo.rubies.worldgeneration.RubyOreGeneration;


public class Registry {
    public static void register() {

        //Items
        Ruby.register();

        //tools
        RubyToolRegister.register();

        //armour
        RubyArmourRegister.register();

        //Blocks
        RubyBlockRegister.register();
        RubyOreRegister.register();

        //world generation
        RubyOreGeneration.RubyOreGen();
}

}
