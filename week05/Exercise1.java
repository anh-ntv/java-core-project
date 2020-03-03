package week05;

import java.util.Scanner;

/**
 * @author Kim-Cuc Nguyen
 *
 * Mar 3, 2020
 *
 */
public class Exercise1 {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		int[] a = inputArray();
		System.out.println("Min = " + min(a));
		System.out.println("Max = " + max(a));
		System.out.printf("Average = %.2f\n", average(a));
	}

	/**
	 * Input array.
	 *
	 * @return an integer array
	 */
	public static int[] inputArray() {
		System.out.println("Input array:");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();
		return a;
	}

	/**
	 * Min.
	 *
	 * @param a an array
	 * @return the smallest number in an array
	 */
	public static int min(int[] a) {
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		return min;
	}

	/**
	 * Max.
	 *
	 * @param a an array
	 * @return the largest number in an array
	 */
	public static int max(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		return max;
	}

	/**
	 * Average.
	 *
	 * @param a an array
	 * @return the average of an array
	 */
	public static double average(int[] a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		double averageArr = sum / a.length;
		return averageArr;
	}
}
