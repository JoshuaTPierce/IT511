
package SteppingStone;

import java.util.Scanner;

/*
 * @author Joshua T. Pierce
 * IT-511
 * Stepping Stone Lab 3: Branches
 */
public class SteppingStone3_Branches {
    
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
	final int MAX_CUPS = 100;
	int numberCups = 0;
		
	System.out.println("Please enter number of cups (between 1 and 100):");
	
//The following branch uses the scanner method .hasNextInt() to 
//check and see if the input is an integer:
	
	if (scnr.hasNextInt()) {
           numberCups = scnr.nextInt();
 
            if ((numberCups >= 1) && (numberCups <= MAX_CUPS)) {
                System.out.println(numberCups + " is a valid number of cups!");
            }
			
            else {
                System.out.println(numberCups + " is not a valid number of cups.");
                System.out.println("Please enter a valid number of cups between 1 and 100: ");
            }
            
            if (scnr.hasNextInt()) {
                numberCups = scnr.nextInt();
		
                if ((numberCups >= 1) && (numberCups <= MAX_CUPS)) {
                    System.out.println(numberCups + " is a valid number of cups!"); 
		}
				
                else if (numberCups < 1) {
                    System.out.println(numberCups + " is less than 1. Sorry, you are out of attempts.");
		}
				
		else {
                    System.out.println(numberCups + " is greater than 100. Sorry, you are out of attempts.");
		}
            }
            
        else {
           System.out.println("Error: That is not a number. Try again.");
	}    
    }
  }
}