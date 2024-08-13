package fr.celyanrbx.pixelpioneer.data.tag;

import fr.celyanrbx.pixelpioneer.PixelPioneer;
import fr.celyanrbx.pixelpioneer.init.BlockInit;
import fr.celyanrbx.pixelpioneer.init.TagsInit;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, PixelPioneer.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(TagsInit.BlockTagsInit.SAPPHIRE_BLOCK_TAG)
                .add(BlockInit.SAPPHIRE_BLOCK.get());

        tag(TagsInit.BlockTagsInit.RAW_SAPPHIRE_BLOCK_TAG)
                .add(BlockInit.RAW_SAPPHIRE_BLOCK.get());

        tag(TagsInit.BlockTagsInit.RUBY_BLOCK_TAG)
                .add(BlockInit.RUBY_BLOCK.get());

        tag(TagsInit.BlockTagsInit.RAW_RUBY_BLOCK_TAG)
                .add(BlockInit.RAW_RUBY_BLOCK.get());

        tag(TagsInit.BlockTagsInit.EMERALD_BLOCK_TAG)
                .add(BlockInit.EMERALD_BLOCK.get());

        tag(TagsInit.BlockTagsInit.RAW_EMERALD_BLOCK_TAG)
                .add(BlockInit.RAW_EMERALD_BLOCK.get());

        tag(TagsInit.BlockTagsInit.SAPPHIRE_ORE_TAG)
                .add(BlockInit.SAPPHIRE_ORE.get());

        tag(TagsInit.BlockTagsInit.DEEPSLATE_SAPPHIRE_ORE_TAG)
                .add(BlockInit.DEEPSLATE_SAPPHIRE_ORE.get());

        tag(TagsInit.BlockTagsInit.RUBY_ORE_TAG)
                .add(BlockInit.RUBY_ORE.get());

        tag(TagsInit.BlockTagsInit.DEEPSLATE_RUBY_ORE_TAG)
                .add(BlockInit.DEEPSLATE_RUBY_ORE.get());

        tag(TagsInit.BlockTagsInit.EMERALD_ORE_TAG)
                .add(BlockInit.EMERALD_ORE.get());

        tag(TagsInit.BlockTagsInit.DEEPSLATE_EMERALD_ORE_TAG)
                .add(BlockInit.DEEPSLATE_EMERALD_ORE.get());

        tag(TagsInit.BlockTagsInit.STEEL_BLOCK_TAG)
                .add(BlockInit.STEEL_BLOCK.get());

        tag(TagsInit.BlockTagsInit.RAW_STEEL_BLOCK_TAG)
                .add(BlockInit.RAW_STEEL_BLOCK.get());

        tag(TagsInit.BlockTagsInit.STEEL_ORE_TAG)
                .add(BlockInit.STEEL_ORE.get());

        tag(TagsInit.BlockTagsInit.DEEPSLATE_STEEL_ORE_TAG)
                .add(BlockInit.DEEPSLATE_STEEL_ORE.get());

        tag(TagsInit.BlockTagsInit.BISMUTH_BLOCK_TAG)
                .add(BlockInit.BISMUTH_BLOCK.get());

        tag(TagsInit.BlockTagsInit.BISMUTH_ORE_TAG)
                .add(BlockInit.BISMUTH_ORE.get());

        tag(TagsInit.BlockTagsInit.DEEPSLATE_BISMUTH_ORE_TAG)
                .add(BlockInit.DEEPSLATE_BISMUTH_ORE.get());

        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .addTag(TagsInit.BlockTagsInit.SAPPHIRE_BLOCK_TAG)
                .addTag(TagsInit.BlockTagsInit.RAW_SAPPHIRE_BLOCK_TAG)
                .addTag(TagsInit.BlockTagsInit.RUBY_BLOCK_TAG)
                .addTag(TagsInit.BlockTagsInit.RAW_RUBY_BLOCK_TAG)
                .addTag(TagsInit.BlockTagsInit.EMERALD_BLOCK_TAG)
                .addTag(TagsInit.BlockTagsInit.RAW_EMERALD_BLOCK_TAG)
                .addTag(TagsInit.BlockTagsInit.STEEL_BLOCK_TAG)
                .addTag(TagsInit.BlockTagsInit.RAW_STEEL_BLOCK_TAG)
                .addTag(TagsInit.BlockTagsInit.BISMUTH_BLOCK_TAG)
                .addTag(TagsInit.BlockTagsInit.SAPPHIRE_ORE_TAG)
                .addTag(TagsInit.BlockTagsInit.DEEPSLATE_SAPPHIRE_ORE_TAG)
                .addTag(TagsInit.BlockTagsInit.RUBY_ORE_TAG)
                .addTag(TagsInit.BlockTagsInit.DEEPSLATE_RUBY_ORE_TAG)
                .addTag(TagsInit.BlockTagsInit.EMERALD_ORE_TAG)
                .addTag(TagsInit.BlockTagsInit.DEEPSLATE_EMERALD_ORE_TAG)
                .addTag(TagsInit.BlockTagsInit.STEEL_ORE_TAG)
                .addTag(TagsInit.BlockTagsInit.DEEPSLATE_STEEL_ORE_TAG)
                .addTag(TagsInit.BlockTagsInit.BISMUTH_ORE_TAG)
                .addTag(TagsInit.BlockTagsInit.DEEPSLATE_BISMUTH_ORE_TAG);

        // TagKey<Block> netherite = createNeoForgeTag("needs_netherite_tool")
        tag(BlockTags.NEEDS_IRON_TOOL).addTag(TagsInit.BlockTagsInit.SAPPHIRE_BLOCK_TAG);
        tag(BlockTags.NEEDS_IRON_TOOL).addTag(TagsInit.BlockTagsInit.RAW_SAPPHIRE_BLOCK_TAG);
        tag(BlockTags.NEEDS_IRON_TOOL).addTag(TagsInit.BlockTagsInit.RUBY_BLOCK_TAG);
        tag(BlockTags.NEEDS_IRON_TOOL).addTag(TagsInit.BlockTagsInit.RAW_RUBY_BLOCK_TAG);
        tag(BlockTags.NEEDS_IRON_TOOL).addTag(TagsInit.BlockTagsInit.EMERALD_BLOCK_TAG);
        tag(BlockTags.NEEDS_IRON_TOOL).addTag(TagsInit.BlockTagsInit.RAW_EMERALD_BLOCK_TAG);
        tag(BlockTags.NEEDS_IRON_TOOL).addTag(TagsInit.BlockTagsInit.STEEL_BLOCK_TAG);
        tag(BlockTags.NEEDS_IRON_TOOL).addTag(TagsInit.BlockTagsInit.RAW_STEEL_BLOCK_TAG);
        tag(BlockTags.NEEDS_IRON_TOOL).addTag(TagsInit.BlockTagsInit.BISMUTH_BLOCK_TAG);
        tag(BlockTags.NEEDS_IRON_TOOL).addTag(TagsInit.BlockTagsInit.SAPPHIRE_ORE_TAG);
        tag(BlockTags.NEEDS_IRON_TOOL).addTag(TagsInit.BlockTagsInit.DEEPSLATE_SAPPHIRE_ORE_TAG);
        tag(BlockTags.NEEDS_IRON_TOOL).addTag(TagsInit.BlockTagsInit.RUBY_ORE_TAG);
        tag(BlockTags.NEEDS_IRON_TOOL).addTag(TagsInit.BlockTagsInit.DEEPSLATE_RUBY_ORE_TAG);
        tag(BlockTags.NEEDS_IRON_TOOL).addTag(TagsInit.BlockTagsInit.EMERALD_ORE_TAG);
        tag(BlockTags.NEEDS_IRON_TOOL).addTag(TagsInit.BlockTagsInit.DEEPSLATE_EMERALD_ORE_TAG);
        tag(BlockTags.NEEDS_IRON_TOOL).addTag(TagsInit.BlockTagsInit.STEEL_ORE_TAG);
        tag(BlockTags.NEEDS_IRON_TOOL).addTag(TagsInit.BlockTagsInit.DEEPSLATE_STEEL_ORE_TAG);
        tag(BlockTags.NEEDS_IRON_TOOL).addTag(TagsInit.BlockTagsInit.BISMUTH_ORE_TAG);
        tag(BlockTags.NEEDS_IRON_TOOL).addTag(TagsInit.BlockTagsInit.DEEPSLATE_BISMUTH_ORE_TAG);

    }
}
