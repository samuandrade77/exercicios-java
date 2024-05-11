package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantos valores vão ter cada vetor?");
		int n = sc.nextInt();
		
		int[] vecta = new int [n];
		System.out.println("Digite os valores do vetor A:");
		for(int i=0; i<n; i++) {
			vecta[i] = sc.nextInt();}
		
		int[] vectb = new int [n];
		System.out.println("Digite os valores do vetor B:");
		for(int i=0; i<n; i++) {
			vectb[i] = sc.nextInt();}
		
		int[] vectc = new int [n];
		System.out.println("Vetor Resultante: ");
		for(int i=0; i<n; i++) {
			vectc[i]= vecta[i] + vectb[i];
			System.out.println(vectc[i]);}
		
		sc.close();
	}

}
