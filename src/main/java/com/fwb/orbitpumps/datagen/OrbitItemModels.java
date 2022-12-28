package com.fwb.orbitpumps.datagen;

import com.fwb.orbitpumps.OrbitPumps;
import com.fwb.orbitpumps.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class OrbitItemModels extends ItemModelProvider {
    public OrbitItemModels(DataGenerator gen, ExistingFileHelper helper) {
        super(gen, OrbitPumps.MODID, helper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(Registration.SIMPLE_PUMP.getId().getPath(), modLoc("block/simple_pump"));
    }
}
