package week07;

import java.util.Scanner;
/**
 * Print n'th Fibonacci number using iterator of recursion
 *
 * @author Kim-Cuc Nguyen
 * 
 * Mar 3, 2020
 */
public class Fibonacci {
	
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
		
		System.out.println(number + "'th fibonacci number");
		System.out.println("Using iterator: " + fibonacciIterator(number));
		System.out.println("Using recursion: " + fibonacciRecursion(number));
	}

	/**
	 * Find n'th fibonacci number using iterator
	 *
	 * @param n an integer greater than or equal to 0
	 * @return the n'th fibonacci number
	 */
	public static int fibonacciIterator(int n) {
		int a = 0;
		int b = 1;
		int c = 0;
		for (int i = 1; i < n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}

	/**
	 * Find n'th fibonacci number using recursion
	 *
	 * @param n an integer greater than or equal to 0
	 * @return the n'th fibonacci number
	 */
	public static int fibonacciRecursion(int n) {
		if (n <= 1)
			return n;
		return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
	}
}
