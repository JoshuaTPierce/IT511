package SteppingStone;

import java.util.Scanner;

import java.util.ArrayList;

/*
 * @author josh
 * Stepping Stone Lab 4: Loops
 * December 2017
 */

public class SteppingStone4_Loops {
    public static void main(String[] args) {
       Scanner scnr = new Scanner (System.in);
       ArrayList<String> ingredientList = new ArrayList(); //Create new object of Class Array List
       String recipeName = "";
       String newIngredient = "";
       boolean addMoreIngredients = true;
       
       System.out.println("Please Enter Recipe Name: ");
       recipeName = scnr.nextLine();
    
        OUTER:                                       //encompasses entire Do-While loop (so break OUTER ends the entire loop)
        do {
            System.out.println("Would you like to enter an ingredient? (y or n)");
            String reply = scnr.next().toLowerCase();
            switch (reply) {                         //Nesting the switch statements to make the branching tidier
                
                case "y":
                    System.out.println("Please Enter Ingredient Name: ");
                    ingredientList.add(scnr.next()); //Stores user inout in ingredient list array
                    break;                           //Breaks to "Would you like to enter more ingredients
                
                case "n":
                    break OUTER;                     //Breaks to end program (e.g., OUTER)
                
                default:
                    System.out.println("Please enter Y or N");
                    break;                           //Breaks to "Would you like to enter more ingredients
            }
            
            System.out.println("Would you like to enter more ingredients? (y or n): ");
            String reply2 = scnr.next().toLowerCase();
            switch (reply2) {
                
                case "y":
                    addMoreIngredients = true;
                    break;                          //Breaks to while clause, will re-start the do-while loop.
                
                case "n":
                    addMoreIngredients = false;     
                    break OUTER;                    //Outer break ends loop.
                    
                default:
                    addMoreIngredients = false;
                    break OUTER;  
            }
        } while (addMoreIngredients = true);        //Outer break ends loop.
         
//Start for-loop portion of Stepping Stone

        for (int i = 0; i < ingredientList.size(); i++) {
            
            
            String ingredient = ingredientList.get(i);
        
            System.out.println(ingredient);
            
        }
                
}

}

