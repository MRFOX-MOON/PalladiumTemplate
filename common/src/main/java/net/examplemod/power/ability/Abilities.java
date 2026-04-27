package net.examplemod.power.ability;

import net.examplemod.ExampleMod;
import net.threetag.palladium.power.ability.Ability;
import net.threetag.palladiumcore.registry.DeferredRegister;
import net.threetag.palladiumcore.registry.RegistrySupplier;

public class Abilities {
    public static final DeferredRegister<Ability> ABILITIES;
    public static final RegistrySupplier<Ability> TEST_ABILITY;

    static {
        ABILITIES = DeferredRegister.create(ExampleMod.MOD_ID, Ability.REGISTRY);
        TEST_ABILITY = ABILITIES.register("test_ability", TestAbility::new);
    }
}
