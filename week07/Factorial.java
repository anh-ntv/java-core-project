package week07;

import java.util.Scanner;

/**
 * Find factorial of given number using iterator or recursion
 *
 * @author Kim-Cuc Nguyen
 * 
 * Mar 1, 2020
 */
public class Factorial {

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
		
		System.out.println("Factorial of " + number);
		System.out.println("Using iterator: " + factorialIterator(number));
		System.out.println("Using recursion: " + factorialRecursion(number));
		
	}

	/**
	 * Find factorial of given number using iterator.
	 *
	 * @param number an integer greater than or equal to 0
	 * @return the factorial of given number
	 */
	public static int factorialIterator(int number) {
		int factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

	/**
	 * Find factorial of given number using iterator.
	 *
	 * @param number an integer greater than or equal to 0
	 * @return the factorial of given number
	 */
	public static int factorialRecursion(int number) {
		if (number == 0) {
			return 1;
		}
		return (number * factorialRecursion(number - 1));
	}
}
