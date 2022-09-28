
package net.mcreator.discordmod.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;

public class CrackedglassBlock extends IronBarsBlock {

	public CrackedglassBlock() {
		super(BlockBehaviour.Properties.of(Material.GLASS).sound(SoundType.GRAVEL).strength(0.5f, 2.5f));

	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(DiscordModModItems.DELETED_MOD_ELEMENT.get(), 2));
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(DiscordModModBlocks.CRACKEDGLASS.get(), renderType -> renderType == RenderType.cutoutMipped());
	}

}
