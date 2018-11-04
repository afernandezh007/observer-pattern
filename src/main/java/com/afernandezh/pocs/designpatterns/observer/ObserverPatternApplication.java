package com.afernandezh.pocs.designpatterns.observer;

import com.afernandezh.pocs.designpatterns.observer.model.Account;
import com.afernandezh.pocs.designpatterns.observer.obs.AccountAmountObserver;
import com.afernandezh.pocs.designpatterns.observer.obs.AccountAmountObserverImpl1;
import com.afernandezh.pocs.designpatterns.observer.obs.AccountAmountObserverImpl2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class ObserverPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObserverPatternApplication.class, args);

		AccountAmountObserver obs1 = new AccountAmountObserverImpl1();
		AccountAmountObserver obs2 = new AccountAmountObserverImpl2();

		Account a = new Account();
		a.register(obs1);
		a.register(obs2);

		a.setAmount(BigDecimal.ZERO);
		a.notifyAllObservers();

		a.unregister(obs1);

		a.setAmount(BigDecimal.ONE);
		a.notifyAllObservers();

	}
}
