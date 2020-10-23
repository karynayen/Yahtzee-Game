
public class FourOfAKindScore extends Score{
	private YahtzeeDice dice; 

	public FourOfAKindScore(YahtzeeDice dice) {
		setName("Four of a kind");
		setNameNum(8);
		this.dice = dice;
	}	

	public int calculateScore() {
		int []max = new int[6];
		int sum = 0; 
		for(int i = 0; i<5; i++) { // add another for loop to simplify
			sum += dice.getDieValue(i);
			for(int j = 0; j<6; j++) {
				if(dice.getDieValue(i)==(j+1)){
					max[j]++;
				}
			}
		}
		for(int i = 0; i<6; i++) {
			if(max[i]>=4) {
				return sum;
			}	
		}
		return 0;
	}
}