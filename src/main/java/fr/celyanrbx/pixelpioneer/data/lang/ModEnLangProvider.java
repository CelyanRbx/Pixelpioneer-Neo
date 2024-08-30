package fr.celyanrbx.pixelpioneer.data.lang;

import fr.celyanrbx.pixelpioneer.PixelPioneer;
import fr.celyanrbx.pixelpioneer.block.ModBlocks;
import fr.celyanrbx.pixelpioneer.item.ModCreativeModeTabs;
import fr.celyanrbx.pixelpioneer.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModEnLangProvider extends LanguageProvider {

    public ModEnLangProvider(PackOutput output) {
        super(output, PixelPioneer.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        // Items
        addItem(ModItems.SAPPHIRE_INGOT, "Sapphire Ingot");
        addItem(ModItems.RAW_SAPPHIRE, "Raw Sapphire");
        addItem(ModItems.SAPPHIRE_NUGGET, "Sapphire Nugget");
        addItem(ModItems.RUBY_INGOT, "Ruby Ingot");
        addItem(ModItems.RAW_RUBY, "Raw Ruby");
        addItem(ModItems.RUBY_NUGGET, "Ruby Nugget");
        addItem(ModItems.EMERALD_INGOT, "Emerald Ingot");
        addItem(ModItems.RAW_EMERALD, "Raw Emerald");
        addItem(ModItems.EMERALD_NUGGET, "Emerald Nugget");
        addItem(ModItems.STEEL_INGOT, "Steel Ingot");
        addItem(ModItems.RAW_STEEL, "Raw Steel");
        addItem(ModItems.STEEL_NUGGET, "Steel Nugget");
        addItem(ModItems.BISMUTH, "Bismuth");
        addItem(ModItems.RAW_BISMUTH, "Raw Bismuth");
        addItem(ModItems.CHISEL, "Chisel");
        addItem(ModItems.RADISH, "Radish");
        addItem(ModItems.FROSTFIRE_ICE, "Frostfire Ice");
        addItem(ModItems.STARLIGHT_ASHES, "Starlight Ashes");

        // Blocks
        addBlock(ModBlocks.SAPPHIRE_BLOCK, "Sapphire Block");
        addBlock(ModBlocks.RAW_SAPPHIRE_BLOCK, "Raw Sapphire Block");
        addBlock(ModBlocks.RUBY_BLOCK, "Ruby Block");
        addBlock(ModBlocks.RAW_RUBY_BLOCK, "Raw Ruby Block");
        addBlock(ModBlocks.EMERALD_BLOCK, "Emerald Block");
        addBlock(ModBlocks.RAW_EMERALD_BLOCK, "Raw Emerald Block");
        addBlock(ModBlocks.STEEL_BLOCK, "Steel Block");
        addBlock(ModBlocks.RAW_STEEL_BLOCK, "Raw Steel Block");
        addBlock(ModBlocks.BISMUTH_BLOCK, "Bismuth Block");
        addBlock(ModBlocks.MAGIC_BLOCK, "Magic Block");

        // Ores
        addBlock(ModBlocks.SAPPHIRE_ORE, "Sapphire Ore");
        addBlock(ModBlocks.RUBY_ORE, "Ruby Ore");
        addBlock(ModBlocks.EMERALD_ORE, "Emerald Ore");
        addBlock(ModBlocks.STEEL_ORE, "Steel Ore");
        addBlock(ModBlocks.BISMUTH_ORE, "Bismuth Ore");

        // Deepslate Ores
        addBlock(ModBlocks.DEEPSLATE_SAPPHIRE_ORE, "Deepslate Sapphire Ore");
        addBlock(ModBlocks.DEEPSLATE_RUBY_ORE, "Deepslate Ruby Ore");
        addBlock(ModBlocks.DEEPSLATE_EMERALD_ORE, "Deepslate Emerald Ore");
        addBlock(ModBlocks.DEEPSLATE_STEEL_ORE, "Deepslate Steel Ore");
        addBlock(ModBlocks.DEEPSLATE_BISMUTH_ORE, "Deepslate Bismuth Ore");


        // others
        add(ModCreativeModeTabs.PIXELPIONEER_TAB_ONE_TITLE, "PixelPioneer");
    }
}
