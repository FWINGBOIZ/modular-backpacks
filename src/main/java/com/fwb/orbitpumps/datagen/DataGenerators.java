package com.fwb.orbitpumps.datagen;

import com.fwb.orbitpumps.OrbitPumps;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = OrbitPumps.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent e) {
        DataGenerator gen = e.getGenerator();
//        gen.addProvider(e.includeClient(), new OrbitBlockStates(gen, e.getExistingFileHelper()));
//        gen.addProvider(e.includeClient(), new OrbitItemModels(gen, e.getExistingFileHelper()));
        gen.addProvider(e.includeClient(), new OrbitLanguageProvider(gen, "en_us"));
    }
}
