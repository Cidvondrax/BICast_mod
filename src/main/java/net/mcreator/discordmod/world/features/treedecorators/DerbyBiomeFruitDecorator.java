package net.mcreator.discordmod.world.features.treedecorators;

public class DerbyBiomeFruitDecorator extends CocoaDecorator {

    public static final DerbyBiomeFruitDecorator INSTANCE = new DerbyBiomeFruitDecorator();

    public static com.mojang.serialization.Codec<DerbyBiomeFruitDecorator> codec;
    public static TreeDecoratorType<?> tdt;

    static {
        codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);
        tdt = new TreeDecoratorType<>(codec);
        tdt.setRegistryName("derby_biome_tree_fruit_decorator");
        ForgeRegistries.TREE_DECORATOR_TYPES.register(tdt);
    }

    public DerbyBiomeFruitDecorator() {
        super(0.2f);
    }

    @Override protected TreeDecoratorType<?> type() {
        return tdt;
    }

    @Override /* failed to load code for net.minecraft.world.level.levelgen.feature.treedecorators.CocoaDecorator */

}
