package org.snacks.java;

public class ContoBancario {
    private int number;
    private double balance;
	
    private ContoBancario (int number) {
    	this.number = number;
    	this.balance = 0.0;
    	
    }
	
    private void setSchei (double schei) {
    	this.balance += schei;
    }
    
    private void leaveSchei (double schei) {
    	this.balance -= schei;
    }
    
    private double getSchei () {
    	return this.balance;
    }
    
    
	public static void main(String[] args) {
		
		ContoBancario conto = new ContoBancario(100);
			
		System.out.println(conto.getSchei());
		
		conto.setSchei(1001.1);
		
		conto.leaveSchei (100.2);
		
		System.out.println(conto.getSchei());
		

	}

}
