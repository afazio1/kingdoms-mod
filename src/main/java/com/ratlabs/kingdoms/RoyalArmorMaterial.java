package com.ratlabs.kingdoms;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;

public class RoyalArmorMaterial implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {40, 40, 40, 40};
    private static final int[] PROTECTION_VALUES = new int[] {6, 12, 16, 6};
    private static final int X = 5;

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * X;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return X;
    }

    @Override
    public SoundEvent getEquipSound() {
        return null;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }

    @Override
    public String getName() {
        return "royal";
    }

    @Override
    public float getToughness() {
        return (float) X;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}
