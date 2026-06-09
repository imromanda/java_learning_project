package WeeklyProblems;

import java.util.Scanner;

public class SumOfNumbers {
	
	 public static void main(String[] args) {
	        try (Scanner sc = new Scanner(System.in)) {
				int n = Integer.parseInt(sc.nextLine().trim());
				
				int sum = 0;
				
				for (int i = 1; i <= n; i++) {
				    int enter = Integer.parseInt(sc.nextLine().trim());
				 sum += enter;
				}
				
				System.out.println("Sum: "+ sum);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        

	        // Read numbers and calculate sum

	        // Print the sum
	    }
	 

//     4
//     10
//     20
//     30
//     40
     
//     Use a for loop to read n numbers.
//     Add each to a sum variable.

}
