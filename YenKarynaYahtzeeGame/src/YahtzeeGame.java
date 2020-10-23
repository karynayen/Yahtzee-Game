
public class YahtzeeGame {

	private YahtzeeDice dice= new YahtzeeDice();
	private Scorecard scorecard1= new Scorecard(dice);
	private int rounds = 0;
	private int input1 = 0;

	public void playRound(){
		System.out.println("*****STARTING GAME*****");
		rounds = 0;
		while (rounds<13) {
			System.out.println("***STARTING ROUND*** (" + (13-rounds) + " rounds left)");
			System.out.println("you have a max of 3 turns per round");
			
			String input = "";
			dice.roll(); // CHANGE THIS LATER!!
			for (int i = 0; i< 2; i++) { // there are three rolls
				System.out.println("Rolling...");
				System.out.println(dice);
				System.out.println("(" + (2-i) + ") rolls left in this round");
				do {
					System.out.print("Would you like to roll again? (y)es or (n)o: ");
					input = TextIO.getlnString();
					input = input.toLowerCase();
				} while (!input.equals("y") && !input.equals("n"));
				
				if(input.equals("y")) {
					dice.hold();
					dice.roll();
				}else {
					break;
				}
			}
			System.out.println(dice);
			System.out.println(scorecard1.currentScorecard());
			System.out.println(scorecard1.potentialScorecard());
			
			do {
			System.out.print("---- Make a choice: ");
			 input1 = TextIO.getlnInt();
			}while(!scorecard1.validChoice(input1));
			scorecard1.choice(input1);

			scorecard1.currentScorecard();
			System.out.println( scorecard1.currentScorecard());
			rounds++;
			System.out.println("");
		}
		System.out.println("");
		System.out.println("GAME OVER!!!");
		System.out.println("");
		System.out.println("*****Final Score: " + scorecard1.getTotal());
		
		
	}
	
}


