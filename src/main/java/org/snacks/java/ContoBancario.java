package org.snacks.java;

public class ContoBancario {
    private int number;
    private double balance;
	
    ContoBancario(int number) {
    	this.number = number;
    	this.balance = 0.0;
    }
	
    void deposit(double money) {
    	if (money > 0) {
    	  this.balance += money;
    	}
    }
    
    void withdraw(double money) {
    	if (money > 0) {
      	  this.balance -= money;
      	}
    }
    
    double getBalance() {
    	return Math.floor(this.balance * 100) / 100;
    }
    
    int getNumber() {
    	return this.number;
    }
}
