package week07;

/**
 * Towers Of Hanoi solution.
 *
 * @author Kim-Cuc Nguyen
 *
 * Mar 3, 2020
 *
 */
public class TowerOfHanoi {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		towerOfHanoi(3, 'a', 'b', 'c');
	}

	/**
	 * Print solution for Towers of Hanoi.
	 *
	 * @param n the number of disks
	 * @param a source peg
	 * @param b auxillary peg
	 * @param c destination peg
	 */
	public static void towerOfHanoi(int n, char a, char b, char c) {
		if (n > 0) {
			towerOfHanoi(n - 1, a, c, b);
			System.out.println(a + "->" + c);
			towerOfHanoi(n - 1, b, a, c);
		}
	}
}
