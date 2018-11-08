import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		System.out.println("Farenheit to Celcius Conversion\n");
	    System.out.print("Enter the temperature in Fahrenheit: ");
	    Scanner scanner = new Scanner(System.in);
	    float fahrenheit = scanner.nextFloat();
	    float celsius = (fahrenheit - 32) * 5 / 9;
	    System.out.println("Temperature in Celsius: " + celsius + "\n");
	    
	    System.out.println("Celcius to Farenheit Conversion\n");
	    System.out.print("Enter the temperature in Celsius: ");
	    celsius = scanner.nextFloat();
	    fahrenheit = (celsius * 9 / 5) + 32;
	    System.out.println("Temperature in Fahrenheit: " + fahrenheit);	    
	    scanner.close();
	}
}
