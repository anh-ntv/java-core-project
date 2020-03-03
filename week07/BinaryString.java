package week07;

import java.util.Scanner;

/**
 * @author Kim-Cuc Nguyen
 *
 * Mar 3, 2020
 *
 */
public class BinaryString {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input integer number:");
		int number = scan.nextInt();
		scan.close();
		
		System.out.println("Binary string of " + number + ": ");
		System.out.println("Using iterator: " + toBinaryIterator(number));
		System.out.println("Using recursion: " + toBinaryRecursion(number));
	}

	/**
	 * Find binary representation of a number using iterator
	 *
	 * @param n an integer greater than or equal to 0
	 * @return the binary string
	 */
	public static String toBinaryIterator(int n) {
		String s = "";
		if (n <= 0) {
			return String.valueOf(0);
		}

		while (n > 0) {
			s = s + String.valueOf(n % 2);
			n = n / 2;
		}

		String binary = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			binary = binary + s.charAt(i);
		}
		return binary;
	}

	/**
	 * Find binary representation of a number using recursion
	 *
	 * @param n an integer greater than or equal to 0
	 * @return the binary string
	 */
	public static String toBinaryRecursion(int n) {
		String s = "";
		if (n == 1) {
			return "1";
		}
		s = String.valueOf(n % 2);
		return toBinaryRecursion(n / 2) + s;
	}

}
