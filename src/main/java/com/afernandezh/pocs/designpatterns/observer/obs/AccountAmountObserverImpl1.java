package com.afernandezh.pocs.designpatterns.observer.obs;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AccountAmountObserverImpl1 implements AccountAmountObserver {


    @Override
    public void notify(String origin, Object value) {
        log.info("Value from " + origin + " has changed to " + value.toString());
    }
}
