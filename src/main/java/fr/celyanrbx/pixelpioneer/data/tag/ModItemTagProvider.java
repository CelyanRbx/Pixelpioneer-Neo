package fr.celyanrbx.pixelpioneer.data.tag;

import fr.celyanrbx.pixelpioneer.PixelPioneer;
import fr.celyanrbx.pixelpioneer.item.ModItems;
import fr.celyanrbx.pixelpioneer.init.TagsInit;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, BlockTagsProvider provider, ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, provider.contentsGetter(), PixelPioneer.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        copy(TagsInit.BlockTagsInit.SAPPHIRE_BLOCK_TAG, TagsInit.ItemTagsInit.SAPPHIRE_BLOCK_TAG);
        copy(TagsInit.BlockTagsInit.RAW_SAPPHIRE_BLOCK_TAG, TagsInit.ItemTagsInit.RAW_SAPPHIRE_BLOCK_TAG);
        copy(TagsInit.BlockTagsInit.RUBY_BLOCK_TAG, TagsInit.ItemTagsInit.RUBY_BLOCK_TAG);
        copy(TagsInit.BlockTagsInit.RAW_RUBY_BLOCK_TAG, TagsInit.ItemTagsInit.RAW_RUBY_BLOCK_TAG);
        copy(TagsInit.BlockTagsInit.EMERALD_BLOCK_TAG, TagsInit.ItemTagsInit.EMERALD_BLOCK_TAG);
        copy(TagsInit.BlockTagsInit.RAW_EMERALD_BLOCK_TAG, TagsInit.ItemTagsInit.RAW_EMERALD_BLOCK_TAG);
        copy(TagsInit.BlockTagsInit.STEEL_BLOCK_TAG, TagsInit.ItemTagsInit.STEEL_BLOCK_TAG);
        copy(TagsInit.BlockTagsInit.RAW_STEEL_BLOCK_TAG, TagsInit.ItemTagsInit.RAW_STEEL_BLOCK_TAG);

        copy(TagsInit.BlockTagsInit.SAPPHIRE_ORE_TAG, TagsInit.ItemTagsInit.SAPPHIRE_ORE_TAG);
        copy(TagsInit.BlockTagsInit.DEEPSLATE_SAPPHIRE_ORE_TAG, TagsInit.ItemTagsInit.DEEPSLATE_SAPPHIRE_ORE_TAG);
        copy(TagsInit.BlockTagsInit.RUBY_ORE_TAG, TagsInit.ItemTagsInit.RUBY_ORE_TAG);
        copy(TagsInit.BlockTagsInit.DEEPSLATE_RUBY_ORE_TAG, TagsInit.ItemTagsInit.DEEPSLATE_RUBY_ORE_TAG);
        copy(TagsInit.BlockTagsInit.EMERALD_ORE_TAG, TagsInit.ItemTagsInit.EMERALD_ORE_TAG);
        copy(TagsInit.BlockTagsInit.DEEPSLATE_EMERALD_ORE_TAG, TagsInit.ItemTagsInit.DEEPSLATE_EMERALD_ORE_TAG);
        copy(TagsInit.BlockTagsInit.STEEL_ORE_TAG, TagsInit.ItemTagsInit.STEEL_ORE_TAG);
        copy(TagsInit.BlockTagsInit.DEEPSLATE_STEEL_ORE_TAG, TagsInit.ItemTagsInit.DEEPSLATE_STEEL_ORE_TAG);

        tag(TagsInit.ItemTagsInit.SAPPHIRE_ITEM_TAG).add(ModItems.SAPPHIRE_INGOT.get());
        tag(TagsInit.ItemTagsInit.RAW_SAPPHIRE_ITEM_TAG).add(ModItems.RAW_SAPPHIRE.get());
        tag(TagsInit.ItemTagsInit.SAPPHIRE_NUGGET_ITEM_TAG).add(ModItems.SAPPHIRE_NUGGET.get());
        tag(TagsInit.ItemTagsInit.RUBY_ITEM_TAG).add(ModItems.RUBY_INGOT.get());
        tag(TagsInit.ItemTagsInit.RAW_RUBY_ITEM_TAG).add(ModItems.RAW_RUBY.get());
        tag(TagsInit.ItemTagsInit.RUBY_NUGGET_ITEM_TAG).add(ModItems.RUBY_NUGGET.get());
        tag(TagsInit.ItemTagsInit.EMERALD_ITEM_TAG).add(ModItems.EMERALD_INGOT.get());
        tag(TagsInit.ItemTagsInit.RAW_EMERALD_ITEM_TAG).add(ModItems.RAW_EMERALD.get());
        tag(TagsInit.ItemTagsInit.EMERALD_NUGGET_ITEM_TAG).add(ModItems.EMERALD_NUGGET.get());
        tag(TagsInit.ItemTagsInit.STEEL_ITEM_TAG).add(ModItems.STEEL_INGOT.get());
        tag(TagsInit.ItemTagsInit.RAW_STEEL_ITEM_TAG).add(ModItems.RAW_STEEL.get());
        tag(TagsInit.ItemTagsInit.STEEL_NUGGET_ITEM_TAG).add(ModItems.STEEL_NUGGET.get());
        tag(TagsInit.ItemTagsInit.BISMUTH_ITEM_TAG).add(ModItems.BISMUTH.get());
        tag(TagsInit.ItemTagsInit.RAW_BISMUTH_ITEM_TAG).add(ModItems.RAW_BISMUTH.get());

        // tag(ItemTags.TRIMMABLE_ARMOR)
    }
}
