package bkap.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Test {
	static List<Employee> employeesList = new ArrayList<Employee>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choice;
		do {
			System.out.println("\n\n\t\t************MENU***************");
			System.out.println("\t\t1. Nhập thông tin nhân viên");
			System.out.println("\t\t2. Tính lương nhân viên");
			System.out.println("\t\t3. Hiển thị thông tin nhân viên");
			System.out.println("\t\t4. Sắp xếp nhân viên theo lương tăng dần");
			System.out.println("\t\t5. Tìm kiếm nhân viên theo tên nhân viên");
			System.out.println("\t\t6. Cập nhật trạng thái nhân viên theo mã nhân viên");
			System.out.println("\t\t7.Thoát");
			System.out.println("\n\n\t ==> Your choice");
			choice = Integer.valueOf(sc.nextLine());

			switch (choice) {
			case 1:
				addEmployee();
				break;

			case 2:
				calSalary();
				System.out.println("Salary was caculater");
				break;

			case 3:
				System.out.println("Before employee sort ");
				displayData();
				break;

			case 4:
				SortEmploy();
				break;

			case 5:
				searchEmployy();
				break;

			case 6:
				updateEmployee();
				break;

			case 7:
				System.exit(0);
				break;

			default:
				System.out.println("Your choice isvalid");
				break;
			}
		} while (true);
	}

	public static void addEmployee() {
		System.out.println("Number employee you want input: ");
		int number = Integer.valueOf(sc.nextLine());
		for (int i = 0; i < number; i++) {
			System.out.print("Number employee count " + (i + 1) + ":\n");
			Employee employee = new Employee();
			
			employee.inputData();
			
			employeesList.add(employee);
		}

	}

	public static void calSalary() {

		for (int i = 0; i < employeesList.size(); i++) {
			employeesList.get(i).calSalary();
		}

	}

	public static void displayData() {
		
		for (int i = 0; i < employeesList.size(); i++) {
			employeesList.get(i).displayData();
		}

	}

	public static void SortEmploy() {

		Collections.sort(employeesList, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				System.out.println(Float.compare(o1.getSalary(), o2.getSalary()));

				return Float.compare(o1.getSalary(), o2.getSalary());
			}
		});
		System.out.println("After employee sort ");
		displayData();
	}

	public static void searchEmployy() {
		System.out.println("Enter name employee you want search ");
		String  name = sc.nextLine();
		for (Employee e : employeesList) {
			
			if(e.getEmployeeName().equals(name)) {
				e.displayData();
			}
		}
	}

	public static void updateEmployee() {
		
	}

}
