package week05;

import java.util.Scanner;

/**
 * @author Kim-Cuc Nguyen
 *
 * Mar 3, 2020
 *
 */
public class Exercise5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input number of array");
		int n = Integer.parseInt(scan.nextLine());
		System.out.println("Input vector A: ");
		int[] vectorA = new int[n];
		for (int i = 0; i < vectorA.length; i++) {
			vectorA[i] = scan.nextInt();
		}
		System.out.println("Input vector B: ");
		int[] vectorB = new int[n];
		for (int i = 0; i < vectorB.length; i++) {
			vectorB[i] = scan.nextInt();
		}
		scan.close();

		System.out.print("Scalar product:");
		System.out.println(scalarProduct(vectorA, vectorB));

		if (n == 3) {
			int[] crossProduct = crossProduct(vectorA, vectorB);
			System.out.print("Cross product:");
			// cross product of two vector array.
			for (int i = 0; i < n; i++) {
				System.out.print(crossProduct[i] + " ");
			}
		}

	}

	public static int scalarProduct(int[] firstVector, int[] secondVector) {
		int result = 0;
		for (int i = 0; i < firstVector.length; i++) {
			result += firstVector[i] * secondVector[i];
		}
		return result;
	}

	public static int[] crossProduct(int[] vectorA, int[] vectorB) {
		if (vectorA.length == 3 && vectorB.length == 3) {
			int[] result = new int[3];
			result[0] = vectorA[1] * vectorB[2] - vectorA[2] * vectorB[1];
			result[1] = vectorA[2] * vectorB[0] - vectorA[0] * vectorB[2];
			result[2] = vectorA[0] * vectorB[1] - vectorA[1] * vectorB[0];
			return result;
		} else {
			return null;
		}
	}

}
