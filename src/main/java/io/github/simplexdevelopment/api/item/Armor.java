package io.github.simplexdevelopment.api.item;

import io.github.simplexdevelopment.api.Animatable;
import io.github.simplexdevelopment.api.Modelable;

public interface Armor extends Item, Animatable, Modelable {
    int getDefense();

    void setDefense(int defense) throws NumberFormatException;
}
