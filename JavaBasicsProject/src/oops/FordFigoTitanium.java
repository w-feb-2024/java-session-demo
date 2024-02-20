package oops;

public class FordFigoTitanium extends FordFigo{
	int airbag;
	
	public FordFigoTitanium(String model, String color, int airbag) {
		super(model, color);
//		this.model = model;
//		this.color = color;
//		this.seats = seats;
		this.airbag = airbag;
	}
	
	boolean useHandrest() {
		System.out.println(model + " use handrest");
		return true;
	}
	
	@Override
	boolean applyBrake() {
		//applyBrake();
		System.out.println(model + " applied ABS brakes.");
		super.applyBrake();
		return true;
	}
}
