package com.example.orbitpumps.setup;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.example.orbitpumps.OrbitPumps.MODID;
import com.example.orbitpumps.blocks.SimplePumpBlock;
import com.example.orbitpumps.blocks.SimplePumpBE;

public class Registration {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    private static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MODID);

    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
        BLOCK_ENTITIES.register(bus);
    }



    public static final BlockBehaviour.Properties DEFAULT_BLOCK_PROPERTIES = BlockBehaviour.Properties.of(Material.STONE).strength(2f);
    public static final Item.Properties DEFAULT_ITEM_PROPERTIES = new Item.Properties().tab(ModSetup.ITEM_GROUP);

    // Perform registrations here:
    // Simple pump
    public static final RegistryObject<Block> SIMPLE_PUMP = BLOCKS.register("simple_pump", SimplePumpBlock::new);
    public static final RegistryObject<Item> SIMPLE_PUMP_ITEM = fromBlock(SIMPLE_PUMP);
    public static final RegistryObject<BlockEntityType<SimplePumpBE>> SIMPLE_PUMP_BE = BLOCK_ENTITIES.register("simple_pump", () -> BlockEntityType.Builder.of(SimplePumpBE::new, SIMPLE_PUMP.get()).build(null));

    // Conveniance function: Take a RegistryObject<Block> and make a corresponding RegistryObject<Item> from it
    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), DEFAULT_ITEM_PROPERTIES));
    }
}
