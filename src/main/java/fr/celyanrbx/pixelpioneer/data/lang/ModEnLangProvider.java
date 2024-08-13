package fr.celyanrbx.pixelpioneer.data.lang;

import fr.celyanrbx.pixelpioneer.PixelPioneer;
import fr.celyanrbx.pixelpioneer.init.BlockInit;
import fr.celyanrbx.pixelpioneer.init.CreativeModeTabInit;
import fr.celyanrbx.pixelpioneer.init.ItemInit;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModEnLangProvider extends LanguageProvider {

    public ModEnLangProvider(PackOutput output) {
        super(output, PixelPioneer.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        // Items
        addItem(ItemInit.SAPPHIRE_INGOT, "Sapphire Ingot");
        addItem(ItemInit.RAW_SAPPHIRE, "Raw Sapphire");
        addItem(ItemInit.SAPPHIRE_NUGGET, "Sapphire Nugget");
        addItem(ItemInit.RUBY_INGOT, "Ruby Ingot");
        addItem(ItemInit.RAW_RUBY, "Raw Ruby");
        addItem(ItemInit.RUBY_NUGGET, "Ruby Nugget");
        addItem(ItemInit.EMERALD_INGOT, "Emerald Ingot");
        addItem(ItemInit.RAW_EMERALD, "Raw Emerald");
        addItem(ItemInit.EMERALD_NUGGET, "Emerald Nugget");
        addItem(ItemInit.STEEL_INGOT, "Steel Ingot");
        addItem(ItemInit.RAW_STEEL, "Raw Steel");
        addItem(ItemInit.STEEL_NUGGET, "Steel Nugget");
        addItem(ItemInit.BISMUTH, "Bismuth");
        addItem(ItemInit.RAW_BISMUTH, "Raw Bismuth");

        // Blocks
        addBlock(BlockInit.SAPPHIRE_BLOCK, "Sapphire Block");
        addBlock(BlockInit.RAW_SAPPHIRE_BLOCK, "Raw Sapphire Block");
        addBlock(BlockInit.RUBY_BLOCK, "Ruby Block");
        addBlock(BlockInit.RAW_RUBY_BLOCK, "Raw Ruby Block");
        addBlock(BlockInit.EMERALD_BLOCK, "Emerald Block");
        addBlock(BlockInit.RAW_EMERALD_BLOCK, "Raw Emerald Block");
        addBlock(BlockInit.STEEL_BLOCK, "Steel Block");
        addBlock(BlockInit.RAW_STEEL_BLOCK, "Raw Steel Block");
        addBlock(BlockInit.BISMUTH_BLOCK, "Bismuth Block");

        // Ores
        addBlock(BlockInit.SAPPHIRE_ORE, "Sapphire Ore");
        addBlock(BlockInit.RUBY_ORE, "Ruby Ore");
        addBlock(BlockInit.EMERALD_ORE, "Emerald Ore");
        addBlock(BlockInit.STEEL_ORE, "Steel Ore");
        addBlock(BlockInit.BISMUTH_ORE, "Bismuth Ore");

        // Deepslate Ores
        addBlock(BlockInit.DEEPSLATE_SAPPHIRE_ORE, "Deepslate Sapphire Ore");
        addBlock(BlockInit.DEEPSLATE_RUBY_ORE, "Deepslate Ruby Ore");
        addBlock(BlockInit.DEEPSLATE_EMERALD_ORE, "Deepslate Emerald Ore");
        addBlock(BlockInit.DEEPSLATE_STEEL_ORE, "Deepslate Steel Ore");
        addBlock(BlockInit.DEEPSLATE_BISMUTH_ORE, "Deepslate Bismuth Ore");


        // others
        add(CreativeModeTabInit.PIXELPIONEER_TAB_ONE_TITLE, "PixelPioneer");
    }
}
