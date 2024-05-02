package application;

import java.util.Scanner;

import entities.Student;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student;
		student = new Student();
		
		System.out.println("Student's name: ");
		sc.nextLine();
		System.out.println("Student's grade: ");
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE: " + student.FinalGrade());
		student.result();
		
		
		sc.close();
	}

}
