package com.fwb.orbitpumps;

import com.fwb.orbitpumps.setup.ClientSetup;
import com.fwb.orbitpumps.setup.ModSetup;
import com.fwb.orbitpumps.setup.Registration;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(OrbitPumps.MODID)
public class OrbitPumps
{
    public static final String MODID = "orbitpumps";
    public static final Logger LOGGER = LogManager.getLogger();

    public OrbitPumps()
    {
        // Register the deferred registry
        Registration.init();

        // Register the setup method for modloading
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(ModSetup::init);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> modEventBus.addListener(ClientSetup::init));
    }
}
