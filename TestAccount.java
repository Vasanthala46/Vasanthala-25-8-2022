package com.Bank.demo;


	import java.util.Scanner;

	 class BankAccount  {
		
		private double Deposit;
		private boolean Withdraw;
		private double Balance;
		
		
 }
	 
	 
	 class SavingsAccount extends BankAccount {
		 
		 private double MIN_BALANCE = 5000;
		 
		 private String customerid;
		 private String name;
		 private double balance;
		 
		 public SavingsAccount() {
			 
		 }
		 
		 public SavingsAccount(String customerid,String name,double balance) {
			 
			 super();
			 this.customerid = customerid;
			 this.name = name;
			 this.balance = balance;

		   }
		 
		 public SavingsAccount(String customerid,String name) {
			 
			 super();
			 this.customerid = customerid;
			 this.name = name;
			 
		 	}

			public double getBalance() {
				return balance;
			}
			
			
			
			public void Deposit(double amount) {
				balance += amount;
				
			}
			
			public boolean Withdraw(double amount) {
				
				if(amount <= (balance-MIN_BALANCE)) {
					balance -= amount;
					
					return true;
				}
				return false;
				
		}
			@Override
			public String toString() {
				return "SavingsAccount [customerid = " + customerid + ", name = " + name + ", balance = " + balance + "]";
			}
			
			
		  }

	public class TestAccount {

			public static void main(String args[]) {

			Scanner sc = new Scanner(System.in);

			SavingsAccount b = new SavingsAccount( "IT001" , "Vasanthala", 5000 );
			
			System.out.println(b);
			
			System.out.println("Enter the  numbers to process : ");
			
			System.out.println("1.Balance ");
			System.out.println("2.Deposit ");
			System.out.println("3.Withdrew ");
			System.out.println("4.Exit ");

			int a = sc.nextInt();

			if(a==1) {

			System.out.println("The Balance Amount is : " + b.getBalance());
			
			}
			
			else if(a==2) {
				
			System.out.println("Enter the amount to doposit : ");
			
			int e = sc.nextInt();
			b.Deposit(e);
			
			System.out.println("After deposit your current balance is : " + b.getBalance());
			
			}
			
			else if(a==3) {
				
			System.out.println("Enter the amount to withdrew : ");
			
			int d = sc.nextInt();
			//b.Withdraw(d);
			
			//System.out.println("After withdraw your current balance is : " + b.getBalance());
			if(b.Withdraw(d)) {
				
				System.out.println("After withdraw your current balance is : " + b.getBalance());
			}
			
			else {
				System.out.println("There is no enough balance in your account"); 
			}
			
			}
			
			else {
				
			System.out.println("Thank you. Visit again..... ");
			
			}
			
			sc.close();
			
			}    

			
		
}
