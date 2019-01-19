
public class Dictionary extends Book{
	private int definitions = 52500;
	
	public void setDefinitions(int numDefinitions) {
		definitions = numDefinitions;
	}
	
	public int getDefinitions() {
		return definitions;
	}
	
	public double computeRatio() {
		return definitions/pages;
	}
}
