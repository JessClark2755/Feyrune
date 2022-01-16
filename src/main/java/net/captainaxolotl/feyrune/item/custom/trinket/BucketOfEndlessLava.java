package net.captainaxolotl.feyrune.item.custom.trinket;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BucketItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class BucketOfEndlessLava extends BucketItem
{
    public BucketOfEndlessLava(Settings settings) {
        super(Fluids.LAVA, settings);

    }
    @Override
    public void onEmptied(@Nullable PlayerEntity player, World world, ItemStack stack, BlockPos pos) {
        super.onEmptied(player, world, stack, pos);
    }
}
