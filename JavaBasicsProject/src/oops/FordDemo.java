package oops;

public class FordDemo {

	public static void main(String[] args) {
		FordFigo ff1 = new FordFigo("FIGO", "Silver");
		ff1.switchOn();
		ff1.accelerate();
		ff1.applyBrake();
		ff1.switchOff();

		System.out.println("-----------------");
		FordFigo ff2 = new FordFigo("FIGO", "White");
		ff2.switchOn();
		ff2.accelerate();
		ff2.applyBrake();
		ff2.switchOff();
		
		System.out.println("-----------------");
		FordFigoTitanium fft1 = new FordFigoTitanium("FIGOTITANIUM", "Red", 4);
		fft1.switchOn();
		fft1.accelerate();
		fft1.applyBrake();
		fft1.useHandrest();
		fft1.switchOff();
	}

}