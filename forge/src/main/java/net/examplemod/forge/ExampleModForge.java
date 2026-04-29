package net.examplemod.forge;

import net.examplemod.ExampleMod;
import net.examplemod.ExampleModClient;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.threetag.palladiumcore.forge.PalladiumCoreForge;
import net.threetag.palladiumcore.util.Platform;

@Mod(ExampleMod.MOD_ID)
public class ExampleModForge {
    public ExampleModForge() {
        // Submit our event bus to let PalladiumCore register our content on the right time
        PalladiumCoreForge.registerModEventBus(ExampleMod.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        ExampleMod.init();
        if (Platform.isClient()) {
            ExampleModClient.init();

        }
    }
}
