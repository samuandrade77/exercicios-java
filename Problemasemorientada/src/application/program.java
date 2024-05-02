package application;

import java.util.Scanner;

import entities.Triângulo;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Triângulo x, y;
		x = new Triângulo();
		y = new Triângulo();
		System.out.println("Coloque as medidas do triângulo X:");
		 x.a = sc.nextDouble();
		 x.b = sc.nextDouble();
		 x.c = sc.nextDouble();
		System.out.println("Coloque as medidas do triângulo Y:");
		 y.a = sc.nextDouble();
		 y.b = sc.nextDouble();
		 y.c = sc.nextDouble();
		double areaX = x.area();
		double areaY = y.area();
		System.out.printf("O valor da área do triângulo X é: %.3f%n", areaX);
		System.out.printf("O valor da área do triângulo Y é: %.3f%n", areaY);
		if(areaX > areaY) {
			System.out.println("A maior área é do triângulo X");}
		else {
			System.out.println("A maior área é do triângulo Y");}
		sc.close();
	}

}
