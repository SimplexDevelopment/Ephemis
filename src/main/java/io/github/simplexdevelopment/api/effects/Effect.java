package io.github.simplexdevelopment.api.effects;

import io.github.simplexdevelopment.api.Animatable;
import io.github.simplexdevelopment.api.Clonable;

public interface Effect extends Animatable, Clonable {
    String getName();
}
