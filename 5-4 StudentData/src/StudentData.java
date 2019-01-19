
public class StudentData {

	public static void main(String[] args) {
	     Address school = new Address ("800 Lancaster Ave.", "Villanova", "PA", 19085);

	     Address jHome = new Address ("21 Jump Street", "Lynchburg", "VA", 24551);
	     Address mHome = new Address ("123 Main Street", "Euclid", "OH", 44132);

		// Oops, I gave them the wrong homes. Better change that....
		
		jHome = mHome;
		mHome = jHome;
		
		Student john = new Student ("John", "Smith", jHome, school);
		Student marsha = new Student ("Marsha", "Jones", mHome, school);
		
		System.out.println (john);
		System.out.println ();
		System.out.println (marsha);

	}

}
