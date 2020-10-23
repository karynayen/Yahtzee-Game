
public class ThreeOfAKindScore extends Score{
	private YahtzeeDice dice; 

	public ThreeOfAKindScore(YahtzeeDice dice) {
		setName("Three of a kind");
		setNameNum(7);
		this.dice = dice;// getYahtzeeDice();

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
			if(max[i]>=3) {
				return sum;
			}	
		}
		return 0;
	}

}