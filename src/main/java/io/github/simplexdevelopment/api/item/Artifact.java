package io.github.simplexdevelopment.api.item;

public interface Artifact extends Item {
    int getWeight();

    void setWeight(int weight) throws NumberFormatException;


}
