import java.util.Scanner;
public class TemperatureConverter {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        // Temperature converter in Celcius or Fahrenheit

        double temperature;
        String unit;
        double newTemperature;

        System.out.print("Enter temperature value: ");
        temperature = scanner.nextDouble();

        System.out.print("Convert to Celcius or Fahrenheit (C or F): ");
        unit = scanner.next().toUpperCase();

        newTemperature = (unit.equals("C")) ? (temperature - 32) * 5 / 9 : (temperature * 5 / 9) + 32;
        System.out.print("New temperature: " + newTemperature + unit);
        scanner.close();
    }
}
