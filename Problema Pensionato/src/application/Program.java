package application;

import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student[] vect = new Student[10];
		System.out.print("How many rooms will be rented?");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println("Rent #" + (i+1) + ":");
			sc.nextLine();
			System.out.print("Name:");
			String name = sc.nextLine();
			System.out.print("Email:");
			String email = sc.nextLine();
			System.out.print("Room:");
			int room = sc.nextInt();
			vect[room] = new Student(name, email);}
		
		
		System.out.println("Busy rooms:");
		for(int i=0; i<10; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i]);}}
			
		sc.close();}}
