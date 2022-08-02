package com.ratlabs.kingdoms;

import com.ratlabs.kingdoms.armor.RoyalArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class RegisterItems {
   public static final ArmorMaterial ROYAL_ARMOR_MATERIAL = new RoyalArmorMaterial();

   public static final Item ROYAL_HELMET = new ArmorItem(ROYAL_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT).maxCount(1).fireproof());
   public static final Item ROYAL_CHESTPLATE = new ArmorItem(ROYAL_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT).maxCount(1));
   public static final Item ROYAL_LEGGINGS = new ArmorItem(ROYAL_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT).maxCount(1));
   public static final Item ROYAL_BOOTS = new ArmorItem(ROYAL_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT).maxCount(1));


   public static void register() {
      Registry.register(Registry.ITEM, new Identifier("kingdoms", "royal_helmet"), ROYAL_HELMET);
      Registry.register(Registry.ITEM, new Identifier("kingdoms", "royal_chestplate"), ROYAL_CHESTPLATE);
      Registry.register(Registry.ITEM, new Identifier("kingdoms", "royal_leggings"), ROYAL_LEGGINGS);
      Registry.register(Registry.ITEM, new Identifier("kingdoms", "royal_boots"), ROYAL_BOOTS);

   }
}
