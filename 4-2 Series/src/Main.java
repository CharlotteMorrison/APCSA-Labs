
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		double sum = 0;
		
		while(i < 100) {
			sum = sum + i;
			
			System.out.print("i = " + i);
			System.out.print(", i^2 = " + (i*i));
			System.out.println(", sum = " + sum);
			
			i++;
		}

	}

}
