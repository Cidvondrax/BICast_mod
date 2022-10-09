package net.mcreator.discordmod.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class TradeCheddarForSwissProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.getItem() == DiscordModModBlocks.CHEESEBLACKONE.get().asItem()) {
			if (sourceentity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(DiscordModModBlocks.CHEESEBLACKONE.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
						_player.inventoryMenu.getCraftSlots());
			}
			if (sourceentity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(DiscordModModBlocks.SWISS_CHEESE_BLOCK.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}
