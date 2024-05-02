import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva um número de 1 a 1000:");
		int numero = sc.nextInt();	
		for(int i=1; i<=numero; i+=2){
			System.out.println(i);
		}
		sc.close();
	}

}
