package com.afernandezh.pocs.designpatterns.observer.obs;

import lombok.extern.slf4j.Slf4j;

/**
 * Abstract class to implement the Observer common behaviour
 */
@Slf4j
public abstract class AccountAmountObserverImpl implements AccountAmountObserver{

    @Override
    public void notify(String origin, Object value) {
        log.info("Value from " + origin + " has changed to " + value.toString());
    }
}
