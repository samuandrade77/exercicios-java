package application;

import java.util.Scanner;

import util.CurrencyConverter;

public class program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the dollar price?");
		double pricedollar = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		double boughtdollars = sc.nextDouble();
		double valuefinal = CurrencyConverter.convert(pricedollar, boughtdollars);
		System.out.println("Amount to be paid in reais: " + valuefinal);
		
		
		sc.close();
	}

}
