public class inheritance{
  public static void main(String [] args){
    // inheritance in java
    /*
    by conventional methods java doesn't supports multiple inheritance

    Types
    single = > parent->child
    multil level => dada => papa => bachha
    heirarchical => one class is extented by many subclasses or child classes


syntax 
use the keyword extends

child extends parent{
class ka dhanda paani
}
  
    */



    /*
    
    Why java doesn't support multiple inheritance 

     agr ek dusre se 50 classes extends krli

     then agr koi function tumne call kia last created class se and vo sirf superparent main h toh vo backtrack hi krta rhega 

     also agr 2 parent ke pass same method h then it creates ambiguity
    */

    // overriridng and overloading

    // overloading main name same and signature alag hota h but overriding main dono cheez same hoti h and it's possible in inheritance only

    /*
    
    
    
    
    
    Method overriding => screenshot
    
    */

  }
}

/*

EXAMPLES
// Superclass: Vehicle
class Vehicle {
    private String brand;
    private int year;

    // Constructor
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Getter methods
    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    // Method to display vehicle information
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

// Subclass: Car
class Car extends Vehicle {
    private int numberOfDoors;

    // Constructor
    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year); // Call superclass constructor
        this.numberOfDoors = numberOfDoors;
    }

    // Method to display car information
    public void displayCarInfo() {
        displayInfo(); // Call superclass method
        System.out.println("Number of doors: " + numberOfDoors);
    }
}

// Subclass: Motorcycle
class Motorcycle extends Vehicle {
    private String type;

    // Constructor
    public Motorcycle(String brand, int year, String type) {
        super(brand, year); // Call superclass constructor
        this.type = type;
    }

    // Method to display motorcycle information
    public void displayMotorcycleInfo() {
        displayInfo(); // Call superclass method
        System.out.println("Type: " + type);
    }
}

// Main class
public class inheritanceexample {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2022, 4);
        myCar.displayCarInfo(); // Display car information
        System.out.println(); // Blank line for separation

        Motorcycle myMotorcycle = new Motorcycle("Harley-Davidson", 2021, "Cruiser");
        myMotorcycle.displayMotorcycleInfo(); // Display motorcycle information
    }
}




 */