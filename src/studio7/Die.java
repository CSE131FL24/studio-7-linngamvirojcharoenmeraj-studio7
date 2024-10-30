package studio7;

public class Die {

	private int sides;
	private int rounds;
	
	
	public Die (int initSides, int initRounds) {
		sides = initSides;
		rounds = initRounds;
	}
	
	public int randomIntegers() {
		return (int)(Math.random()*sides) +1;
	}
	
	
	
	public static void main(String[] args) {
		Die die1 = new Die (6,3);
		
		//to incorporate the rounds, use for loop here
		for (int i = 1; i <= die1.rounds; i++) {
			System.out.println(die1.randomIntegers());
		}
		
		
	}

}
