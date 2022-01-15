package net.captainaxolotl.feyrune.client.render;

import com.google.common.collect.ImmutableList;
import net.captainaxolotl.feyrune.entity.RatEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

@Environment(EnvType.CLIENT)
public class RatEntityModel extends EntityModel<RatEntity> {
    private final ModelPart root;
    private final ModelPart tail;

    public RatEntityModel(ModelPart root) {
        this.root = root;
        this.tail = root.getChild("tail");
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();

        modelPartData.addChild("body",
                ModelPartBuilder.create()
                        .uv(0, 0)
                        .cuboid(-6.5F, -5.1111F, 0.6111F, 11.0F, 9.0F, 11.0F)
                        .uv(19, 20)
                        .cuboid(-5.5F, -4.1111F, -4.3889F, 9.0F, 7.0F, 6.0F),
                ModelTransform.pivot(0.5F, 19.1111F, -4.6111F));

        modelPartData.addChild("head",
                ModelPartBuilder.create()
                        .uv(33, 0)
                        .cuboid(-2.5F, -1.375F, -4.75F, 5.0F, 5.0F, 5.0F)
                        .uv(0, 5)
                        .cuboid(0.5F, -3.375F, -1.75F, 4.0F, 4.0F, 1.0F)
                        .uv(0, 0)
                        .cuboid(-4.5F, -3.375F, -1.75F, 4.0F, 4.0F, 1.0F)
                        .uv(9, 20)
                        .cuboid(-1.0F, 0.625F, -5.75F, 2.0F, 2.0F, 1.0F)
                        .uv(34, 33)
                        .cuboid(-4.0F, -0.375F, -4.85F, 8.0F, 4.0F, 0.0F),
                ModelTransform.pivot(-0.5F, 18.375F, -9.25F));

        modelPartData.addChild("front_leg_left",
                ModelPartBuilder.create()
                        .uv(24, 37)
                        .cuboid(-1.5F, -0.5F, -1.5F, 3.0F, 5.0F, 3.0F),
                ModelTransform.pivot(3.5F, 19.5F, -6.5F));

        modelPartData.addChild("front_leg_right",
                ModelPartBuilder.create()
                        .uv(0, 37)
                        .cuboid(-1.5F, -0.5F, -1.5F, 3.0F, 5.0F, 3.0F),
                ModelTransform.pivot(-4.5F, 19.5F, -6.5F));

        modelPartData.addChild("back_leg_left",
                ModelPartBuilder.create()
                        .uv(12, 37)
                        .cuboid(-1.5F, -0.5F, -1.5F, 3.0F, 5.0F, 3.0F),
                ModelTransform.pivot(4.5F, 19.5F, 4.5F));

        modelPartData.addChild("back_leg_right",
                ModelPartBuilder.create()
                        .uv(0, 20)
                        .mirrored()
                        .cuboid(-1.5F, -0.5F, -1.5F, 3.0F, 5.0F, 3.0F),
                ModelTransform.pivot(-5.5F, 19.5F, 4.5F));

        modelPartData.addChild("tail",
                ModelPartBuilder.create()
                        .uv(0, 20)
                        .mirrored()
                        .cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 15.0F),
                ModelTransform.pivot(-0.5F, 19.1111F, 6.3889F));
        return TexturedModelData.of(modelData, 64, 64);
    }

    @Override
    public void setAngles(RatEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch)
    {
        this.tail.pitch = -0.2f;
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.root).forEach((modelRenderer) ->
        {
            modelRenderer.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        });
    }
}
