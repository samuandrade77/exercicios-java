import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número da soma:");
		double a = sc.nextDouble();
		System.out.println("Digite o segundo número da soma:");
		double b = sc.nextDouble();
		double soma = a + b;
		System.out.printf("O resultado da soma entre %.1f e %.1f é %.1f%n", a, b, soma);
		sc.close();
		}}
