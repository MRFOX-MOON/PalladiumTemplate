package net.examplemod.power.condition;

import com.google.gson.JsonObject;
import net.threetag.palladium.condition.Condition;
import net.threetag.palladium.condition.ConditionSerializer;
import net.threetag.palladium.condition.ConditionSerializers;
import net.threetag.palladium.util.context.DataContext;

public class VeryTrue extends Condition {

    @Override
    public boolean active(DataContext context) {
        return true;
    }

    @Override
    public ConditionSerializer getSerializer() {
        return ConditionSerializers.TRUE.get();
    }

    public static class Serializer extends ConditionSerializer {
        @Override
        public Condition make(JsonObject json) {
            return new VeryTrue();
        }

        @Override
        public String getDocumentationDescription() {
            return "It's just Very True. That's it. also I'm lazy :P";
        }
    }

}