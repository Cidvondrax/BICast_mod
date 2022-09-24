
package net.mcreator.discordmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class GelSwordItem extends SwordItem {
	public GelSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 50;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 3.5f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.SLIME_BALL));
			}
		}, 3, -1.5f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
	}
}
