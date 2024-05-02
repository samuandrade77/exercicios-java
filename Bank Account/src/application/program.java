package application;

import java.util.Scanner;

import entities.Account;

public class program {

	public static void main(String[] args) {
		Account account;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter account number:");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder:");
		String name = sc.nextLine();
		System.out.print("Is there initial deposit (y/n)?");
		char init = sc.next().charAt(0)

		if (init == 'y') {
			System.out.print("Enter initial deposit value:");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, name, initialDeposit);}
		
		else {
			account = new Account(number, name);}

		System.out.println("Account data:");
		System.out.println(account.toString());
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();	
		account.deposit(deposit);
		System.out.println("Updated account data:");
		System.out.println(account.toString());
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		double wd = sc.nextDouble();
		account.withdraw(wd);
		System.out.println("Updated account data:");
		System.out.println(account.toString());

		sc.close();}}


