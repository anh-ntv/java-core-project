package week05;

import java.util.Random;

/**
 * @author Kim-Cuc Nguyen
 *
 * Mar 3, 2020
 *
 */
public class Exercise8 {
	public static void main(String[] args) {
		// array from 0 to 51 - representing a deck of cards
		int card[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
				27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51 };

		shuffle(card, 52);

		// printing all shuffled elements of cards
		for (int i = 0; i < 52; i++) {
			System.out.print(card[i] + " ");
		}
		System.out.println();

		// divide a deck of cards
		int[] user1 = new int[8];
		int[] user2 = new int[8];
		int[] user3 = new int[8];
		int[] user4 = new int[8];
		int index = 0;
		for (int i = 0; i < 32; i = i + 4) {
			user1[index] = card[i];
			user2[index] = card[i + 1];
			user3[index] = card[i + 2];
			user4[index] = card[i + 3];
			index++;
		}
		System.out.print("User 1:");
		printArray(user1);
		System.out.print("User 2:");
		printArray(user2);
		System.out.print("User 3:");
		printArray(user3);
		System.out.print("User 4:");
		printArray(user4);
	}

	public static void shuffle(int card[], int n) {
		Random rand = new Random();

		for (int i = 0; i < n; i++) {
			// random
			int r = rand.nextInt(51);

			// swapping the elements
			int temp = card[r];
			card[r] = card[i];
			card[i] = temp;

		}
	}

	public static void printArray(int[] a) {
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
