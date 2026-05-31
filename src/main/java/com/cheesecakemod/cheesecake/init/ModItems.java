package com.cheesecakemod.cheesecake.init;

import com.cheesecakemod.cheesecake.CheesecakeMod;
import com.cheesecakemod.cheesecake.items.CheesecakeArmorMaterial;
import com.cheesecakemod.cheesecake.items.CheesecakeTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CheesecakeMod.MOD_ID);

    // ======= ЇЖА =======
    public static final RegistryObject<Item> CHEESECAKE = ITEMS.register("cheesecake",
            () -> new Item(new Item.Properties()
                    .tab(ItemGroup.TAB_FOOD)
                    .food(new Food.Builder()
                            .nutrition(6)
                            .saturationMod(0.6f)
                            .build())));

    public static final RegistryObject<Item> COTTAGE_CHEESE = ITEMS.register("cottage_cheese",
            () -> new Item(new Item.Properties()
                    .tab(ItemGroup.TAB_FOOD)
                    .food(new Food.Builder()
                            .nutrition(3)
                            .saturationMod(0.4f)
                            .build())));

    // ======= МАТЕРІАЛ =======
    public static final RegistryObject<Item> CHEESECAKE_INGOT = ITEMS.register("cheesecake_ingot",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    // ======= ІНСТРУМЕНТИ =======
    public static final RegistryObject<Item> CHEESECAKE_SWORD = ITEMS.register("cheesecake_sword",
            () -> new SwordItem(CheesecakeTier.CHEESECAKE, 3, -2.4f,
                    new Item.Properties().tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> CHEESECAKE_PICKAXE = ITEMS.register("cheesecake_pickaxe",
            () -> new PickaxeItem(CheesecakeTier.CHEESECAKE, 1, -2.8f,
                    new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<Item> CHEESECAKE_AXE = ITEMS.register("cheesecake_axe",
            () -> new AxeItem(CheesecakeTier.CHEESECAKE, 6.0f, -3.1f,
                    new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<Item> CHEESECAKE_SHOVEL = ITEMS.register("cheesecake_shovel",
            () -> new ShovelItem(CheesecakeTier.CHEESECAKE, 1.5f, -3.0f,
                    new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<Item> CHEESECAKE_HOE = ITEMS.register("cheesecake_hoe",
            () -> new HoeItem(CheesecakeTier.CHEESECAKE, -2, 0.0f,
                    new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    // ======= БРОНЯ =======
    public static final RegistryObject<Item> CHEESECAKE_HELMET = ITEMS.register("cheesecake_helmet",
            () -> new ArmorItem(CheesecakeArmorMaterial.CHEESECAKE, EquipmentSlotType.HEAD,
                    new Item.Properties().tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> CHEESECAKE_CHESTPLATE = ITEMS.register("cheesecake_chestplate",
            () -> new ArmorItem(CheesecakeArmorMaterial.CHEESECAKE, EquipmentSlotType.CHEST,
                    new Item.Properties().tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> CHEESECAKE_LEGGINGS = ITEMS.register("cheesecake_leggings",
            () -> new ArmorItem(CheesecakeArmorMaterial.CHEESECAKE, EquipmentSlotType.LEGS,
                    new Item.Properties().tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> CHEESECAKE_BOOTS = ITEMS.register("cheesecake_boots",
            () -> new ArmorItem(CheesecakeArmorMaterial.CHEESECAKE, EquipmentSlotType.FEET,
                    new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
}