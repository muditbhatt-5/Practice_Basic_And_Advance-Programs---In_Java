import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AllArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Numeric Array
        System.out.print("Enter the size of the numeric array: ");
        int size = scanner.nextInt();
        int[] numericArray = new int[size];
        System.out.println("Enter elements for the numeric array:");
        for (int i = 0; i < size; i++) {
            numericArray[i] = scanner.nextInt();
        }

        // Associative Array (Simulated using a Map)
        System.out.print("Enter the number of key-value pairs for the associative array: ");
        int pairs = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        Map<String, String> associativeArray = new HashMap<>();
        System.out.println("Enter key-value pairs (format: key value):");
        for (int i = 0; i < pairs; i++) {
            String key = scanner.next();
            String value = scanner.next();
            associativeArray.put(key, value);
        }

        // Multidimensional Array
        System.out.print("Enter rows for the multidimensional array: ");
        int rows = scanner.nextInt();
        System.out.print("Enter columns for the multidimensional array: ");
        int cols = scanner.nextInt();
        int[][] multiArray = new int[rows][cols];
        System.out.println("Enter elements for the multidimensional array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                multiArray[i][j] = scanner.nextInt();
            }
        }

        // Print Numeric Array using for and foreach
        System.out.println("\nNumeric Array:");
        System.out.println("Using for loop:");
        for (int i = 0; i < numericArray.length; i++) {
            System.out.print(numericArray[i] + " ");
        }
        System.out.println("\nUsing foreach loop:");
        for (int num : numericArray) {
            System.out.print(num + " ");
        }

        // Print Associative Array using for and foreach
        System.out.println("\n\nAssociative Array:");
        System.out.println("Using for-each loop:");
        for (Map.Entry<String, String> entry : associativeArray.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Print Multidimensional Array using for and foreach
        System.out.println("\nMultidimensional Array:");
        System.out.println("Using for loop:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Using foreach loop:");
        for (int[] row : multiArray) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
