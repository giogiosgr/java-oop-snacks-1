package org.snacks.java;

public class ContoBancario {
    private int number;
    private double balance;
	
    private ContoBancario (int number) {
    	this.number = number;
    	this.balance = 0.0;
    }
	
    void deposit (double money) {
    	this.balance += money;
    }
    
    void withdraw (double money) {
    	this.balance -= money;
    }
    
    double getBalance () {
    	return this.balance;
    }
    
}
