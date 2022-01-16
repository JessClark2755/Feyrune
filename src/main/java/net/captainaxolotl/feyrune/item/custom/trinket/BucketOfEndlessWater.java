package net.captainaxolotl.feyrune.item.custom.trinket;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BucketItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class BucketOfEndlessWater extends BucketItem
{
    public BucketOfEndlessWater(Settings settings) {
        super(Fluids.WATER, settings);
    }

    @Override
    public void onEmptied(@Nullable PlayerEntity player, World world, ItemStack stack, BlockPos pos) {
        super.onEmptied(player, world, stack, pos);
    }
}
