package ca.evannosich.Trapiche;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class EmeraldToolMaterial implements ToolMaterial {
	@Override
	public int getDurability() {
		return 1024;
	}

	@Override
	public int getMiningLevel() {
		return 3;
	}

	@Override
	public float getMiningSpeedMultiplier() {
		return 8.0F;
	}

	@Override
	public float getAttackDamage() {
		return 0F;
	}

	@Override
	public int getEnchantability() {
		return 22;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(Items.EMERALD);
	}
}
