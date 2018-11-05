package com.afernandezh.pocs.designpatterns.observer.obs;

import lombok.extern.slf4j.Slf4j;

/**
 * Concrete class to implement a Custom Observer overriding the common behaviour defined in the abstract
 */
@Slf4j
public class ObserverImpl2 extends ObserverImpl {

    @Override
    public void notify(String origin, String field, Object value) {
        super.notify(origin, field, value);

        String[] chunks = origin.split("\\.");
        String entity = chunks[chunks.length - 1];

        log.info("Generating report about the field '" + field + "' change value to '" + value + "' in the entity " + entity + "...");
    }
}
