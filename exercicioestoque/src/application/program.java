package application;

import java.util.Scanner;

import entities.Product;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data:");
		System.out.print("Name:");
		String name = sc.nextLine();
		System.out.print("Price:");
		double price = sc.nextDouble();
		System.out.print("Quantity:");
		double quantity = sc.nextDouble();
		System.out.println();
		Product product = new Product(name, price, quantity);
		System.out.println("Product data: " + product);
		System.out.println();
		
		System.out.print("Enter the number of products to be added from stock: ");
		System.out.println();
		product.AddProducts(quantity);
		System.out.println();
		System.out.println("Update data: " + product);
		System.out.println();
		
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextDouble();
		System.out.println();
		product.RemoveProducts(quantity);
		System.out.println();
		System.out.println("Update data: " + product);
		
		sc.close();
	}

}
