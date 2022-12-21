package io.github.simplexdevelopment.util;

public enum Statuses {
    BLEEDING(25.0),
    POISONED(10.0),
    BURNING(12.5),
    FROZEN(7.5),
    CHARMED(2.5),
    HEALING(5.0),
    BLIGHTED(2500.0);

    final double damageValue;

    Statuses(double damageValue) {
        this.damageValue = damageValue;
    }

    public static Statuses[] getValues() {
        return Statuses.values();
    }

    public double getDamageOverTime() {
        return damageValue;
    }
}
