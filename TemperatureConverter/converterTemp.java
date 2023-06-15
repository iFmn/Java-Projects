import java.util.Scanner;

public class converterTemp {
    public static void main(String[] args) {
        Scanner tempCelsius = new Scanner(System.in);

        System.out.print("Enter the temperature in degrees Celsius: ");
        double celsius = tempCelsius.nextDouble();

        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        double kelvin = celsiusToKelvin(celsius);
        System.out.println("Temperature in Kelvin: " + kelvin);
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
}
