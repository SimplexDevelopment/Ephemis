package io.github.simplexdevelopment.api.item;

public interface Money extends Item {
    double getAmount();

    void setAmount(double amount);

    void incrementAmount(double amount);

    void decrementAmount(double amount);

    void multiplyAmount(double amount);
}
