package io.github.simplexdevelopment.api.asset;

import com.bulletphysics.dynamics.vehicle.VehicleRaycaster;
import com.bulletphysics.dynamics.vehicle.VehicleRaycasterResult;
import com.bulletphysics.dynamics.vehicle.VehicleTuning;
import com.jme3.bullet.control.VehicleControl;
import com.jme3.bullet.objects.VehicleWheel;
import com.jme3.bullet.objects.infos.VehicleController;
import io.github.simplexdevelopment.api.Animatable;

public interface Vehicle extends Asset, Animatable {
    VehicleControl getVehicleControl();

    VehicleController getVehicleController();

    VehicleWheel getWheel();

    VehicleTuning getVehicleTuning();

    VehicleRaycaster getVehicleRaycaster();

    VehicleRaycasterResult getVehicleRaycasterResult();
}
