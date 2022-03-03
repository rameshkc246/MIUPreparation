package finalPractice;

public class RailRoadTie {

	public static void main(String[] args) {
		System.out.println(isRailRoadTie(new int[] {1,2,0,6,9}));
	}
	
	public static int isRailRoadTie(int[] a) {
		if(a.length <= 1) return 0;
		if(a[a.length-1] == 0) return 0;
 		for(int i = 0, k = 1; i < a.length; i++) {
			if(i == (3*k-1)){
				k++;
				if(a[i] != 0) {
					return 0;
				}
			}
			else {
				if(a[i] == 0) {
					return 0;
				}
			}
		}
		return 1;
	}
}
