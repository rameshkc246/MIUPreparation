package finalPractice;

public class ComputeHMS {

	public static void main(String[] args) {
		int sec = 7200;
		int[] rslt = computeHMS(sec);
		for(int x : rslt) System.out.print(x + ",");
	}
	
	public static int[] computeHMS(int sec) {
		int hour, minutes;
		int[] rslt = new int[3];
		hour = sec / 3600;
		sec %= 3600;
		minutes = sec / 60;
		sec %= 60;
		rslt[0] = hour;
		rslt[1] = minutes;
		rslt[2] = sec;
		return rslt;
	}
}
