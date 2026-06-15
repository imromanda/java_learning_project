package WeeklyProblems;
import java.util.Scanner;


public class CountConsonants {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String myString = sc.nextLine().trim();
        int resultado = countConsonants(myString);
        System.out.println(resultado);
        sc.close();
	}//fin Main
    
    
    public static int countConsonants(String myString) {
	
	String	replaced = myString.replace("a", "");
	String	replaced1 = replaced.replace("e", "");
	String	replaced2 = replaced1.replace("i", "");
	String	replaced3 = replaced2.replace("o", "");
	String	replaced4 = replaced3.replace("u", "");
	String	replaced5 = replaced4.replace(" ", "");


	int out = replaced5.length();
				return out;
		    }//Fin countConsonants
    
    
    

}
