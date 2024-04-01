package com.confusingfool.moltenobsidiantools;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

import java.util.List;

public class MoltenObsidianToolsItems
{
	private static final Formatting TITLE_FORMATTING = Formatting.GRAY;
	private static final Formatting DESCRIPTION_FORMATTING = Formatting.BLUE;

	private static final Text MOLTEN_UPGRADE_APPLIES_TO_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("moltenobsidiantools", "smithing_template.molten_upgrade.applies_to"))).formatted(DESCRIPTION_FORMATTING);
	private static final Text REINFORCED_UPGRADE_APPLIES_TO_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("moltenobsidiantools", "smithing_template.reinforced_upgrade.applies_to"))).formatted(DESCRIPTION_FORMATTING);

	private static final Text MOLTEN_UPGRADE_INGREDIENTS_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("moltenobsidiantools", "smithing_template.molten_upgrade.ingredients"))).formatted(DESCRIPTION_FORMATTING);
	private static final Text REINFORCED_UPGRADE_INGREDIENTS_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("moltenobsidiantools", "smithing_template.reinforced_upgrade.ingredients"))).formatted(DESCRIPTION_FORMATTING);

	private static final Text MOLTEN_UPGRADE_TEXT= Text.translatable(Util.createTranslationKey("upgrade", new Identifier("moltenobsidiantools", "molten_upgrade"))).formatted(TITLE_FORMATTING);
	private static final Text REINFORCED_UPGRADE_TEXT= Text.translatable(Util.createTranslationKey("upgrade", new Identifier("moltenobsidiantools", "reinforced_upgrade"))).formatted(TITLE_FORMATTING);

	private static final Text MOLTEN_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("moltenobsidiantools", "smithing_template.molten_upgrade.base_slot_description")));
	private static final Text REINFORCED_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("moltenobsidiantools", "smithing_template.reinforced_upgrade.base_slot_description")));
	private static final Text MOLTEN_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("moltenobsidiantools", "smithing_template.molten_upgrade.additions_slot_description")));
	private static final Text REINFORCED_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("moltenobsidiantools", "smithing_template.reinforced_upgrade.additions_slot_description")));
	private static final Identifier EMPTY_SLOT_PICKAXE_TEXTURE = new Identifier("item/empty_slot_pickaxe");
	private static final Identifier EMPTY_SLOT_AXE_TEXTURE = new Identifier("item/empty_slot_axe");
	private static final Identifier EMPTY_SLOT_HOE_TEXTURE = new Identifier("item/empty_slot_hoe");
	private static final Identifier EMPTY_SLOT_SHOVEL_TEXTURE = new Identifier("item/empty_slot_shovel");
	private static final Identifier EMPTY_SLOT_MOLTEN_TEXTURE = new Identifier("moltenobsidiantools", "item/empty_slot_molten");
	private static final Identifier EMPTY_SLOT_REINFORCED_TEXTURE = new Identifier("moltenobsidiantools", "item/empty_slot_reinforced");

	public static final Item MOLTEN_OBSIDIAN = new Item(new QuiltItemSettings().maxCount(4));
	public static final Item REINFORCED_MOLTEN_OBSIDIAN = new Item(new QuiltItemSettings().maxCount(1));

	public static final Item MOLTEN_OBSIDIAN_AXE = new AxeItem(MoltenObsidianToolsToolMaterials.MOLTEN, 10, -1F, new QuiltItemSettings());
	public static final Item REINFORCED_OBSIDIAN_AXE = new AxeItem(MoltenObsidianToolsToolMaterials.REINFORCED, 10, -1F, new QuiltItemSettings());
	public static final Item MOLTEN_OBSIDIAN_PICKAXE = new PickaxeItem(MoltenObsidianToolsToolMaterials.MOLTEN, 4, -1F, new QuiltItemSettings());
	public static final Item REINFORCED_OBSIDIAN_PICKAXE = new PickaxeItem(MoltenObsidianToolsToolMaterials.REINFORCED, 4, -1F, new QuiltItemSettings());
	public static final Item MOLTEN_OBSIDIAN_SHOVEL = new ShovelItem(MoltenObsidianToolsToolMaterials.MOLTEN, 3, -1F, new QuiltItemSettings());
	public static final Item REINFORCED_OBSIDIAN_SHOVEL = new ShovelItem(MoltenObsidianToolsToolMaterials.REINFORCED, 3, -1F, new QuiltItemSettings());
	public static final Item MOLTEN_OBSIDIAN_HOE = new HoeItem(MoltenObsidianToolsToolMaterials.MOLTEN, 2, -1F, new QuiltItemSettings());
	public static final Item REINFORCED_OBSIDIAN_HOE = new HoeItem(MoltenObsidianToolsToolMaterials.REINFORCED, 2, -1F, new QuiltItemSettings());

	public static final Item MOLTEN_UPGRADE_TEMPLATE = new SmithingTemplateItem(MOLTEN_UPGRADE_APPLIES_TO_TEXT, MOLTEN_UPGRADE_INGREDIENTS_TEXT, MOLTEN_UPGRADE_TEXT, MOLTEN_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT, MOLTEN_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT, getMoltenUpgradeEmptyBaseSlotTextures(), getMoltenUpgradeEmptyAdditionsSlotTextures());
	public static final Item REINFORCED_UPGRADE_TEMPLATE = new SmithingTemplateItem(REINFORCED_UPGRADE_APPLIES_TO_TEXT, REINFORCED_UPGRADE_INGREDIENTS_TEXT, REINFORCED_UPGRADE_TEXT, REINFORCED_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT, REINFORCED_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT, getMoltenUpgradeEmptyBaseSlotTextures(), getReinforcedUpgradeEmptyAdditionsSlotTextures());

	private static List<Identifier> getMoltenUpgradeEmptyBaseSlotTextures() {
		return List.of(EMPTY_SLOT_PICKAXE_TEXTURE, EMPTY_SLOT_AXE_TEXTURE, EMPTY_SLOT_HOE_TEXTURE, EMPTY_SLOT_SHOVEL_TEXTURE);
	}

	private static List<Identifier> getMoltenUpgradeEmptyAdditionsSlotTextures() {
		return List.of(EMPTY_SLOT_MOLTEN_TEXTURE);
	}

	private static List<Identifier> getReinforcedUpgradeEmptyAdditionsSlotTextures() {
		return List.of(EMPTY_SLOT_REINFORCED_TEXTURE);
	}


	public static void register(ModContainer mod)
	{
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "molten_obsidian"), MOLTEN_OBSIDIAN);
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "reinforced_molten_obsidian"), REINFORCED_MOLTEN_OBSIDIAN);
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "molten_obsidian_pickaxe"), MOLTEN_OBSIDIAN_PICKAXE);
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "reinforced_obsidian_pickaxe"), REINFORCED_OBSIDIAN_PICKAXE);
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "molten_obsidian_axe"), MOLTEN_OBSIDIAN_AXE);
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "reinforced_obsidian_axe"), REINFORCED_OBSIDIAN_AXE);
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "molten_obsidian_shovel"), MOLTEN_OBSIDIAN_SHOVEL);
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "reinforced_obsidian_shovel"), REINFORCED_OBSIDIAN_SHOVEL);
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "molten_obsidian_hoe"), MOLTEN_OBSIDIAN_HOE);
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "reinforced_obsidian_hoe"), REINFORCED_OBSIDIAN_HOE);
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "molten_upgrade_template"), MOLTEN_UPGRADE_TEMPLATE);
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "reinforced_upgrade_template"), REINFORCED_UPGRADE_TEMPLATE);

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
			entries.addItem(MOLTEN_OBSIDIAN);
			entries.addItem(REINFORCED_MOLTEN_OBSIDIAN);
			entries.addAfter(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, MOLTEN_UPGRADE_TEMPLATE, REINFORCED_UPGRADE_TEMPLATE);
		});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS_AND_UTILITIES).register(entries -> {
			entries.addAfter(Items.DIAMOND_HOE, MOLTEN_OBSIDIAN_SHOVEL, MOLTEN_OBSIDIAN_PICKAXE, MOLTEN_OBSIDIAN_AXE, MOLTEN_OBSIDIAN_HOE);
			entries.addAfter(Items.NETHERITE_HOE, REINFORCED_OBSIDIAN_SHOVEL, REINFORCED_OBSIDIAN_PICKAXE, REINFORCED_OBSIDIAN_AXE, REINFORCED_OBSIDIAN_HOE);
		});
	}
}
