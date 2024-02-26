
// Pet Class
// Create a class to represent a Pet type in java, which should have the following fields:
// name. Instance variable of type String that holds the name of a pet.
// animal. Instance variable of type String that holds the type of animal that a pet is.
// age. Instance variable of type int holds the pet's age.
// The Pet class should also have the following methods:
// constructor for this class. The constructor should accept an argument for each of the fields.
// setName, The setName method stores a value in the name field.
// setAnimal. The setAnimal method stores a value in the animal field.
// setAge. The setAge method stores a value in the age field.
// getName. The getName method returns the value of the name field.
// getAnimal. The getAnimal method returns the value of the animal field.
// getAge. The getAge method returns the value of the age field.

public class Pet {
    private String name;
    private String animal;
    private int age;

    // Constructor
    public Pet(String name, String animal, int age) {
        this.name = name;
        this.animal = animal;
        this.age = age;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getAnimal() {
        return animal;
    }

    public int getAge() {
        return age;
    }
}
