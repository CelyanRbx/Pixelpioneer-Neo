package fr.celyanrbx.pixelpioneer.data.lang;

import fr.celyanrbx.pixelpioneer.PixelPioneer;
import fr.celyanrbx.pixelpioneer.block.ModBlocks;
import fr.celyanrbx.pixelpioneer.item.ModCreativeModeTabs;
import fr.celyanrbx.pixelpioneer.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModFrLangProvider extends LanguageProvider {

    public ModFrLangProvider(PackOutput output) {
        super(output, PixelPioneer.MOD_ID, "fr_fr");
    }

    @Override
    protected void addTranslations() {
        // Items
        addItem(ModItems.SAPPHIRE_INGOT, "Lingot de Saphir");
        addItem(ModItems.RAW_SAPPHIRE, "Saphir Brut");
        addItem(ModItems.SAPPHIRE_NUGGET, "Pépite de Saphir");
        addItem(ModItems.RUBY_INGOT, "Lingot de Rubis");
        addItem(ModItems.RAW_RUBY, "Rubis Brut");
        addItem(ModItems.RUBY_NUGGET, "Pépite de Rubis");
        addItem(ModItems.EMERALD_INGOT, "Lingot d'Émeraude");
        addItem(ModItems.RAW_EMERALD, "Émeraude Brut");
        addItem(ModItems.EMERALD_NUGGET, "Pépite d'Émeraude");
        addItem(ModItems.STEEL_INGOT, "Lingot d'Acier");
        addItem(ModItems.RAW_STEEL, "Acier Brut");
        addItem(ModItems.STEEL_NUGGET, "Pépite d'Acier");
        addItem(ModItems.BISMUTH, "Bismuth");
        addItem(ModItems.RAW_BISMUTH, "Bismuth Brut");
        addItem(ModItems.CHISEL, "Chisel");
        addItem(ModItems.RADISH, "Radis");
        addItem(ModItems.FROSTFIRE_ICE, "Glace de Feu");
        addItem(ModItems.STARLIGHT_ASHES, "Cendre de Lumière des Étoiles");

        // Blocks
        addBlock(ModBlocks.SAPPHIRE_BLOCK, "Bloc de Saphir");
        addBlock(ModBlocks.RAW_SAPPHIRE_BLOCK, "Bloc de Saphir Brut");
        addBlock(ModBlocks.RUBY_BLOCK, "Bloc de Rubis");
        addBlock(ModBlocks.RAW_RUBY_BLOCK, "Bloc de Rubis Brut");
        addBlock(ModBlocks.EMERALD_BLOCK, "Bloc d'Émeraude");
        addBlock(ModBlocks.RAW_EMERALD_BLOCK, "Bloc d'Émeraude Brut");
        addBlock(ModBlocks.STEEL_BLOCK, "Bloc d'Acier");
        addBlock(ModBlocks.RAW_STEEL_BLOCK, "Bloc d'Acier Brut");
        addBlock(ModBlocks.BISMUTH_BLOCK, "Bloc de Bismuth");
        addBlock(ModBlocks.MAGIC_BLOCK, "Bloc de Magie");

        // Ores
        addBlock(ModBlocks.SAPPHIRE_ORE, "Minerai de Saphir");
        addBlock(ModBlocks.RUBY_ORE, "Minerai de Rubis");
        addBlock(ModBlocks.EMERALD_ORE, "Minerai d'Émeraude");
        addBlock(ModBlocks.STEEL_ORE, "Minerai d'Acier");
        addBlock(ModBlocks.BISMUTH_ORE, "Minerai de Bismuth");

        // Deepslate Ores
        addBlock(ModBlocks.DEEPSLATE_SAPPHIRE_ORE, "Minerai de Saphir des abîmes");
        addBlock(ModBlocks.DEEPSLATE_RUBY_ORE, "Minerai de Ruby des abîmes");
        addBlock(ModBlocks.DEEPSLATE_EMERALD_ORE, "Minerai d'Émeraude des abîmes");
        addBlock(ModBlocks.DEEPSLATE_STEEL_ORE, "Minerai d'Acier des abîmes");
        addBlock(ModBlocks.DEEPSLATE_BISMUTH_ORE, "Minerai de Bismuth des abîmes");

        // others
        add(ModCreativeModeTabs.PIXELPIONEER_TAB_ONE_TITLE, "PixelPioneer");
    }
}
