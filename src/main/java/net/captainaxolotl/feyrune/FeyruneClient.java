package net.captainaxolotl.feyrune;
import net.captainaxolotl.feyrune.client.render.RatEntityModel;
import net.captainaxolotl.feyrune.client.render.RatEntityRenderer;
import net.captainaxolotl.feyrune.entity.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class FeyruneClient implements ClientModInitializer
{
    public static final EntityModelLayer MODEL_RAT_LAYER = new EntityModelLayer(new Identifier(FeyruneMod.MOD_ID, "rat"), "main");


    @Override
    public void onInitializeClient()
    {
        EntityRendererRegistry.INSTANCE.register(ModEntities.RAT, (context) -> {
            return new RatEntityRenderer(context);
        });

        EntityModelLayerRegistry.registerModelLayer(MODEL_RAT_LAYER, RatEntityModel::getTexturedModelData);

    }
}
