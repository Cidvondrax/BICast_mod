
package net.mcreator.discordmod.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.discordmod.init.DiscordModModItems;
import net.mcreator.discordmod.init.DiscordModModFluids;
import net.mcreator.discordmod.init.DiscordModModBlocks;

public abstract class BluecheeseFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(DiscordModModFluids.BLUECHEESE,
			DiscordModModFluids.FLOWING_BLUECHEESE,
			FluidAttributes.builder(new ResourceLocation("discord_mod:blocks/blue"), new ResourceLocation("discord_mod:blocks/blue"))

	).explosionResistance(100f)

			.bucket(DiscordModModItems.BLUECHEESE_BUCKET).block(() -> (LiquidBlock) DiscordModModBlocks.BLUECHEESE.get());

	private BluecheeseFluid() {
		super(PROPERTIES);
	}

	public static class Source extends BluecheeseFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends BluecheeseFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
