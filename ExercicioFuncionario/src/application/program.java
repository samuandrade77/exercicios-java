package application;

import java.util.Scanner;

import entities.Employee;

public class program {

	public static void main(String[] args) {
		Employee employee;
		employee = new Employee();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the employee data: ");
		System.out.print("Name: "); 
		employee.name = sc.nextLine();
		System.out.print("Salary: ");
		employee.salary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + employee);
		
		System.out.print("Wich the percent to increase the salary? ");
		int percent = sc.nextInt();
		employee.IncreaseNet(percent);
		System.out.println();
		
		System.out.println("Update data: " + employee);
		
		
		
		sc.close();
	}

}
