package com.fwb.orbitpumps.block.entity;

import com.fwb.orbitpumps.setup.Registration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;


public class SimplePumpTile extends BlockEntity {
    public SimplePumpTile(BlockPos pos, BlockState state) {
        super(Registration.SIMPLE_PUMP_BE.get(), pos, state);
    }

    // Called by the block ticker
    public void tickServer() { }
}
