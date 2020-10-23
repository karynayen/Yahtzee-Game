
public class ChanceScore extends Score{
	private YahtzeeDice dice; 

	public ChanceScore(YahtzeeDice dice) {
		setName("Chance");
		setNameNum(12);
		this.dice = dice;// getYahtzeeDice();
	}	
	public int calculateScore() {
		int sum = 0; 
		for(int i = 0; i<5; i++) { // add another for loop to simplify
			sum += dice.getDieValue(i);
			
		}
		
		return sum;
		

	}

}