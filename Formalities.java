package Project;
import java.util.Random;
import java.util.Scanner;

public class Formalities {
		private String fname;
		private String lname;
		private String address;
		private String email;
		private String password;
		static long mobno;
		static double WalletBalance;
		static long bankAc;
		public String getFname()
		{
			return fname;
		}
		public void setFname(String fname)
		{
			this.fname = fname;
		}
		
		public String getLname()
		{
			return lname;
		}
		public void setLname(String lname)
		{
			this.lname = lname;
		}
		
		public String getAddress()
		{
			return address;
		}
		public void setAddress(String address)
		{
			this.address = address;
		}
		
		public String getEmail()
		{
			return email;
		}
		public void setEmail(String email)
		{
			this.email = email;
		}
		
		public String getPassword()
		{
			return password;
		}
		public void setPassword(String password)
		{
			this.password = password;
		}
		
		public long getMobno()
		{
			return mobno;
		}
		public void setMobno()
		{
			Scanner s= new Scanner(System.in);
			System.out.println("enter mobile number");
			long mobno = s.nextLong();
			if (mobno > 999999999 && mobno < 10000000000L) {
				this.mobno = mobno;
			}
			else {
				System.err.println("invalid mob no");
				setMobno();
			}
			
		}
		
		public void signup()
		{
			ColorForProject c = new ColorForProject();
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the first name");
			String fname = s.next();
			setFname(fname);
			System.out.println("enter last name");
			s.nextLine();
			String lname = s.nextLine();
			setLname(lname);
			System.out.println("enter address");
			String address = s.nextLine();
			setAddress(address);
			System.out.println("enter email");
			String email = s.next();
			setEmail(email);
			System.out.println("enter password");
			String pwd = s.next();
			setPassword(pwd);
			setMobno();
			System.out.println(c.ANSI_PURPLE+"Signup sucessfull...!!"+c.ANSI_RESET);
			login();
		}
		public void login()
		{
			ColorForProject c = new ColorForProject();
			System.out.println(c.ANSI_GREEN+"-==-=-=-=-=-=-=-=-=-=-=-=-=-");
			System.out.println("           LOGIN:           ");
			System.out.println("-==-=-=-=-=-=-=-=-=-=-=-=-=-"+c.ANSI_RESET);
			if(fname != null) {
			Scanner s = new Scanner(System.in);
			System.out.println(c.ANSI_BLUE+"Enter Your Choice:"+c.ANSI_RESET);
			System.out.println("| 1.Login with mobile number ");
			System.out.println("| 2.Login with Email ID ");
			int a = s.nextInt();
			if (a==1) {
				System.out.println("Enter registered mobile number");
				long mobno = s.nextLong();
				System.out.println("enter your password");
				String pwd = s.next();
				
				if (this.mobno == mobno && this.password.equals(pwd)) {
					System.out.println(c.ANSI_PURPLE+"Login Sucessful!!"+c.ANSI_RESET);
					
				}else {
					System.err.println("invalid mobile number or password");
					login();
				}
			}
			else if (a==2) {
				System.out.println("enter email ID");
				String email = s.next();
				System.out.println("enter password");
				String pwd = s.next();
				if (this.email.equals(email) && this.password.equals(pwd)) {
					System.out.println(c.ANSI_PURPLE+"Login Sucessfull...!!"+c.ANSI_RESET); 
				}else {
					System.err.println("Invalid input");
					login();
				}
			}else {
				System.err.println("Invalid input");
				login();
			}	
			}else {
				System.err.println("First create account for logining");
				signup();
			}
		}
		public void Selector () {
			Scanner sc = new Scanner (System.in);
			ColorForProject c = new ColorForProject();
			
			System.out.println(c.ANSI_BLUE+"Select Version"+c.ANSI_RESET);
			System.out.println(c.ANSI_ORANGE+"Enter [1] To Play << Free Version >>");
			System.out.println("Enter [2] To Play << Paid Version >>");
			System.out.println("Enter [3] To << Exit >>"+c.ANSI_RESET);
			int a = sc.nextInt ();
			switch (a) {
			case 1: {
				Free f = new FreeVersion();
				f.free();
				break
				;
			}case 2:{
				Paid p = new PaidVersion();
				p.paid();
				break;
			}
			case 3:{
				exit();
				break;
			}
			default:
				System.err.println("Invalid Option");
				System.out.println("-----------------------");
				Selector();
			}
		}
 //exit option
		public void exit(){
			Scanner sc = new Scanner (System.in);
			ColorForProject c = new ColorForProject();
			System.out.println(c.ANSI_BLUE+"Do You Want To Exit"+c.ANSI_RESET);
			System.out.println(c.ANSI_ORANGE+"Enter [1] To << YES >>");
			System.out.println("Enter [2] To << NO >>"+c.ANSI_RESET);
			int opt = sc.nextInt();
			if (opt==1) {if(WalletBalance !=0){
			System.out.println(c.ANSI_BLUE+"Enter Bank Account :"+c.ANSI_RESET);
			bankAc =sc.nextLong();
			validate();
			System.out.println(c.ANSI_YELLOW+"Since your Winning is "+c.ANSI_GREEN+WalletBalance);
			System.out.println(c.ANSI_YELLOW+"The Amount will be transfered in your bank A/c: "+c.ANSI_GREEN+bankAc+c.ANSI_RESET);
			System.exit(0);
		}
			else{
				System.out.println(c.ANSI_PURPLE+"Thank you ! Visit Again...."+c.ANSI_RESET);
				System.exit(0);
			}
			}
		else if (opt==2) {
			Contents.main(null);
		}
		else {
			System.err.println("Invalid Option");
			System.err.println("-----------------------");
		    exit();
		}
		}
		
		//for validating bank A/c
		public void validate() {
			Scanner sc = new Scanner (System.in);
			ColorForProject c = new ColorForProject();
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
			System.out.println(c.ANSI_BLUE+"Verify your registered mobile number"+c.ANSI_RESET);
			long mobilenumber = sc.nextLong();
			if (mobilenumber == Formalities.mobno) {
				int a = 9999;
				Random r = new Random();
				int o = r.nextInt(a);
				while (o < 999) {
					o = r.nextInt(a);
				} // end of while-loop
				System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				System.out.println(c.ANSI_BLUE+"Generated OTP: " +c.ANSI_GREEN+ o+c.ANSI_RESET);
				System.out.println("Enter the OTP displayed Above:");
				int otp = sc.nextInt();
				if (otp == o) {
					System.out.println("Bank Account Added Successfull..");
				}
				else {
					System.err.println("Invalid OTP");
					validate();
				}
				}
		   else {
			   System.err.println("Enter Your Mobile Number Wisely:");
			  	validate();
			}
		}
}
