package MUMPractice;

public class RailRaodTie {

	public static void main(String[] args) {
		int[] a = {0,1,3,0,2};
		int result = isRailRoadTie(a);
		System.out.println(result);
	}
	
	public static int isRailRoadTie(int[] a) {
		if(a.length <= 1) {
			return 0;
		}
		else if(a.length == 2) {
			if(a[0] == 0 || a[1] == 0)
				return 0;
		}
		else if(a.length == 3) {
			if(a[1] == 0)
				return 0;
		}
		else {
			if(a[0] != 0 && a[1] == 0)
				return 0;
			if(a[a.length-1] != 0 && a[a.length-2] == 0)
				return 0;
			if(a[0] == 0) {
				for(int i = 0; i < a.length; i = i + 3) {
					if(a[i] != 0)
						return 0;
					if(a[i+1] == 0 || a[i+2] == 0)
						return 0;
				}
			}
			else {
				for(int j = 2; j < a.length; j = j + 3) {
					if(a[j] != 0)
						return 0;
					if(a[j-1] == 0 || a[j-2] == 0)
						return 0;
				}
			}
		}
		return 1;
	}

}
