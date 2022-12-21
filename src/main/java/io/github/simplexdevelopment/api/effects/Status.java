package io.github.simplexdevelopment.api.effects;

import io.github.simplexdevelopment.api.entity.LivingEntity;
import io.github.simplexdevelopment.util.Statuses;

public interface Status {
    Statuses getStatus();

    Statuses[] getAppliedStatusEffects(LivingEntity entity);

    void applyEffect(LivingEntity entity);
}
