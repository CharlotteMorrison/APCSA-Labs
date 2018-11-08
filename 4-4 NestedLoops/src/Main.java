
public class Main {

	public static void main(String[] args) {
		System.out.println("***Question 1***");
		
		for(int i = 1; i < 4; i++) {
			for(int j = 1; j < 4; j++) {
				System.out.println(i + " " + j);
			}
		}
		
		System.out.println("***Question 2***");
		
		for(int i = 1; i < 4; i++) {
			for(int j = 1; j < i; j++) {
				System.out.println(i + " " + j);
			}
		}	
		
		System.out.println("***Question 4***");
		int T = 0;
		for(int i = 1; i < 4; i++) {
			for(int j = 1; j < 2 * i; j += 2) {
				T += j * i;
				System.out.println("T= " + T);
			}
		}
	}

}
