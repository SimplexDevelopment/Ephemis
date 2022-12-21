package io.github.simplexdevelopment.api;

public interface Serializable<T> {
    String serialize(T object);

    T deserialize(String data);
}
