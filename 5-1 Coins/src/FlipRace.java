
public class FlipRace {

	public static void main(String[] args) {
		final int GOAL = 3;
		int count1 = 0;
		int count2 = 0;
		
		Coin coin1 = new Coin();
		Coin coin2 = new Coin();
		
		while (count1 < GOAL && count2 < GOAL) {
			coin1.flip();
			coin2.flip();
			
			System.out.println("Coin 1: " + coin1);
			System.out.println("Coin 2: " + coin2);
			
			//ternary operator: (condition) ? if true : if false
			
			count1 = (coin1.isHeads()) ? count1 + 1 : 0;
			count2 = (coin2.isHeads()) ? count2 + 1 : 0;
		}
		
		if (count1 < GOAL) {
			System.out.println("Coin 2 wins!");
		}else {
			if(count2 < GOAL) {
				System.out.println("Coin 1 wins!");
			}else {
				System.out.println("It is a Tie!");
			}
		}

	}

}
