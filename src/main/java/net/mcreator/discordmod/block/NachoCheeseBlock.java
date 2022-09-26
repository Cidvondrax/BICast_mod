
package net.mcreator.discordmod.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.discordmod.init.DiscordModModFluids;

public class NachoCheeseBlock extends LiquidBlock {
	public NachoCheeseBlock() {
		super(() -> (FlowingFluid) DiscordModModFluids.NACHO_CHEESE.get(), BlockBehaviour.Properties.of(Material.LAVA).strength(100f)
				.hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true)

		);
	}
}
