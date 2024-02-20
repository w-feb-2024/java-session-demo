package oops;

public class AnimalDemo {

	public static void main(String[] args) {
//		Interface interVar = new ImplClass1();
//		interVar = new ImplClass2();
//		Animal animal2 = new Snake("SNAKY");
		
//		Animal animal = new Animal("animal");
//	
//		animal.breathes();
//		animal.mobility();

		System.out.println("_______________________");
		Dog dog = new Dog("DOG");
		dog.breathes();
		dog.mobility();
		dog.friendly();
		
		System.out.println("_______________________");
		Snake snake = new Snake("SNAKE");
		snake.breathes();
		snake.mobility();
		snake.poisonous();
		
		System.out.println("_______________________");
		//Animal animal1 = new Dog("DOGGY")
		
		Dog dog1 = new Dog("DOGGY");
		Animal animal1 = dog1; //upcasting - implicitly casted
		animal1.breathes();
		animal1.mobility();
		//animal1.friendly();
		
		animal1 = new Snake("SNAKY");
		//animal1.friendly();
		
		Exhibition exhibition = new Exhibition();
		exhibition.exhibitAnimals(dog);
		exhibition.exhibitAnimals(snake);
	}

}
