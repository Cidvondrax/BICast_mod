
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.discordmod.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class DiscordModModTabs {
	public static CreativeModeTab TAB_CHEESE_DIMENSION;

	public static void load() {
		TAB_CHEESE_DIMENSION = new CreativeModeTab("tabcheese_dimension") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(DiscordModModItems.MOZZARELLA_BALL.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
