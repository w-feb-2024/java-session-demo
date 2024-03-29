package filehandling;

import java.io.Serializable;

public class Account implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private double balance;
	transient private int atmPin;
	
	public Account(String name, double balance, int atmPin) {
		super();
		this.name = name;
		this.balance = balance;
		this.atmPin = atmPin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAtmPin() {
		return atmPin;
	}

	public void setAtmPin(int atmPin) {
		this.atmPin = atmPin;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", balance=" + balance + ", atmPin=" + atmPin + "]";
	}
	
	
	
	
}
