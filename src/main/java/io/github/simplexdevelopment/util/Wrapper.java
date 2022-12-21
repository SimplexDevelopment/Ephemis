package io.github.simplexdevelopment.util;

import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Wrapper<T> {
    private final T object;

    Wrapper(T object) {
        this.object = object;
    }

    public T get() {
        return object;
    }

    public <V> V cast(@NotNull Class<V> clazz) {
        return clazz.cast(object);
    }

    public <V> boolean doesInherit(Class<V> clazz) {
        return object.getClass().isAssignableFrom(clazz);
    }

    public <V> boolean isChild(@NotNull Class<V> clazz) {
        return clazz.isAssignableFrom(object.getClass());
    }

    public void consume(@NotNull Consumer<T> consumer) {
        consumer.accept(object);
    }

    public <V> V transform(@NotNull Function<T, V> func) {
        return func.apply(object);
    }

    public boolean is(@NotNull Predicate<T> predicate) {
        return predicate.test(object);
    }

    public <V> Wrapper<V> wrap(@NotNull Function<T, V> func) {
        return new Wrapper<>(func.apply(object));
    }

    public Wrapper<T> wrap(T object) {
        return new Wrapper<>(object);
    }
}
