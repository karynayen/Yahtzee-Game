
public class FullHouseScore extends Score{
	private YahtzeeDice dice; 
	
	public FullHouseScore(YahtzeeDice dice) {
		setName("Full House");
		setNameNum(9);
		this.dice = dice;
	}	

	public int calculateScore() {
		boolean two = false;
		boolean three = false;
		int []max = new int[6]; 
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<6; j++) {
				if(dice.getDieValue(i)==(j+1)){
					max[j]++;
				}
			}
		}
		for(int i = 0; i<6; i++) {
			if(max[i]==2) {
				two = true;
			}	
			if(max[i]==3) {
				three = true;
			}	
		}
		if(two && three) {
			return 25;
		}
		return 0;
	}
}