package Project;

import java.util.Random;
import java.util.Scanner;


public class Wallet implements WalletInfo{


public void deposit(){
	Scanner sc = new Scanner(System.in);
	ColorForProject c = new ColorForProject();
	System.out.println(c.ANSI_BLUE+"Select Payment Method"+c.ANSI_RESET);
	System.out.println(c.ANSI_ORANGE+"Enter [1] To Pay With<< UPI >>");
	System.out.println("Enter [2] To << GO BACK >>"+c.ANSI_RESET);
	int a = sc.nextInt ();
	if(a==1) {
		System.out.println(c.ANSI_BLUE+"Select UPI"+c.ANSI_RESET);
		System.out.println(c.ANSI_ORANGE+"Enter [1] To Pay With<< Phone Pay >>");
		System.out.println(c.ANSI_ORANGE+"Enter [2] To Pay With<< GPay >>");
		System.out.println(c.ANSI_ORANGE+"Enter [3] To Pay With<< PayTm >>");
		System.out.println(c.ANSI_ORANGE+"Enter [4] To << Go Back >>"+c.ANSI_RESET);
		int option =sc.nextInt();
		switch (option) {
		case 1: {
			
			phonePay();
			break;
		}
		case 2:{
			GPay();
			break;
	
		}
		case 3:{
			PayTM();
			break;
		}
		case 4:{
			
			deposit();
			break;
		}
		default:
			System.err.println("Invalid Option ");
			deposit();
		}
		
		
	}
	else if (a==2) {
		Paid p = new PaidVersion();
		p.paid();
	}
	else {
		System.err.println("Invalid Option");
		System.err.println("-----------------------");
		deposit();
	}
}
public void phonePay() {
	Scanner s = new Scanner(System.in);
	ColorForProject c = new ColorForProject();
	System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
	System.out.println(c.ANSI_BLUE+"Verify your registered mobile number"+c.ANSI_RESET);
	long mobilenumber = s.nextLong();
	if (mobilenumber == Formalities.mobno) {
		
		otp();
		}
   else {
	   System.err.println("Enter Your Mobile Number Wisely:");
	  	phonePay();
	}
	}

public void GPay() {
	Scanner s = new Scanner(System.in);
	ColorForProject c = new ColorForProject();
	System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
	System.out.println(c.ANSI_BLUE+"Verify your registered mobile number"+c.ANSI_RESET);
	long mobilenumber = s.nextLong();
	if (mobilenumber == Formalities.mobno) {
		
		otp();
		}
   else {
	   System.err.println("Enter Your Mobile Number Wisely:");
	  	GPay();
	}
	}

public void PayTM() {
	Scanner s = new Scanner(System.in);
	ColorForProject c = new ColorForProject();
	System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
	System.out.println(c.ANSI_BLUE+"Verify your registered mobile number"+c.ANSI_RESET);
	long mobilenumber = s.nextLong();
	if (mobilenumber == Formalities.mobno) {
		
		otp();
		}
   else {
	   System.err.println("Enter Your Mobile Number Wisely:");
	  	PayTM();
	}
	}
		
public void otp() {
	ColorForProject c = new ColorForProject();
	Scanner s = new Scanner(System.in);
		int a = 9999;
		Random r = new Random();
		int o = r.nextInt(a);
		while (o < 999) {
			o = r.nextInt(a);
		} // end of while-loop
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println(c.ANSI_BLUE+"Generated OTP: " +c.ANSI_GREEN+ o+c.ANSI_RESET);
		System.out.println("Enter the OTP displayed Above:");
		int otp = s.nextInt();
		if (otp == o) {
		System.out.println("Enter Amount Minimum 100 RS");
		double amount =s.nextInt();
		if(amount>=100) {
		Formalities.WalletBalance=amount;
		System.out.println(c.ANSI_GREEN+"The Amount is successfully added "+c.ANSI_RESET); 
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println(c.ANSI_CYAN+"Wallet Balance: "+c.ANSI_GREEN+Formalities.WalletBalance+c.ANSI_RESET);
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		}else {
			System.err.println("Enter Minimum 100 RS");
			deposit();
		}
}
	else {
	otp();
}
		}
}
