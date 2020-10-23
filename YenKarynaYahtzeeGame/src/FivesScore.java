
public class FivesScore extends Score{

	private YahtzeeDice dice; 

	public FivesScore(YahtzeeDice dice) {
		setName("Fives");
		setNameNum(5);
		this.dice = dice;
	}	
	public int calculateScore() {
		int sum = 0;
		for(int i = 0; i<5; i++) {
			if(dice.getDieValue(i)==5){
				sum+=5;
			}
		}
		return sum;
	}
}
