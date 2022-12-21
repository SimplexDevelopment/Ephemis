package io.github.simplexdevelopment.api;

public interface Focusable {
    void setFocus(String componentName);

    void clearFocus();

    boolean isFocusable();

    void setFocusable(boolean focusable);

    boolean isFocused();

    String getFocusedComponent();

    void setFocusedComponent(String componentName);
}
