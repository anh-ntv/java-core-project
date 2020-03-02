package week11.ex1;

public class Square implements Shape{
	private double length;
	public Square(){
	}
	public Square(double a){
		length = a;
	}
	
	public double getLength(){
		return length;
	}
	public void setLength(double a){
		length = a;
	}
	
	public double getPerimeter(){
		return 4*length;
	}
	
	public double getArea(){
		return length*length;
	}
	

}