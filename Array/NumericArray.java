import java.util.Scanner;

public class NumericArray 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i=0;i<size;i++)
        {
            System.out.println("Enter Value For Index:"+i);
            arr[i] = sc.nextInt();
        }

        for(int m=0;m<size;m++)
        {
            System.out.println("Array :"+arr[m]);
        }    
    }
}