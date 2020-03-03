package week07;

/**
 * The Class Subsequence: Find subsequences length k of a string using recursion
 *
 * @author Kim-Cuc Nguyen
 * 
 * Mar 3, 2020
 */
public class Subsequence {

	public static void main(String[] args) {
		String s = "abcd";
		char[] c = new char[s.length()];
		for (int i = 0; i < c.length; i++) {
			c[i] = s.charAt(i);
		}
		int k = 3;
		printSubsequence(s, k);

	}

	public static void printSubsequence(String s, int k) {
		char result[] = new char[k];
		subsequence(s, 0, result, 0);
	}

	public static void subsequence(String s, int index, char result[], int i) {
		if (index == result.length) {
			System.out.println(result);
			return;
		}

		if (i >= s.length()) {
			return;
		}

		result[index] = s.charAt(i);
		subsequence(s, index + 1, result, i + 1);
		subsequence(s, index, result, i + 1);
	}

}
