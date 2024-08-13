package fr.celyanrbx.pixelpioneer.init;

import fr.celyanrbx.pixelpioneer.PixelPioneer;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class TagsInit {
    public static ResourceLocation createOreLocation(String name) {
        return ResourceLocation.fromNamespaceAndPath(PixelPioneer.MOD_ID,  "ores/" + name);
    }

    public static ResourceLocation createBlockLocation(String name) {
        return ResourceLocation.fromNamespaceAndPath(PixelPioneer.MOD_ID, name);
    }

    public static ResourceLocation createGenericItemsLocation(String name) {
        return ResourceLocation.fromNamespaceAndPath(PixelPioneer.MOD_ID, name);
    }

    public static ResourceLocation createRawItemsLocation(String name) {
        return  ResourceLocation.fromNamespaceAndPath(PixelPioneer.MOD_ID, "raw/" + name);
    }

    public static TagKey<Block> createToolTag(String name) {
        return TagKey.create(BuiltInRegistries.BLOCK.key(), ResourceLocation.fromNamespaceAndPath(PixelPioneer.MOD_ID, name));
    }

    public static class ItemTagsInit {
        // Items
        public static final TagKey<Item> SAPPHIRE_ITEM_TAG = ItemTags.create(createGenericItemsLocation("sapphire"));
        public static final TagKey<Item> RAW_SAPPHIRE_ITEM_TAG = ItemTags.create(createGenericItemsLocation("raw_sapphire"));
        public static final TagKey<Item> SAPPHIRE_NUGGET_ITEM_TAG = ItemTags.create(createGenericItemsLocation("sapphire_nugget"));
        public static final TagKey<Item> RUBY_ITEM_TAG = ItemTags.create(createGenericItemsLocation("ruby"));
        public static final TagKey<Item> RAW_RUBY_ITEM_TAG = ItemTags.create(createGenericItemsLocation("raw_ruby"));
        public static final TagKey<Item> RUBY_NUGGET_ITEM_TAG = ItemTags.create(createGenericItemsLocation("ruby_nugget"));
        public static final TagKey<Item> EMERALD_ITEM_TAG = ItemTags.create(createGenericItemsLocation("emerald"));
        public static final TagKey<Item> RAW_EMERALD_ITEM_TAG = ItemTags.create(createGenericItemsLocation("raw_emerald"));
        public static final TagKey<Item> EMERALD_NUGGET_ITEM_TAG = ItemTags.create(createGenericItemsLocation("emerald_nugget"));
        public static final TagKey<Item> STEEL_ITEM_TAG = ItemTags.create(createGenericItemsLocation("steel_ingot"));
        public static final TagKey<Item> RAW_STEEL_ITEM_TAG = ItemTags.create(createGenericItemsLocation("raw_steel"));
        public static final TagKey<Item> STEEL_NUGGET_ITEM_TAG = ItemTags.create(createGenericItemsLocation("steel_nugget"));
        public static final TagKey<Item> BISMUTH_ITEM_TAG = ItemTags.create(createGenericItemsLocation("steel_ingot"));
        public static final TagKey<Item> RAW_BISMUTH_ITEM_TAG = ItemTags.create(createGenericItemsLocation("raw_steel"));

        // Blocks
        public static final TagKey<Item> SAPPHIRE_BLOCK_TAG = ItemTags.create(createBlockLocation("sapphire_block"));
        public static final TagKey<Item> RAW_SAPPHIRE_BLOCK_TAG = ItemTags.create(createBlockLocation("raw_sapphire_block"));
        public static final TagKey<Item> RUBY_BLOCK_TAG = ItemTags.create(createBlockLocation("ruby_block"));
        public static final TagKey<Item> RAW_RUBY_BLOCK_TAG = ItemTags.create(createBlockLocation("raw_ruby_block"));
        public static final TagKey<Item> EMERALD_BLOCK_TAG = ItemTags.create(createBlockLocation("emerald_block"));
        public static final TagKey<Item> RAW_EMERALD_BLOCK_TAG = ItemTags.create(createBlockLocation("raw_emerald_block"));
        public static final TagKey<Item> STEEL_BLOCK_TAG = ItemTags.create(createBlockLocation("steel_block"));
        public static final TagKey<Item> RAW_STEEL_BLOCK_TAG = ItemTags.create(createBlockLocation("raw_steel_block"));
        public static final TagKey<Item> BISMUTH_BLOCK_TAG = ItemTags.create(createBlockLocation("bismuth_block"));
        public static final TagKey<Item> SAPPHIRE_ORE_TAG = ItemTags.create(createOreLocation("sapphire_ore"));
        public static final TagKey<Item> DEEPSLATE_SAPPHIRE_ORE_TAG = ItemTags.create(createOreLocation("deepslate_sapphire_ore"));
        public static final TagKey<Item> RUBY_ORE_TAG = ItemTags.create(createOreLocation("ruby_ore"));
        public static final TagKey<Item> DEEPSLATE_RUBY_ORE_TAG = ItemTags.create(createOreLocation("deepslate_ruby_ore"));
        public static final TagKey<Item> EMERALD_ORE_TAG = ItemTags.create(createOreLocation("emerald_ore"));
        public static final TagKey<Item> DEEPSLATE_EMERALD_ORE_TAG = ItemTags.create(createOreLocation("deepslate_emerald_ore"));
        public static final TagKey<Item> STEEL_ORE_TAG = ItemTags.create(createOreLocation("steel_ore"));
        public static final TagKey<Item> DEEPSLATE_STEEL_ORE_TAG = ItemTags.create(createOreLocation("deepslate_steel_ore"));
        public static final TagKey<Item> BISMUTH_ORE_TAG = ItemTags.create(createOreLocation("bismuth_ore"));
        public static final TagKey<Item> DEEPSLATE_BISMUTH_ORE_TAG = ItemTags.create(createOreLocation("deepslate_bismuth_ore"));
    }

    public static class BlockTagsInit {
        public static final TagKey<Block> SAPPHIRE_BLOCK_TAG =
                    BlockTags.create(createBlockLocation("sapphire_block"));

        public static final TagKey<Block> RAW_SAPPHIRE_BLOCK_TAG =
                BlockTags.create(createBlockLocation("raw_sapphire_block"));

        public static final TagKey<Block> RUBY_BLOCK_TAG =
                BlockTags.create(createBlockLocation("ruby_block"));

        public static final TagKey<Block> RAW_RUBY_BLOCK_TAG =
                BlockTags.create(createBlockLocation("raw_ruby_block"));

        public static final TagKey<Block> EMERALD_BLOCK_TAG =
                BlockTags.create(createBlockLocation("emerald_block"));

        public static final TagKey<Block> RAW_EMERALD_BLOCK_TAG =
                BlockTags.create(createBlockLocation("raw_emerald_block"));

        public static final TagKey<Block> STEEL_BLOCK_TAG =
                BlockTags.create(createBlockLocation("steel_block"));

        public static final TagKey<Block> RAW_STEEL_BLOCK_TAG =
                BlockTags.create(createBlockLocation("raw_steel_block"));

        public static final TagKey<Block> BISMUTH_BLOCK_TAG =
                BlockTags.create(createBlockLocation("bismuth_block"));

        public static final TagKey<Block> SAPPHIRE_ORE_TAG =
                BlockTags.create(createOreLocation("sapphire_ore"));

        public static final TagKey<Block> DEEPSLATE_SAPPHIRE_ORE_TAG =
                BlockTags.create(createOreLocation("deepslate_sapphire_ore"));

        public static final TagKey<Block> RUBY_ORE_TAG =
                BlockTags.create(createOreLocation("ruby_ore"));

        public static final TagKey<Block> DEEPSLATE_RUBY_ORE_TAG =
                BlockTags.create(createOreLocation("deepslate_ruby_ore"));

        public static final TagKey<Block> EMERALD_ORE_TAG =
                BlockTags.create(createOreLocation("emerald_ore"));

        public static final TagKey<Block> DEEPSLATE_EMERALD_ORE_TAG =
                BlockTags.create(createOreLocation("deepslate_emerald_ore"));

        public static final TagKey<Block> STEEL_ORE_TAG =
                BlockTags.create(createOreLocation("steel_ore"));

        public static final TagKey<Block> DEEPSLATE_STEEL_ORE_TAG =
                BlockTags.create(createOreLocation("deepslate_steel_ore"));

        public static final TagKey<Block> BISMUTH_ORE_TAG =
                BlockTags.create(createOreLocation("bismuth_ore"));

        public static final TagKey<Block> DEEPSLATE_BISMUTH_ORE_TAG =
                BlockTags.create(createOreLocation("deepslate_bismuth_ore"));
    }
}