// exception handling in java
// public class Main{
//   public static void main(String [] args){
//     int a  = 100;
//     int b = 0;
//     try{
//       int c = a/b;
//       System.out.println(c);
//     }
//     catch(Exception e){
//       System.out.println("exceptinn"+ e);
//     }
//   }
// }


// custom exception
// Custom exception of invalidAge
// Custom exception class

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ExceptionHandlingExample {
    // Method that throws a custom exception
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Invalid age: " + age);
        }
        System.out.println("Age is valid: " + age);
    }

    public static void main(String[] args) {
        try {
            // Code that may throw exceptions
            validateAge(-5); // This will throw InvalidAgeException

            // This line won't execute if an exception is thrown
            System.out.println("This line won't execute if an exception occurs.");
        } catch (InvalidAgeException e) {
            // Catch and handle the custom exception
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            // Code that always runs (e.g., cleanup code)
            System.out.println("Finally block executed.");
        }
    }
}
