package com.fwb.orbitpumps.datagen;

import com.fwb.orbitpumps.OrbitPumps;
import com.fwb.orbitpumps.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class OrbitLanguageProvider extends LanguageProvider {
    public OrbitLanguageProvider(DataGenerator gen, String locale) {
        super(gen, OrbitPumps.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup.orbit_pumps", "Orbit Pumps");
        add(Registration.SIMPLE_PUMP.get(), "Simple Pump");
    }
}
