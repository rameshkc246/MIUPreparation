package MUMPractice;

public class AnagramWord {

	public static void main(String[] args) {
		char[] c1 = {'p', 'o', 'o', 'l'};
		char[] c2 = {'p', 'o', 'l', 'l'};
		int result = isAnagram(c1, c2);
		System.out.println(result);
	}
	
	public static int isAnagram(char[] c1, char[] c2) {
		if(c1.length != c2.length) return 0;
		char[] s1 = sort(c1);
		char[] s2 = sort(c2);
		for(int i = 0; i < s1.length; i++) {
			if(s1[i] != s2[i])
				return 0;
		}
		return 1;
	}
	
	public static char[] sort(char[] c) {
		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < c.length-i-1; j++) {
				if(c[j] > c[j+1]) {
					char temp;
					temp = c[j];
					c[j] = c[j+1];
					c[j+1] = temp;
				}
			}
		}
		return c;
	}

}
