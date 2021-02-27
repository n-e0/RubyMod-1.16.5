package com.neo.rubies;

import com.neo.rubies.blocks.rubyblock.RubyBlockRegister;
import com.neo.rubies.blocks.rubyore.RubyOreRegister;
import com.neo.rubies.items.Ruby;
import com.neo.rubies.items.rubytools.RubyToolRegister;


public class Registry {
    public static void register() {

        //Items
        Ruby.register();

        //tools
        RubyToolRegister.register();

        //armour
        //RubyArmourRegister.register();

        //Blocks
        RubyBlockRegister.register();
        RubyOreRegister.register();
}

}
