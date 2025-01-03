import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a decimal number
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        // Convert decimal to octal
        String octalNumber = Integer.toOctalString(decimalNumber);

        // Display the result
        System.out.println("The octal equivalent of " + decimalNumber + " is: " + octalNumber);

        // Close the scanner
        scanner.close();
    }
}
