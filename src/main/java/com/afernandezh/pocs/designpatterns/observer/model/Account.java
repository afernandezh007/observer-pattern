package com.afernandezh.pocs.designpatterns.observer.model;

import com.afernandezh.pocs.designpatterns.observer.obs.AccountAmountObserver;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
public class Account {

    private BigDecimal amount;

    private List<AccountAmountObserver> observers;

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
        notifyAllObservers();
    }

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

    private void notifyAllObservers() {
        observers.forEach(accountAmountObserver -> accountAmountObserver.notify(this.getClass().getCanonicalName(), amount));
    }
}
