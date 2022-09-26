
package net.mcreator.discordmod.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.discordmod.init.DiscordModModItems;
import net.mcreator.discordmod.init.DiscordModModFluids;
import net.mcreator.discordmod.init.DiscordModModBlocks;
import net.mcreator.discordmod.fluid.attributes.NachoCheeseFluidAttributes;

public abstract class NachoCheeseFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(DiscordModModFluids.NACHO_CHEESE,
			DiscordModModFluids.FLOWING_NACHO_CHEESE,
			NachoCheeseFluidAttributes
					.builder(new ResourceLocation("discord_mod:blocks/nacho_cheese"), new ResourceLocation("discord_mod:blocks/nacho_cheese"))

					.color(-16448205))
			.explosionResistance(100f).canMultiply().tickRate(2).levelDecreasePerBlock(3).slopeFindDistance(3)
			.bucket(DiscordModModItems.NACHO_CHEESE_BUCKET).block(() -> (LiquidBlock) DiscordModModBlocks.NACHO_CHEESE.get());

	private NachoCheeseFluid() {
		super(PROPERTIES);
	}

	public static class Source extends NachoCheeseFluid {
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

	public static class Flowing extends NachoCheeseFluid {
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
