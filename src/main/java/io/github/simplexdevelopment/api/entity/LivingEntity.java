package io.github.simplexdevelopment.api.entity;

import io.github.simplexdevelopment.api.asset.Vehicle;
import io.github.simplexdevelopment.api.effects.Status;
import org.jetbrains.annotations.Nullable;

public interface LivingEntity extends Entity {
    double getHealth();

    void setHealth(double health);

    void damage(double damage);

    void heal(double heal);

    @Nullable Status[] getStatusEffects();

    @Nullable Vehicle getCurrentVehicle();
}
