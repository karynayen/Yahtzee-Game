
public class SixesScore extends Score{

	private YahtzeeDice dice; 

	public SixesScore(YahtzeeDice dice) {
		setName("Sixes");
		setNameNum(6);
		this.dice = dice;// getYahtzeeDice();
	}	
	
	public int calculateScore() {
		int sum = 0;
		for(int i = 0; i<5; i++) {
			if(dice.getDieValue(i)==6){
				sum+=6;
			}
		}
		return sum;
	}



}
