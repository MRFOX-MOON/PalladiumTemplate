package net.examplemod.client.hud;

import net.examplemod.ExampleMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.resources.ResourceLocation;
import net.threetag.palladium.power.SuperpowerUtil;
import net.threetag.palladiumcore.registry.client.OverlayRegistry;

public class testhud {
   public static void init() {
       OverlayRegistry.registerOverlay("test/test_overlay", (minecraft, gui, mStack, partialTicks, width, height) -> {
           LocalPlayer localPlayer = (Minecraft.getInstance().player);
           if (localPlayer == null) return;
           int screenXplacement = width - 50;
           int screenYplacement = height - 58;
           if (SuperpowerUtil.hasSuperpower(localPlayer, new ResourceLocation(ExampleMod.MOD_ID, "test_overlay")))
               mStack.blit(new ResourceLocation(ExampleMod.MOD_ID, "textures/gui/test_overlay.png"), screenXplacement, screenYplacement, 0.0F, 0.0F, 32, 32, 32, 32);
           }
       );
   }
}
