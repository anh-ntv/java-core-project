package week09;

/**
 * 
 * @author Kim-Cuc Nguyen
 *
 * Feb 26, 2020
 *
 */
public class Student {
	private String name;
	private double score;

	public Student(String name, double score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public void printStudent() {
		System.out.println(this.name + "\t" + this.score);
	}
	
}
