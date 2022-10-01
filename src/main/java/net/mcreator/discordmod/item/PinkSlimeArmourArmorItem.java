
package net.mcreator.discordmod.item;

import net.minecraft.sounds.SoundEvent;

public abstract class PinkSlimeArmourArmorItem extends ArmorItem {

	public PinkSlimeArmourArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 18;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 7, 6, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 11;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DiscordModModItems.DELETED_MOD_ELEMENT.get()));
			}

			@Override
			public String getName() {
				return "pink_slime_armour_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends PinkSlimeArmourArmorItem {

		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "discord_mod:textures/models/armor/pinkslimearmour_layer_1.png";
		}

	}

	public static class Chestplate extends PinkSlimeArmourArmorItem {

		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "discord_mod:textures/models/armor/pinkslimearmour_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			PinkSlimeArmourArmorBodyTickEventProcedure.execute(

			);
		}
	}

	public static class Leggings extends PinkSlimeArmourArmorItem {

		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "discord_mod:textures/models/armor/pinkslimearmour_layer_2.png";
		}

	}

	public static class Boots extends PinkSlimeArmourArmorItem {

		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "discord_mod:textures/models/armor/pinkslimearmour_layer_1.png";
		}

	}

}
