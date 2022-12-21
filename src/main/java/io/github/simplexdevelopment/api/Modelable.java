package io.github.simplexdevelopment.api;

import com.jme3.asset.ModelKey;
import com.jme3.math.Spline;

import java.util.Collection;

public interface Modelable {
    ModelKey getModelKey();

    Spline getSplineAtIndex(int index);

    Collection<Spline> getSplines();

    Spline.SplineType getSplineType();
}
