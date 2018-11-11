package com.afernandezh.pocs.designpatterns.observer.obs;

/**
 * Interface with all common methods of an observed entity
 */
public interface Observable {

    /**
     * Register an observer
     * @param obs
     */
    void register(Observer obs);

    /**
     * Unregister an observer
     * @param obs
     */
    void unregister(Observer obs);
}
