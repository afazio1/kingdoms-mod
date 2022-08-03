package com.ratlabs.kingdoms;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;


public class KingdomsMod implements ModInitializer {
    public static final String MOD_ID = "kingdoms";
    private static boolean worldGeneratedClient = false;
    private static boolean worldGeneratedServer = false;

    @Override
    public void onInitialize() {
        RegisterItems.register();
        ClientTickEvents.START_WORLD_TICK.register(world -> {
            AbstractClientPlayerEntity player = world.getPlayers().get(0);
            if (!worldGeneratedClient && world.getTime() < 100) {
                player.sendMessage(Text.literal("Welcome to Kingdoms Mod"));
                worldGeneratedClient = true;
            }

        });
//        ServerTickEvents.START_WORLD_TICK.register(world -> {
//
//            if (!worldGeneratedServer && world.getTime() < 500) {
//                worldGeneratedServer = true;
//            }
//        });
//        ServerPlayConnectionEvents.JOIN.register(((handler, sender, server) -> {
//            ServerPlayerEntity player = server.getCommandSource().getPlayer();
//            if (!worldGeneratedServer && player.getWorld().getTime() < 200) {
//                CommandManager commandManager = player.getServer().getCommandManager();
//                commandManager.executeWithPrefix(player.getCommandSource(), "/give @p written_book{pages:['{\"text\":\"Minecraft Tools book\"}'],title:\"Kingdoms Mod\",author:Alexa,generation:3,display:{Lore:[\"Hello this is the kingdoms mod. lore lol\"]}}");
//                worldGeneratedServer = true;
//            }
//        }));


    }
}
