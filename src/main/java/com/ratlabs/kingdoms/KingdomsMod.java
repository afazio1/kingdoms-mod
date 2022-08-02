package com.ratlabs.kingdoms;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.text.Text;

import java.util.function.BooleanSupplier;

public class KingdomsMod implements ModInitializer {
    private static boolean worldGenerated = false;

    @Override
    public void onInitialize() {
        RegisterItems.register();
        ClientTickEvents.START_WORLD_TICK.register(world -> {

            if (!worldGenerated && world.getTime() < 100) {
                world.getPlayers().get(0).sendMessage(Text.literal("Welcome to the Kingdoms Mod!"));
                worldGenerated = true;
                // i dont think this does anything lol
//                world.tick(() -> false);
//                world.getPlayers().get(0).sendMessage(Text.literal(Long.toString(world.getTime())));
            }

        });


    }
}
