package com.afernandezh.pocs.designpatterns.observer.model;

import com.afernandezh.pocs.designpatterns.observer.obs.AccountAmountObserver;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
public class Account {

    private BigDecimal amount;

    private List<AccountAmountObserver> observers;

    public void register(AccountAmountObserver obs) {

        if (observers == null) {
            observers = new ArrayList<>();
        }
        observers.add(obs);
    }

    public void unregister(AccountAmountObserver obs) {

        if (observers != null) {
            observers.remove(obs);
        }
    }

    public void notifyAllObservers() {
        observers.forEach(accountAmountObserver -> accountAmountObserver.notify(this.getClass().getCanonicalName(), amount));
    }
}
