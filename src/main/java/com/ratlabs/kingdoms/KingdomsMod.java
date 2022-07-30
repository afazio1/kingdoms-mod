package com.ratlabs.kingdoms;

import net.fabricmc.api.ModInitializer;

public class KingdomsMod implements ModInitializer {

    @Override
    public void onInitialize() {
        RegisterItems.register();
    }
}
