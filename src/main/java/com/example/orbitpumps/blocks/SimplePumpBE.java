package com.example.orbitpumps.blocks;

import com.example.orbitpumps.setup.Registration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;


public class SimplePumpBE extends BlockEntity {
    public SimplePumpBE(BlockPos pos, BlockState state) {
        super(Registration.SIMPLE_PUMP_BE.get(), pos, state);
    }

    // Called by the block ticker
    public void tickServer() { }
}
