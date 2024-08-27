package fr.celyanrbx.pixelpioneer.data.loot;

import fr.celyanrbx.pixelpioneer.PixelPioneer;
import fr.celyanrbx.pixelpioneer.item.ModItems;
import fr.celyanrbx.pixelpioneer.loot.AddItemModifier;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;
import net.neoforged.neoforge.common.loot.LootTableIdCondition;

import java.util.concurrent.CompletableFuture;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, PixelPioneer.MOD_ID);
    }

    @Override
    protected void start() {
        add("steel_ingot_from_igloo_chest", new AddItemModifier(new LootItemCondition[]{
                LootTableIdCondition.builder(ResourceLocation.parse("chests/igloo_chest")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()},
                ModItems.STEEL_INGOT.get()));

        add("steel_ingot_from_iron_golem", new AddItemModifier(new LootItemCondition[]{
                LootTableIdCondition.builder(ResourceLocation.parse("entities/iron_golem")).build()},
                ModItems.STEEL_INGOT.get()));
    }
}
