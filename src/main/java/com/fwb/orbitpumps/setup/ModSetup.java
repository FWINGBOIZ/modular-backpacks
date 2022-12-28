package com.fwb.orbitpumps.setup;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class ModSetup {
    public static final String TAB_NAME = "orbit_pumps";

    public static final CreativeModeTab ITEM_GROUP = new CreativeModeTab(TAB_NAME) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.HEART_OF_THE_SEA);
        }
    };

    // Called on setup
    public static void init(final FMLCommonSetupEvent event) { }
}
