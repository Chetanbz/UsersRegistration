import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
			System.out.println("Welcome to user registartion ");
			String InputPattern = "^(?=.*[A-Z]{1}[a-z A-Z]){3,}$";  // fisrt name pattern
			System.out.println("Enter first name :");
			String InputFirstName = sc.next();
			check(InputPattern,InputFirstName);
			String InputPattern2 = "^(?=.*[A-Z]{1}[a-z A-Z]){3,}$";  // fisrt name pattern
			System.out.println("Enter Last name :");
			String InputLastName = sc.next();
			check(InputPattern2,InputLastName);
			
			
	}
	public static void check(String InputPattern , String InputName) { 
		Pattern pattern = Pattern.compile(InputPattern); 
		Matcher matcher = pattern.matcher(InputName);    
		boolean found = false;    
        while (matcher.find()) {    
            System.out.println("I found the text "+matcher.group()+" starting at index "+    
             matcher.start()+" and ending at index "+matcher.end());    
            found = true; 
        }    
        if(!found){    
            System.out.println("No match found.");  
        } 
	}
}
