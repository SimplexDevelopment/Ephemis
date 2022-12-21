package io.github.simplexdevelopment.api.asset;

import com.simsilica.lemur.core.GuiComponent;

public interface BasicGUI {
    GuiComponent getComponent(String componentName);

    void setComponent(String componentName, GuiComponent component);

    void removeComponent(String componentName);

    void clearComponents();

    boolean isEnabled();

    void setEnabled(boolean enabled);
}
