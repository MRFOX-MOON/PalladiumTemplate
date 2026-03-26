package net.examplemod.power.condition;

import net.threetag.palladium.condition.ConditionSerializer;
import net.threetag.palladiumcore.registry.DeferredRegister;
import net.threetag.palladiumcore.registry.RegistrySupplier;

public class ConditionSerializers {
    public static final DeferredRegister<ConditionSerializer> CONDITION_SERIALIZERS;
    public static final RegistrySupplier<ConditionSerializer> VERY_TRUE;
    static {
        CONDITION_SERIALIZERS = DeferredRegister.create("examplemod", ConditionSerializer.REGISTRY);
        VERY_TRUE = CONDITION_SERIALIZERS.register("very_true", VeryTrue.Serializer::new);
    }
}
