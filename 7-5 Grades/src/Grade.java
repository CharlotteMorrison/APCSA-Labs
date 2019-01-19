
public class Grade {
	private String name;
	private int lowerBound;
	
	public Grade (String grade, int cutoff) {
		name = grade;
		lowerBound = cutoff;
	}
	public void setName(String grade) {
		name = grade;
	}
	public String getName() {
		return name;
	}
	public void setLowerBound(int cutoff) {
		lowerBound = cutoff;
	}
	public int getLowerBound(){
		return lowerBound;
	}
	public String toString() {
		return name + "\t" + lowerBound;
	}
}
