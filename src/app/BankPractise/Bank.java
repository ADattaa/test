package app.BankPractise;

import java.util.Random;
import java.util.Scanner;

public class Bank {
	
	private int totalBalance = 0;
//	int minBalance = 100;
//	String otp = "";
	private void balance() {
		int otp = new Random().nextInt();
		System.out.println(otp);
		System.out.println("enter otp");
		int otp1 = new Scanner(System.in).nextInt();
		if(otp1 == otp) {
			System.out.println("available balance \t"+totalBalance);
			System.out.println("thank you");
		}	
	}
	private int deposit() {
		int otp = new Random().nextInt();
		System.out.println(otp);
		System.out.println("enter otp");
		int otp1 = new Scanner(System.in).nextInt();
		if(otp1 == otp) {
			System.out.print("enter deposit amount \t");
			int deposit = new Scanner(System.in).nextInt();
			totalBalance = totalBalance + deposit;
			System.out.println("after deposit, avilable balance \t"+totalBalance);
			System.out.println("are you want to withdraw amount ?, if it is type s else n ");
			String response = new Scanner(System.in).next();
			if(response.equalsIgnoreCase("s")) {
				withdrawnAmount();
			}
			else {
				System.out.println("thankyou for banking");
			}
		}
		else {
			System.out.println("otp failed, try again thyank you");
		}
		return totalBalance;
	}
	private int withdraw() {
		System.out.println("enter withdraw amount");
		int withdrawMoney = new Scanner(System.in).nextInt();
		if (withdrawMoney < totalBalance && withdrawMoney > 100) {
			int minBalance = 100;
			totalBalance = totalBalance - withdrawMoney;
			if(totalBalance >= minBalance) {
				System.out.println("after withdrawn, avilable balance \t"+totalBalance);
				System.out.println("thankyou");
			}
			else {
				System.out.println("insufficent fund");
			}	
		}
		else {
			System.out.println("min balance should be 100rs");
			System.out.println("thankyou");
		}
		return totalBalance;
	}
	public void balanceInfo() {
		balance();
	}
	public void depositAmount() {
		deposit();

	}
	public void withdrawnAmount() {
		withdraw();
	}
	public static void main(String[] args) {
		
	}
}
class BankOperations extends Bank{
	String bankingOption = "";
	public void bankingScreen() {
		System.out.println("welcome to our services");
		System.out.println("1 for balance");
		System.out.println("2 for  deposit");
		System.out.println("3 for withdraw");
		System.out.print("enter option \t");
		bankingOption = new Scanner(System.in).next();
//		switch(bankingOption)
	}
	
	public static void main(String[] args) {
		BankOperations bankOperantions = new BankOperations();
//		bankOperantions.bankingScreen();
		bankOperantions.depositAmount();
//		bankOperantions.depositAmount();
//		bankOperantions.withdrawnAmount();
	}
}
