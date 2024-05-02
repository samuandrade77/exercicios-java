package application;

import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);	
		
		System.out.print("Quantas pessoas serão digitadas?");
		int n = sc.nextInt();
		
		Person[] vect = new Person[n];		
	
		for(int i=0; i<n; i++) {
			sc.nextLine();
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome:");
			String name = sc.nextLine();
			System.out.print("Idade:");
			int age = sc.nextInt();
			System.out.print("Altura:");
			double height = sc.nextDouble();
			vect [i] = new Person(name, age, height);}
		
		System.out.println();
		double sum = 0.0;
		for(int i=0; i<n; i++) {
			sum += vect[i].getHeight();}
		double average = sum/n;
		System.out.printf("Altura média: %.2f%n", average);
		
		int cont = 0;
		for(int i=0; i<n; i++) {
			if(vect[i].getAge() < 16) {
				cont+=1;}}
		double percent = cont*100.0 / n;
		System.out.printf("Pessoas com menos de 16 anos %.1f%n", percent);
			
		for(int i=0; i<n; i++) {
			if(vect[i].getAge()<16) {
				System.out.println(vect[i].getName());}}
			
		sc.close();
	}

}
