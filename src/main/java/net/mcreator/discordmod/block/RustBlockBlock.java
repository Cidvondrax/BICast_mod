
package net.mcreator.discordmod.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;

public class RustBlockBlock extends FallingBlock {

	public RustBlockBlock() {
		super(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.FIRE).sound(SoundType.GRAVEL).strength(3f, 15f).friction(1f)
				.speedFactor(0.6f));

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
