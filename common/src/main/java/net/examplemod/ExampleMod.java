package net.examplemod;

import net.examplemod.condition.ConditionSerializers;

import static net.examplemod.power.ability.Abilities.ABILITIES;

public class ExampleMod {

    public static final String MOD_ID = "examplemod";

    public static void init() {
        ABILITIES.register();
        ConditionSerializers.CONDITION_SERIALIZERS.register();
    }
}
