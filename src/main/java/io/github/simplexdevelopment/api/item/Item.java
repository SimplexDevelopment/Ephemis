package io.github.simplexdevelopment.api.item;

import io.github.simplexdevelopment.api.asset.Asset;
import io.github.simplexdevelopment.util.ItemProperties;

public interface Item extends Asset {
    int getWeight();

    void setWeight(int weight) throws NumberFormatException;

    ItemProperties getItemProperties();
}
