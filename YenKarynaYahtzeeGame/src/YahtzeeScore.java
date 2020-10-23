
public class YahtzeeScore extends Score{
	private YahtzeeDice dice; 

	public YahtzeeScore(YahtzeeDice dice) {
		setName("Yahtzee");
		setNameNum(13);
		this.dice = dice;
	}	
	public int calculateScore() {
		int []max = new int[6]; 
		for(int i = 0; i<5; i++) { 
			for(int j = 0; j<6; j++) {
				if(dice.getDieValue(i)==(j+1)){
					max[j]++;
				}
			}
		}

		for(int i = 0; i<6; i++){
			if(max[i]== 5) {
				return 50;
			}
		}
		return 0;
	}
}