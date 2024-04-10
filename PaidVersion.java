package Project;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PaidVersion implements Paid{
static
{
System.err.println(" _____________________________________________________________");
System.err.println("|                                                             |");
System.err.println("|                        PAID VERSION:                        |");
System.err.println("|               A Place to earn some cash...🤑💸              |");
System.err.println("|_____________________________________________________________|");
}
	@Override
	public void paid() {
		Scanner sc = new Scanner (System.in);
		ColorForProject c = new ColorForProject();
		
		System.out.println(c.ANSI_BLUE+"Enter Your Choice:"+c.ANSI_RESET);
		System.out.println(c.ANSI_ORANGE+"Enter [1] To <<ADD FUND IN WALLET >>");
		System.out.println("Enter [2] To << CHECK OUT GAMES >>");
		System.out.println("Enter [3] To << GO BACK >>"+c.ANSI_RESET);
		
		int Option = sc.nextInt();
		switch (Option) {
		case 1: {
			Formalities f = new Formalities();
			if(Formalities.mobno !=0) {
			WalletInfo w = new Wallet ();
			w.deposit();
			paid();
			}
			else {
				f.login();
				WalletInfo w = new Wallet ();
				w.deposit();
				paid();
			}
			break;
		}
		case 2:{
			paidgames();
			break;
		}
		
		case 3:{
			Formalities f = new Formalities();
			f.Selector();
			break;
		}
		default:
			System.err.println("--------------------------");
			System.err.println("Invalid Option ");
			paid();
		}
	}
	public void paidgames() {
		Scanner sc = new Scanner (System.in);
		ColorForProject c = new ColorForProject();
		
		System.out.println(c.ANSI_BLUE+"Enter Your Choice:"+c.ANSI_RESET);
		System.out.println(c.ANSI_ORANGE+"Enter [1] To << DIVING DICE ROLL >>");
		System.out.println("Enter [2] To << COLOR CATCHUP  >>");
		System.out.println("Enter [3] To << PREDICTIVE NUMBERS >>");
		System.out.println("Enter [4] To << GO BACK >>"+c.ANSI_RESET);
		int Option = sc.nextInt();
		switch (Option) {
		case 1: {
			divingDice();
			break;
		}
		case 2:{
			ColourCatchup();
			break;
		}
		case 3:{
			PredictiveNumbers();
			break;
		}
		case 4:{
			Formalities f = new Formalities();
			paid();
			break;
		}
		default:
			System.err.println("--------------------------");
			System.err.println("Invalid Option ");
			paidgames();
		}
	}//end of paid method
	
//Dice Game:
	public void  divingDice() {
		Scanner sc = new Scanner (System.in);
		ColorForProject c = new ColorForProject();
		Random random = new Random();
		
		//Printing Statements
		System.out.println(c.ANSI_BLUE+"Enter Your Choice:"+c.ANSI_RESET);
		System.out.println(c.ANSI_ORANGE+"Enter [1] For << PLAY DICE ROLL >>");
		System.out.println("Enter [2] To << Go Back To Play Other Paid Game  >>"+c.ANSI_RESET);
		int option =sc.nextInt();
		
		//Validation for login 
		Formalities f=new Formalities();
		if(option==1) {
			if(f.mobno!=0){
			if(f.WalletBalance !=0) {
        System.out.println(c.ANSI_RED + "Wallet Balance: "+c.ANSI_BLACK+Formalities.WalletBalance +c.ANSI_RESET );
        System.out.println(c.ANSI_BLUE+"Enter Your Amount:"+c.ANSI_RESET);
        for(int i =0 ; i<1; i++) {
        	
			int currentamount =sc.nextInt();
			if(currentamount<=0) {
			System.err.println("Enter Amount more than 0");
			i--; }
			else if(currentamount>f.WalletBalance) {
				System.err.println("Enter Amount less than Wallet balance");
				i--; 
				}
			else {
		for(int j=0;j<1;j++) {
        System.out.println("Guess the number (1-6): ");
        int userinput = sc.nextInt();
        if (userinput < 1 || userinput > 6) {
            System.err.println("Invalid input! Please enter a number between 1 and 6.");
            j--;
            continue;
        }
        int diceRoll = random.nextInt(6) + 1; // Generate a random number between 1 and 6
        System.out.println("The dice rolled: " + diceRoll);

            if (userinput == diceRoll) {
               double balance= Formalities.WalletBalance+(currentamount*2*0.98); // Increment amount if the guess is correct
               Formalities.WalletBalance = balance;
               System.out.println(" WOW...!! You Won "+currentamount*2*0.98);
               System.out.println(c.ANSI_YELLOW+"=-=-=-=-=-=-=-=-=-=--=-=-="+c.ANSI_RESET);
               System.out.println(c.ANSI_BLUE + "Current Balance: " +c.ANSI_RESET+c.ANSI_GREEN+ Formalities.WalletBalance  +c.ANSI_RESET );
               
            }
            else{ 
            	double balance= Formalities.WalletBalance-(currentamount);
            	Formalities.WalletBalance=balance;
                System.err.println("Incorrect! You lose "+currentamount);
                System.out.println(c.ANSI_YELLOW+"=-=-=-=-=-=-=-=-=-=--=-=-="+c.ANSI_RESET);
                System.out.println(c.ANSI_BLUE + "Current Balance: " +c.ANSI_RESET+c.ANSI_RED+Formalities.WalletBalance+c.ANSI_RESET );
                }
            }}
		}            
		System.out.println(c.ANSI_BLUE+"Do You Want to Play Again: "+c.ANSI_RESET);
		System.out.println(c.ANSI_ORANGE+"Enter [1] For << YES >>");
		System.out.println("Enter [2] To << Go Back To Play Other Paid Game  >>");
		System.out.println("Enter [3] To << EXIT >>"+c.ANSI_RESET);
		int opt =sc.nextInt();
		if (opt ==1) {
			divingDice();
		}
		else if (opt==2) {
			paid(); 
		}
		else if(opt==3) {
			f.exit();
		}else {
			System.err.println("--------------------------");
			System.err.println("Invalid Option ");
			divingDice();
			}
		}//fund checker
		else {
			System.out.println("---------------------------------------------");
			System.err.println("Your Fund is Empty... Add Fund to play ($_$)");	
			WalletInfo pay =new Wallet();
			pay.deposit();
			System.out.println("---------------------------------------------");
			divingDice();
			}
			}//end of if-statement given to validate if it is login or not
			else {
				f.login();
				divingDice();
				}
			}
	else if (option==2) {
			paid();
		}
		else {
		System.err.println("--------------------------");
		System.err.println("Invalid Option ");
		divingDice();
		}
	}//end of DivingDice Method
	
//COLOR CATCHUP
	public void ColourCatchup(){
		Formalities f =new Formalities();
		Scanner sc = new Scanner (System.in);
		ColorForProject c = new ColorForProject();
		
		//for add & take a color input
		ArrayList color = new ArrayList();
		color.add("Red");
		color.add("Green");
		color.add("Violet");
		Random random = new Random();
		
		//Printing Statements
		System.out.println(c.ANSI_BLUE+"Enter Your Choice:"+c.ANSI_RESET);
		System.out.println(c.ANSI_ORANGE+"Enter [1] For << PLAY COLOR CATCHUP >>");
		System.out.println("Enter [2] To << Go Back To Play Other Paid Game  >>"+c.ANSI_RESET);
		int option =sc.nextInt();
		
		//Validation for login 
		if(option==1) {
			if(f.mobno!=0){
			if(f.WalletBalance !=0) {
				System.out.println(c.ANSI_RED + "Wallet Balance: "+c.ANSI_BLACK+Formalities.WalletBalance +c.ANSI_RESET );
		        System.out.println(c.ANSI_BLUE+"Enter Your Amount:"+c.ANSI_RESET);
		        for(int i =0 ; i<1; i++) {
					
		        	int currentamount =sc.nextInt();
					if(currentamount<=0) 
					{
						System.err.println("Enter Amount more than 0");
						i--; 
						}
					else if(currentamount>f.WalletBalance) {
						System.err.println("Enter Amount less than Wallet balance");
						i--; 
						}
					else {
		  //logic for ColourCode
	        /* TypeCast of string non-premativeDatatype 
	         * get(random.nextInt(color.size()) to get random number of color based on the size of  ArrayList */
	       String randomcolor = (String) color.get(random.nextInt(color.size()));// Generate a random color from green,red,violet
	       System.out.println("Guess the Colour"+c.ANSI_RED+"(Red "+c.ANSI_PURPLE+"/ Violet /"+c.ANSI_GREEN+" Green )"+c.ANSI_RESET);
	        for (int j=0; j<1;j++) {
	        	String userinput = sc.next();
	        	if(userinput.equalsIgnoreCase("Red")||userinput.equalsIgnoreCase("Violet")
	        			||userinput.equalsIgnoreCase("Green")) {
	        System.out.println("The Colour Output: " + randomcolor);
	        if(userinput.equalsIgnoreCase(randomcolor)) {
	        	double balance= Formalities.WalletBalance+(currentamount*2*0.98); // Increment amount if the guess is correct
	        	 Formalities.WalletBalance = balance;
	               System.out.println(" WOW...!! You Won "+currentamount*2*0.98);
	               System.out.println(c.ANSI_YELLOW+"=-=-=-=-=-=-=-=-=-=--=-=-="+c.ANSI_RESET);
	               System.out.println(c.ANSI_BLUE + "Current Balance: " +c.ANSI_RESET+c.ANSI_GREEN+ Formalities.WalletBalance  +c.ANSI_RESET );  
	            }
	            else{ 
	            	double balance= Formalities.WalletBalance-(currentamount);
	            	Formalities.WalletBalance=balance;
	                System.err.println("Incorrect! You lose "+currentamount);
	                System.out.println(c.ANSI_YELLOW+"=-=-=-=-=-=-=-=-=-=--=-=-="+c.ANSI_RESET);
	                System.out.println(c.ANSI_BLUE + "Current Balance: " +c.ANSI_RESET+c.ANSI_RED+Formalities.WalletBalance+c.ANSI_RESET );
	                } }
	        	else{
	        		System.err.println("---------------------------------------------------");
	        		System.err.println("Invalid input! Please enter a value as Red, Violet Or Green");
	        		--j;
	        	}}
	        }}            
        //After Game Over
		System.out.println(c.ANSI_BLUE+"Do You Want to Play Again: "+c.ANSI_RESET);
		System.out.println(c.ANSI_ORANGE+"Enter [1] For << YES >>");
		System.out.println("Enter [2] To << Go Back To Play Other Paid Game  >>");
		System.out.println("Enter [3] To << EXIT >>"+c.ANSI_RESET);
		int opt =sc.nextInt();
		if (opt ==1) {
			ColourCatchup();
		}
		else if (opt==2) {
			paid(); 
		}
		else if(opt==3) {
			f.exit();
		}else {
			System.err.println("--------------------------");
			System.err.println("Invalid Option ");
			ColourCatchup();
			}
        
	}else {
		System.out.println("---------------------------------------------");
		System.err.println("Your Fund is Empty... Add Fund to play ($_$)");	
		WalletInfo pay =new Wallet();
		pay.deposit();
		System.out.println("---------------------------------------------");
		ColourCatchup();
		}
		}
		else {
			f.login();
			ColourCatchup();
			}
		}
		else  if(option==2) {
			paid();
			}//end of if-statement of validating
		else {
		System.err.println("--------------------------");
		System.err.println("Invalid Option ");
		ColourCatchup();
		}
		}
//end of Color CatchUp method
	
//PredictiveNumbers
	public void PredictiveNumbers() {
		Formalities f =new Formalities();
		Scanner sc = new Scanner (System.in);
		ColorForProject c = new ColorForProject();
		Random random =new Random();
		
		//Printing Statements
		System.out.println(c.ANSI_BLUE+"Enter Your Choice:"+c.ANSI_RESET);
		System.out.println(c.ANSI_ORANGE+"Enter [1] For << PLAY Hard Mode (Number Prediction) >>");
		System.out.println(c.ANSI_ORANGE+"Enter [2] For << PLAY ODD EVEN >>");
		System.out.println(c.ANSI_ORANGE+"Enter [3] For << PLAY BIG SMALL >>");
		System.out.println("Enter [4] To << Go Back To Play Other Paid Game  >>"+c.ANSI_RESET);
		int option =sc.nextInt();
		
		//start of HardLevel
			if(option==1) {
				if(f.mobno!=0) {
				if(f.WalletBalance !=0) {
				System.out.println(c.ANSI_RED + "Wallet Balance: "+c.ANSI_BLACK+Formalities.WalletBalance +c.ANSI_RESET );
				System.out.println(c.ANSI_BLUE+"Enter Your Amount:"+c.ANSI_RESET);
				
				for(int i =0 ; i<1; i++) {
				int currentamount =sc.nextInt();
				if(currentamount<=0) {
					System.err.println("Enter Amount more than 0");
					i--; }
				else if(currentamount>f.WalletBalance) {
					System.err.println("Enter Amount less than Wallet balance");
					i--; 
					}
				else {
				//game logic
				for (int j= 0;j<1;j++) {
	        	System.out.println("Guess the number (1-9): ");
	            int userinput = sc.nextInt();
	            if (userinput < 1 || userinput > 9) {
	                System.err.println("Invalid input! Please enter a number between 1 and 9.");
	                j--;
	                continue;
	            }
	            int numeric= random.nextInt(9) + 1; // Generate a random number between 1 and 6
	            System.out.println("Number Forcasted : " + numeric);

	            if (userinput == numeric) {
	            	double balance= Formalities.WalletBalance+(currentamount*5*0.98); // Increment amount if the guess is correct
		        	 Formalities.WalletBalance = balance;
		               System.out.println(" WOW...!! You Won "+currentamount*5*0.98);
		               System.out.println(c.ANSI_YELLOW+"=-=-=-=-=-=-=-=-=-=--=-=-="+c.ANSI_RESET);
		               System.out.println(c.ANSI_BLUE + "Current Balance: " +c.ANSI_RESET+c.ANSI_GREEN+ Formalities.WalletBalance  +c.ANSI_RESET );  
		            }
		            else{ 
		            	double balance= Formalities.WalletBalance-(currentamount);
		            	Formalities.WalletBalance=balance;
		                System.err.println("Incorrect! You lose "+currentamount);
		                System.out.println(c.ANSI_YELLOW+"=-=-=-=-=-=-=-=-=-=--=-=-="+c.ANSI_RESET);
		                System.out.println(c.ANSI_BLUE + "Current Balance: " +c.ANSI_RESET+c.ANSI_RED+Formalities.WalletBalance+c.ANSI_RESET );
		                }
	            }
				}
				}   
	          //After Game Over
	    		System.out.println(c.ANSI_BLUE+"Do You Want to Play Again: "+c.ANSI_RESET);
	    		System.out.println(c.ANSI_ORANGE+"Enter [1] For << YES >>");
	    		System.out.println("Enter [2] To << Go Back To Play Other Paid Game  >>");
	    		System.out.println("Enter [3] To << EXIT >>"+c.ANSI_RESET);
	    		int opt =sc.nextInt();
	    		if (opt ==1) {
	    			PredictiveNumbers();
	    		}
	    		else if (opt==2) {
	    			paid(); 
	    		}
	    		else if(opt==3) {
	    			f.exit();
	    		}else {
	    			System.err.println("--------------------------");
	    			System.err.println("Invalid Option ");
	    			PredictiveNumbers();
	    			}
	            
	    	}else {
	    		System.out.println("---------------------------------------------");
	    		System.err.println("Your Fund is Empty... Add Fund to play ($_$)");	
	    		WalletInfo pay =new Wallet();
	    		pay.deposit();
	    		System.out.println("---------------------------------------------");
	    		PredictiveNumbers();
	    		}
				}
	    		else {
	    			f.login();
	    			PredictiveNumbers();
	    			}
				}		
		//end of hard mode
		
		//start of odd even
			if(option==2) {
				if(f.mobno!=0) {
				if(f.WalletBalance !=0) {
				System.out.println(c.ANSI_RED + "Wallet Balance: "+c.ANSI_BLACK+Formalities.WalletBalance +c.ANSI_RESET );
				System.out.println(c.ANSI_BLUE+"Enter Your Amount:"+c.ANSI_RESET);
				for(int i =0 ; i<1; i++) {
					int currentamount =sc.nextInt();
					if(currentamount<=0) {
						System.err.println("Enter Amount more than 0");
						i--; }
					else if(currentamount>f.WalletBalance) {
						System.err.println("Enter Amount less than Wallet balance");
						i--; 
						}
					else {
				String num;
				//game logic
	        	System.out.println("Guess the Output (Odd/Even): ");
	        	for(int j=0; j<1;j++) {
	            String userinput = sc.next();
	            if(userinput.equalsIgnoreCase("Odd")||userinput.equalsIgnoreCase("Even")) {
	            int numeric= random.nextInt(9) + 1; // Generate a random number between 1 and 6
	            
	            if(numeric%2==0) {
	        	   
	            num ="Even";
	           }else{
	        	   num="Odd";
	           }
	            System.out.println("Output Forcasted: "+num);
	            
	            if (userinput.equalsIgnoreCase(num)) {
	            	double balance= Formalities.WalletBalance+(currentamount*2*0.98); // Increment amount if the guess is correct
		        	 Formalities.WalletBalance = balance;
		               System.out.println(" WOW...!! You Won "+currentamount*2*0.98);
		               System.out.println(c.ANSI_YELLOW+"=-=-=-=-=-=-=-=-=-=--=-=-="+c.ANSI_RESET);
		               System.out.println(c.ANSI_BLUE + "Current Balance: " +c.ANSI_RESET+c.ANSI_GREEN+ Formalities.WalletBalance  +c.ANSI_RESET );  
		            }
		            else{ 
		            	double balance= Formalities.WalletBalance-(currentamount);
		            	Formalities.WalletBalance=balance;
		                System.err.println("Incorrect! You lose "+currentamount);
		                System.out.println(c.ANSI_YELLOW+"=-=-=-=-=-=-=-=-=-=--=-=-="+c.ANSI_RESET);
		                System.out.println(c.ANSI_BLUE + "Current Balance: " +c.ANSI_RESET+c.ANSI_RED+Formalities.WalletBalance+c.ANSI_RESET );
		                }} else{
			            	System.err.println("------------------------------------------------");
			            	System.err.println("Invalid input! Please enter a value as Even Or Odd");
			        		--j;}
	            }}  
	        	}
				
	          //After Game Over
	    		System.out.println(c.ANSI_BLUE+"Do You Want to Play Again: "+c.ANSI_RESET);
	    		System.out.println(c.ANSI_ORANGE+"Enter [1] For << YES >>");
	    		System.out.println("Enter [2] To << Go Back To Play Other Paid Game  >>");
	    		System.out.println("Enter [3] To << EXIT >>"+c.ANSI_RESET);
	    		int opt =sc.nextInt();
	    		if (opt ==1) {
	    			PredictiveNumbers();
	    		}
	    		else if (opt==2) {
	    			paid(); 
	    		}
	    		else if(opt==3) {
	    			f.exit();
	    		}else {
	    			System.err.println("--------------------------");
	    			System.err.println("Invalid Option ");
	    			PredictiveNumbers();
	    			}
	            
	    	}else {
	    		System.out.println("---------------------------------------------");
	    		System.err.println("Your Fund is Empty... Add Fund to play ($_$)");	
	    		WalletInfo pay =new Wallet();
	    		pay.deposit();
	    		System.out.println("---------------------------------------------");
	    		PredictiveNumbers();
	    		}
				}
	    		else {
	    			f.login();
	    			PredictiveNumbers();
	    			}
				}	//end of Odd/even mode
		
		//Big/Small
			if(option==3) {
			if(f.mobno!=0) {
				if(f.WalletBalance !=0) {
				System.out.println(c.ANSI_RED + "Wallet Balance: "+c.ANSI_BLACK+Formalities.WalletBalance +c.ANSI_RESET );
				System.out.println(c.ANSI_BLUE+"Enter Your Amount:"+c.ANSI_RESET);
				for(int i =0 ; i<1; i++) {
					int currentamount =sc.nextInt();
					if(currentamount<=0) {
						System.err.println("Enter Amount more than 0");
						i--; }
					else if(currentamount>f.WalletBalance ) {
						System.err.println("Enter Amount less than Wallet balance");
						i--; 
						}
					else {
				String num;
				
	        	System.out.println("Guess the Output (Big/Small): ");
	        	for(int j=0; j<1;j++) {
		            String userinput = sc.next();
		            if(userinput.equalsIgnoreCase("Big")||userinput.equalsIgnoreCase("Small")) {
	            int numeric= random.nextInt(9) + 1; // Generate a random number between 1 and 6
	            
	            if(numeric<5) {
	        	   
	        	 num ="Big";
	           }else{
	        	   num="Small";
	           }
	            System.out.println("Output Forcasted: "+num);
	            
	            if (userinput.equalsIgnoreCase(num)) {
	            	double balance= Formalities.WalletBalance+(currentamount*2*0.98); // Increment amount if the guess is correct
		        	 Formalities.WalletBalance = balance;
		               System.out.println(" WOW...!! You Won "+currentamount*2*0.98);
		               System.out.println(c.ANSI_YELLOW+"=-=-=-=-=-=-=-=-=-=--=-=-="+c.ANSI_RESET);
		               System.out.println(c.ANSI_BLUE + "Current Balance: " +c.ANSI_RESET+c.ANSI_GREEN+ Formalities.WalletBalance  +c.ANSI_RESET );  
		            }
		            else{ 
		            	double balance= Formalities.WalletBalance-(currentamount);
		            	Formalities.WalletBalance=balance;
		                System.err.println("Incorrect! You lose "+currentamount);
		                System.out.println(c.ANSI_YELLOW+"=-=-=-=-=-=-=-=-=-=--=-=-="+c.ANSI_RESET);
		                System.out.println(c.ANSI_BLUE + "Current Balance: " +c.ANSI_RESET+c.ANSI_RED+Formalities.WalletBalance+c.ANSI_RESET );
		                } }
		            else{
	            	System.err.println("------------------------------------------------");
	            	System.err.println("Invalid input! Please enter a value as Big Or Small");
	        		--j;}
					}} }   
	          //After Game Over
	    		System.out.println(c.ANSI_BLUE+"Do You Want to Play Again: "+c.ANSI_RESET);
	    		System.out.println(c.ANSI_ORANGE+"Enter [1] For << YES >>");
	    		System.out.println("Enter [2] To << Go Back To Play Other Paid Game  >>");
	    		System.out.println("Enter [3] To << EXIT >>"+c.ANSI_RESET);
	    		int opt =sc.nextInt();
	    		if (opt ==1) {
	    			PredictiveNumbers();
	    		}
	    		else if (opt==2) {
	    			paid(); 
	    		}
	    		else if(opt==3) {
	    			f.exit();
	    		}else {
	    			System.err.println("--------------------------");
	    			System.err.println("Invalid Option ");
	    			PredictiveNumbers();
	    			}
	            
	    	}else {
	    		System.out.println("---------------------------------------------");
	    		System.err.println("Your Fund is Empty... Add Fund to play ($_$)");	
	    		WalletInfo pay =new Wallet();
	    		pay.deposit();
	    		System.out.println("---------------------------------------------");
	    		PredictiveNumbers();
	    		}
				}
	    		else{
	    			f.login();
	    			PredictiveNumbers();
	    			}	
				}//end of big/small
			else if (option==4) {
				paid(); 
				}
			else {
	    			System.err.println("--------------------------");
	    			System.err.println("Invalid Option ");
	    			PredictiveNumbers();
			}
			}//end of predictive method	
}
	 



