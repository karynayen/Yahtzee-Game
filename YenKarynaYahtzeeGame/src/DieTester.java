
public class DieTester {
	
	public static void main(String[] args) {
		System.out.println("*** Test Die class ***");	
		Die die1 = new Die(); // Create default 6-sided Die object
		Die die2 = new Die(17); // Create 17-sided Die object
		Die die3 = new Die(8, 3); // Create 8-sided Die object, set value to 3.
		// Test objects were created properly
		System.out.println("Testing .toString() for Die objects");
		System.out.println(die1); 
		System.out.println(die2);
		System.out.println(die3);
		System.out.println();
		
		System.out.println("*** Test PairOfDice class ***");	
		PairOfDice pair1 = new PairOfDice(); // Create default pair of 6-sided Die objects
		PairOfDice pair2 = new PairOfDice(12); // Create pair of 12-sided Die objects
		System.out.println("Testing .toString() for PairOfDice objects");
		System.out.println( pair1);
		System.out.println(pair2);
		System.out.println();
		
		System.out.println("*** Test YahtzeeDice class ***");
		YahtzeeDice sixSidedQuintetOfDice = new YahtzeeDice();
		YahtzeeDice fourSidedQuintetOfDice = new YahtzeeDice(4);
		
		//System.out.println("Test rolling of default yahtzee dice: " + sixSidedQuintetOfDice.roll());
		//why do the values repeat? can you control what the two string outputs?
		System.out.println("Test .toString() of default yahtzee dice: " + sixSidedQuintetOfDice);
		System.out.print("Test getDiceValues() of default yahtzee dice: ");
		System.out.println(java.util.Arrays.toString(sixSidedQuintetOfDice.getDiceValues()));

		System.out.println();
		
		//System.out.println("Test rolling of 4-sided yahtzee dice: " + fourSidedQuintetOfDice.roll());
		System.out.println("Test .toString() of 4-sided yahtzee dice: " + fourSidedQuintetOfDice);
		System.out.print("Test getDiceValues() of 4-sided yahtzee dice: ");
		System.out.println(java.util.Arrays.toString(fourSidedQuintetOfDice.getDiceValues()));
	}

}
