import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
			System.out.println("Welcome to user registartion ");
			
			//String InputPattern = "[A-Z]{1}[a-zA-Z]{2,}";  // fisrt name pattern
			//System.out.println("Enter first name :");
			//String InputFirstName = sc.next();
			//check(InputFirstName,InputPattern);
			
			//String InputPattern2 = "[A-Z]{1}[a-zA-Z]{2,}";  // last name pattern
			//System.out.println("Enter Last name :");
			//String InputLastName = sc.next();
			//check(InputLastName,InputPattern2);
			
			//String InputPattern3 = "[A-Z]{1}[a-zA-Z]{2,}";  // Email pattern
			//System.out.println("Enter Email name :");
			//String InputEmailName = sc.next();
			//check(InputEmailName,InputPattern3);
			
			String InputPattern4 = "([0-9]{2})\\s{1}[7-9][0-9]{9}";  //Mobile pattern
			System.out.println("Enter Mobile number :");
			String InputMobile = sc.next();
			check(InputMobile,InputPattern4);
			
			
	}
	public static void check( String InputParameter, String Pattern) { 
		boolean result = InputParameter.matches(Pattern);
	      if(result) {
	         System.out.println("Given input matches with pattern");
	      } else {
	         System.out.println("Given input not matches with pattern.");
	      }	
	}
}
