package fr.celyanrbx.pixelpioneer.data.texture;

import fr.celyanrbx.pixelpioneer.PixelPioneer;
import fr.celyanrbx.pixelpioneer.block.ModBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, PixelPioneer.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        normalBlock(ModBlocks.SAPPHIRE_BLOCK.get());
        normalBlock(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
        normalBlock(ModBlocks.RUBY_BLOCK.get());
        normalBlock(ModBlocks.RAW_RUBY_BLOCK.get());
        normalBlock(ModBlocks.EMERALD_BLOCK.get());
        normalBlock(ModBlocks.STEEL_BLOCK.get());
        normalBlock(ModBlocks.RAW_STEEL_BLOCK.get());
        normalBlock(ModBlocks.BISMUTH_BLOCK.get());
        normalBlock(ModBlocks.RAW_EMERALD_BLOCK.get());
        normalBlock(ModBlocks.SAPPHIRE_ORE.get());
        normalBlock(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
        normalBlock(ModBlocks.RUBY_ORE.get());
        normalBlock(ModBlocks.DEEPSLATE_RUBY_ORE.get());
        normalBlock(ModBlocks.EMERALD_ORE.get());
        normalBlock(ModBlocks.DEEPSLATE_EMERALD_ORE.get());
        normalBlock(ModBlocks.STEEL_ORE.get());
        normalBlock(ModBlocks.DEEPSLATE_STEEL_ORE.get());
        normalBlock(ModBlocks.BISMUTH_ORE.get());
        normalBlock(ModBlocks.DEEPSLATE_BISMUTH_ORE.get());
        normalBlock(ModBlocks.MAGIC_BLOCK.get());
    }

    private void normalBlock(Block block) {
        ResourceLocation blockKey = BuiltInRegistries.BLOCK.getKey(block);
        String path = blockKey.getPath();
        simpleBlock(block, models().cubeAll(path, modLoc("block/" + path)));
        simpleBlockItem(block, models().getExistingFile(modLoc("block/" + path)));
    }
}
