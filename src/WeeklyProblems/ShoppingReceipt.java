package WeeklyProblems;
import java.util.Scanner;

/*Instructions
Your program reads three lines:

	Item name
	Price (a number like 1.50)
	Quantity (a whole number like 3)
	
	Print exactly these 4 lines:

	Item: [item]
	Price: $[price] (always two decimal places, like 1.50)
	Quantity: [quantity]
	Total: $[total] (price times quantity, two decimal places)
 * 
 */





public class ShoppingReceipt {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String item = sc.nextLine().trim();
	        double price = Double.parseDouble(sc.nextLine().trim());
	        int quantity = Integer.parseInt(sc.nextLine().trim());
	        double total = price*quantity;

	        // Calculate total and print receipt
	        
	        System.out.println("Item: " + item);
	        System.out.printf("Price: $%.2f%n", price);	       
	        System.out.println("Quantity: " + quantity);
	        System.out.printf("Total: $%.2f%n", total);
	        sc.close();

	    }
	
	
	

}
