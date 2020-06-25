package sef.module6.activity;

public class AbstractionActivity {
	
	static void printResults(){
		Rectangle square = new Rectangle(5,5);
		Rectangle notSquare = new Rectangle(5,6);

		System.out.println("Color of square: "+ square.color +", area of square: " + square.calculateArea() + ", perimeter of square: " +square.calculatePerimeter());
		System.out.println("Color of rectangle: "+ notSquare.color +", area of rectangle: " + notSquare.calculateArea() + ", perimeter of rectangle: " +notSquare.calculatePerimeter());
	}

	
	public static void main(String[] args) {
		printResults();

	}

}
