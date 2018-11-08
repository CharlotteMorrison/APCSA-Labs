import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//instantiate new variables
		Scanner scan = new Scanner(System.in);
		final int NUM_GAMES = 12;
		int won;
		double ratio;
		
		System.out.println("Enter the number of games won (0 to " + NUM_GAMES + "): ");
		
		won = scan.nextInt();
		
		while(won < 0 || won > NUM_GAMES) {
			System.out.print("Invalid input. Please reenter: ");
			won = scan.nextInt();
		}
		
		ratio = (double)won / NUM_GAMES;
		
		NumberFormat fmt = NumberFormat.getPercentInstance();
		System.out.println();
		System.out.println("Wining Percentage: " + fmt.format(ratio));
		
		scan.close();
		
	}

}
