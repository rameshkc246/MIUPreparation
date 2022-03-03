package finalPractice;

public class FilterArray9and11And7Not13 {

	public static void main(String[] args) {
		System.out.println(isFiltered(new int[] {3,5,4,11,9,7,13,9}));
	}
	
	public static int isFiltered(int[] a) {
		int found9 = 0, found11 = 0, found7 = 0, found13 = 0, isFilter = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] == 9) {
				found9 = 1;
				for(int j = 0; j < a.length; j++) {
					if(a[j] == 11) {
						found11 = 1;
						break;
					}
				}
			}
			if(a[i] == 7) {
				found7 = 1;
				for(int j = 0; j < a.length; j++) {
					if(a[j] == 13) {
						found13 = 1;
						break;
					}
				}
			}
		}
		if(found9 == 1 && found11 == 1) {
			isFilter = 1;
		}
		if(found7 == 1 && found13 == 1) {
			isFilter = 0;
		}
		return isFilter;
	}
}
