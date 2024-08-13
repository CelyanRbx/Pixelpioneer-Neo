package fr.celyanrbx.pixelpioneer.data.texture;

import fr.celyanrbx.pixelpioneer.PixelPioneer;
import fr.celyanrbx.pixelpioneer.init.BlockInit;
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
        normalBlock(BlockInit.SAPPHIRE_BLOCK.get());
        normalBlock(BlockInit.RAW_SAPPHIRE_BLOCK.get());
        normalBlock(BlockInit.RUBY_BLOCK.get());
        normalBlock(BlockInit.RAW_RUBY_BLOCK.get());
        normalBlock(BlockInit.EMERALD_BLOCK.get());
        normalBlock(BlockInit.STEEL_BLOCK.get());
        normalBlock(BlockInit.RAW_STEEL_BLOCK.get());
        normalBlock(BlockInit.BISMUTH_BLOCK.get());
        normalBlock(BlockInit.RAW_EMERALD_BLOCK.get());
        normalBlock(BlockInit.SAPPHIRE_ORE.get());
        normalBlock(BlockInit.DEEPSLATE_SAPPHIRE_ORE.get());
        normalBlock(BlockInit.RUBY_ORE.get());
        normalBlock(BlockInit.DEEPSLATE_RUBY_ORE.get());
        normalBlock(BlockInit.EMERALD_ORE.get());
        normalBlock(BlockInit.DEEPSLATE_EMERALD_ORE.get());
        normalBlock(BlockInit.STEEL_ORE.get());
        normalBlock(BlockInit.DEEPSLATE_STEEL_ORE.get());
        normalBlock(BlockInit.BISMUTH_ORE.get());
        normalBlock(BlockInit.DEEPSLATE_BISMUTH_ORE.get());
    }

    private void normalBlock(Block block) {
        ResourceLocation blockKey = BuiltInRegistries.BLOCK.getKey(block);
        String path = blockKey.getPath();
        simpleBlock(block, models().cubeAll(path, modLoc("block/" + path)));
        simpleBlockItem(block, models().getExistingFile(modLoc("block/" + path)));
    }
}
