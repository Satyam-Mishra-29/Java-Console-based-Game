package Project;
import java.util.Scanner;

public class Contents {
	static{
		
		System.err.println("=-=-=-=-==-=-=-=-==-=-=-=-==-=-==-=-=-=-=");
		System.err.println("      WELCOME TO PERFECT PREDICTOR       ");
		System.err.println("=-=-=-=-==-=-=-=-==-=-=-=-==-=-==-=-=-=-=");
		System.out.println(" ");

	}
	static {
		System.out.println("Test Your Fate here ☆(ﾉ◕ヮ◕)ﾉ* ");
		System.out.println("-----------------------------------------");
	}
	
	public static void main(String[] args) {
		ColorForProject c = new ColorForProject();
		Scanner s = new Scanner(System.in);
		
		System.out.println(c.ANSI_BLUE+"Enter Your Choice:"+c.ANSI_RESET);
		System.out.println(c.ANSI_ORANGE+"Enter [1] To << SIGN UP >>");
		System.out.println("Enter [2] To << LOGIN >>");
		System.out.println("Enter [3] To << GUEST ACCESS >>");
		System.out.println("Enter [4] To << EXIT >>"+c.ANSI_RESET);
		
		Formalities m = new Formalities();
		int choice =s.nextInt();
		switch (choice){
			case 1:{
				if(Formalities.mobno==0) {
				System.out.println(c.ANSI_GREEN+"-==-=-=-=-=-=-=-=-=-=-=-=-=-");
				System.out.println("         SIGN UP:           ");
				System.out.println("-==-=-=-=-=-=-=-=-=-=-=-=-=-"+c.ANSI_RESET);
				m.signup();
				}
				else {
				Formalities f = new Formalities();
				System.err.println("Since,Your Account is already created..! Go and Enjoy the Games");
				f.Selector();
				}
				break;
				}
			case 2:{
				m.login();
				break;
			}
			case 3 : {
				System.out.println(c.ANSI_GREEN+"-==-=-=-=-=-=-=-=-=-=-=-=-=-");
				System.out.println("           GUEST MODE:          ");
				System.out.println("-==-=-=-=-=-=-=-=-=-=-=-=-=-"+c.ANSI_RESET);
				m.Selector();
				System.exit(0);
			}
		
			case 4:{
				m.exit();
				break;
			}
			default:
				System.err.println("Invalid Option");
				System.err.println("-----------------------");
				main(null);
			}
		m.Selector();
		}
	}
