package MUMPractice;

public class StantonMeasure {

	public static void main(String[] args) {
		int[] a = {3,1,1,1,3,6,3,6,5,3,3};
		int result = stantonMeasure(a);
		System.out.println(result);
	}
	
	public static int stantonMeasure(int[] a) {
		int onecount = 0, stantoncount = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] == 1)
				onecount++;
		}
		for(int j = 0; j < a.length; j++) {
			if(a[j] == onecount && onecount != 0)
				stantoncount++;
		}
		return stantoncount;
	}

}
