package com.confusingfool.moltenobsidiantools;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class MoltenObsidianToolsItemGroups
{
	public static ItemGroup MOLTEN_OBSIDIAN_TOOLS = Registry.register(Registries.ITEM_GROUP, new Identifier("moltenobsidiantools", "molten_obsidian_tools"),
		FabricItemGroup.builder()
			.name(Text.translatable("itemgroup.moltenObsidianTools"))
			.icon(() -> new ItemStack(MoltenObsidianToolsItems.MOLTEN_OBSIDIAN)).entries((displayContext, entries) -> {
				entries.addItem(MoltenObsidianToolsItems.MOLTEN_OBSIDIAN);
				entries.addItem(MoltenObsidianToolsItems.MOLTEN_UPGRADE_TEMPLATE);
				entries.addItem(MoltenObsidianToolsItems.MOLTEN_OBSIDIAN_AXE);
				entries.addItem(MoltenObsidianToolsItems.MOLTEN_OBSIDIAN_HOE);
				entries.addItem(MoltenObsidianToolsItems.MOLTEN_OBSIDIAN_SHOVEL);
				entries.addItem(MoltenObsidianToolsItems.MOLTEN_OBSIDIAN_PICKAXE);
				entries.addItem(MoltenObsidianToolsItems.REINFORCED_MOLTEN_OBSIDIAN);
				entries.addItem(MoltenObsidianToolsItems.REINFORCED_UPGRADE_TEMPLATE);
				entries.addItem(MoltenObsidianToolsItems.REINFORCED_OBSIDIAN_AXE);
				entries.addItem(MoltenObsidianToolsItems.REINFORCED_OBSIDIAN_HOE);
				entries.addItem(MoltenObsidianToolsItems.REINFORCED_OBSIDIAN_SHOVEL);
				entries.addItem(MoltenObsidianToolsItems.REINFORCED_OBSIDIAN_PICKAXE);
			}).build());

	public static void registerItemGroups()
	{

	}
}
