
public class BasicArray {

	public static void main(String[] args) {

		final int LIMIT = 15;
		final int MULTIPLE = 10;
		
		// Initialize an array
		
		int[] list = new int[LIMIT];
		
		// Fill array with values
		for(int i = 0; i < LIMIT; i++) {
			list[i] = i * MULTIPLE;
		}

		list[5] = 999;
		
		for(int value : list) {
			System.out.print(value + "  ");
		}
	}

}
