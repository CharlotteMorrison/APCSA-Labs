import java.text.NumberFormat;

public class CDCollection {
	//always private, unless you have a good reason.
	private CD[] collection;
	private int count;
	private double totalCost;
	
	public CDCollection() {
		//instantiate all the class variable
		//either assign a value or set equal to a parameter
		collection = new CD[100];
		count = 0;
		totalCost = 0;
	}
	public void addCD(String title, String artist, double cost, int tracks) {
		if(count == collection.length) {
			increaseSize();
		}
		
		collection[count] = new CD(title, artist, cost, tracks);
		count++;
		totalCost += cost;
	}
	
	private void increaseSize() {
		CD[] temp = new CD[collection.length +2];
		for(int cd = 0; cd < collection.length; cd++) {
			temp[cd] = collection[cd];
		}
		collection = temp;
	}
	public String toString() {
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		String report = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
		report += "My CD Collection\n";
		report += "Number of CDs: " + count + "\n";
		report += "Total Cost: " + fmt.format(totalCost) + "\n";
		report += "Average Cost: " + fmt.format(totalCost/count) + "\n";
		report += "\nCD List: \n\n";
		
		for(int i = 0; i < count; i++) {
			report += collection[i].toString() + "\n";
		}
		return report;
	}
	
}
