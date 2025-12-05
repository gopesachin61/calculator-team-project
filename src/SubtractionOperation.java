import java.util.Scanner; // Import the Scanner class to read user input

public class SubtractionOperation {

    public static void main(String[] args) {

        // --- Basic Subtraction Example ---
        System.out.println("--- Basic Subtraction Example ---");
        int num1 = 10;
        int num2 = 5;
        int difference = num1 - num2;
        System.out.println("The difference between " + num1 + " and " + num2 + " is: " + difference);

        // --- Subtraction with User Input Example ---
        System.out.println("\n--- Subtraction with User Input Example ---");
        Scanner input = new Scanner(System.in); // Create a Scanner object

        System.out.print("Enter the first number: ");
        double firstNumber = input.nextDouble(); // Read the first number (can be decimal)

        System.out.print("Enter the second number: ");
        double secondNumber = input.nextDouble(); // Read the second number (can be decimal)

        double result = firstNumber - secondNumber; // Perform subtraction

        System.out.println("The result of subtracting " + secondNumber + " from " + firstNumber + " is: " + result);

        input.close(); // Close the scanner to release resources
    }
}