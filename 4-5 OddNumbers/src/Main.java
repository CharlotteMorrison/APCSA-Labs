
public class Main {

	public static void main(String[] args) {
		
		double pi = 0;
		int sign = 1;
		
		for(int i = 1; i < 5000; i +=2) {
			pi += sign * (4.0 /i);
			System.out.println("I " + i + " PI " + pi);
			sign = sign * -1;
		}
		
		
		//odd numbers
		//for(int i = 1; i <= 10; i += 2) {
		//	System.out.println(i);
		//}

	}

}
