
public class ThreesScore extends Score{

	private YahtzeeDice dice; 

	public ThreesScore(YahtzeeDice dice) {
		setName("Threes");
		setNameNum(3);
		this.dice = dice;
	}

	public int calculateScore() {
		int sum = 0;
		for(int i = 0; i<5; i++) {
			if(dice.getDieValue(i)==3){
				sum+=3;
			}
		}
		return sum;
	}
}
