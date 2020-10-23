
 public abstract class Score {
	private int score;
	private boolean isUsed; 
	private YahtzeeDice dice; 
	private String name; 
	private int nameNum;
	
	public YahtzeeDice getYahtzeeDice() {
		return dice;
	}
	public boolean getIsUsed() {
		return isUsed;
	}
	public void setIsUsed(boolean i) {
		isUsed = i;
	}

	public String getName() {
		return this.name;
	}
	public int getNameNum() {
		return this.nameNum;
	}
	public void setName(String n) {
		this.name = n;
	}
	public void setNameNum(int n) {
		this.nameNum = n;
	}
	public void setScore() {
		score = calculateScore(); 
	}
	public int getScore() {
		return score;
	}
	
	public boolean isUsed() {
		isUsed = true;
		return isUsed;
	}
	public abstract int calculateScore();

}
