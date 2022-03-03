package MUMSampleTest;

public class CharacterArrayLength {

	public static void main(String[] args) {
		char[] a = {'a', 'b', 'c'};
		int start = 0, len = 2;
		char[] ar = new char[len];
		ar = validArrayElement(a, start, len);
		for(char x : ar) {
			System.out.println(x);
		}

	}
	
	public static char[] validArrayElement(char[] a, int start, int len) {
		char[] sub =  new char[len];
		if(a.length - start >= len) {
			int i = start;
			int j = 0;
			while(j < len) {
				sub[j] = a[i];
				j++;
				i++;
			}
			return sub;
		}
		else {
			return null;
		}
	}

}
