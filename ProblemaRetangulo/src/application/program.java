package application;

import java.util.Scanner;

import entities.Rectangle;

public class program {

	public static void main(String[] args) {
		Rectangle rectangle;
		
		rectangle = new Rectangle();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle widht and height: ");
		rectangle.wid = sc.nextDouble();
		rectangle.hei = sc.nextDouble();
		
		System.out.println("Area: " + rectangle.area());
		System.out.println("Perimeter: " + rectangle.perimeter());
		System.out.println("Diagonal: "+ rectangle.diagonal());
		sc.close();
	}

}
