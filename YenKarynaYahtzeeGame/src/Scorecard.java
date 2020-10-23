
public class Scorecard {
	private Score [] scores = new Score[13];
	private String currentScorecard= "";
	private String potentialScorecard= "";
	private int total = 0;

	public Scorecard(YahtzeeDice dice) {

		scores[0] = new OnesScore(dice);
		scores[1] = new TwosScore(dice);
		scores[2] = new ThreesScore(dice);
		scores[3] = new FoursScore(dice);
		scores[4] = new FivesScore(dice);
		scores[5] = new SixesScore(dice);
		scores[6] = new ThreeOfAKindScore(dice);
		scores[7] = new FourOfAKindScore(dice);
		scores[8] = new FullHouseScore(dice);
		scores[9] = new SmallStraightScore(dice);
		scores[10] = new LargeStraightScore(dice);
		scores[11] = new ChanceScore(dice);
		scores[12] = new YahtzeeScore(dice);
	}

	public int getTotal() {
		return total;
	}

	public boolean validChoice(int choice) {
		for(int i = 0; i<13; i++) {
			if(choice == scores[i].getNameNum() && scores[i].getIsUsed()){
				System.out.println("Already chosen, pick again!");
				return false;
			}
		}
		return true;
	}

	public void choice(int choice) {
		for(int i = 0; i<13; i++) {
			if(choice == scores[i].getNameNum() && !scores[i].getIsUsed()){
				scores[i].setScore();
				scores[i].setIsUsed(true);
			}
		}
	}

	public String potentialScorecard () {
		potentialScorecard = "";
		potentialScorecard += String.format("%-10s","***Potential Score***");
		for(int i = 0; i<13; i++) {
			if(i%4==0) {
				potentialScorecard += String.format("\n");
			}
			if(scores[i].getIsUsed()) {
				if(i<12) {
					potentialScorecard +=String.format("%-30s", "");
					i++;
					if(i%4==0) {
						potentialScorecard += String.format("\n");
					}
				}
			}
			String name = scores[i].getName();
			int calculateScore = scores[i].calculateScore();
			potentialScorecard +=String.format("%-2s", (i+1));
			potentialScorecard +=String.format("%-3s", ": ");
			potentialScorecard +=String.format("%-25s", name + " (" + calculateScore + ")");
		}
		return potentialScorecard;
	}

	public String currentScorecard () {
		total = 0;
		currentScorecard = "";
		currentScorecard += String.format("%-10s","***Current Score***");
		for(int i = 0; i<13; i++) {
			String name = scores[i].getName();
			int score = scores[i].getScore();
			total += score;
			if(i%4==0) {
				currentScorecard += String.format("\n");
			}
			currentScorecard +=String.format("%-22s", name + " (" + score + ")");
		}
		currentScorecard +=String.format("\n");
		currentScorecard +=String.format("%-1s", "Total Score: " + total );
		return currentScorecard;
	}

}

