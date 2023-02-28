package bank;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
	public class Bank {
	    public static void main(String[] args){
	    	PrintStream display=new PrintStream((new FileOutputStream(FileDescriptor.out)));
	    	Scanner scan = new Scanner(System.in);
	    	Scanner scan1 = new Scanner(System.in);
	    	String accountnumber;
	    	String holdername;
	    	double amount;
	    	int choice;
	    	double depositeamount;
	    	double withdrawamount;
	    	display.println("Enter the Details to create account :");
	    	display.print("Account Number : ");
	    	accountnumber = scan.nextLine();
	    	display.print("Account Holder's Name : ");
	    	holdername =  scan.nextLine();
	    	display.print("Balace Amount : ");
	    	amount = scan1.nextDouble();
	        Account obj = new Account(accountnumber , holdername ,amount);
	        display.println("Enter the choice you want :\n 1.Deposite\n 2.Withdraw \n 3.Check Balance Enquiry");
	        choice = scan1.nextInt();
	        switch(choice) {
	        case 1:
	        	display.println("Enter the amount to deposite:");
	        	depositeamount = scan1.nextDouble();
	        	obj.deposite(depositeamount);
	        	break;
	        case 2:
	        	display.println("Enter the amount to withdraw:");
	        	withdrawamount = scan1.nextDouble();
	        	obj.withdraw(withdrawamount);
	        	break;
	        case 3:
	        	display.print("YOUR CURRENT BALANCE IS "+obj.display());
	        	break;
	        default:
	        	display.println("Invalid choice");
	        }
	        display.println("\n---------Thank You----------");
	    }
	    
	}

