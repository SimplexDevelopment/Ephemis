package io.github.simplexdevelopment.api;

/**
 * @author SimplexDevelopment
 * <p>
 * This interface is used to mark a class as clonable.
 * It contains a single {@link #cloned()} method which will return a new instance of the object
 * with all the data from the old object. This is useful for creating copies of objects, where operating on the object directly
 * would produce unfavorable results.
 */
public interface Clonable {
    /**
     * @return A new instance of the object with all the data from the old object.
     */
    Clonable cloned();
}
