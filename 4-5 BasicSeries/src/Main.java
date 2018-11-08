
public class Main {

	public static void main(String[] args) {
		double accumulator = 0;
		int sign = 1;
		for(int i = 0; i <= 10; i++) {
			System.out.print(accumulator + " += " + (i * sign) + " = ");
			//accumulator += 1.0 / (Math.pow(2,i));
			sign = sign * -1;
			accumulator += i * sign;
			System.out.println(accumulator);
		}

	}

}
