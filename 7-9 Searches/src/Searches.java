
public class Searches {

	public static int linearSearch (int[] numbers, int target) {
		for(int i = 0; i < numbers.length; i++) {
			if (target == numbers[i]) {
				return i;
			}
		}
		return -1;
	}
	
	public static int binarySearch(int[] numbers, int target) {
		int low = 0;
		int high = numbers.length - 1;
		int middle = (low + high) / 2;
		
		while(numbers[middle] != target && low <= high) {
			if(target < numbers[middle]) {
				high = middle - 1;
			}else {
				low = middle + 1;
			}
			middle = (low + high) / 2;
		}
		if (numbers[middle] == target) {
			return middle;
		}else {
			return - 1;
		}		
	}
}
