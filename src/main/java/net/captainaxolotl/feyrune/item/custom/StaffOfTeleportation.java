package net.captainaxolotl.feyrune.item.custom;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.*;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.World;
import java.util.List;

import static net.minecraft.sound.SoundEvents.ENTITY_SHULKER_TELEPORT;

public class StaffOfTeleportation extends ModStaffItem {
    public StaffOfTeleportation(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings)
    {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
        //Tooltip
    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack stack, World world, List<Text> list, TooltipContext context)
    {
        list.add(new LiteralText("Wheee....").formatted(Formatting.LIGHT_PURPLE));
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand)
    {
        //Cooldown
        player.getItemCooldownManager().set(this, 90);
        //Sound
        world.playSound((PlayerEntity) null, player.getX(), player.getY(), player.getZ(),
                ENTITY_SHULKER_TELEPORT, SoundCategory.NEUTRAL, 1F,
                1F / (world.getRandom().nextFloat() * 0.4F + 0.8F));
        if (player.getEntityWorld().isClient)
        {

            Vec3d lookPos = Vec3d.ofCenter(raycast(world, player, RaycastContext.FluidHandling.NONE).getBlockPos());
            player.setPosition(lookPos.x, lookPos.y, lookPos.z);
        }
        //Fall damage cancel
        player.fallDistance = 0F;

        //Durability reduction on use
        ItemStack stack = player.getMainHandStack();
        stack.setDamage(stack.getDamage() + 10);

        //Break at 0 durability
        if (stack.getDamage() == 0) stack.setCount(0);

        return super.use(world, player, hand);
    }
        //copied from item.raycast
    protected static BlockHitResult raycast(World world, PlayerEntity player, RaycastContext.FluidHandling fluidHandling)
    {
        float f = player.getPitch();
        float g = player.getYaw();
        Vec3d vec3d = player.getEyePos();
        float h = MathHelper.cos(-g * ((float)Math.PI / 180F) - (float)Math.PI);
        float i = MathHelper.sin(-g * ((float)Math.PI / 180F) - (float)Math.PI);
        float j = -MathHelper.cos(-f * ((float)Math.PI / 180F));
        float k = MathHelper.sin(-f * ((float)Math.PI / 180F));
        float l = i * j;
        float n = h * j;
        double d = 5.0D;
        Vec3d vec3d2 = vec3d.add((double)l * 5.0D, (double)k * 5.0D, (double)n * 5.0D);
        return world.raycast(new RaycastContext(vec3d, vec3d2, RaycastContext.ShapeType.OUTLINE, fluidHandling, player));
    }
}
