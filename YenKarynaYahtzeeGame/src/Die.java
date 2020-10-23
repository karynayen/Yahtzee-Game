public class Die {
	
	private int numSides;
	private int currentValue;
	
	public Die() {
		numSides = 6; // default 
		roll(); //currentValue is set already TEST!
	}
	
	public Die(int sides) {
		numSides = sides;  // can set the number of sides
		roll();
	}

	public Die(int sides, int initialValue) {
		numSides = sides; 
		currentValue = initialValue;
	}
	
	public int roll() {
		currentValue = (int)(Math.random() * numSides + 1);
		return currentValue;
	}
	
	public String toString() {
		return "Num of sides: " + numSides + ", Value: " + currentValue;
	}
	
	public int getCurrentValue() {
		return currentValue;
	}
}