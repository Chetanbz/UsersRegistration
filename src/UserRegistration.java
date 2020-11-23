import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
			System.out.println("Enter your first name: ");
		      String name = sc.next();
		      String regex = "[A-Z]{1}[a-zA-Z]{2,}";
		      boolean result = name.matches(regex);
		      if(result) {
		         System.out.println("Given name is valid.");
		      } else {
		         System.out.println("Given name is not valid.");
		      }	
	}
}
