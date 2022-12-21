package io.github.simplexdevelopment.api.item;

import io.github.simplexdevelopment.api.Animatable;
import io.github.simplexdevelopment.api.Modelable;
import io.github.simplexdevelopment.api.asset.Vehicle;
import io.github.simplexdevelopment.api.entity.LivingEntity;

public interface Weapon extends Item, Animatable, Modelable {
    int getDamage();

    void setDamage(int damage) throws NumberFormatException;

    void attack(LivingEntity target);

    void armorPierce(LivingEntity target);

    void armorPierce(Vehicle vehicle);
}
