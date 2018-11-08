
public class Main {

	public static void main(String[] args) {
		int test = 74;
		
		for(int i = 2; i < test; i++) {
			if(test % i == 0) {
				System.out.println("Is not prime");
				break;
			}
		}

	}

}
