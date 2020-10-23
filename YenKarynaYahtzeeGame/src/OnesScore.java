
public class OnesScore extends Score{

	private YahtzeeDice dice; 

	public OnesScore(YahtzeeDice dice) {
		setName("Ones");
		setNameNum(1);
		this.dice = dice;	
	}	
	
	public int calculateScore() {
		int sum = 0;
		for(int i = 0; i<5; i++) {
			if(dice.getDieValue(i)==1){
				sum++;
			}
		}
		return sum;
	}
}
