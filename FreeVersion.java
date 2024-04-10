package Project;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FreeVersion implements Free{
	static
	{
	System.err.println(" _____________________________________________________________");
	System.err.println("|                                                             |");
	System.err.println("|                       FREE VERSION:                         |");
	System.err.println("|     Unlock the power of prediction with free version...🎮   |");
	System.err.println("|_____________________________________________________________|");
	}
	public void free() {
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
			f.Selector();
			break;
		}
		default:
			System.err.println("--------------------------");
			System.err.println("Invalid Option ");
			free();
		}
	}//end of free method
	
//Dice Game:
	public void  divingDice() {
		Scanner sc = new Scanner (System.in);
		ColorForProject c = new ColorForProject();
		Random random = new Random();
		
		//Printing Statements
		System.out.println(c.ANSI_BLUE+"Enter Your Choice:"+c.ANSI_RESET);
		System.out.println(c.ANSI_ORANGE+"Enter [1] For << PLAY DICE ROLL >>");
		System.out.println("Enter [2] To << Go Back To Play Other Free Game  >>"+c.ANSI_RESET);
		int option =sc.nextInt();
		
		//Validation for login 
		Formalities f=new Formalities();
		if(option==1) {
			if(f.mobno!=0){
        int lives = 5; // Initial number of lives
        int score = 0; // Initial score
        
        System.out.println(c.ANSI_RED + "Lives ❤ : " + lives + c.ANSI_RESET);
        for (int i = 1; i <=lives; i++) { // Loop until lives are exhausted
           
        	System.out.println("Guess the number (1-6): ");
            int userinput = sc.nextInt();
            if (userinput < 1 || userinput > 6) {
                System.err.println("Invalid input! Please enter a number between 1 and 6.");
                i--;
                continue;
            }
            int diceRoll = random.nextInt(6) + 1; // Generate a random number between 1 and 6
            System.out.println("The dice rolled: " + diceRoll);

            if (userinput == diceRoll) {
                score++; // Increment score if the guess is correct
                System.out.println(c.ANSI_YELLOW+"=-=-=-=-=-=-=-=-=-=--=-=-="+c.ANSI_RESET);
                System.out.println(c.ANSI_BLUE + "Correct! Score: " +c.ANSI_RESET+c.ANSI_GREEN+ score +c.ANSI_RESET );
                System.out.println(c.ANSI_BLUE +"Lives Remains ❤: "+c.ANSI_RESET+c.ANSI_GREEN+(lives-i+1)+c.ANSI_RESET);
                lives++;
            } else{ 
            	System.out.println(c.ANSI_YELLOW+"=-=-=-=-=-=-=-=-=-=--=-=-="+c.ANSI_RESET);
            	System.err.println("Lives Remains ❤: "+(lives-i));
                System.err.println("Incorrect!");
                System.out.println(c.ANSI_YELLOW+"=-=-=-=-=-=-=-=-=-=--=-=-="+c.ANSI_RESET);
                System.out.println(c.ANSI_BLUE + "Correct! Score: " +c.ANSI_RESET+c.ANSI_RED+ score +c.ANSI_RESET );
            }            
        } System.err.println("!!! Game Over 😓!!!");
        //end of for loop 
        
        //After Game Over
		System.out.println(c.ANSI_BLUE+"Do You Want to Play Again: "+c.ANSI_RESET);
		System.out.println(c.ANSI_ORANGE+"Enter [1] For << YES >>");
		System.out.println("Enter [2] To << Go Back To Play Other Free Game  >>");
		System.out.println("Enter [3] To << EXIT >>"+c.ANSI_RESET);
		int opt =sc.nextInt();
		if (opt ==1) {
			divingDice();
		}
		else if (opt==2) {
			free(); 
		}
		else if(opt==3) {
			f.exit();
		}else {
			System.err.println("--------------------------");
			System.err.println("Invalid Option ");
			divingDice();
			}
		}////end of if-statement given to validate if it is login or not
			else {
				f.login();
				divingDice();
				}
			}
		else if (option==2) {
			free();
		}
		else {
		System.err.println("--------------------------");
		System.err.println(c.ANSI_RESET+"Invalid Option ");
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
		System.out.println("Enter [2] To << Go Back To Play Other Free Game  >>"+c.ANSI_RESET);
		int option =sc.nextInt();
		
		//Validation for login 
		if(option==1) {
			if(f.mobno!=0){
		//logic for ColourCode
		 int lives = 5; // Initial number of lives
	        int score = 0; // Initial score
	        
	        System.out.println(c.ANSI_RED + "Lives ❤ : " + lives + c.ANSI_RESET);
	        --lives; //in order to start with index Position[4] = 5 chances
	        for (int i = 0; i <=lives; --lives) { // Loop until lives are exhausted
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
	        	score=score+2;// Increment score by 2 if the guess is correct
	        	++lives;
                System.out.println(c.ANSI_YELLOW+"=-=-=-=-=-=-=-=-=-=--=-=-="+c.ANSI_RESET);
                System.out.println(c.ANSI_BLUE + "Correct! Score: " +c.ANSI_RESET+c.ANSI_GREEN+ score +c.ANSI_RESET );
                System.out.println(c.ANSI_BLUE +"Lives Remains ❤: "+c.ANSI_RESET+c.ANSI_GREEN+lives+c.ANSI_RESET);
               
            } else{ 
            	System.out.println(c.ANSI_YELLOW+"=-=-=-=-=-=-=-=-=-=--=-=-="+c.ANSI_RESET);
            	System.err.println("Lives Remains ❤: "+lives);
                System.err.println("Incorrect!");
                System.out.println(c.ANSI_YELLOW+"=-=-=-=-=-=-=-=-=-=--=-=-="+c.ANSI_RESET);
                System.out.println(c.ANSI_BLUE + "Correct! Score: " +c.ANSI_RESET+c.ANSI_RED+ score +c.ANSI_RESET );
            }            
        }else{
    		System.err.println("---------------------------------------------------");
    		System.err.println("Invalid input! Please enter a value as Red, Violet Or Green");
    		--j;
    	}
	        	}} System.err.println("!!! Game Over 😓!!!");
        //end of for loop
        //After Game Over
		System.out.println(c.ANSI_BLUE+"Do You Want to Play Again: "+c.ANSI_RESET);
		System.out.println(c.ANSI_ORANGE+"Enter [1] For << YES >>");
		System.out.println("Enter [2] To << Go Back To Play Other Free Game  >>");
		System.out.println("Enter [3] To << EXIT >>"+c.ANSI_RESET);
		int opt =sc.nextInt();
		if (opt ==1) {
			ColourCatchup();
		}
		else if (opt==2) {
			free(); 
		}
		else if(opt==3) {
			f.exit();
		}else {
			System.err.println("--------------------------");
			System.err.println("Invalid Option ");
			ColourCatchup();
			}
        
	}//end of if-statement of validating
			else {
				f.login();
				ColourCatchup();
				}
			}
		else if (option==2) {
			free();
		}
		else {
		System.err.println("--------------------------");
		System.err.println(c.ANSI_RESET+"Invalid Option ");
		ColourCatchup();
		}
	}//end of Color CatchUp method
	
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
		System.out.println("Enter [4] To << Go Back To Play Other Free Game  >>"+c.ANSI_RESET);
		int option =sc.nextInt();
		
		//start of HardLevel
			if(option==1) {
				if(f.mobno!=0){
	        int lives = 5; // Initial number of lives
	        int score = 0; // Initial score
	        
	        
	        System.out.println(c.ANSI_RED + "Lives ❤ : " + lives + c.ANSI_RESET);
	        for (int i = 1; i <=lives; i++) { // Loop until lives are exhausted
	           
	        	System.out.println("Guess the number (1-9): ");
	            int userinput = sc.nextInt();
	            if (userinput < 1 || userinput > 9) {
	                System.err.println("Invalid input! Please enter a number between 1 and 9.");
	                i--;
	                continue;
	            }
	            int numeric= random.nextInt(9) + 1; // Generate a random number between 1 and 9
	            System.out.println("Number Forcasted : " + numeric);

	            if (userinput == numeric) {
	                score=score+5; // Increment score if the guess is correct
	                System.out.println(c.ANSI_YELLOW+"=-=-=-=-=-=-=-=-=-=--=-=-="+c.ANSI_RESET);
	                System.out.println(c.ANSI_BLUE + "Correct! Score: " +c.ANSI_RESET+c.ANSI_GREEN+ score +c.ANSI_RESET );
	                System.out.println(c.ANSI_BLUE +"Lives Remains ❤: "+c.ANSI_RESET+c.ANSI_GREEN+(lives-i+1)+c.ANSI_RESET);
	                lives++;
	            } else{ 
	            	System.out.println(c.ANSI_YELLOW+"=-=-=-=-=-=-=-=-=-=--=-=-="+c.ANSI_RESET);
	            	System.err.println("Lives Remains ❤: "+(lives-i));
	                System.err.println("Incorrect!");
	                System.out.println(c.ANSI_YELLOW+"=-=-=-=-=-=-=-=-=-=--=-=-="+c.ANSI_RESET);
	                System.out.println(c.ANSI_BLUE + "Correct! Score: " +c.ANSI_RESET+c.ANSI_RED+ score +c.ANSI_RESET );
	            }            
	        } System.err.println("!!! Game Over 😓!!!");
	        //end of for loop 
	       //After Game Over
			System.out.println(c.ANSI_BLUE+"Do You Want to Play Again: "+c.ANSI_RESET);
			System.out.println(c.ANSI_ORANGE+"Enter [1] For << YES >>");
			System.out.println("Enter [2] To << Go Back To Play Other Free Game  >>");
			System.out.println("Enter [3] To << EXIT >>"+c.ANSI_RESET);
			int opt =sc.nextInt();
			if (opt ==1) {
				PredictiveNumbers();
			}
			else if (opt==2) {
				free(); 
			}
			else if(opt==3) {
				f.exit();
			}else {
				System.err.println("--------------------------");
				System.err.println("Invalid Option ");
				PredictiveNumbers();
				}
			}//end of if-statement given to validate if user is login or not
	       else {
				f.login();
				PredictiveNumbers();
				} 
		}//end of hard mode
		
		//start of odd even
		if(option==2) {
			if(f.mobno!=0){
			int lives = 5; // Initial number of lives
	        int score = 0; // Initial score
	        String num = null;
	        //for hard level
	        System.out.println(c.ANSI_RED + "Lives ❤ : " + lives + c.ANSI_RESET);
	        --lives; //in order to start with index Position[4] = 5 chances
	        for (int i = 0; i <=lives; lives--) { // Loop until lives are exhausted
	        	System.out.println("Guess the Output (Odd/Even): ");
	        	for (int j=0; j<1;j++) {
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
	                score++; // Increment score if the guess is correct
	                System.out.println(c.ANSI_YELLOW+"=-=-=-=-=-=-=-=-=-=--=-=-="+c.ANSI_RESET);
	                System.out.println(c.ANSI_BLUE + "Correct! Score: " +c.ANSI_RESET+c.ANSI_GREEN+ score +c.ANSI_RESET );
	                System.out.println(c.ANSI_BLUE +"Lives Remains ❤: "+c.ANSI_RESET+c.ANSI_GREEN+lives+c.ANSI_RESET);
	                lives++;
	            } else{ 
	            	System.out.println(c.ANSI_YELLOW+"=-=-=-=-=-=-=-=-=-=--=-=-="+c.ANSI_RESET);
	            	System.err.println("Lives Remains ❤: "+lives);
	                System.err.println("Incorrect!");
	                System.out.println(c.ANSI_YELLOW+"=-=-=-=-=-=-=-=-=-=--=-=-="+c.ANSI_RESET);
	                System.out.println(c.ANSI_BLUE + "Correct! Score: " +c.ANSI_RESET+c.ANSI_RED+ score +c.ANSI_RESET );
	            }            
	        }
		        	else{
        		System.err.println("---------------------------------------------------");
        		System.err.println("Invalid input! Please enter a value as Odd & Even");
        		--j;
        	}
		        	}} System.err.println("!!! Game Over 😓!!!");
	        //end of for loop 
	        //end of for loop 
		       //After Game Over
				System.out.println(c.ANSI_BLUE+"Do You Want to Play Again: "+c.ANSI_RESET);
				System.out.println(c.ANSI_ORANGE+"Enter [1] For << YES >>");
				System.out.println("Enter [2] To << Go Back To Play Other Free Game  >>");
				System.out.println("Enter [3] To << EXIT >>"+c.ANSI_RESET);
				int opt =sc.nextInt();
				if (opt ==1) {
					PredictiveNumbers();
				}
				else if (opt==2) {
					free(); 
				}
				else if(opt==3) {
					f.exit();
				}else {
					System.err.println("--------------------------");
					System.err.println("Invalid Option ");
					PredictiveNumbers();
					}
				}//end of if-statement given to validate if user is login or not
		       else {
					f.login();
					PredictiveNumbers();
					} 
			}//end of Odd/even mode
		
		//Big/Small
		if(option==3) {
			if(f.mobno!=0){
			int lives = 5; // Initial number of lives
	        int score = 0; // Initial score
	        String num = null;
	        //for hard level
	        System.out.println(c.ANSI_RED + "Lives ❤ : " + lives + c.ANSI_RESET);
	        --lives; //in order to start with index Position[4] = 5 chances
	        for (int i = 0; i <=lives; lives--) { // Loop until lives are exhausted
	        	System.out.println("Guess the Output (Big/Small): ");
	        	for (int j=0; j<1;j++) {
		        	String userinput = sc.next();
		        	if(userinput.equalsIgnoreCase("Big")||userinput.equalsIgnoreCase("Small")) {
	            int numeric= random.nextInt(9) + 1; // Generate a random number between 1 and 9
	            
	            if(numeric<5) {
	        	   
	        	 num ="Big";
	           }else{
	        	   num="Small";
	           }
	            System.out.println("Output Forcasted: "+num);
	            
	            if (userinput.equalsIgnoreCase(num)) {
	                score++; // Increment score if the guess is correct
	                System.out.println(c.ANSI_YELLOW+"=-=-=-=-=-=-=-=-=-=--=-=-="+c.ANSI_RESET);
	                System.out.println(c.ANSI_BLUE + "Correct! Score: " +c.ANSI_RESET+c.ANSI_GREEN+ score +c.ANSI_RESET );
	                System.out.println(c.ANSI_BLUE +"Lives Remains ❤: "+c.ANSI_RESET+c.ANSI_GREEN+lives+c.ANSI_RESET);
	                lives++;
	            } else{ 
	            	System.out.println(c.ANSI_YELLOW+"=-=-=-=-=-=-=-=-=-=--=-=-="+c.ANSI_RESET);
	            	System.err.println("Lives Remains ❤: "+lives);
	                System.err.println("Incorrect!");
	                System.out.println(c.ANSI_YELLOW+"=-=-=-=-=-=-=-=-=-=--=-=-="+c.ANSI_RESET);
	                System.out.println(c.ANSI_BLUE + "Correct! Score: " +c.ANSI_RESET+c.ANSI_RED+ score +c.ANSI_RESET );
	            }            
	        }
		     else{
        		System.err.println("---------------------------------------------------");
        		System.err.println("Invalid input! Please enter a value as Big & Small");
        		--j;
        	}
		        	}} System.err.println("!!! Game Over 😓!!!");
	        //end of for loop 
	        //end of for loop 
		       //After Game Over
				System.out.println(c.ANSI_BLUE+"Do You Want to Play Again: "+c.ANSI_RESET);
				System.out.println(c.ANSI_ORANGE+"Enter [1] For << YES >>");
				System.out.println("Enter [2] To << Go Back To Play Other Free Game  >>");
				System.out.println("Enter [3] To << EXIT >>"+c.ANSI_RESET);
				int opt =sc.nextInt();
				if (opt ==1) {
					PredictiveNumbers();
				}
				else if (opt==2) {
					free(); 
				}
				else if(opt==3) {
					f.exit();
				}else {
					System.err.println("--------------------------");
					System.err.println("Invalid Option ");
					PredictiveNumbers();
					}
				}//end of if-statement given to validate if user is login or not
		       else {
					f.login();
					PredictiveNumbers();
					} 
			}
			else if(option ==4) {
			free();
		    }
			else {
				System.err.println("Invalid Option:");
				PredictiveNumbers();
				}
	}
	}
	 


