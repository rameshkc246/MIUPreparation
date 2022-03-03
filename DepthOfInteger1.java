package MUMPractice;

import java.util.ArrayList;

public class DepthOfInteger1 {

	public static void main(String[] args) {
		int n = 25;
		int result = computeDepth(n);
		System.out.println(result);
	}
	
	public static int computeDepth(int n) {
		int depth = 1, tempnum;
		ArrayList<Integer> depthStore = new ArrayList<Integer>();
		int digit;
		l2:
		while(true) {
			tempnum = n * depth;
			while(tempnum != 0) {
				digit = tempnum % 10;
				if(!depthStore.contains(digit)) {
					depthStore.add(digit);
				}
				if(depthStore.size() == 10) {
					break l2;
				}
				tempnum /= 10;
			}
			depth++;
		}
		return depth;
	}

}
