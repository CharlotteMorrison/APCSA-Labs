
public class Employee extends StaffMember{
	protected String socialSecurityNumber;
	protected double payRate;
	
	public Employee(String eName, String eAddress, String ePhone,
					String eSocialSecurity, double rate) {
		super(eName, eAddress, ePhone);
		socialSecurityNumber = eSocialSecurity;
		payRate = rate;
	}
	
	public String toString() {
		String result = super.toString();
		result += "\nSSN: " + socialSecurityNumber;
		return result;
	}
	public double pay() {
		return payRate;
	}
}
