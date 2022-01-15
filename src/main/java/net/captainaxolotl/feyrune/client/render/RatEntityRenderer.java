package net.captainaxolotl.feyrune.client.render;

import net.captainaxolotl.feyrune.FeyruneClient;
import net.captainaxolotl.feyrune.FeyruneMod;
import net.captainaxolotl.feyrune.entity.RatEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class RatEntityRenderer extends MobEntityRenderer<RatEntity, RatEntityModel>
{
    public RatEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new RatEntityModel(context.getPart(FeyruneClient.MODEL_RAT_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(RatEntity entity) {
        return new Identifier(FeyruneMod.MOD_ID, "textures/entity/rat/rat.png");
    }
}
