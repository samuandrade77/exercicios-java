import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor do raio do círculo:");
		double raio = sc.nextDouble();
		double π = 3.14159;
		double area = π * raio*raio;
		System.out.printf("A área do círculo é %.4f%n", area);
		sc.close();
}
}
