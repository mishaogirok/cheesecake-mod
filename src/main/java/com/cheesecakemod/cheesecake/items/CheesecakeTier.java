package com.cheesecakemod.cheesecake.items;

import com.cheesecakemod.cheesecake.init.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public enum CheesecakeTier implements IItemTier {
    CHEESECAKE(2, 512, 6.5f, 2.5f, 18,
            () -> Ingredient.of(ModItems.CHEESECAKE_INGOT.get()));

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final java.util.function.Supplier<Ingredient> repairIngredient;

    CheesecakeTier(int level, int uses, float speed, float damage, int enchantmentValue,
                   java.util.function.Supplier<Ingredient> repairIngredient) {
        this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = repairIngredient;
    }

    @Override public int getUses() { return uses; }
    @Override public float getSpeed() { return speed; }
    @Override public float getAttackDamageBonus() { return damage; }
    @Override public int getLevel() { return level; }
    @Override public int getEnchantmentValue() { return enchantmentValue; }
    @Override public Ingredient getRepairIngredient() { return repairIngredient.get(); }
}