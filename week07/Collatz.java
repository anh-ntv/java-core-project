package week07;

import java.util.Scanner;

/**
 * The Class Collatz.
 *
 * @author Kim-Cuc Nguyen
 * 
 * Mar 2, 2020
 */
public class Collatz {

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

		System.out.println("Collatz sequence");
		printCollatz(number);
	}

	
	/**
	 * Prints the Collatz sequence starting from n.
	 *
	 * @param n
	 */
	public static void printCollatz(int n) {
		System.out.print(n + " ");
		if (n == 1) {
			return;
		}
		if (n % 2 == 0) {
			printCollatz(n / 2);
		} else {
			printCollatz(n * 3 + 1);
		}
	}

}
