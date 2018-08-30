package Ingredient;

import java.util.Scanner;

class Ingredient {
    //Define Instance Variables
    //Declaring as Private so only Methods of this Class Can Access
    
    private String nameOfIngredient;
    private String unitMeasurement;        //Options: Cup(s), Tbsp(s), Tsp(s), or Gram(s)
    private float ingredientAmount;        //Number of unitMeasurement Units
    private int numberCaloriesPerUnit;     //Number of Calories per each unit of unitMeasurement
    private double totalCalories;          //(Calories Per Unit * Ingredient Amount)
} 

//Creating Main Outside of Class (Helps with Compile Time)

public class NewIngredient {    
public static void main(String[] args) {  
    Scanner scnr = new Scanner(System.in);  
    Ingredient newIngredient = new Ingredient(); //Creates New Ingredient "newIngredient" of Class "Ingredient"
        
 //Initialize Variables
        String nameOfIngredient = ""; 
        String unitMeasurement = "";       //Options: Cup(s), Tbsp(s), Tsp(s), or Gram(s)
        float ingredientAmount = 0;        //Number of unitMeasurement Units
        int numberCaloriesPerUnit = 0;     //Number of Calories per each unit of unitMeasurement
        double totalCalories = 0.0;        //(Calories Per Unit * Ingredient Amount)
        
//Prompt user for name of ingredient
    System.out.println("Please Enter Ingredient Name: ");
        nameOfIngredient = scnr.nextLine(); 
	
//Prompt user for unit of measurement
        System.out.println("Please Enter the Unit of Measurement for this Ingredient. You have the following options:");
	System.out.println("Cup(s)");
	System.out.println("Tbsp(s)");
	System.out.println("Tsp(s)");
	System.out.println("Gram(s)");
        System.out.println("Type a unit of measurement exactly as it appears in this list above.");
		
	if (scnr.hasNext()) {
            unitMeasurement = scnr.next();
            
            if (!"Gram(s)".equals(unitMeasurement) && !"Cup(s)".equals(unitMeasurement) && !"Tbsp(s)".equals(unitMeasurement) && !"Tsp(s)".equals(unitMeasurement)) {
                System.out.println("Please enter one of the preceding options.");
                }
			
            else {
                System.out.println("You have selected " + unitMeasurement);
                }
            }
        
	else {
            System.out.println("Please enter one of the preceding options.");
		
		
            if (scnr.hasNext()) {
                unitMeasurement = scnr.next();
                 
                if (!"Gram(s)".equals(unitMeasurement) && !"Cup(s)".equals(unitMeasurement) && !"Tbsp(s)".equals(unitMeasurement) && !"Tsp(s)".equals(unitMeasurement)) {
                    System.out.println("Unit not recognized. You are out of attempts.");
                }
			
            else {
                System.out.println("You have selected " + unitMeasurement);
                }
            }
        }
                
//Prompt user for number of units 
        System.out.println("Please enter the number of " + unitMeasurement + " of " + nameOfIngredient + " required (between 1 and 1000: )");
			
	if (scnr.hasNextInt()) {
            ingredientAmount = scnr.nextInt();
				
            if ((ingredientAmount >= 1) && (ingredientAmount <= 1000)) {
		System.out.println(ingredientAmount + " is a valid amount. Any recipes using this "
                        + "ingredient will require " + ingredientAmount + " " + unitMeasurement + " of " + nameOfIngredient); 	
            }			
            else {
		System.out.println(ingredientAmount + " is not a valid amount.");
		System.out.println("Please enter a valid number of units between 1 and 1000: ");
                    if (scnr.hasNextInt()) {
                        ingredientAmount = scnr.nextInt();
				
                        if ((ingredientAmount >= 1) && (ingredientAmount <= 1000)) {
                            System.out.println(ingredientAmount + " is a valid amount!"); 	
                        }
                        else if (ingredientAmount < 1) {
                            System.out.println(ingredientAmount + " is less than 1 unit. Sorry, you are out of attempts.");
                        }
                        else {
                            System.out.println(ingredientAmount + " is greater than 1000 units. Sorry, you are out of attempts.");
                        }
            }
        }
    }
        
    else {
        System.out.println("Error: That is not a number. Sorry, you are out of attempts.");
	}
	
//Prompt user for calories per unit
        System.out.println("Please enter the number of calories per " + unitMeasurement + " of " + nameOfIngredient + " (between 1 and 2000): ");
        
    if (scnr.hasNextInt()) {
        numberCaloriesPerUnit = scnr.nextInt();
			
        if ((numberCaloriesPerUnit >= 1) && (numberCaloriesPerUnit <= 2000)) {
            System.out.println(numberCaloriesPerUnit + " is a valid number of calories."); 	
        }
        else {
            System.out.println(numberCaloriesPerUnit + " is not a valid number of calories.");
            System.out.println("Please enter a valid number of calories per unit between 1 and 2000: ");
            
            if (scnr.hasNextInt()) {
                numberCaloriesPerUnit = scnr.nextInt();
        
                if ((numberCaloriesPerUnit >= 1) && (numberCaloriesPerUnit <= 2000)) {
                    System.out.println(numberCaloriesPerUnit + " is a valid number of calories!"); 	
                }
                
                else if (numberCaloriesPerUnit < 1) {
                    System.out.println(numberCaloriesPerUnit + " is less than 1. Sorry, you are out of attempts.");
                }
                
                else {
                    System.out.println(numberCaloriesPerUnit + " is greater than 2000. Sorry, you are out of attempts.");
                }
            }
        }
    }
    
    else {
        System.out.println("Error: That is not a number. Sorry, you are out of attempts.");
        }
    

//Calculate total calories
        totalCalories = ingredientAmount * numberCaloriesPerUnit;
        
        System.out.println("Congratulations!");
        System.out.println("Any recipe that uses " + nameOfIngredient + " will use " + ingredientAmount + " number of " + 
                unitMeasurement + " of " + ingredientAmount + " which contains " + totalCalories + " total calories.");
	
        System.out.println("Ingredient has been successfully added.");
        
           }
        }		

