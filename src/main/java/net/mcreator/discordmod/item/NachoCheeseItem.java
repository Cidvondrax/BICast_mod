
package net.mcreator.discordmod.item;

import net.minecraft.network.chat.Component;

public class NachoCheeseItem extends BucketItem {

	public NachoCheeseItem() {
		super(DiscordModModFluids.NACHO_CHEESE,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(CreativeModeTab.TAB_MISC));
	}

}
