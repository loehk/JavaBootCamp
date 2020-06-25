package sef.module6.activity;

public class Rectangle extends Shape {

		// TODO Auto-generated method stub
		double length;
		double breadth;
	
		public Rectangle(){
			this.length=0;
			this.breadth=0;
			System.out.println("I'm default Rectangle constructor"); 
		}
		
		
		public Rectangle(double length, double breadth){
			this.length = length;
			this.breadth = breadth;
			System.out.println("Length: "+length+" breadth: "+breadth);
		}
		
		
		public double getLength() {
			return length;
		}
		
		
		public void setLength(double length) {
			this.length = length;
		}

	
		public double setBreadth() {
			return breadth;
		}

	
		public void setBreadth(double breadth) {
			this.breadth = breadth;
		}
		
		public double calculateArea() {
			return length*breadth;
		}
		public double calculatePerimeter() {
			return length*2+breadth*2;
		}
		
}

