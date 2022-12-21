package io.github.simplexdevelopment.api.inventory;

import io.github.simplexdevelopment.api.item.Item;

public interface Inventory {
    int getSize();

    void setSize(int size) throws NumberFormatException;

    void addItem(Item item);
}
