package net.eman3600.dndreams.blocks.crop;

import net.eman3600.dndreams.initializers.ModItems;
import net.minecraft.block.*;
import net.minecraft.item.ItemConvertible;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class SnowbellBlock extends BeetrootsBlock {
    public SnowbellBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected int getGrowthAmount(World world) {
        return MathHelper.nextInt(world.random, 1, 2);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.SNOWBELL_SEEDS;
    }
}
