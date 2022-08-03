package com.ratlabs.kingdoms;

import com.ratlabs.kingdoms.armor.KnightArmorMaterial;
import com.ratlabs.kingdoms.armor.NobleArmorMaterial;
import com.ratlabs.kingdoms.armor.RoyalArmorMaterial;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;


public class RegisterItems {
   // KINGDOMS ITEM GROUP
   private static final ItemGroup KINGDOMS_ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(KingdomsMod.MOD_ID, "kingdoms_mod"), () -> new ItemStack(Items.IRON_SWORD));

   // ROYAL ARMOR
   public static final ArmorMaterial ROYAL_ARMOR_MATERIAL = new RoyalArmorMaterial();
   public static final Item ROYAL_HELMET = new ArmorItem(ROYAL_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(KINGDOMS_ITEM_GROUP).maxCount(1).fireproof());
   public static final Item ROYAL_CHESTPLATE = new ArmorItem(ROYAL_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(KINGDOMS_ITEM_GROUP).maxCount(1));
   public static final Item ROYAL_LEGGINGS = new ArmorItem(ROYAL_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(KINGDOMS_ITEM_GROUP).maxCount(1));
   public static final Item ROYAL_BOOTS = new ArmorItem(ROYAL_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(KINGDOMS_ITEM_GROUP).maxCount(1));

   // NOBLE ARMOR

   public static final ArmorMaterial NOBLE_ARMOR_MATERIAL = new NobleArmorMaterial();
   public static final Item NOBLE_HELMET = new ArmorItem(NOBLE_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(KINGDOMS_ITEM_GROUP).maxCount(1));
   public static final Item NOBLE_CHESTPLATE = new ArmorItem(NOBLE_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(KINGDOMS_ITEM_GROUP).maxCount(1));
   public static final Item NOBLE_LEGGINGS = new ArmorItem(NOBLE_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(KINGDOMS_ITEM_GROUP).maxCount(1));
   public static final Item NOBLE_BOOTS = new ArmorItem(NOBLE_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(KINGDOMS_ITEM_GROUP).maxCount(1));

   // KNIGHT ARMOR
   public static final ArmorMaterial KNIGHT_ARMOR_MATERIAL = new KnightArmorMaterial();
   public static final Item KNIGHT_HELMET = new ArmorItem(KNIGHT_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(KINGDOMS_ITEM_GROUP).maxCount(1));
   public static final Item KNIGHT_CHESTPLATE = new ArmorItem(KNIGHT_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(KINGDOMS_ITEM_GROUP).maxCount(1));
   public static final Item KNIGHT_LEGGINGS = new ArmorItem(KNIGHT_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(KINGDOMS_ITEM_GROUP).maxCount(1));
   public static final Item KNIGHT_BOOTS = new ArmorItem(KNIGHT_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(KINGDOMS_ITEM_GROUP).maxCount(1));



   public static void register() {
      registerArmor();

   }
   private static void registerArmor() {
      // ROYAL ARMOR
      Registry.register(Registry.ITEM, new Identifier(KingdomsMod.MOD_ID, "royal_helmet"), ROYAL_HELMET);
      Registry.register(Registry.ITEM, new Identifier(KingdomsMod.MOD_ID, "royal_chestplate"), ROYAL_CHESTPLATE);
      Registry.register(Registry.ITEM, new Identifier(KingdomsMod.MOD_ID, "royal_leggings"), ROYAL_LEGGINGS);
      Registry.register(Registry.ITEM, new Identifier(KingdomsMod.MOD_ID, "royal_boots"), ROYAL_BOOTS);

      // NOBLE ARMOR
      Registry.register(Registry.ITEM, new Identifier(KingdomsMod.MOD_ID, "noble_helmet"), NOBLE_HELMET);
      Registry.register(Registry.ITEM, new Identifier(KingdomsMod.MOD_ID, "noble_chestplate"), NOBLE_CHESTPLATE);
      Registry.register(Registry.ITEM, new Identifier(KingdomsMod.MOD_ID, "noble_leggings"), NOBLE_LEGGINGS);
      Registry.register(Registry.ITEM, new Identifier(KingdomsMod.MOD_ID, "noble_boots"), NOBLE_BOOTS);

      // KNIGHT ARMOR
      Registry.register(Registry.ITEM, new Identifier(KingdomsMod.MOD_ID, "knight_helmet"), KNIGHT_HELMET);
      Registry.register(Registry.ITEM, new Identifier(KingdomsMod.MOD_ID, "knight_chestplate"), KNIGHT_CHESTPLATE);
      Registry.register(Registry.ITEM, new Identifier(KingdomsMod.MOD_ID, "knight_leggings"), KNIGHT_LEGGINGS);
      Registry.register(Registry.ITEM, new Identifier(KingdomsMod.MOD_ID, "knight_boots"), KNIGHT_BOOTS);
   }
}
