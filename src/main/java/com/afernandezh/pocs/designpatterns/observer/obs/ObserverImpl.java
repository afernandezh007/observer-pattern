package com.afernandezh.pocs.designpatterns.observer.obs;

import lombok.extern.slf4j.Slf4j;

/**
 * Abstract class to implement the Observer common behaviour
 */
@Slf4j
public abstract class ObserverImpl implements Observer {

    @Override
    public void notify(String origin, String field, Object value) {
        log.info("Field '" + field + "' from " + origin + " has changed to '" + value.toString() + "'");
    }
}
