package oops;

public class FordFigo {
	String model;
	String color;
	int seats;

	public FordFigo(String model, String color) {
		super();
		this.model = model;
		this.color = color;
		this.seats = 4;
	}

	boolean switchOn() {
		System.out.println(model + " switched on.");
		return true;
	}
	
	boolean accelerate() {
		System.out.println(model + " accelerated.");
		return true;
	}
	
	boolean applyBrake() {
		System.out.println(model + " applied manual brake.");
		return true;
	}
	
	boolean switchOff() {
		System.out.println(model + " switched off.");
		return true;
	}
	
}
