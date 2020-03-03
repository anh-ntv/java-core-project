package week05;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Kim-Cuc Nguyen
 *
 * Mar 3, 2020
 *
 */
public class Exercise6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input m:");
		int m = Integer.parseInt(scan.nextLine());
		System.out.println("Input n: ");
		int n = Integer.parseInt(scan.nextLine());
		scan.close();

		int[][] firstMatrix = randomMatrix(m, n);
		int[][] secondMatrix = randomMatrix(n, m);
		System.out.println("First matrix");
		printMatrix(firstMatrix);
		System.out.println("Second matrix");
		printMatrix(secondMatrix);
		int[][] result = multipyMatrix(firstMatrix, secondMatrix);
		System.out.println("Result matrix");
		printMatrix(result);
	}

	public static int[][] randomMatrix(int m, int n) {
		Random rand = new Random();
		int[][] matrix = new int[m][n];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = rand.nextInt(10);
			}
		}
		return matrix;
	}

	public static int[][] multipyMatrix(int[][] firstMatrix, int[][] secondMatrix) {
		int m = firstMatrix.length;
		int n = secondMatrix[0].length;
		int[][] result = new int[m][n];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				int sum = 0;
				for (int k = 0; k < secondMatrix.length; k++) {
					sum = sum + firstMatrix[i][k] * secondMatrix[k][j];
				}
				result[i][j] = sum;
			}
		}
		return result;
	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
