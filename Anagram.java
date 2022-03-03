package finalPractice;

public class Anagram {

	public static void main(String[] args) {
		char[] a1 = {'p','o','o','l'};
		char[] a2 = {'p','o','l','l'};
		System.out.println(isAnagram(a1,a2));
	}
	
	public static int isAnagram(char[] a1, char[] a2) {
		int count1, count2;
		if(a1.length != a2.length) return 0;
		char[] a3 = new char[a1.length];
		for(int i = 0; i < a1.length; i++) {
			count1 = 0; count2 = 0;
			a3[i] = a1[i];
			for(int j = 0; j <= i; j++) {
				if(a1[i] == a3[j]) {
					count1++;
				}
			}
			for(int k = 0; k < a2.length; k++) {
				if(a1[i] == a2[k]) {
					count2++;
				}
				if(count1 == count2) {
					break;
				}
			}
			if(count2 < count1) {
				return 0;
			}
		}
		return 1;
	}
}
