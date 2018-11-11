package com.afernandezh.pocs.designpatterns.observer;

import com.afernandezh.pocs.designpatterns.observer.model.Account;
import com.afernandezh.pocs.designpatterns.observer.model.Bank;
import com.afernandezh.pocs.designpatterns.observer.obs.Observer;
import com.afernandezh.pocs.designpatterns.observer.obs.ObserverImpl1;
import com.afernandezh.pocs.designpatterns.observer.obs.ObserverImpl2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class ObserverPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObserverPatternApplication.class, args);

		//1. Create observers
		Observer obs1 = new ObserverImpl1();
		Observer obs2 = new ObserverImpl2();

		//2. Create an entity and register the observers
		Account a = new Account();
		a.register(obs1);
		a.register(obs2);

		//3. Change the value (and notify automatically to all the observers registered about this change)
		a.setAmount(BigDecimal.ZERO);

		//4. Unregister an aobserver
		a.unregister(obs1);

		//5. Change the value (and notify automatically to the remaining registered observers about this change)
		a.setAmount(BigDecimal.ONE);

		//6. Create another entity and register one observer
		Bank b = new Bank();
		b.register(obs2);

		//7. Change the value twice to see in log that the observer is being notified
		b.setEntityCode("0049");
		b.setEntityCode("0050");

	}
}
