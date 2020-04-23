package bkap.entity;

import java.util.Scanner;

public class Employee {
	private String employeeId;
	private String employeeName;
	private int age;
	private float rate;
	private float salary;
	private boolean employeeStatus;
	final float LUONG_CB = 1300000;
	
	
	
	public Employee(String employeeId, String employeeName, int age, float rate, boolean employeeStatus) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.age = age;
		this.rate = rate;

		this.employeeStatus = employeeStatus;
	}
	public Employee() {
		
	}
	
	public void inputData() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your employeeId: ");
		this.employeeId = sc.nextLine();
		
		System.out.print("Enter your employeeName: ");
		this.employeeName = sc.nextLine();
		
		System.out.print("Enter your age: ");
		this.age = Integer.valueOf(sc.nextLine());
		
		System.out.print("Enter your rate: ");
		this.rate = Float.valueOf(sc.nextLine());
		
		System.out.print("Enter your employeeStatus: ");
		this.employeeStatus = sc.nextBoolean();
	}
	
	
	public void displayData() {
		System.out.printf("EmployeeId: %s\t EmployeeName: %s\tAge: %d\t", this.employeeId, this.employeeName, this.age);
		System.out.printf("Rage: %1.2f\t Salary: %4.3f", this.rate, this.calSalary());
		System.out.println("\n\n");
		
	}
	
	public double calSalary() {
		return this.rate * this.LUONG_CB;
	}
	
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public boolean isEmployeeStatus() {
		return employeeStatus;
	}
	public void setEmployeeStatus(boolean employeeStatus) {
		this.employeeStatus = employeeStatus;
	}
	
	
}
