import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantos números você vai digitar?");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um número:");
			vect[i] = sc.nextDouble();}
		System.out.println();
		
		System.out.print("Valores = ");
		for (int i=0; i<n; i++) {
			System.out.print(vect[i]+ " ");}
		System.out.println();
		
		double sum = 0.0;
		for(int i=0; i<n; i++) {
			sum += vect[i];}
		System.out.println("Soma = " + sum);
		
		double media = sum/n;
		System.out.println("Media = " + media);
		
		
		
		sc.close();
	}

}
