package com.ratlabs.kingdoms.armor;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;

public class KnightArmorMaterial implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {20, 20, 20, 20};
    private static final int[] PROTECTION_VALUES = new int[] {5, 11, 15, 5};
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
        return "knight";
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

