
public class Round {

	private static int roundNumber=1;
	private int targetNumber;
	private int[] Numbers;
	private int winner=0;
	
	
	//
	public Round() {
		id++;
		targetNumber=(int)(Math.random()*900+100);
		for (int i = 0; i < 5; i++) {
			Numbers[i]=(int)Math.random()*9+1;	
		}
		Numbers[5]=((int)(Math.random()*4+1)) * 25;
		
	}
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Round.id = id;
	}
	public int getTargetNumber() {
		return targetNumber;
	}
	public void setTargetNumber(int targetNumber) {
		this.targetNumber = targetNumber;
	}
	public int[] getNumbers() {
		return Numbers;
	}
	public void setNumbers(int[] numbers) {
		Numbers = numbers;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	
	public void display() {
		System.out.println("---------Round "+this.id+"----------");
		System.out.println();
		System.out.println("Target Number: "+this.targetNumber);
		System.out.println();
		System.out.println("Numbers: ");
		for (int i = 0; i < 6; i++) {
			System.out.print(Numbers[i]+" ");
		}
	}
	
	//Kürşat Selam

}
