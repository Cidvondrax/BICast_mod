// Made with Blockbench 4.4.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelIronGolemModel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "irongolemmodel"), "main");
	private final ModelPart field_78176_b;
	private final ModelPart field_78174_d;
	private final ModelPart field_78177_c;
	private final ModelPart field_78175_e;
	private final ModelPart field_78178_a;
	private final ModelPart field_78173_f;

	public ModelIronGolemModel(ModelPart root) {
		this.field_78176_b = root.getChild("field_78176_b");
		this.field_78174_d = root.getChild("field_78174_d");
		this.field_78177_c = root.getChild("field_78177_c");
		this.field_78175_e = root.getChild("field_78175_e");
		this.field_78178_a = root.getChild("field_78178_a");
		this.field_78173_f = root.getChild("field_78173_f");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition field_78176_b = partdefinition.addOrReplaceChild("field_78176_b", CubeListBuilder.create()
				.texOffs(0, 40).addBox(-9.0F, -2.0F, -6.0F, 18.0F, 12.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -7.0F, 0.0F));

		PartDefinition field_78174_d = partdefinition.addOrReplaceChild("field_78174_d", CubeListBuilder.create()
				.texOffs(60, 58).addBox(9.0F, -2.5F, -3.0F, 4.0F, 30.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -7.0F, 0.0F));

		PartDefinition field_78177_c = partdefinition.addOrReplaceChild("field_78177_c", CubeListBuilder.create()
				.texOffs(60, 21).addBox(-13.0F, -2.5F, -3.0F, 4.0F, 30.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -7.0F, 0.0F));

		PartDefinition field_78175_e = partdefinition.addOrReplaceChild("field_78175_e", CubeListBuilder.create()
				.texOffs(37, 0).addBox(-3.5F, -3.0F, -3.0F, 6.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 11.0F, 0.0F));

		PartDefinition field_78178_a = partdefinition.addOrReplaceChild("field_78178_a", CubeListBuilder.create()
				.texOffs(0, 0).addBox(-4.0F, -12.0F, -5.5F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -7.0F, -2.0F));

		PartDefinition field_78173_f = partdefinition.addOrReplaceChild("field_78173_f",
				CubeListBuilder.create().texOffs(60, 0).mirror()
						.addBox(-3.5F, -3.0F, -3.0F, 6.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(5.0F, 11.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		field_78176_b.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		field_78174_d.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		field_78177_c.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		field_78175_e.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		field_78178_a.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		field_78173_f.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}