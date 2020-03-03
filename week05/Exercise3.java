package week05;

import java.util.Scanner;

/**
 * Exercise3: Remove middle element in an array if the length is odd.
 *
 * @author Kim-Cuc Nguyen
 * 
 * Mar 3, 2020
 */
public class Exercise3 {
	
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

		if (a.length % 2 == 1) {
			int[] b = removeMiddleElement(a);
			System.out.println("After remove middle element");
			printArray(b);
		}
	}

	/**
	 * Removes the middle element.
	 *
	 * @param a the array
	 * @return the array after remove middle element
	 */
	public static int[] removeMiddleElement(int[] a) {
		int[] b = new int[a.length - 1];
		int n = a.length / 2;
		for (int i = 0; i < n; i++) {
			b[i] = a[i];
		}
		for (int i = n; i < b.length; i++) {
			b[i] = a[i + 1];
		}
		return b;
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
