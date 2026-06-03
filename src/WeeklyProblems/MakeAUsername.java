package WeeklyProblems;

import java.util.Scanner;

public class MakeAUsername {

	public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String firstName = sc.nextLine().trim();
	        String lastName = sc.nextLine().trim();
		
	        // Create username (lowercase, no space)
	        String username = firstName.trim().concat(lastName.trim()).toLowerCase();	       
	        
	        
	        // Create initials (uppercase first letters)
					char initial1 = firstName.charAt(0);
					char initial2 = lastName.charAt(0);
					String initials = ("" + initial1 + initial2).toUpperCase();
					

	        // Print results
					System.out.println("Username: " + username);

					System.out.println("Initials: " + initials);
	    }
	
}
