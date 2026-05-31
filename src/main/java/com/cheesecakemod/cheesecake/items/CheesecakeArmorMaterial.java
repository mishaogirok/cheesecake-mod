package com.cheesecakemod.cheesecake.items;

import com.cheesecakemod.cheesecake.CheesecakeMod;
import com.cheesecakemod.cheesecake.init.ModItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public enum CheesecakeArmorMaterial implements IArmorMaterial {
    CHEESECAKE("cheesecake", 20, new int[]{2, 5, 6, 2}, 15,
            SoundEvents.ARMOR_EQUIP_LEATHER, 0.0f, 0.0f,
            () -> Ingredient.of(ModItems.CHEESECAKE_INGOT.get()));

    private static final String[] SLOT_NAMES = {"boots", "leggings", "chestplate", "helmet"};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final java.util.function.Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = {13, 15, 16, 11};

    CheesecakeArmorMaterial(String name, int durabilityMultiplier, int[] slotProtections,
                             int enchantmentValue, SoundEvent sound, float toughness,
                             float knockbackResistance, java.util.function.Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.slotProtections = slotProtections;
        this.enchantmentValue = enchantmentValue;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override public int getDurabilityForSlot(EquipmentSlotType slot) {
        return BASE_DURABILITY[slot.getIndex()] * durabilityMultiplier;
    }
    @Override public int getDefenseForSlot(EquipmentSlotType slot) { return slotProtections[slot.getIndex()]; }
    @Override public int getEnchantmentValue() { return enchantmentValue; }
    @Override public SoundEvent getEquipSound() { return sound; }
    @Override public Ingredient getRepairIngredient() { return repairIngredient.get(); }
    @Override public String getName() { return CheesecakeMod.MOD_ID + ":" + name; }
    @Override public float getToughness() { return toughness; }
    @Override public float getKnockbackResistance() { return knockbackResistance; }
}