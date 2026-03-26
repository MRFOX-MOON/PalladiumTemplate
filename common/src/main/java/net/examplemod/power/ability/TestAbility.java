package net.examplemod.power.ability;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Items;
import net.threetag.palladium.power.IPowerHolder;
import net.threetag.palladium.power.ability.Ability;
import net.threetag.palladium.power.ability.AbilityInstance;
import net.threetag.palladium.util.icon.ItemIcon;
import net.threetag.palladium.util.property.*;

public class TestAbility extends Ability {
    public static final PalladiumProperty<Boolean> BOOLEAN = new BooleanProperty("boolean").configurable("BOOLEAN IS IT TRUE OR FALSE? :O");
    public static final PalladiumProperty<Float> FIRST_TICK = new FloatProperty("first_tick").configurable("I MUST TICK BUT ONLY ONCE :3");
    public static final PalladiumProperty<String> TICK = new StringProperty("tick").configurable("I MUST TICK");
    public static final PalladiumProperty<Integer> LAST_TICK = new IntegerProperty("first_tick").configurable("I TOO LAZY TO TICK I'LL DO IT LAST :P");

    public TestAbility() {
        this.withProperty(ICON, new ItemIcon(Items.SNOWBALL));
        this.withProperty(BOOLEAN, false);
        this.withProperty(FIRST_TICK, null);
        this.withProperty(TICK, null);
        this.withProperty(LAST_TICK, null);

    }
    @Override
    public void firstTick(LivingEntity entity, AbilityInstance entry, IPowerHolder holder, boolean enabled) {
        if (!entity.level().isClientSide && enabled) {
            if (entry.getProperty(BOOLEAN)) {
                entity.setInvisible(true);
                entity.sendSystemMessage(Component.literal("Your Now Invisible :o"));
            }
            entity.sendSystemMessage((Component) FIRST_TICK);
        }
    }
    @Override
    public void tick(LivingEntity entity, AbilityInstance entry, IPowerHolder holder, boolean enabled) {
        if (!entity.level().isClientSide && enabled) {
            entity.sendSystemMessage((Component) TICK);
        }
    }
    @Override
    public void lastTick(LivingEntity entity, AbilityInstance entry, IPowerHolder holder, boolean enabled) {
        if (entry.getProperty(BOOLEAN)) {
            entity.setInvisible(false);
            entity.sendSystemMessage(Component.literal("Your Now Visible :o"));
        }
        entity.sendSystemMessage((Component) LAST_TICK);
    }
        @Override
    public String getDocumentationDescription() {
        return "I just love Testing";
    }
}
