package fr.celyanrbx.pixelpioneer.item;

import fr.celyanrbx.pixelpioneer.PixelPioneer;
import fr.celyanrbx.pixelpioneer.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.HashSet;
import java.util.Set;

public class ModCreativeModeTabs {
    public static DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PixelPioneer.MOD_ID);

    public static String PIXELPIONEER_TAB_ONE_TITLE = "PixelPioneer";

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> PIXELPIONEER_TAB_ONE = CREATIVE_MODE_TABS.register("pixelpioneer.items_tab_one", () -> {
        CreativeModeTab.Builder builder = CreativeModeTab.builder();

        builder.displayItems((itemDispay, output) -> {
            Set<Item> addedItems = new HashSet<>();

            ModItems.ITEMS.getEntries()
                    .stream()
                    .map((item) -> item.get().asItem())
                    .filter(addedItems::add)
                    .forEach(output::accept);

            ModBlocks.BLOCKS.getEntries()
                    .stream()
                    .map((block) -> block.get().asItem())
                    .filter(addedItems::add)
                    .forEach(output::accept);
        });

        builder.icon(() -> new ItemStack(ModItems.BISMUTH.get()));
        builder.title(Component.translatable(PIXELPIONEER_TAB_ONE_TITLE));

        return builder.build();
    });
}
