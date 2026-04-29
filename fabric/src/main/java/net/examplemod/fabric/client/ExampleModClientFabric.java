package net.examplemod.fabric.client;

import net.examplemod.ExampleModClient;
import net.fabricmc.api.ClientModInitializer;

public class ExampleModClientFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ExampleModClient.init();
    }
}
