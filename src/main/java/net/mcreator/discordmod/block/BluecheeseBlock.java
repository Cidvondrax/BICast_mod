
package net.mcreator.discordmod.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.discordmod.init.DiscordModModFluids;

public class BluecheeseBlock extends LiquidBlock {
	public BluecheeseBlock() {
		super(() -> (FlowingFluid) DiscordModModFluids.BLUECHEESE.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
	}
}
