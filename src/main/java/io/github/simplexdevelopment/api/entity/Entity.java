package io.github.simplexdevelopment.api.entity;

import com.jme3.bounding.BoundingBox;
import io.github.simplexdevelopment.api.Animatable;
import io.github.simplexdevelopment.api.Clonable;
import io.github.simplexdevelopment.api.Modelable;
import io.github.simplexdevelopment.api.Texturable;
import io.github.simplexdevelopment.api.mappings.Location;

public interface Entity extends Clonable, Texturable, Modelable, Animatable {
    String getName();

    void setName(String name);

    BoundingBox getCollisionBox();

    Location getLocation();

    void setLocation(Location location);

    void setLocation(int x, int y, int z, float pitch, float yaw);

    void setCollisionBox(BoundingBox boundingBox);
}
