import static java.lang.Integer.parseInt;

import java.util.Scanner;

public class OppgB4 {

	public static void main(String[] args) {
		
		int lønnstrinn = 0;
		
		double hskatt0 = 190349;
		double hskatt1 = 267899;
		double hskatt2 = 643799;
		double hskatt3 = 969199;
		double hskatt4 = 1999999;
		
		
		double lønn = 0;
		double lønnstrinn1 = 0.017;
		double lønnstrinn2 = 0.04;
		double lønnstrinn3 = 0.134;
		double lønnstrinn4 = 0.164;
		double lønnstrinn5 = 0.174;
	
		double skatt1 = 0;
		double skatt2 = 0;
		double skatt3 = 0;
		double skatt4 = 0;
		double skatt5 = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Din bruttolønn:");
	    double bruttolønn = parseInt(input.nextLine());
	    
	    if (bruttolønn > 2000000) {
	    	skatt5 = (bruttolønn-hskatt4)*lønnstrinn5;
	    	skatt4 = (hskatt4-hskatt3)*lønnstrinn4;
	    	skatt3 = (hskatt3-hskatt2)*lønnstrinn3;
	    	skatt2 = (hskatt2-hskatt1)*lønnstrinn2;
	    	skatt1 = (hskatt1-hskatt0)*lønnstrinn1;
	    	lønnstrinn = 5;
	    	
	    
	    }else if (bruttolønn > 969199) {
	    	skatt4 = (bruttolønn-hskatt3)*lønnstrinn4;
	    	skatt3 = (hskatt3-hskatt2)*lønnstrinn3;
	    	skatt2 = (hskatt2-hskatt1)*lønnstrinn2;
	    	skatt1 = (hskatt1-hskatt0)*lønnstrinn1;
	    	lønnstrinn = 4;
	    		    	   
	    }else if (bruttolønn > 643799) {
	    	skatt3 = (bruttolønn-hskatt2)*lønnstrinn3;
	    	skatt2 = (hskatt2-hskatt1)*lønnstrinn2;
	    	skatt1 = (hskatt1-hskatt0)*lønnstrinn1;
	    	lønnstrinn = 3;
	    	
		}else if (bruttolønn > 267899){
	    	skatt2 = (bruttolønn-hskatt1)*lønnstrinn2;
	    	skatt1 = (hskatt1-hskatt0)*lønnstrinn1;
	    	lønnstrinn = 2;
	    	
		}else if (bruttolønn > 190549){
	    	skatt1 = bruttolønn*lønnstrinn1; 
	    	lønnstrinn = 1;
	    
		}else
	    	System.out.println("Du betaler ikke trinnskatt.");
	    int totalskatt = (int) (skatt1+skatt2+skatt3+skatt4+skatt5);
	    System.out.println("Du er på trinnskatt "+ lønnstrinn +"\nUnder er listen over hvor mye trinnskatt du betaler i vært av trinnene\nTrinn 1: " + (int) skatt1 + "\nTrinn 2: " + (int) skatt2 + "\nTrinn 3: " + (int) skatt3 + "\nTrinn 4: "+ (int) skatt4 + "\nTrinn 5: "+ (int)skatt5 +"\nDu betaler totalt " + totalskatt + " i skatt");

	}
		
}
