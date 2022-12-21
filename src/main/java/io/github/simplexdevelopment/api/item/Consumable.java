package io.github.simplexdevelopment.api.item;

import io.github.simplexdevelopment.api.Animatable;
import io.github.simplexdevelopment.api.Modelable;

public interface Consumable extends Item, Animatable, Modelable {
    void consume();
}
