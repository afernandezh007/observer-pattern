package com.afernandezh.pocs.designpatterns.observer.model;

import com.afernandezh.pocs.designpatterns.observer.obs.ObservableImpl;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class Account extends ObservableImpl {

    private BigDecimal amount;

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
        notifyAllObservers("amount", this.amount);
    }
}
