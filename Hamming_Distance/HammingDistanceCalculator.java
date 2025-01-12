import java.util.Scanner;

public class HammingDistanceCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the first string
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        // Taking input for the second string
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Check if the strings are of equal length
        if (str1.length() != str2.length()) {
            System.out.println("UnMatched: Strings must be of equal length to calculate Hamming distance.");
        } else {
            int hammingDistance = calculateHammingDistance(str1, str2);
            System.out.println("The Hamming distance between the two strings is: " + hammingDistance);
        }

        scanner.close();
    }

    /**
     * Function to calculate Hamming distance
     * @param str1 First string
     * @param str2 Second string
     * @return Hamming distance
     */
    public static int calculateHammingDistance(String str1, String str2) {
        int distance = 0;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                distance++;
            }
        }

        return distance;
    }
}
