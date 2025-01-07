import java.util.Scanner;

public class FahrenheitToCelsius
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n Enter Value Of Fahrenheit::");
        double fahrenheit = sc.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.printf("\n The Corresponding Temperature In Celsius Is:: %.2f°C", celsius);

    }
}