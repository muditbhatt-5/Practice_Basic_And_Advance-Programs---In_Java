public class RemoveValueFromArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int valueToRemove = 20;
        int newLength = arr.length - 1; // New array will have one less element
        int[] newArr = new int[newLength];

        int j = 0; // Index for newArr
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != valueToRemove) { 
                newArr[j] = arr[i]; // 0 = 10, 2 = 30
                j++;
            }
        }

        // Display the new array
        System.out.println("Array after removing " + valueToRemove + ":");
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
}
