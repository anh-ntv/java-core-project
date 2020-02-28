package week11.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import week11.ex2.Student;

/**
 * @author Kim-Cuc Nguyen
 *
 * Feb 27, 2020
 *
 */
public class StudentAffairs {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		List<Student> listStudent = new ArrayList<>();
		System.out.println("Input number of students:");
		int size = Integer.parseInt(scan.nextLine());
		System.out.println("Size: " + size);
		inputStudents(listStudent, size);
		sort(listStudent);
		printStudents(listStudent);
	}

	public static void inputStudents(List<Student> listStudent, int size) {
		System.out.println("Input student information: ID|Name|Age|Email|Gender");
		while (size > 0) {
			String[] line = scan.nextLine().trim().split("\\|");	
			String id = line[0].trim();
			String name = line[1].trim();
			int age = Integer.parseInt(line[2].trim());
			String email = line[3].trim();
			String gender = line[4].trim();
			String department = findDepartment(email);

			Student student = new Student(id, name, age, email, gender, department);
			listStudent.add(student);
			size--;
		}
	}

	public static String findDepartment(String email) {
		int a = email.indexOf("@");
		int b = email.indexOf(".");
		String department = email.substring(a + 1, b);
		if (department.equals("chem")) {
			return "Khoa Hoa hoc";
		} else if (department.equals("math")) {
			return "Khoa Toan- Co - Tin hoc";
		} else if (department.equals("phys")) {
			return "Khoa Vat ly";
		} else {
			return null;
		}
	}

	public static void printStudents(List<Student> listStudent) {
		for (Student student : listStudent) {
			student.printInfo();
		}
	}
	
	public static void sort(List<Student> listStudent) {
		for (int i = 0; i < listStudent.size(); i++) {
			for (int j = 0; j < listStudent.size() - i - 1; j++) {
				if (listStudent.get(j).compareTo(listStudent.get(j + 1)) > 0) {
					swap(listStudent, j, j + 1);
				}
			}
		}
	}

	private static void swap(List<Student> listStudent, int i, int j) {
		Student temp = listStudent.get(i);
		listStudent.set(i, listStudent.get(j));
		listStudent.set(j, temp);
	}
	
}
