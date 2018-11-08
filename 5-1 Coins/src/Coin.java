
public class Coin {
	private final int HEADS = 0;
	private final int TAILS = 1;
	private int face;
	
	//gives a random value
	public Coin() {
		flip();
	}
	
	//flips coin by choosing a random number
	public void flip() {
		face = (int)(Math.random() * 2);
	}
	
	//returns if value is heads
	public boolean isHeads() {
		return(face == HEADS);
	}
	//returns the face
	public String toString() {
		String faceName;
		
		if(face == HEADS) {
			faceName = "Heads";
		}else {
			faceName = "Tails";
		}
		return faceName;
	}
}
