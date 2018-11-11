package com.afernandezh.pocs.designpatterns.observer.model;

import com.afernandezh.pocs.designpatterns.observer.obs.ObservableImpl;
import lombok.Getter;

@Getter
public class Bank extends ObservableImpl {

    private String entityCode;

    public void setEntityCode(String entityCode) {
        this.entityCode = entityCode;
        notifyAllObservers("entityCode", this.entityCode);
    }

}
