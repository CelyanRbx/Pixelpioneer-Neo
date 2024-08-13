package fr.celyanrbx.pixelpioneer.data;

import fr.celyanrbx.pixelpioneer.PixelPioneer;
import fr.celyanrbx.pixelpioneer.data.lang.ModEnLangProvider;
import fr.celyanrbx.pixelpioneer.data.lang.ModFrLangProvider;
import fr.celyanrbx.pixelpioneer.data.loot.ModGlobalLootModifiersProvider;
import fr.celyanrbx.pixelpioneer.data.loottable.ModLootTables;
import fr.celyanrbx.pixelpioneer.data.tag.ModBlockTagsProvider;
import fr.celyanrbx.pixelpioneer.data.tag.ModItemTagProvider;
import fr.celyanrbx.pixelpioneer.data.texture.ModBlockStateProvider;
import fr.celyanrbx.pixelpioneer.data.texture.ModItemStateProvider;
import fr.celyanrbx.pixelpioneer.data.worldgen.ModWorldGenProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
public class DataGenerators {

    public static void gatherData(GatherDataEvent event) {
        try {
            DataGenerator generator = event.getGenerator();
            PackOutput output = generator.getPackOutput();
            ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

            generator.addProvider(true, new ModEnLangProvider(output));
            generator.addProvider(true, new ModFrLangProvider(output));
            generator.addProvider(true, new ModItemStateProvider(output, existingFileHelper));
            ModBlockTagsProvider modBlockTagsProvider = new ModBlockTagsProvider(output, event.getLookupProvider(), existingFileHelper);
            generator.addProvider(true, modBlockTagsProvider);
            generator.addProvider(true, new ModItemTagProvider(output, event.getLookupProvider(), modBlockTagsProvider, existingFileHelper));
            generator.addProvider(true, new ModLootTables(output, event.getLookupProvider()));
            generator.addProvider(true, new ModBlockStateProvider(output, existingFileHelper));
            generator.addProvider(true, new ModWorldGenProvider(output, event.getLookupProvider()));
            generator.addProvider(true, new ModGlobalLootModifiersProvider(output, event.getLookupProvider()));
        } catch (RuntimeException e) {
            PixelPioneer.logger.error("Failed to gather data", e);
        }
    }
}