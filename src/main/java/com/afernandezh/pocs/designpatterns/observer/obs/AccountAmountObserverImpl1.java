package com.afernandezh.pocs.designpatterns.observer.obs;

import lombok.extern.slf4j.Slf4j;

/**
 * Concrete class to implement a Custom Observer overriding the common behaviour defined in the abstract
 */
@Slf4j
public class AccountAmountObserverImpl1 extends AccountAmountObserverImpl{

    @Override
    public void notify(String origin, Object value) {
        super.notify(origin, value);
        log.info("Sending notification by email to afernandezh@architectmind.es...");
    }
}
