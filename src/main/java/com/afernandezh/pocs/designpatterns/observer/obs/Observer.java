package com.afernandezh.pocs.designpatterns.observer.obs;

/**
 * Observer interface with all observers common methods
 */
public interface Observer {

    /**
     * Generic method to notify to the observer a change about a value in a class
     *
     * @param origin Canonical name of the origin class
     * @param field Field changed
     * @param value  the new observed property value
     */
    void notify(String origin, String field, Object value);
}
