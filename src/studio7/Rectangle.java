package studio7;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	
	private int length;
	private int width;
	private int area;
	private int perimeter;
	private boolean square;
	private StdDraw picture;
	

	
	
	public Rectangle (int initlength, int initwidth) {
		length = initlength;
		width = initwidth;
		area = initlength * initwidth;
		perimeter = 2*(initlength + initwidth);
		if (initlength == initwidth) {
			square = true;
		}
	}
	
	public int calculateArea() {
		area = length * width;
		return area;
	}
	
	public int calculatePerimeter() {
		perimeter = 2*(length + width);
		return perimeter;
	}
	
	public boolean ifSquare() {
		if (length == width) {
			return true;
		}
		return false;
	}
	
	public boolean comparingSize(Rectangle otherObject) {
		if (this.calculateArea() > otherObject.calculateArea()) {
			return true;
		}
		return false;
	}
	
	


	public String toString() {
		return "given " + length + "x" + width + ", " + "area = " + area + ", perimeter = " + perimeter; 
	}



	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(4,5);
		Rectangle rectangle2 = new Rectangle (6,7);
		
		rectangle1.comparingSize(rectangle2);
		System.out.println(rectangle1.toString());
		System.out.println(rectangle1.comparingSize(rectangle2));
	}

}
