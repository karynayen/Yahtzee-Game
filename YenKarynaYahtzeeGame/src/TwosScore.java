
public class TwosScore extends Score{
	private YahtzeeDice dice; 

	public TwosScore(YahtzeeDice dice) {
		setName("Twos");
		setNameNum(2);
		this.dice = dice;
	}

	public int calculateScore() {
		int sum = 0;
		for(int i = 0; i<5; i++) {
			if(dice.getDieValue(i)==2){
				sum+=2;
			}
		}
		return sum;
	}
}
