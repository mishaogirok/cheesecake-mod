package com.cheesecakemod.cheesecake;

import com.cheesecakemod.cheesecake.init.ModBlocks;
import com.cheesecakemod.cheesecake.init.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafxmod.FMLJavaModLoadingContext;

@Mod(CheesecakeMod.MOD_ID)
public class CheesecakeMod {
    public static final String MOD_ID = "cheesecake";

    public CheesecakeMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.ITEMS.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}