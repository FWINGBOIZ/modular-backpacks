package com.fwb.orbitpumps.datagen;

import com.fwb.orbitpumps.OrbitPumps;
import com.fwb.orbitpumps.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class OrbitBlockStates extends BlockStateProvider {
    public OrbitBlockStates(DataGenerator gen, ExistingFileHelper helper) {
        super(gen, OrbitPumps.MODID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
        registerSimplePump();
    }

    private void registerSimplePump() {
        simpleBlock(Registration.SIMPLE_PUMP.get());
    }
}
