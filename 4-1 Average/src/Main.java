import java.text.DecimalFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int value;
		int count = 0;
		int sum = 0;
		double average;
		
		System.out.print("Enter an integer (0 to quit): ");
		value = scan.nextInt();
		
		while(value != 0) {
			count++;
			sum += value;
			
			System.out.println("The sum so far is:" + sum);
			System.out.print("Enter an integer (0 to quit): ");
			value = scan.nextInt();			
		}
		System.out.println();
		
		if(count==0) {
			System.out.println("No values were entered!");
		}else{
			average = (double)sum / count;
			DecimalFormat fmt = new DecimalFormat("0.###");
			System.out.println("The average is " + fmt.format(average));
		}
		scan.close();
	}

}
