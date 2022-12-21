package io.github.simplexdevelopment.api.entity;

import io.github.simplexdevelopment.api.Displayable;
import io.github.simplexdevelopment.api.asset.BasicGUI;
import io.github.simplexdevelopment.api.asset.Vehicle;
import io.github.simplexdevelopment.api.inventory.PlayerInventory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface Player extends LivingEntity {
    @NotNull Displayable getDisplayable();

    @NotNull BasicGUI getGUI();

    @NotNull PlayerInventory getInventory();
}
