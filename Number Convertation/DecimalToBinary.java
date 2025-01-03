import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a decimal number
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();
        
        // Convert the decimal number to binary
        String binaryString = Integer.toBinaryString(decimalNumber);
        
        // Display the binary representation
        System.out.println("Binary representation: " + binaryString);
        
        // Close the scanner
        scanner.close();
    }
}
