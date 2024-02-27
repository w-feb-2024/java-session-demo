// Question 1
// Consider the following definition of the class Sample:
// public class Sample 
// {
//     private int x;
//     private double y;

//     public Sample() 
//     {
//     }

//     public Sample(int a, double b)
//     {
//     }

//     public void setSample()
//     {
//     }

//     public void print()
//     {
//     }
// }
// a. How many constructors does class Sample have?
// b. Write the definition of the member setSample so that x is set to 10 and y is set to 25.8.
// c. Write the definition of the member print that prints the contents of x and y.
// d. Write the definition of the default constructor of the class Sample so that the instance variables are initialized to 0.
// e. Write the definition of the constructor with parameters of the class Sample so that the instance variable x is initialized to the value of a and the instance variable y is initialized to the value of b. 
// f. Write a Java statement that creates the Sample object s and initializes the instance variables of s to 20 and 35.0, respectively.
// g. Write a Java statement that prints the values of the instance variables of s.
 
public class que1 {
    private int x;
    private double y;

    // a. Class Sample has two constructors: default constructor and parameterized constructor.

    // b. Definition of the member setSample to set x to 10 and y to 25.8
    public void setSample() {
        x = 10;
        y = 25.8;
    }

    // c. Definition of the member print that prints the contents of x and y
    public void print() {
        System.out.println("x: " + x + ", y: " + y);
    }

    // d. Definition of the default constructor to initialize instance variables to 0
    public que1() {
        x = 0;
        y = 0.0;
    }

    // e. Definition of the constructor with parameters to initialize x to a and y to b
    public que1(int a, double b) {
        x = a;
        y = b;
    }

    // f. Java statement to create Sample object s and initialize instance variables
    // to 20 and 35.0, respectively
    // Sample s = new Sample(20, 35.0);

    // g. Java statement to print values of instance variables of s
    // s.print();
}
