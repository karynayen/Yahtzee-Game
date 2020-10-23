
public class SmallStraightScore extends Score{
	private YahtzeeDice dice; 


	public SmallStraightScore(YahtzeeDice dice) {
		setName("Small Straight");
		setNameNum(10);
		this.dice = dice;// getYahtzeeDice();

	}	
	public int calculateScore() {
		boolean combo1 = true;
		boolean combo2 = true;
		boolean combo3 = true;
		boolean []max = new boolean[6];

		for(int i = 0; i<5; i++) { 
			for(int j = 0; j<6; j++) {
				if(dice.getDieValue(i)==(j+1)){
					max[j]= true;
				}
			}
		}
		for(int i = 0; i<4; i++) {
			if(max[i] == false){
				combo1 = false;
				break;
			}
		}
		for(int i = 1; i<5; i++) {
			if(max[i] == false) {
				combo2 = false;
				break;
			}
		}
		for(int i = 2; i<6; i++) {
			if(max[i] == false) {
				combo3 = false;
				break;
			}
		}
		if(combo1 || combo2 || combo3) {
			return 30;
		}
		return 0;
	}
}