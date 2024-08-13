package fr.celyanrbx.pixelpioneer.init;

import fr.celyanrbx.pixelpioneer.PixelPioneer;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class BlockInit {
    public static DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(PixelPioneer.MOD_ID);

    public static final DeferredBlock<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    public static final DeferredBlock<Block> RAW_SAPPHIRE_BLOCK = registerBlock("raw_sapphire_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    public static final DeferredBlock<Block> RUBY_BLOCK = registerBlock("ruby_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    public static final DeferredBlock<Block> RAW_RUBY_BLOCK = registerBlock("raw_ruby_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    public static final DeferredBlock<Block> EMERALD_BLOCK = registerBlock("emerald_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    public static final DeferredBlock<Block> RAW_EMERALD_BLOCK = registerBlock("raw_emerald_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    public static final DeferredBlock<Block> STEEL_BLOCK = registerBlock("steel_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    public static final DeferredBlock<Block> RAW_STEEL_BLOCK = registerBlock("raw_steel_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    public static final DeferredBlock<Block> BISMUTH_BLOCK = registerBlock("bismuth_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));


    public static final DeferredBlock<Block> SAPPHIRE_ORE = registerBlock("sapphire_ore", () ->
            new Block(BlockBehaviour.Properties.of()
                    .destroyTime(3.0F)
                    .explosionResistance(10.0F)
                    .sound(SoundType.STONE)
                    .lightLevel((state) -> 5)
                    .requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore", () ->
            new Block(BlockBehaviour.Properties.of()
                    .destroyTime(3.0F)
                    .explosionResistance(10.0F)
                    .sound(SoundType.DEEPSLATE)
                    .lightLevel((state) -> 5)
                    .requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> RUBY_ORE = registerBlock("ruby_ore", () ->
            new Block(BlockBehaviour.Properties.of()
                    .destroyTime(3.0F)
                    .explosionResistance(10.0F)
                    .sound(SoundType.STONE)
                    .lightLevel((state) -> 5)
                    .requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore", () ->
            new Block(BlockBehaviour.Properties.of()
                    .destroyTime(3.0F)
                    .explosionResistance(10.0F)
                    .sound(SoundType.DEEPSLATE)
                    .lightLevel((state) -> 5)
                    .requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> EMERALD_ORE = registerBlock("emerald_ore", () ->
            new Block(BlockBehaviour.Properties.of()
                    .destroyTime(3.0F)
                    .explosionResistance(10.0F)
                    .sound(SoundType.STONE)
                    .lightLevel((state) -> 5)
                    .requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> DEEPSLATE_EMERALD_ORE = registerBlock("deepslate_emerald_ore", () ->
            new Block(BlockBehaviour.Properties.of()
                    .destroyTime(3.0F)
                    .explosionResistance(10.0F)
                    .sound(SoundType.DEEPSLATE)
                    .lightLevel((state) -> 5)
                    .requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> STEEL_ORE = registerBlock("steel_ore", () ->
            new Block(BlockBehaviour.Properties.of()
                    .destroyTime(3.0F)
                    .explosionResistance(10.0F)
                    .sound(SoundType.STONE)
                    .lightLevel((state) -> 5)
                    .requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> DEEPSLATE_STEEL_ORE = registerBlock("deepslate_steel_ore", () ->
            new Block(BlockBehaviour.Properties.of()
                    .destroyTime(3.0F)
                    .explosionResistance(10.0F)
                    .sound(SoundType.DEEPSLATE)
                    .lightLevel((state) -> 5)
                    .requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> BISMUTH_ORE = registerBlock("bismuth_ore", () ->
            new Block(BlockBehaviour.Properties.of()
                    .destroyTime(3.0F)
                    .explosionResistance(10.0F)
                    .sound(SoundType.STONE)
                    .lightLevel((state) -> 5)
                    .requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> DEEPSLATE_BISMUTH_ORE = registerBlock("deepslate_bismuth_ore", () ->
            new Block(BlockBehaviour.Properties.of()
                    .destroyTime(3.0F)
                    .explosionResistance(10.0F)
                    .sound(SoundType.DEEPSLATE)
                    .lightLevel((state) -> 5)
                    .requiresCorrectToolForDrops()));


    public static DeferredBlock<Block> registerBlock(String name, Supplier<Block> block) {
        DeferredBlock<Block> blockReg = BLOCKS.register(name, block);
        ItemInit.ITEMS.register(name, () -> new BlockItem(blockReg.get(), new Item.Properties()));
        return blockReg;
    }
}

