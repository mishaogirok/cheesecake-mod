package com.cheesecakemod.cheesecake.init;

import com.cheesecakemod.cheesecake.CheesecakeMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CheesecakeMod.MOD_ID);

    public static final RegistryObject<Block> CHEESECAKE_BLOCK = BLOCKS.register("cheesecake_block",
            () -> new Block(AbstractBlock.Properties.of(Material.CAKE)
                    .strength(0.5f, 0.5f)
                    .sound(SoundType.WOOL)
                    .noOcclusion()));

    static {
        // Register block item for cheesecake_block
        ModItems.ITEMS.register("cheesecake_block", () ->
                new BlockItem(CHEESECAKE_BLOCK.get(),
                        new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    }
}