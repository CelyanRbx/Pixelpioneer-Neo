package fr.celyanrbx.pixelpioneer.data.lang;

import fr.celyanrbx.pixelpioneer.PixelPioneer;
import fr.celyanrbx.pixelpioneer.init.BlockInit;
import fr.celyanrbx.pixelpioneer.init.CreativeModeTabInit;
import fr.celyanrbx.pixelpioneer.init.ItemInit;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModFrLangProvider extends LanguageProvider {

    public ModFrLangProvider(PackOutput output) {
        super(output, PixelPioneer.MOD_ID, "fr_fr");
    }

    @Override
    protected void addTranslations() {
        // Items
        addItem(ItemInit.SAPPHIRE_INGOT, "Lingot de Saphir");
        addItem(ItemInit.RAW_SAPPHIRE, "Saphir Brut");
        addItem(ItemInit.SAPPHIRE_NUGGET, "Pépite de Saphir");
        addItem(ItemInit.RUBY_INGOT, "Lingot de Rubis");
        addItem(ItemInit.RAW_RUBY, "Rubis Brut");
        addItem(ItemInit.RUBY_NUGGET, "Pépite de Rubis");
        addItem(ItemInit.EMERALD_INGOT, "Lingot d'Émeraude");
        addItem(ItemInit.RAW_EMERALD, "Émeraude Brut");
        addItem(ItemInit.EMERALD_NUGGET, "Pépite d'Émeraude");
        addItem(ItemInit.STEEL_INGOT, "Lingot d'Acier");
        addItem(ItemInit.RAW_STEEL, "Acier Brut");
        addItem(ItemInit.STEEL_NUGGET, "Pépite d'Acier");
        addItem(ItemInit.BISMUTH, "Bismuth");
        addItem(ItemInit.RAW_BISMUTH, "Bismuth Brut");

        // Blocks
        addBlock(BlockInit.SAPPHIRE_BLOCK, "Bloc de Saphir");
        addBlock(BlockInit.RAW_SAPPHIRE_BLOCK, "Bloc de Saphir Brut");
        addBlock(BlockInit.RUBY_BLOCK, "Bloc de Rubis");
        addBlock(BlockInit.RAW_RUBY_BLOCK, "Bloc de Rubis Brut");
        addBlock(BlockInit.EMERALD_BLOCK, "Bloc d'Émeraude");
        addBlock(BlockInit.RAW_EMERALD_BLOCK, "Bloc d'Émeraude Brut");
        addBlock(BlockInit.STEEL_BLOCK, "Bloc d'Acier");
        addBlock(BlockInit.RAW_STEEL_BLOCK, "Bloc d'Acier Brut");
        addBlock(BlockInit.BISMUTH_BLOCK, "Bloc de Bismuth");

        // Ores
        addBlock(BlockInit.SAPPHIRE_ORE, "Minerai de Saphir");
        addBlock(BlockInit.RUBY_ORE, "Minerai de Rubis");
        addBlock(BlockInit.EMERALD_ORE, "Minerai d'Émeraude");
        addBlock(BlockInit.STEEL_ORE, "Minerai d'Acier");
        addBlock(BlockInit.BISMUTH_ORE, "Minerai de Bismuth");

        // Deepslate Ores
        addBlock(BlockInit.DEEPSLATE_SAPPHIRE_ORE, "Minerai de Saphir des abîmes");
        addBlock(BlockInit.DEEPSLATE_RUBY_ORE, "Minerai de Ruby des abîmes");
        addBlock(BlockInit.DEEPSLATE_EMERALD_ORE, "Minerai d'Émeraude des abîmes");
        addBlock(BlockInit.DEEPSLATE_STEEL_ORE, "Minerai d'Acier des abîmes");
        addBlock(BlockInit.DEEPSLATE_BISMUTH_ORE, "Minerai de Bismuth des abîmes");

        // others
        add(CreativeModeTabInit.PIXELPIONEER_TAB_ONE_TITLE, "PixelPioneer");
    }
}
