package WeeklyProblems;

public class MultiplicationTable {

	    	  static long factorial(int n) {
	    		long  result = 1;
	    		
	    		  for (int i = 1; i <= n; i++) {
	    			  result *= i;
	    		  } 
	    		  
	    		  return result;
	    		  
	    		  
	    		  //The factorial of N means: multiply all numbers from 1 to N together.
    		  	//Example: factorial of 5 = 1 × 2 × 3 × 4 × 5 = 120
	    	        // Return the factorial of n
	    		  //Initialize a result variable to 1.
	    		  //Loop from 1 to n, multiplying the result each time.
	    	    }

	    	    public static void main(String[] args) {
	    	        int num = 5;
	    	        System.out.println(num + "! = " + factorial(num));
	    	    }
	        
	    
	}
	

