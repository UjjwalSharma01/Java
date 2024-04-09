import java.util.Scanner;

public class arithmetic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        System.out.println("The sum of two numbers is " + (num1 + num2));

        scanner.close();

        // Count the number of words and characters in a string
        String s = "Ujjwal Sharma";
        int len = s.length();
        int count = 0;
        String[] words = s.split("\\s"); // Array of words
        for (int i = 0; i < words.length; i++) {
            count = count + words[i].length();
        }
        System.out.println("Number of words in string: " + words.length);
        System.out.println("Number of characters in string: " + count);

        // Creating instances of Student to demonstrate static variable behavior
    }
}
