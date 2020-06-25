package sef.module6.activity;

// class Employee_I must extend class Person_I. Complete code for the same
public class Employee_I extends Person_I{
	
	//Attributes
	private double salary;
	private String title;
	
	public Employee_I(){
		this.title="Unknown";
		this.salary = 0;
		System.out.println("I'm Employee_I constructor"); // Called when creating a Person instance
	}
	
	//Behavior - parameterized constructor
	public Employee_I(String title, int salary){
		this.title = title;
		this.salary = salary;
	}
	
	// getter for String name
	public String getTitle() {
		return title;
	}
	
	// setter for String name
	public void setTitle(String title) {
		this.title = title;
	}

	// getter for int age
	public double getSalary() {
		return salary;
	}

	// setter for int age
	public void setSalary(int salary) {
		this.salary = salary;
	}	
	
	public void announce(){
		System.out.println("Inside Employee Class");
	}
}
