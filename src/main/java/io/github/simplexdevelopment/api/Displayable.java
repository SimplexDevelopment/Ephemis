package io.github.simplexdevelopment.api;

import io.github.simplexdevelopment.util.Wrapper;

public interface Displayable extends Texturable, Focusable, Animatable {
    String getName();

    int getWidth();

    int getHeight();

    int getLength();

    boolean isVisible();

    void setVisible(boolean visible);

    void show();

    void hide();

    void toggle();

    void update();

    void render();

    void dispose();

    void close();

    void open();

    void toggleOpen();

    boolean isOpen();

    boolean isClosed();

    boolean isDisposed();

    boolean isRendered();

    boolean isUpdated();

    boolean isHidden();

    <T> Wrapper<T> getDisplayedContent();
}
