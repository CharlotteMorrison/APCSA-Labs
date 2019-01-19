
public class RationalTester {

	public static void main(String[] args) {
		RationalNumber r1 = new RationalNumber(6, 8);
		RationalNumber r2 = new RationalNumber(1, 3);
		RationalNumber r3, r4, r5, r6, r7;
		
		System.out.println("The first rational number: " + r1);
		System.out.println("The second rational number: " + r2);
		
		if(r1.equals(r2)) {
			System.out.println("They are equal!");
		}else {
			System.out.println("They are NOT equal.");
		}
		r3 = r1.reciprocal();
		System.out.println("The reciporcal is: " + r3);
		
		r4 = r1.add(r2);
		r5 = r1.subtract(r2);
		r6 = r1.multiply(r2);
		r7 = r1.divide(r2);
		
		System.out.println("r1 + r2 = " + r4);
		System.out.println("r1 - r2 = " + r5);
		System.out.println("r1 * r2 = " + r6);
		System.out.println("r1 / r2 = " + r7);
	}

}
