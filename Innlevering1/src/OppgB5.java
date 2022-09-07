import static java.lang.Integer.parseInt;

import java.util.Scanner;

public class OppgB5 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
	   
		int s = 10;
	   
	    for (int i = 1; i <= s; i++) {
	    	System.out.println("Hva er poengsumen:");
	    	int poengsum = parseInt(input.nextLine());
	    	
			if (poengsum > 89 && poengsum <= 100)
	    		System.out.println("Studenten fikk A");
	    	else if (poengsum > 79 && poengsum <=89)
	    		System.out.println("Studenten fikk B");
	    	else if (poengsum > 59 && poengsum <=79)
	    		System.out.println("Studenten fikk C");
	    	else if (poengsum > 49 && poengsum <=59)
	    		System.out.println("Studenten fikk D");
	    	else if (poengsum > 39&& poengsum <=49)
	    		System.out.println("Studenten fikk E");
	    	else if (poengsum >= 0 && poengsum <=39)
	    		System.out.println("Studenten fikk F");
			
	    	else {
	    		System.out.println("Ugyldig karakter");
	    		System.out.println("Hva er poengsumen:");
		    	poengsum = parseInt(input.nextLine());
		    	s=s+1;
	    		
	    		
	    	}
	    }

	}

}
