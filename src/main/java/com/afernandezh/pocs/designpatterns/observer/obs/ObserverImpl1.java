package com.afernandezh.pocs.designpatterns.observer.obs;

import lombok.extern.slf4j.Slf4j;

/**
 * Concrete class to implement a Custom Observer overriding the common behaviour defined in the abstract
 */
@Slf4j
public class ObserverImpl1 extends ObserverImpl {

    @Override
    public void notify(String origin, String field, Object value) {
        super.notify(origin, field, value);
        log.info("Sending notification by email to afernandezh@architectmind.es...");
    }
}
