package WeeklyProblems;

import java.util.Scanner;

/*
 * Read a shape and its measurements from input.

The shape is one of these three words:

rectangle - next two lines are width and height
triangle - next two lines are base and height
circle - next line is the radius
Print the area with two decimal places:

Area: [result]
Triangle area = base × height / 2. Circle area = pi × radius × radius.

Input used in test:
rectangle
5
3
Important:
To solve the problem your code has to return a correct result for other values as well. 

Use conditional statements to check which shape was entered.
Each shape has its own formula. Read different inputs depending on the shape.
For pi, use Math.PI.
 */

public class AreaCalculator {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String shape = sc.nextLine().trim();

	        double result = 00.00;
	        
	        switch (shape) {
	        case "rectangle":
		        double recWidth = sc.nextDouble();
		        double recHeight = sc.nextDouble();
		       result = (recWidth * recHeight);
		        break;
		        
	        case "triangle": 
	        	   double base = sc.nextDouble();
			        double triHeight = sc.nextDouble();
			      result = (base * triHeight)/2;
			      break;

	        case "circle": 
	        	double radius = sc.nextDouble();
	        	result = Math.PI*(radius*radius);
	        	break;
	        
	  }
	        System.out.printf("Area: %.2f%n", result);	       
	        sc.close();

    

	        // Read measurements and calculate area
	        

	        // Print the area
	  }
}
