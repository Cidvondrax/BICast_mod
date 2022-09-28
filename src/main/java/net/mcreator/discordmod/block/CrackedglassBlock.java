
package net.mcreator.discordmod.block;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.discordmod.init.DiscordModModItems;
import net.mcreator.discordmod.init.DiscordModModBlocks;

import java.util.List;
import java.util.Collections;

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
		return Collections.singletonList(new ItemStack(DiscordModModItems.GLASS_SHARD.get(), 2));
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(DiscordModModBlocks.CRACKEDGLASS.get(), renderType -> renderType == RenderType.cutoutMipped());
	}

}
