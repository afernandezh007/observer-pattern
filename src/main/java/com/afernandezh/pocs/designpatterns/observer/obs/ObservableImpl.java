package com.afernandezh.pocs.designpatterns.observer.obs;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Abstract class to do a final implementation of the observable methods and offers them for the child classes
 */
@Data
public abstract class ObservableImpl implements Observable{

    private List<Observer> observers = new ArrayList<>();

    @Override
    public final void register(Observer obs) {
        getObservers().add(obs);
    }

    @Override
    public final void unregister(Observer obs) {
        getObservers().remove(obs);
    }

    /**
     * Method to iterate over all the registered observers and notify them the change
     * @param field
     * @param observedField
     */
    @Override
    public final void notifyAllObservers(String field, Object observedField) {
        getObservers().forEach(observer -> observer.notify(this.getClass().getCanonicalName(),field, observedField));
    }
}
