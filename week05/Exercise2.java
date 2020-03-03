package week05;

import java.util.Scanner;

/**
 * Exercise2.
 *
 * @author Kim-Cuc Nguyen
 * 
 * Mar 3, 2020
 */
public class Exercise2 {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		System.out.println("Input array:");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();
		
		System.out.println("Increasing sequence: " + isIncreasingSequence(a));
		System.out.println("Monotonic sequence: " + isMonotonicSequence(a));
		System.out.print("Arithmetic sequence: ");
		sumArithmeticSequence(a);
		System.out.print("Geometric sequence: ");
		sumGeometricSequence(a);
	}

	/**
	 * Checks if is increasing sequence.
	 *
	 * @param a the array
	 * @return true, if is increasing sequence
	 */
	public static boolean isIncreasingSequence(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Checks if is decreasing sequence.
	 *
	 * @param a the a
	 * @return true, if is decreasing sequence
	 */
	public static boolean isDecreasingSequence(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] < a[i + 1]) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Checks if is monotonic sequence.
	 *
	 * @param a the array
	 * @return true, if is monotonic sequence
	 */
	public static boolean isMonotonicSequence(int[] a) {
		return isIncreasingSequence(a) || isDecreasingSequence(a);
	}

	/**
	 * Checks if is arithmetic sequence.
	 *
	 * @param a the array
	 * @return true, if is arithmetic sequence
	 */
	public static boolean isArithmeticSequence(int[] a) {
		double d = a[1] - a[0];
		for (int i = 2; i < a.length; i++) {
			if (a[i] - a[i - 1] != d) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Sum of arithmetic sequence.
	 *
	 * @param a the array
	 */
	public static void sumArithmeticSequence(int[] a) {
		if (isArithmeticSequence(a)) {
			double sum = (a[0] + a[a.length - 1]) * a.length / 2;
			System.out.println("true  Sum: " + sum);
		} else {
			System.out.println("false");
		}
	}

	/**
	 * Checks if is geometric sequence.
	 *
	 * @param a the array
	 * @return true, if is geometric sequence
	 */
	public static boolean isGeometricSequence(int[] a) {
		if (a.length < 2 || a[0] == 0) {
			return false;
		}

		double ratio = a[1] / a[0];
		for (int i = 1; i < a.length; i++) {
			double temp = a[i] / a[i - 1];
			if (temp != ratio) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Sum of geometric sequence.
	 *
	 * @param a the array
	 */
	public static void sumGeometricSequence(int[] a) {
		if (isGeometricSequence(a)) {
			double ratio = a[1] / a[0];
			double sum = (2 * (Math.pow(a[0], a.length) - 1) / (ratio - 1));
			System.out.println("true  Sum: " + sum);
		} else {
			System.out.println("false");
		}
	}
}
