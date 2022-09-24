
package net.mcreator.discordmod.block;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import net.mcreator.discordmod.init.DiscordModModItems;

import java.util.List;
import java.util.Collections;

public class CheeseblockstwoBlock extends Block {
	public CheeseblockstwoBlock() {
		super(BlockBehaviour.Properties.of(Material.VEGETABLE).sound(SoundType.SHROOMLIGHT).strength(1.1500000000000001f, 10f).jumpFactor(1.6f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(DiscordModModItems.DELETED_MOD_ELEMENT.get(), 3));
	}
}
