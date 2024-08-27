package fr.celyanrbx.pixelpioneer.data.texture;

import fr.celyanrbx.pixelpioneer.PixelPioneer;
import fr.celyanrbx.pixelpioneer.item.ModItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

public class ModItemStateProvider extends ItemModelProvider {
    public ModItemStateProvider(PackOutput output,  ExistingFileHelper existingFileHelper) {
        super(output, PixelPioneer.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        item(ModItems.SAPPHIRE_INGOT.get());
        item(ModItems.RAW_SAPPHIRE.get());
        item(ModItems.SAPPHIRE_NUGGET.get());
        item(ModItems.RUBY_INGOT.get());
        item(ModItems.RAW_RUBY.get());
        item(ModItems.RUBY_NUGGET.get());
        item(ModItems.EMERALD_INGOT.get());
        item(ModItems.RAW_EMERALD.get());
        item(ModItems.EMERALD_NUGGET.get());
        item(ModItems.STEEL_INGOT.get());
        item(ModItems.RAW_STEEL.get());
        item(ModItems.STEEL_NUGGET.get());
        item(ModItems.BISMUTH.get());
        item(ModItems.RAW_BISMUTH.get());
        item(ModItems.CHISEL.get());
    }

    private void item(Item item) {
        String name = getItemName(item);
        getBuilder(name)
                .parent(getExistingFile(mcLoc("item/generated")))
                .texture("layer0", "item/" + name);
    }

    private @NotNull String getItemName(Item item) {
        return BuiltInRegistries.ITEM.getKey(item).toString().replace(PixelPioneer.MOD_ID + ":", "");
    }
}