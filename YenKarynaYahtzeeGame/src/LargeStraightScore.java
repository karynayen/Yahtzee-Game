
public class LargeStraightScore extends Score{
	private YahtzeeDice dice; 
	private boolean start = true;
	private boolean end = true;
	public LargeStraightScore(YahtzeeDice dice) {
		setName("Large Straight");
		setNameNum(11);
		this.dice = dice;
	}	
	public int calculateScore() {
		boolean []max = new boolean[6];
		for(int i = 0; i<5; i++) { 
			for(int j = 0; j<6; j++) {
 				if(dice.getDieValue(i)==(j+1)){
 					max[j]= true;
 				}
 			}
		}
		for(int i = 0; i<5; i++) {
			if(max[i] == false){
				start = false;
				break;
			}
		}
		for(int i = 1; i<6; i++) {
			if(max[i] == false) {
				end = false;
				break;
			}
		}
		if(start || end) {
			return 40;
		}
		return 0;

	}

}