package week09;

import java.util.Scanner;

/**
 * 
 * @author Kim-Cuc Nguyen
 *
 * Feb 26, 2020
 *
 */
public class StudentTest {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Input number of students:");
		int number = Integer.parseInt(scan.nextLine());
		Student []students = new Student[number];
		inputStudents(students);
		sortScores(students);
		printStudents(students);
	}

	public static void inputStudents(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			System.out.println("Input student's name:");
			String name = scan.nextLine();
			System.out.println("Input student's score:");
			double score = Double.parseDouble(scan.nextLine());
			students[i] = new Student(name, score);
		}
	}

	public static void printStudents(Student[] students) {
		for (Student student : students) {
			student.printStudent();
		}
	}

	public static void sortScores(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length - i - 1; j++) {
				if (students[j].getScore() < students[j + 1].getScore()) {
					Student temp = students[j];
					students[j] = students[j + 1];
					students[j + 1] = temp;
				}
			}
		}
	}
	
}
