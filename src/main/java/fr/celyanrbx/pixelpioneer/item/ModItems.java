package fr.celyanrbx.pixelpioneer.item;

import fr.celyanrbx.pixelpioneer.PixelPioneer;
import fr.celyanrbx.pixelpioneer.item.custom.ChiselItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static DeferredRegister.Items ITEMS = DeferredRegister.createItems(PixelPioneer.MOD_ID);

    public static final DeferredItem<Item> SAPPHIRE_INGOT = ITEMS.register("sapphire_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SAPPHIRE_NUGGET = ITEMS.register("sapphire_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RUBY_INGOT = ITEMS.register("ruby_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_RUBY = ITEMS.register("raw_ruby", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RUBY_NUGGET = ITEMS.register("ruby_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> EMERALD_INGOT = ITEMS.register("emerald_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_EMERALD = ITEMS.register("raw_emerald", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> EMERALD_NUGGET = ITEMS.register("emerald_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_STEEL = ITEMS.register("raw_steel", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_NUGGET = ITEMS.register("steel_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BISMUTH = ITEMS.register("bismuth", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_BISMUTH = ITEMS.register("raw_bismuth", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHISEL = ITEMS.register("chisel", () -> new ChiselItem(new Item.Properties().durability(32)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}