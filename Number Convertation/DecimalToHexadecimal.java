import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a decimal number
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        // Convert the decimal number to hexadecimal
        String hexadecimal = Integer.toHexString(decimal).toUpperCase();

        // Display the result
        System.out.println("The hexadecimal equivalent is: " + hexadecimal);

        // Close the scanner
        scanner.close();
    }
}
