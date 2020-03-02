package week03;

/**
 * The Class NumberProperty.
 *
 * @author Kim-Cuc Nguyen
 * 
 * Mar 1, 2020
 */
public class NumberProperty {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);

		printPrimeNumber(n);
		printPalindromeNumber(n);
		printPalindromicPrimes(n);
		printArmstrongNumber(n);
	
	}

	/**
	 * Checks if is prime.
	 *
	 * @param number the number to check
	 * @return true, if number is prime
	 */

	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Checks if is palindrome.
	 *
	 * @param number the number to check
	 * @return true, if number is palindrome
	 */
	public static boolean isPalindrome(int number) {
		if (number < 0) {
			return false;
		}
		int reverseNumber = getReverseNumber(number);
		if (reverseNumber == number) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Gets the reverse number.
	 *
	 * @param number the number to check
	 * @return the reverse number
	 */
	public static int getReverseNumber(int number) {
		int reverseNumber = 0;
		while (number > 0) {
			int r = number % 10;
			number = number / 10;
			reverseNumber = reverseNumber * 10 + r;
		}
		return reverseNumber;

	}

	/**
	 * Checks if is Armstrong number.
	 *
	 * @param number the number to check
	 * @return true, if is Armstrong number
	 */
	public static boolean isArmstrong(int number) {
		if (number < 0) {
			return false;
		}
		int sum = 0;
		int temp = number;

		int numberOfDigits = 0;
		while (temp > 0) {
			temp = temp / 10;
			numberOfDigits++;
		}

		temp = number;
		while (temp > 0) {
			int r = temp % 10;
			sum = sum + (int) Math.pow(r, numberOfDigits);
			temp = temp / 10;

		}

		if (sum == number) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Prints the first n prime numbers.
	 *
	 * @param n
	 */
	public static void printPrimeNumber(int n) {
		int number = 0;
		int temp = n;
		System.out.println("Print first " + n + " prime numbers");
		while (temp > 0) {
			if (isPrime(number)) {
				System.out.print(number + " ");
				temp--;
			}
			number++;
		}
		System.out.println("\n");
	}

	/**
	 * Prints the first n palindrome number.
	 *
	 * @param n
	 */
	public static void printPalindromeNumber(int n) {
		int number = 0;
		int temp = n;
		System.out.println("Print first " + n + " palindrome numbers");
		while (temp > 0) {
			if (isPalindrome(number)) {
				System.out.print(number + " ");
				temp--;
			}
			number++;
		}
		System.out.println("\n");
	}

	/**
	 * Prints the first n palindromic primes.
	 *
	 * @param n
	 */
	public static void printPalindromicPrimes(int n) {
		int number = 0;
		int temp = n;
		System.out.println("Print first " + n + " palindromic primes");
		while (temp > 0) {
			if (isPalindrome(number) && isPrime(number)) {
				System.out.print(number + " ");
				temp--;
			}
			number++;
		}
		System.out.println("\n");
	}
	
	/**
	 * Prints the first n Armstrong number.
	 *
	 * @param n
	 */
	public static void printArmstrongNumber(int n) {
		int number = 0;
		int temp = n;
		System.out.println("Print first " + n + " armstrong numbers");
		while (temp > 0) {
			if (isArmstrong(number)) {
				System.out.print(number + " ");
				temp--;
			}
			number++;
		}
		System.out.println("\n");
	}
}
