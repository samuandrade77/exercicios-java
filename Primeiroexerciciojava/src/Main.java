
public class Main {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";
		int age = 33;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.23182638;
		System.out.println("Products: ");
		System.out.println(product1 + ", wich price is " + price1 );
		System.out.printf("%s, wich price is $ %.2f %n %n", product2, price2);
		System.out.println("Record: " + age + "years old, code " + code + " and gender: " + gender);
		System.out.println("Measue with eight decimal places: " + price1);
		System.out.printf("Round (three decimal places): %.3f %n", measure);
	}

}
