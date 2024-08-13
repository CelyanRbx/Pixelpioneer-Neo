package fr.celyanrbx.pixelpioneer.data.worldgen.ore;

import fr.celyanrbx.pixelpioneer.PixelPioneer;
import fr.celyanrbx.pixelpioneer.init.BlockInit;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {
    protected static ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SAPPHIRE_ORE = createKey("overworld_sapphire_ore");
    protected static ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RUBY_ORE = createKey("overworld_ruby_ore");
    protected static ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_EMERALD_ORE = createKey("overworld_emerald_ore");
    protected static ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_STEEL_ORE = createKey("overworld_steel_ore");
    protected static ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_BISMUTH_ORE = createKey("overworld_bismuth_ore");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?,?>> context) {
        RuleTest stoneReplacable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplacable = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreConfiguration.TargetBlockState> sapphireOre =
                List.of(OreConfiguration.target(stoneReplacable, BlockInit.SAPPHIRE_BLOCK.get().defaultBlockState()),
                        OreConfiguration.target(deepslateReplacable, BlockInit.SAPPHIRE_BLOCK.get().defaultBlockState()));

        register(context, OVERWORLD_SAPPHIRE_ORE, Feature.ORE, new OreConfiguration(sapphireOre, 4));

        List<OreConfiguration.TargetBlockState> rubyOre =
                List.of(OreConfiguration.target(stoneReplacable, BlockInit.RUBY_BLOCK.get().defaultBlockState()),
                        OreConfiguration.target(deepslateReplacable, BlockInit.RUBY_BLOCK.get().defaultBlockState()));

        register(context, OVERWORLD_RUBY_ORE, Feature.ORE, new OreConfiguration(rubyOre, 4));

        List<OreConfiguration.TargetBlockState> emeraldOre =
                List.of(OreConfiguration.target(stoneReplacable, BlockInit.EMERALD_BLOCK.get().defaultBlockState()),
                        OreConfiguration.target(deepslateReplacable, BlockInit.EMERALD_BLOCK.get().defaultBlockState()));

        register(context, OVERWORLD_EMERALD_ORE, Feature.ORE, new OreConfiguration(emeraldOre, 4));

        List<OreConfiguration.TargetBlockState> steelOre =
                List.of(OreConfiguration.target(stoneReplacable, BlockInit.STEEL_BLOCK.get().defaultBlockState()),
                        OreConfiguration.target(deepslateReplacable, BlockInit.STEEL_BLOCK.get().defaultBlockState()));

        register(context, OVERWORLD_STEEL_ORE, Feature.ORE, new OreConfiguration(steelOre, 4));

        List<OreConfiguration.TargetBlockState> bismuthOre =
                List.of(OreConfiguration.target(stoneReplacable, BlockInit.BISMUTH_BLOCK.get().defaultBlockState()),
                        OreConfiguration.target(deepslateReplacable, BlockInit.BISMUTH_BLOCK.get().defaultBlockState()));

        register(context, OVERWORLD_BISMUTH_ORE, Feature.ORE, new OreConfiguration(bismuthOre, 4));
    }

    private static ResourceKey<ConfiguredFeature<?, ?>> createKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(PixelPioneer.MOD_ID, name));
    }

    private static  <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?,?>> key, F feature, FC config) {
        context.register(key, new ConfiguredFeature<>(feature, config));
    }
}
