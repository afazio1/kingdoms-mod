package com.ratlabs.kingdoms.armor;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;

public class NobleArmorMaterial implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {30, 30, 30, 30};
    private static final int[] PROTECTION_VALUES = new int[] {4, 10, 14, 4};
    private static final int X = 4;

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
        return "noble";
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

