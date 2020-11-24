import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
			System.out.println("Welcome to user registartion ");
			
			validateEmail();
			String InputPattern = "[A-Z]{1}[a-zA-Z]{2,}";  // fisrt name pattern
			System.out.println("Enter first name :");
			String InputFirstName = sc.next();
			check(InputFirstName,InputPattern);
			
			String InputPattern2 = "[A-Z]{1}[a-zA-Z]{2,}";  // last name pattern
			System.out.println("Enter Last name :");
			String InputLastName = sc.next();
			check(InputLastName,InputPattern2);
			
			String InputPattern3 = "[A-Z]{1}[a-zA-Z]{2,}";  // Email pattern
			System.out.println("Enter Email name :");
			String InputEmailName = sc.next();
			check(InputEmailName,InputPattern3);
			
			String InputPattern4 = "([0-9]{2})\\s{1}[7-9][0-9]{9}";  //Mobile pattern
			System.out.println("Enter Mobile number :");
			String InputMobile = sc.next();
			check(InputMobile,InputPattern4);
			

			String InputPattern5 = "(?=.*[@*&^%#-*+!])(?=.*[0-9])(?=.*[A-Z])(.{6,})";  //password pattern
			System.out.println("Enter password number :");
			String Inputpassword = sc.next();
			check(Inputpassword,InputPattern5);
			
			
	}
	public static void check( String InputParameter, String Pattern) { 
		boolean result = InputParameter.matches(Pattern);
	      if(result) {
	         System.out.println("Given input matches with pattern");
	      } else {
	         System.out.println("Given input not matches with pattern.");
	      }	
	}
	public static  void validateEmail() {
		
		String InputEmail ="^[a-zA-Z]+([._+-]{0,1}[a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}+(?:\\.[a-z]{2,}){0,1}$";
		ArrayList<String> validateMail = new ArrayList<>();
		System.out.println("Folling are the results of valid and invalid mails");
		// valid email
		validateMail.add("abc@yahoo.com");
		validateMail.add("abc-100@yahoo.com");
		validateMail.add("abc.100@yahoo.com");
		validateMail.add("abc-100@abc.net");
		validateMail.add("abc.100@abc.com.au");
		validateMail.add("abc@1.com");
		validateMail.add("abc@gmail.com.com");
		validateMail.add("abc+100@gmail.com");
		// invalid email
		validateMail.add("abc-");
		validateMail.add("abc@.com");
		validateMail.add("abc@123gmail.a");
		validateMail.add("abc123@.com");
		validateMail.add("abc123@.com.com");
		validateMail.add(".abc@abc.com");
		validateMail.add("abc()*@gmail.com");
		validateMail.add("abc@%*.com.com");
		validateMail.add("abc..2002@.gmail.com");
		validateMail.add("abc.@gmail.com");
		validateMail.add("abc@abc@gmail.com");
		validateMail.add("abc@gmail.com.1a");
		validateMail.add("abc@gmail.com.aa.au");
		for(String validate1 : validateMail) {
			System.out.println(validate1+" "+"-----"+validate1.matches(InputEmail));
		}
}
}
