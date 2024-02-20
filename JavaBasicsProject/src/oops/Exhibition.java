package oops;

public class Exhibition {
	void exhibitAnimals(Animal animal) {
		animal.breathes();
		animal.mobility();
		if(animal instanceof Dog) {
			Dog dog = (Dog)animal; // down casting - explicitly
			dog.friendly();
		}else if (animal instanceof Snake) {
			Snake snake = (Snake)animal;
			snake.poisonous();
		}
	}
}
