
public class FoursScore extends Score{
	private YahtzeeDice dice; 
	
	public FoursScore(YahtzeeDice dice) {
		setName("Fours");
		setNameNum(4);
		this.dice = dice;
	}
	
	public int calculateScore() {
		int sum = 0;
		for(int i = 0; i<5; i++) {
			if(dice.getDieValue(i)==4){
				sum+=4;
			}
		}
		return sum;
	}
}
