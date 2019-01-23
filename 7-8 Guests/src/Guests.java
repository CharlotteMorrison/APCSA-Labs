import java.util.Scanner;

public class Guests {
	public static void main(String[] args) {
		String[] guests = {"Elma", "Blake", "Joseph", "Christian",
				"Gabe", "Breanna", "Zavier","Anaya", "Harris"};
		String name;
		boolean found = false;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a name: ");
		name = scan.nextLine();
		
		for(String guest : guests) {
			if (name.equals(guest)) {
				found = true;
			}
		}		
		if (found) {
			System.out.println(name + " is on the guest list.");
		}else {
			System.out.println(name + " is not on the guest list.");
		}
		scan.close();
	}
}
