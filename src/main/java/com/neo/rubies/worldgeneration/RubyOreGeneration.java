package com.neo.rubies.worldgeneration;

import com.neo.rubies.blocks.rubyore.RubyOreBlock;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class RubyOreGeneration {
    private static final ConfiguredFeature<?, ?> RUBY_ORE_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
            RubyOreBlock.RUBY_ORE.getDefaultState(), 9)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 240)))
            .spreadHorizontally().repeat(20);

    public static void RubyOreGen() {
        RegistryKey<ConfiguredFeature<?, ?>> rubyOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier("ruby", "ruby_ore"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, rubyOreOverworld.getValue(), RUBY_ORE_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, rubyOreOverworld);
    }
}
