package fr.celyanrbx.pixelpioneer.data.loottable;

import fr.celyanrbx.pixelpioneer.PixelPioneer;
import fr.celyanrbx.pixelpioneer.block.ModBlocks;
import fr.celyanrbx.pixelpioneer.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class ModBlockLootTables extends BlockLootSubProvider {
    protected ModBlockLootTables(HolderLookup.Provider p_344943_) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), p_344943_);
    }

    @Override
    protected void generate() {
        add(ModBlocks.SAPPHIRE_ORE.get(), createOreDrop(ModBlocks.SAPPHIRE_ORE.get(), ModItems.RAW_SAPPHIRE.get()));
        add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), createOreDrop(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), ModItems.RAW_SAPPHIRE.get()));
        add(ModBlocks.RUBY_ORE.get(), createOreDrop(ModBlocks.RUBY_ORE.get(), ModItems.RAW_RUBY.get()));
        add(ModBlocks.DEEPSLATE_RUBY_ORE.get(), createOreDrop(ModBlocks.DEEPSLATE_RUBY_ORE.get(), ModItems.RAW_RUBY.get()));
        add(ModBlocks.EMERALD_ORE.get(), createOreDrop(ModBlocks.EMERALD_ORE.get(), ModItems.RAW_EMERALD.get()));
        add(ModBlocks.DEEPSLATE_EMERALD_ORE.get(), createOreDrop(ModBlocks.DEEPSLATE_EMERALD_ORE.get(), ModItems.RAW_EMERALD.get()));
        add(ModBlocks.STEEL_ORE.get(), createOreDrop(ModBlocks.STEEL_ORE.get(), ModItems.RAW_STEEL.get()));
        add(ModBlocks.DEEPSLATE_STEEL_ORE.get(), createOreDrop(ModBlocks.DEEPSLATE_STEEL_ORE.get(), ModItems.RAW_STEEL.get()));
        add(ModBlocks.BISMUTH_ORE.get(), createOreDrop(ModBlocks.BISMUTH_ORE.get(), ModItems.RAW_BISMUTH.get()));
        add(ModBlocks.DEEPSLATE_BISMUTH_ORE.get(), createOreDrop(ModBlocks.DEEPSLATE_BISMUTH_ORE.get(), ModItems.RAW_BISMUTH.get()));

        dropSelf(ModBlocks.SAPPHIRE_BLOCK.get());
        dropSelf(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
        dropSelf(ModBlocks.RUBY_BLOCK.get());
        dropSelf(ModBlocks.RAW_RUBY_BLOCK.get());
        dropSelf(ModBlocks.EMERALD_BLOCK.get());
        dropSelf(ModBlocks.RAW_EMERALD_BLOCK.get());
        dropSelf(ModBlocks.STEEL_BLOCK.get());
        dropSelf(ModBlocks.RAW_STEEL_BLOCK.get());
        dropSelf(ModBlocks.BISMUTH_BLOCK.get());
        dropSelf(ModBlocks.MAGIC_BLOCK.get());
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return BuiltInRegistries.BLOCK.stream()
                .filter(block -> Optional.of(BuiltInRegistries.BLOCK.getKey(block))
                        .filter(key -> key.getNamespace().equals(PixelPioneer.MOD_ID))
                        .isPresent())
                .collect(Collectors.toSet());
    }
}
