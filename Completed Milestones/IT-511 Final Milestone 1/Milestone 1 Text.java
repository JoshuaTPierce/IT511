package Ingredient;
import java.util.Scanner;

/**
 * @author Joshua T. Pierce
 * @title  Stepping Stone 2: Ingredient Calculator
 * @date   05-Dec-2017
 * 
 * This Milestone is a complete Java Class.
 * The class construct defines a new type that can group data and methods to form an object. 
 * In this case, the Class "Ingredient" combines data (the variables) and methods to form the 
 * objects: Ingredients!
 *
 */
 
public class Ingredient {
	
 //Private Fields: Internal Data 
	
    private String nameOfIngredient;
    private String unitMeasurement;
    private float ingredientAmount; 			
    private int numberOfCaloriesPerUnit;
    private double totalCalories;			

//Operations: Public Methods

	//Mutators and Accessors: Set Values at the this. Index and Return the Value 

	//Set and Return Name of Ingredient 
    public void setNameOfIngredient(String nameOfIngredient) {
        this.nameOfIngredient = nameOfIngredient;
    }

	public String getNameOfIngredient() {
        return nameOfIngredient;
    }
	
	//Set and Return Unit Measurement
	public void setUnitMeasurement (String unitMeasurement) {
		this.unitMeasurement = unitMeasurement;
	}
	
	public String getUnitMeasurement () {
		return unitMeasurement;
	}
	
	//Set and Return Ingredient Amount
	public void setIngredientAmount(float ingredientAmount) {
        this.ingredientAmount = ingredientAmount;
    }
	
	public float getIngredientAmount() {
        return ingredientAmount;
    }

	//Set and Return Number of Calories per Unit	
	public void setNumberCaloriesPerUnit(int numberCaloriesPerUnit) {
        this.numberCaloriesPerUnit = numberCaloriesPerUnit;
    }
	
	public int getNumberCaloriesPerUnit() {
    return numberCaloriesPerUnit;
    
	}
	
	//Set and Return Total Calories
	public void setTotalCalories(double totalCalories) {
        this.totalCalories = totalCalories;
    }
	
	public double getTotalCalories() {
    return totalCalories;
    }
}

/*Main Method
 *Program Execution Begins at Main Method.
 *Here, the user is prompted to enter ingredient information to create a new ingredient object. 
 */ 

 import java.util.Scanner;
 
 public Class NewIngredient {
	public static void main(String[] args) {  
	Scanner scnr = new Scanner(System.in);
	
	//Use this. pointer to initialize fields (as they share the same name as private/global fields)
		this.nameOfIngredient = "";
        this.numberCups = 0;
        this.numberCaloriesPerCup = 0;
        this.totalCalories = 0.0;
	
	//Prompt user for name of ingredient
        System.out.println("Please Enter Ingredient Name: ");
		if (scnr.hasNextString()) {
			nameOfIngredient = scnr.nextLine(); 
		}
			
		else {
			System.out.println("Please enter a valid name (characters only): ");
		}
			
	//Prompt user for unit of measurement
        System.out.println("Please Enter Unit of Measurement for this Ingredient. You have the following options: ");
		System.out.println("Cup(s)");
		System.out.println("Tbsp");
		System.out.println("Tsp");
		System.out.println("Gram(s)");
		
		if (scnr.hasNextString()) {
			unitMeasurement = scnr.next();
		}
			if ((unitMeasurement == "Cup(s)") || (unitMeasurement == "Tbsp") || (unitMeasurement == "Tsp") || (unitMeasurement == "Gram(s)")) {
				System.out.println("You have selected " + unitMeasurement);
			}
			
			else {
				System.out.println("Please enter one of the preceding options.");
			}
			
		else {
			System.out.println("Please enter one of the preceding options.");
		}
		
	//Prompt user for number of units 
        System.out.println("Please enter the number of units of " + nameOfIngredient + " required (between 1 and 100: ");
			
		if (scnr.hasNextInt()) {
			ingredientAmount = scnr.nextInt();
				
			if ((ingredientAmount >= 1) && (ingredientAmount <= 100)) {
				System.out.println(ingredientAmount + " is a valid amount!" 	
					
			else {
			System.out.println(ingredientAmount + " is not a valid amount.");
			System.out.println("Please enter a valid number of units between 1 and 100: ");
				
				if ((ingredientAmount >= 1) && (ingredientAmount <= 100)) {
					System.out.println(numberCups + " is a valid amount!"); 	
			}
				else if (ingredientAmount < 1) {
					System.out.println(ingredientAmount + " is less than 1 unit. Sorry, you are out of attempts.");
			}
				else {
					System.out.println(ingredientAmount + " is greater than 100 units. Sorry, you are out of attempts.");
			}
			
		else {
           System.out.println("Error: That is not a number. Try again.");
		}
	
	//Prompt user for calories per unit
        System.out.println("Please enter the number of calories per unit of " + nameOfIngredient + " (between 1 and 2000): ");
        
		if (scnr.hasNextInt()) {
			numberOfCaloriesPerUnit = scnr.nextInt();
			
			if ((numberOfCaloriesPerUnit >= 1) && (numberOfCaloriesPerUnit <= 2000)) {
				System.out.println(numberOfCaloriesPerUnit + " is a valid number of calories!" 	
			
			else {
				System.out.println(numberOfCaloriesPerUnit + " is not a valid number of calories.");
				System.out.println("Please enter a valid number of calories per unit between 1 and 2000: ");
        
					if ((numberOfCaloriesPerUnit >= 1) && (numberOfCaloriesPerUnit <= 2000)) {
						System.out.println(numberOfCaloriesPerUnit + " is a valid number of calories!"); 	
				}
					else if (numberOfCaloriesPerUnit < 1) {
						System.out.println(numberOfCaloriesPerUnit + " is less than 1. Sorry, you are out of attempts.");
				}
					else {
						System.out.println(numberOfCaloriesPerUnit + " is greater than 2000. Sorry, you are out of attempts.");
				}
				
		else {
           System.out.println("Error: That is not a number. Try again.");
		
	//Calculate total calories
        totalCalories = ingredientAmount * numberOfCaloriesPerUnit;
        
        System.out.println(nameOfIngredient + " uses " + ingredientAmount + " number of " + unitMeasurement + "'s" + " which contains " + totalCalories + " total calories.");
		System.out.println("Ingredient has been successfully added.");
						}
					}
		return
				}
			}
		}
	}
 }}}
  
 
 