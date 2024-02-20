//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Create 4 objects of type Car
        Car car1 = new Car();
        Car car2 = new Car("Ford", "Mustang", "2021");
        Car car3 = new Car(car1); // Copy Constructor
        Car car4 = new Car(car2); // Copy Constructor

        // Replicate the shallow copy issue
        Car car6 = car1; // Shallow copy

        // Modify car1 to demonstrate shallow copy issue
        car1.make = "Honda";

        // Print information for all cars
        car1.printMe();
        car2.printMe();
        car3.printMe();
        car4.printMe();
        car6.printMe();
    }
}