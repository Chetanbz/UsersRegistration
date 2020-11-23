import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
			System.out.println("Welcome to user registartion ");
			String InputPattern = "^(?=.*[A-Z]{1}[a-z A-Z]){3,}$";
			Pattern pattern = Pattern.compile(InputPattern); 
			System.out.println("Enter text:");
			Matcher matcher = pattern.matcher(sc.nextLine());    
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
