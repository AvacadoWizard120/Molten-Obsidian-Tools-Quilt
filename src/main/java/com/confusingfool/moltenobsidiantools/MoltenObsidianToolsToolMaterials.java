package com.confusingfool.moltenobsidiantools;

import java.util.function.Supplier;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

@SuppressWarnings("ALL")
public enum MoltenObsidianToolsToolMaterials implements ToolMaterial
{
	MOLTEN( 3, 1900, 9.4F, 3.5F, 3, () -> {
	return Ingredient.ofItems(MoltenObsidianToolsItems.MOLTEN_OBSIDIAN);
	}),
	REINFORCED(4, 3000, 20.0F, 4.0F, 20, () -> {
	return Ingredient.ofItems(MoltenObsidianToolsItems.REINFORCED_MOLTEN_OBSIDIAN);
	});

	private final int miningLevel;
	private final int itemDurability;
	private final float miningSpeed;
	private final float attackDamage;
	private final int enchantability;
	private final Lazy<Ingredient> repairIngredient;

	private MoltenObsidianToolsToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier repairIngredient) {
		this.miningLevel = miningLevel;
		this.itemDurability = itemDurability;
		this.miningSpeed = miningSpeed;
		this.attackDamage = attackDamage;
		this.enchantability = enchantability;
		this.repairIngredient = new Lazy(repairIngredient);
	}

	public int getDurability() {
		return this.itemDurability;
	}

	public float getMiningSpeedMultiplier() {
		return this.miningSpeed;
	}

	public float getAttackDamage() {
		return this.attackDamage;
	}

	public int getMiningLevel() {
		return this.miningLevel;
	}

	public int getEnchantability() {
		return this.enchantability;
	}

	public Ingredient getRepairIngredient() {
		return (Ingredient)this.repairIngredient.get();
	}
}
