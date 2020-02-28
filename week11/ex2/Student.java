package week11.ex2;

/**
 * @author Kim-Cuc Nguyen
 *
 * Feb 27, 2020
 *
 */
public class Student implements Comparable<Student> {
	private String id;
	private String name;
	private int age;
	private String email;
	private String gender;
	private String department;

	public Student(String id, String name, int age, String email, String gender, String department) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.gender = gender;
		this.department = department;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void printInfo(){
		System.out.printf("%.10s|%-30s|%-3s|%-30s|%-5s|%-30s\n", getId(), getName(), getAge(), getEmail(),getGender(), getDepartment());
	}

	@Override
	public int compareTo(Student other) {
		if (!this.getDepartment().equals(other.getDepartment())) {
			if (this.getDepartment().equals("Khoa Toan- Co - Tin hoc")) {
				return -1;
			} else if (this.getDepartment().equals("Khoa Hoa hoc")) {
				return 1;
			} else {
				if (other.getDepartment().equals("Khoa Toan- Co - Tin hoc")) {
					return 1;
				} else {
					return -1;
				}
			}
		}
		String[] name = this.getName().trim().split(" ");
		String[] otherName = other.getName().trim().split(" ");
		if (name[name.length - 1].equals(otherName[otherName.length - 1])) {
			return name[0].compareTo(otherName[0]);
		} else {
			return name[name.length - 1].compareTo(otherName[otherName.length - 1]);
		}
	}

}
