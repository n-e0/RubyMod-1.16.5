package com.neo.rubies.ModMaterials;

import com.neo.rubies.items.Ruby;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ModToolMaterial implements ToolMaterial {

    @ Override
    public int getDurability() {
        return 3000;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 15;
    }

    @Override
    public float getAttackDamage() {
        return 4f;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Ruby.RUBY);
    }
}
