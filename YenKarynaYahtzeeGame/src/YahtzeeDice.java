import java.awt.Color;

public class YahtzeeDice {
	// the method is in the tester
	//how to use the two string method
	private Die[] dice = new Die[5];
	private String [] holdDice = new String[] {"n","n","n","n","n"};
	private int numSides;
	private String input;

	public YahtzeeDice() {
		for(int i = 0; i < 5; i++) {
			dice[i] = new Die(); // 6,i+1  gives the initial values instead of random
		}


	}
	public YahtzeeDice(int numSides) {
		for(int i = 0; i < dice.length; i++) {
			dice[i] = new Die(numSides,i+1);
		}
	}

	public void hold() {
		for(int j = 0; j<5; j++) {
			do {
				System.out.print("Hold die " + (j+1) + "? ");
				input = TextIO.getlnString();
				input.toLowerCase();
			}while(!input.equals("y")&& !input.equals("n"));
			holdDice[j] = input;
		}
	}

	public void roll() {
		for(int i = 0; i <dice.length;i++) {
			if(holdDice[i].equals("n")) {
				dice[i].roll();//getCurrentValue();
			}	
			holdDice[i] = "n"; //resets the hold locks
		}
	}

	public Die[]getDiceValues(){
		return dice;
	}
	public int getDieValue(int i){
		return dice[i].getCurrentValue();
	}

	public String toString() {
		String yahtzee = "The " + 5 + " dice read: ";

		for(int i = 0; i < dice.length; i++) {
			if(i < dice.length - 1)	
				yahtzee += dice[i].getCurrentValue() + ", ";
			else
				yahtzee += dice[i].getCurrentValue() + ".";
		}
		return yahtzee;

	}

}
