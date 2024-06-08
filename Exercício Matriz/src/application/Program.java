package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escreva o número de linhas da matriz:");
		int m = sc.nextInt();
		System.out.print("Escreva o número de colunas da matriz:");
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		
		for (int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				System.out.println("Escreva um número que pertencerá à matriz:");
				mat[i][j]= sc.nextInt();}}
		
		System.out.print("Escreva um número pertencente à matriz:");
		int x = sc.nextInt();
		for(int i=0; i<mat.length; i++){
			for(int j=0; j<mat[i].length; j++) {
				if(x == mat[i][j]) {
					System.out.println("Position: " + i + ", " + j);}
				if(j>0){
					System.out.println("Left: " + mat[i][j-1]);}
				if(j<mat[i].length-1){
					System.out.println("Right: " + mat[i][j+1]);}
				if(i>0){
					System.out.println("Up: " + mat[i-1][j]);}
				if(i<mat.length-1) {
					System.out.println("Down: " + mat[i+1][j]);}}}
			
		sc.close();}

}
