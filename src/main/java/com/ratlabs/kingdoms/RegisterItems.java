package com.ratlabs.kingdoms;

import com.ratlabs.kingdoms.armor.KnightArmorMaterial;
import com.ratlabs.kingdoms.armor.NobleArmorMaterial;
import com.ratlabs.kingdoms.armor.RoyalArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class RegisterItems {
   // ROYAL ARMOR
   public static final ArmorMaterial ROYAL_ARMOR_MATERIAL = new RoyalArmorMaterial();
   public static final Item ROYAL_HELMET = new ArmorItem(ROYAL_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT).maxCount(1).fireproof());
   public static final Item ROYAL_CHESTPLATE = new ArmorItem(ROYAL_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT).maxCount(1));
   public static final Item ROYAL_LEGGINGS = new ArmorItem(ROYAL_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT).maxCount(1));
   public static final Item ROYAL_BOOTS = new ArmorItem(ROYAL_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT).maxCount(1));

   // NOBLE ARMOR

   public static final ArmorMaterial NOBLE_ARMOR_MATERIAL = new NobleArmorMaterial();
   public static final Item NOBLE_HELMET = new ArmorItem(NOBLE_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT).maxCount(1));
   public static final Item NOBLE_CHESTPLATE = new ArmorItem(NOBLE_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT).maxCount(1));
   public static final Item NOBLE_LEGGINGS = new ArmorItem(NOBLE_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT).maxCount(1));
   public static final Item NOBLE_BOOTS = new ArmorItem(NOBLE_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT).maxCount(1));

   // KNIGHT ARMOR
   public static final ArmorMaterial KNIGHT_ARMOR_MATERIAL = new KnightArmorMaterial();
   public static final Item KNIGHT_HELMET = new ArmorItem(KNIGHT_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT).maxCount(1));
   public static final Item KNIGHT_CHESTPLATE = new ArmorItem(KNIGHT_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT).maxCount(1));
   public static final Item KNIGHT_LEGGINGS = new ArmorItem(KNIGHT_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT).maxCount(1));
   public static final Item KNIGHT_BOOTS = new ArmorItem(KNIGHT_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT).maxCount(1));



   public static void register() {
      // ROYAL ARMOR
      Registry.register(Registry.ITEM, new Identifier("kingdoms", "royal_helmet"), ROYAL_HELMET);
      Registry.register(Registry.ITEM, new Identifier("kingdoms", "royal_chestplate"), ROYAL_CHESTPLATE);
      Registry.register(Registry.ITEM, new Identifier("kingdoms", "royal_leggings"), ROYAL_LEGGINGS);
      Registry.register(Registry.ITEM, new Identifier("kingdoms", "royal_boots"), ROYAL_BOOTS);

      // NOBLE ARMOR
      Registry.register(Registry.ITEM, new Identifier("kingdoms", "noble_helmet"), NOBLE_HELMET);
      Registry.register(Registry.ITEM, new Identifier("kingdoms", "noble_chestplate"), NOBLE_CHESTPLATE);
      Registry.register(Registry.ITEM, new Identifier("kingdoms", "noble_leggings"), NOBLE_LEGGINGS);
      Registry.register(Registry.ITEM, new Identifier("kingdoms", "noble_boots"), NOBLE_BOOTS);

      // KNIGHT ARMOR
      Registry.register(Registry.ITEM, new Identifier("kingdoms", "knight_helmet"), KNIGHT_HELMET);
      Registry.register(Registry.ITEM, new Identifier("kingdoms", "knight_chestplate"), KNIGHT_CHESTPLATE);
      Registry.register(Registry.ITEM, new Identifier("kingdoms", "knight_leggings"), KNIGHT_LEGGINGS);
      Registry.register(Registry.ITEM, new Identifier("kingdoms", "knight_boots"), KNIGHT_BOOTS);

   }
}
