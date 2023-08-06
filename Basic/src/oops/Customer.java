package oops;

import java.util.Scanner;

public class Customer {
	private String name;
	private int id;
	private int balance;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBalance() {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the Amount");
		int amountDeduct=sc.nextInt();
		int availableAmount=balance-amountDeduct;
		return availableAmount;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
