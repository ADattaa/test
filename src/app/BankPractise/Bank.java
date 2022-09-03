package app.BankPractise;

import java.util.Random;
import java.util.Scanner;

public class Bank {
	
	private int totalBalance = 0;
	
	//available balance
	private void balance() {
		int otp = new Random().nextInt();
		System.out.println("otp for balance checking "+" "+otp);
		System.out.print("enter otp here");
		int otp1 = new Scanner(System.in).nextInt();
		if(otp1 == otp) {
			System.out.println("available balance \t"+totalBalance);
			System.out.println("thank you");
		}	
	}
	//deposit amount
	private int deposit() {
		int otp = new Random().nextInt();
		System.out.println("your OTP number  "+ otp+" for transaction" );
		//System.out.println(otp);
		System.out.print("enter otp here ");
		int otp1 = new Scanner(System.in).nextInt();
		//OTP should match then only you can deposit
		if(otp1 == otp) {
			System.out.print("enter deposit amount \t");
			int deposit = new Scanner(System.in).nextInt();
			totalBalance = totalBalance + deposit;
			System.out.println("after deposit, avilable balance \t"+totalBalance);
			//withdraw option
			System.out.println("are you want to withdraw amount ?, if it is type s else n ");
			//take response from end user
			String response = new Scanner(System.in).next();
			if(response.equalsIgnoreCase("s")) {
				withdrawnAmount();
			}
			else {
				System.out.println("thankyou for banking");
			}
		}
		//incase OTP fails
		else {
			System.out.println("enter correct otp, try again thyank you");
		}
		return totalBalance;
	}
	//withdraw option
	private int withdraw() {
		System.out.println("enter withdraw amount");
		//taking the amount from user
		int withdrawMoney = new Scanner(System.in).nextInt();
		if (withdrawMoney < totalBalance && withdrawMoney >= 100) {
			int minBalance = 100;
			totalBalance = totalBalance - withdrawMoney;
			if(totalBalance >= minBalance) {
				System.out.println("transaction succesful");
//				System.out.println("thankyou");
				System.out.println("are you want to see balance ?, if it is type s else n ");
				//take response from end user
				String response = new Scanner(System.in).next();
				if(response.equalsIgnoreCase("s")) {
					balanceInfo();;
				}
				else {
					System.out.println("thankyou for banking");
				}
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
	//String bankingOption = "";
	public void bankingScreen() {
		System.out.println("welcome to our services");
		System.out.println("1 for balance");
		System.out.println("2 for  deposit");
		System.out.println("3 for withdraw");
		System.out.print("enter option \t");
		int bankingOption = new Scanner(System.in).nextInt();
		screening(bankingOption);
	}
	public void screening(int a) {
		switch (a) {
		case 1: 
			new BankOperations().balanceInfo();
			break;

		case 2:
			new BankOperations().depositAmount();
			break;
			
		case 3:
			new BankOperations().withdrawnAmount();
			break;
		default:
			System.out.println("enter correctly");
		}
	}
	
	public static void main(String[] args) {
		BankOperations bankOperantions = new BankOperations();
		bankOperantions.bankingScreen();
//		bankOperantions.balanceInfo();
//		bankOperantions.depositAmount();
//		bankOperantions.withdrawnAmount();
	}
}
