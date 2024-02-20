package oops;

public class Snake extends Animal{

	Snake(String name){
		super(name);
	}
	
	void poisonous() {
		System.out.println(name + " is poisonous");
	}
	
	@Override
	void mobility() {
		System.out.println(name + " crawls");
	}
}
