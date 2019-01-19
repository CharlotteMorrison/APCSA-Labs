
abstract public class StaffMember implements Comparable{
	protected String name;
	protected String address;
	protected String phone;
	
	public StaffMember (String eName, String eAddress, String ePhone) {
		name = eName;
		address = eAddress;
		phone = ePhone;
	}
	
	public String toString() {
		String result = "Name: " + name + "\n";
		
		result += "Address: " + address + "\n";
		result += "Phone: " + phone;
		
		return result;
	}
	
	public int compareTo(Object obj) {
		String n1 = ((StaffMember) obj).name;
		return name.compareTo(n1);
	}
	
	public abstract double pay();
	
}
