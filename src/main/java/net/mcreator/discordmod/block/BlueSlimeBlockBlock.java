
package net.mcreator.discordmod.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;

public class BlueSlimeBlockBlock extends Block {

	public BlueSlimeBlockBlock() {
		super(BlockBehaviour.Properties.of(Material.SPONGE).sound(SoundType.SLIME_BLOCK).strength(0.8f, 10f).friction(1.5f).speedFactor(0.8f)
				.jumpFactor(1.5f));

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
		return Collections.singletonList(new ItemStack(this, 1));
	}

}
