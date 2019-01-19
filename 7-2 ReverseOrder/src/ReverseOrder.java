import java.util.Scanner;

public class ReverseOrder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double[] numbers = new double[10];
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print("Enter a number " + (i + 1) + ": ");
			numbers[i] = scan.nextDouble();
		}

		System.out.print("The numbers in reverse order are ");
		
		for(int i = numbers.length - 1; i >= 0; i--) {
			System.out.print(numbers[i] + "   ");
		}
	}

}
