package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantos números você vai digitar?");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();}
		
		double vetmaior = vect[0];
		int posmaior = 0;
		for (int i=0; i<n; i++) {
			if(vect[i] > vetmaior) {
				vetmaior = vect[i];
				posmaior = i;}}
		
		System.out.printf("Maior valor = %.f", vetmaior);
		System.out.println("Posição do maior valor = " + posmaior);
		sc.close();
	}

}
