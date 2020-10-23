
public class PairOfDice {
	// --- Instance variables -- 
	// What each PairOfDice "has" as attributes
	Die[] dice = new Die[2]; 
	
	// --- Constructors ---
	public PairOfDice() {
		for (int i = 0; i < dice.length; i++) {
			dice[i] = new Die();
		}
	}
	
	// overloaded constructor to allow diff # of sides
	public PairOfDice(int numSides) {
		for (int i = 0; i < dice.length; i++) {
			dice[i] = new Die(numSides);
		}
	}
	
	
	// --- Instance methods ---
	// What each PairOfDice "does"
	
	// What does it mean to roll pair of dice?
	// Don't reinvent the wheel! 
	public int roll() {  
		return dice[0].roll() + dice[1].roll();
	}
	
	// return the array of Die objects
	public Die[] getDice() {
		return dice;
	}
	
	// If the format above isn't helpful
	// this method will return the int values of each Die object
	public int[] getDiceValues() {
		return new int[] {dice[0].getCurrentValue(), 
			dice[1].getCurrentValue() };
	}
	
	// String representation of Pair of Dice
	// Again, don't reinvent wheel
	public String toString() {
		return dice[0].toString() + " " + dice[1].toString();
	} 


}
