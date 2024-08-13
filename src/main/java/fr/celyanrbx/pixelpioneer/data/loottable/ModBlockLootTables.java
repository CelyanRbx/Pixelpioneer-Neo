package fr.celyanrbx.pixelpioneer.data.loottable;

import fr.celyanrbx.pixelpioneer.PixelPioneer;
import fr.celyanrbx.pixelpioneer.init.BlockInit;
import fr.celyanrbx.pixelpioneer.init.ItemInit;
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
        add(BlockInit.SAPPHIRE_ORE.get(), createOreDrop(BlockInit.SAPPHIRE_ORE.get(), ItemInit.RAW_SAPPHIRE.get()));
        add(BlockInit.DEEPSLATE_SAPPHIRE_ORE.get(), createOreDrop(BlockInit.DEEPSLATE_SAPPHIRE_ORE.get(), ItemInit.RAW_SAPPHIRE.get()));
        add(BlockInit.RUBY_ORE.get(), createOreDrop(BlockInit.RUBY_ORE.get(), ItemInit.RAW_RUBY.get()));
        add(BlockInit.DEEPSLATE_RUBY_ORE.get(), createOreDrop(BlockInit.DEEPSLATE_RUBY_ORE.get(), ItemInit.RAW_RUBY.get()));
        add(BlockInit.EMERALD_ORE.get(), createOreDrop(BlockInit.EMERALD_ORE.get(), ItemInit.RAW_EMERALD.get()));
        add(BlockInit.DEEPSLATE_EMERALD_ORE.get(), createOreDrop(BlockInit.DEEPSLATE_EMERALD_ORE.get(), ItemInit.RAW_EMERALD.get()));
        add(BlockInit.STEEL_ORE.get(), createOreDrop(BlockInit.STEEL_ORE.get(), ItemInit.RAW_STEEL.get()));
        add(BlockInit.DEEPSLATE_STEEL_ORE.get(), createOreDrop(BlockInit.DEEPSLATE_STEEL_ORE.get(), ItemInit.RAW_STEEL.get()));
        add(BlockInit.BISMUTH_ORE.get(), createOreDrop(BlockInit.BISMUTH_ORE.get(), ItemInit.RAW_BISMUTH.get()));
        add(BlockInit.DEEPSLATE_BISMUTH_ORE.get(), createOreDrop(BlockInit.DEEPSLATE_BISMUTH_ORE.get(), ItemInit.RAW_BISMUTH.get()));

        dropSelf(BlockInit.SAPPHIRE_BLOCK.get());
        dropSelf(BlockInit.RAW_SAPPHIRE_BLOCK.get());
        dropSelf(BlockInit.RUBY_BLOCK.get());
        dropSelf(BlockInit.RAW_RUBY_BLOCK.get());
        dropSelf(BlockInit.EMERALD_BLOCK.get());
        dropSelf(BlockInit.RAW_EMERALD_BLOCK.get());
        dropSelf(BlockInit.STEEL_BLOCK.get());
        dropSelf(BlockInit.RAW_STEEL_BLOCK.get());
        dropSelf(BlockInit.BISMUTH_BLOCK.get());
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
