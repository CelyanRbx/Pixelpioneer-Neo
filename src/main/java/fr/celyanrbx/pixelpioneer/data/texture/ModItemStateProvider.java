package fr.celyanrbx.pixelpioneer.data.texture;

import fr.celyanrbx.pixelpioneer.PixelPioneer;
import fr.celyanrbx.pixelpioneer.init.ItemInit;
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
        item(ItemInit.SAPPHIRE_INGOT.get());
        item(ItemInit.RAW_SAPPHIRE.get());
        item(ItemInit.SAPPHIRE_NUGGET.get());
        item(ItemInit.RUBY_INGOT.get());
        item(ItemInit.RAW_RUBY.get());
        item(ItemInit.RUBY_NUGGET.get());
        item(ItemInit.EMERALD_INGOT.get());
        item(ItemInit.RAW_EMERALD.get());
        item(ItemInit.EMERALD_NUGGET.get());
        item(ItemInit.STEEL_INGOT.get());
        item(ItemInit.RAW_STEEL.get());
        item(ItemInit.STEEL_NUGGET.get());
        item(ItemInit.BISMUTH.get());
        item(ItemInit.RAW_BISMUTH.get());
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