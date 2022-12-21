package io.github.simplexdevelopment.api.asset;

import com.jme3.bounding.BoundingBox;

public interface Frame extends Asset {
    BoundingBox getBoundingBox();
}
