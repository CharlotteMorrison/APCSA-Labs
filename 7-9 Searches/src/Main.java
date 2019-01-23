
public class Main {

	public static void main(String[] args) {
		int[] myArray = {1,3,5,7,9,11,33,44,55,77};
		
		int linear = Searches.linearSearch(myArray, 9);
		int binary = Searches.binarySearch(myArray, 9);
		
		System.out.println(linear);
		System.out.println(binary);

	}

}
