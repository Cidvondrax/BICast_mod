
package net.mcreator.discordmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

import net.mcreator.discordmod.init.DiscordModModFluids;

public class BluecheeseItem extends BucketItem {
	public BluecheeseItem() {
		super(DiscordModModFluids.BLUECHEESE,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(CreativeModeTab.TAB_MISC));
	}
}
