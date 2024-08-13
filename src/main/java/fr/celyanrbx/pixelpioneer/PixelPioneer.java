package fr.celyanrbx.pixelpioneer;

import fr.celyanrbx.pixelpioneer.data.DataGenerators;
import fr.celyanrbx.pixelpioneer.init.BlockInit;
import fr.celyanrbx.pixelpioneer.init.CreativeModeTabInit;
import fr.celyanrbx.pixelpioneer.init.ItemInit;
import fr.celyanrbx.pixelpioneer.init.LootModifierInit;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(PixelPioneer.MOD_ID)
public class PixelPioneer {
    public static final String MOD_ID = "pixelpioneer";
    public static final Logger logger = LoggerFactory.getLogger(PixelPioneer.class);

    public PixelPioneer(@NotNull IEventBus bus) {

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        CreativeModeTabInit.CREATIVE_MODE_TABS.register(bus);
        LootModifierInit.LOOT_MODIFIERS.register(bus);

        bus.addListener(DataGenerators::gatherData);

        bus.addListener(FMLClientSetupEvent.class, (fmlClientSetupEvent -> {
            fmlClientSetupEvent.enqueueWork(() -> {
                ModList.get().getModContainerById(MOD_ID).ifPresent(modContainer -> {
                    logger.info("Hello from PixelPioneer!, using version: {}", modContainer.getModInfo().getVersion());
                });
            });
        }));
    }
}
