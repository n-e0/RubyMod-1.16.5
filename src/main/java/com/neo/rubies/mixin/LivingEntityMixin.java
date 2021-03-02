package com.neo.rubies.mixin;

import com.neo.rubies.items.rubyarmour.RubyBoots;
import com.neo.rubies.items.rubyarmour.RubyChestplate;
import com.neo.rubies.items.rubyarmour.RubyHelmet;
import com.neo.rubies.items.rubyarmour.RubyLeggings;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;


@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin extends Entity {

    @Shadow
    @Final
    private DefaultedList<ItemStack> equippedArmor;
    private int ArmourCount;

    public LivingEntityMixin(EntityType<?> type, World world) {
        super(type, world);
    }

    @Inject(at = @At("HEAD"), method = "tick")
    private void tick(CallbackInfo info) {
        if (isOnFire()) {
            ItemStack HelmetStack1 = equippedArmor.get(3);
            ItemStack ChestplateStack1 = equippedArmor.get(2);
            ItemStack LeggingsStack1 = equippedArmor.get(1);
            ItemStack BootsStack1 = equippedArmor.get(0);

            int ArmourCount = 0;

            if (HelmetStack1.getItem().equals(RubyHelmet.RUBYHELMET)) {
                ArmourCount++;
            }
            if (ChestplateStack1.getItem().equals(RubyChestplate.RUBYCHESTPLATE)) {
                ArmourCount++;
            }
            if (LeggingsStack1.getItem().equals(RubyLeggings.RUBYLEGGINGS)) {
                ArmourCount++;
            }
            if (BootsStack1.getItem().equals(RubyBoots.RUBYBOOTS)) {
                ArmourCount++;
            }

            if (ArmourCount >= 1) {
                this.setFireTicks(0);
            }
        }
    }

    @Inject(at = @At("HEAD"), method = "damage",cancellable = true)
    private void damage(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir) {
        ItemStack HelmetStack2 = equippedArmor.get(3);
        ItemStack ChestplateStack2 = equippedArmor.get(2);
        ItemStack LeggingsStack2 = equippedArmor.get(1);
        ItemStack BootsStack2 = equippedArmor.get(0);

        if (source.isFire()) {

            int ArmourCount2 = 0;

            if (HelmetStack2.getItem().equals(RubyHelmet.RUBYHELMET)) {
                ArmourCount2++;
            }
            if (ChestplateStack2.getItem().equals(RubyChestplate.RUBYCHESTPLATE)) {
                ArmourCount2++;
            }
            if (LeggingsStack2.getItem().equals(RubyLeggings.RUBYLEGGINGS)) {
                ArmourCount2++;
            }
            if (BootsStack2.getItem().equals(RubyBoots.RUBYBOOTS)) {
                ArmourCount2++;
            }
            if (ArmourCount2 == 4) {
                cir.setReturnValue(false);
            }
        }
    }
}
