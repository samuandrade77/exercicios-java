package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered?");
		int n = sc.nextInt();
		System.out.println();
		
		for(int i=0; i<n; i++) {
			System.out.println("Employee #" + (i+1) + ":");
			System.out.print("Id:");
			int Id = sc.nextInt();
			while(hasId(list, Id)) {
				System.out.print("This Id already taken. try again:");
				int id = sc.nextInt();}
			System.out.print("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary:");
			double salary = sc.nextDouble();
			list.add(new Employee(Id, name, salary));}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase:");
		int Id = sc.nextInt();
		Employee employee = list.stream().filter(x -> x.getId() == Id).findFirst().orElse(null);
		if(employee == null) {
			System.out.println("This Id doesn't exist");}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			employee.increaseSalary(percentage);}
		
		System.out.println();
		System.out.println("List of employees:");
		for(Employee obj : list) {
			System.out.println(obj);}
	
		sc.close();}
	
	static boolean hasId(List<Employee> list, int Id) {
		Employee employee = list.stream().filter(x -> x.getId() == Id).findFirst().orElse(null);
		return employee!=null;}}
