package week05;

import java.util.Scanner;

/**
 * Exercise 4.
 *
 * @author Kim-Cuc Nguyen
 * 
 * Mar 3, 2020
 */
public class Exercise4 {

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
		sortArray(a);
		System.out.println("Sort array: ");
		printArray(a);
		System.out.println("Min: " + a[0]);
		System.out.println("Max: " + a[a.length - 1]);
		
//		Find median of an array
		if (a.length % 2 == 0) {
			int x = a.length / 2;
			System.out.println(x);
			double median = ((double) (a[x - 1] + a[x])) / 2;
			System.out.printf("Median: %.2f\n", median);
		} else {
			System.out.println("Median: " + a[a.length / 2]);
		}
		System.out.printf("Variance: %.2f\n", variance(a));
	}

	/**
	 * Sort an array in ascending order
	 *
	 * @param a the array
	 */
	public static void sortArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}

	/**
	 * Variance.
	 *
	 * @param a the array
	 * @return the variance of an array
	 */
	public static double variance(int[] a) {
		double average = average(a);
		double sum = 0;
		for (int i : a) {
			sum += Math.pow(i - average, 2);
		}
		double variance = sum / a.length;
		return variance;
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

	/**
	 * Prints the array.
	 *
	 * @param a the array
	 */
	public static void printArray(int[] a) {
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
