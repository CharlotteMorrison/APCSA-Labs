package UI;

public class Stats {
	private String stat;
	private int amount;
	
	//utilize .this to assign variables constructor
	public Stats(String stat, int amount) {
		this.stat = stat;
		this.amount = amount;
	}
	//simple getters and setters
	public void setStat(String stat) {
		this.stat = stat;
	}
		public String getStat() {
		return stat;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getAmount() {
		return amount;
	}
	
}
