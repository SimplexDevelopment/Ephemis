package io.github.simplexdevelopment.api.asset;

import io.github.simplexdevelopment.api.Texturable;

public interface Asset extends Texturable {
    String getName();

    void setName(String name);

    String getDescription();

    void setDescription();
}
