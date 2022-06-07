
package net.mcreator.packz.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.packz.init.PackzModTabs;

public class ShootmDownSwordItem extends SwordItem {
	public ShootmDownSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 3811;
			}

			public float getSpeed() {
				return 19f;
			}

			public float getAttackDamageBonus() {
				return 40f;
			}

			public int getLevel() {
				return 14;
			}

			public int getEnchantmentValue() {
				return 98;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.COPPER_BLOCK));
			}
		}, 3, -3f, new Item.Properties().tab(PackzModTabs.TAB_SHOOTM));
	}
}
