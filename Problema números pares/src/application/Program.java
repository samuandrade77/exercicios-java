package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantos números você vai digitar?");
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um número:");
			vect[i]=sc.nextInt();}
		
		System.out.println();
		int par = 0;
		System.out.println("Números Pares: ");
		for(int i=0; i<n; i++) {
			if(vect[i]%2==0) {
				System.out.print(vect[i] + " ");
				par++;}}
		System.out.println();
		System.out.println();
		
		System.out.println("Quantidade de pares = " + par);
		
		sc.close();
	}

}
