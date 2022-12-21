package io.github.simplexdevelopment.api.mappings;

import io.github.simplexdevelopment.api.Clonable;
import io.github.simplexdevelopment.api.Serializable;
import io.github.simplexdevelopment.util.Wrapper;

public interface Location extends Clonable, Serializable<Location> {
    double getX();

    void setX(double x);

    double getY();

    void setY(double y);

    double getZ();

    void setZ(double z);

    float getYaw();

    void setYaw(float yaw);

    float getPitch();

    void setPitch(float pitch);

    Wrapper<Location> getWrappedLocation();
}
