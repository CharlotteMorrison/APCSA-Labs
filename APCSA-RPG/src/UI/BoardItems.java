package UI;
//need to extend this class for items and enemies
public abstract class BoardItems {
	private String name;
	private int value;
	private int experience;
	
	public BoardItems(String name, int value, int experience) {
		this.name = name;
		this.value = value;
		this.experience = experience;
	}
	
	public abstract void something();
}
