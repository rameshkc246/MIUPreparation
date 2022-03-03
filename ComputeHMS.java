package MUMPractice;

public class ComputeHMS {

	public static void main(String[] args) {
		int second = 50;
		int[] result = computeHMS(second);
		for(int x : result) {
			System.out.println(x);
		}
	}
	
	public static int[] computeHMS(int second) {
		int[] result = new int[3];
		int hour, minute;
		hour = second / 3600;
		result[0] = hour;
		second %= 3600;
		minute = second / 60;
		result[1] = minute;
		second %= 60;
		result[2] = second;
		return result;
	}

}
