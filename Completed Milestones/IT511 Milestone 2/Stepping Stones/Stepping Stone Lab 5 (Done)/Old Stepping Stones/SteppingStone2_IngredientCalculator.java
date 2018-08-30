package SteppingStone;

import java.util.Scanner;

/**
 * @author Joshua T. Pierce
 * @title  Stepping Stone 2: Ingredient Calculator
 * @date   05-Dec-2017
 */
public class SteppingStone2_IngredientCalculator {
    
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        String nameOfIngredient = "";
        double numberCups = 0.0;
        int numberCaloriesPerCup = 0;
        double totalCalories = 0.0;
        
        System.out.println("Please Enter Ingredient Name: ");
        nameOfIngredient = scnr.nextLine(); //In case ingredient is more than one word long. 
        
        System.out.println("Please enter the number of cups of " + nameOfIngredient + " required: ");
        numberCups = scnr.nextDouble();
        
        System.out.println("Please enter the number of calories per cup of " + nameOfIngredient + " : ");
        numberCaloriesPerCup = scnr.nextInt();
        
        totalCalories = numberCups * numberCaloriesPerCup;
        
        System.out.println(nameOfIngredient + " uses " + numberCups + " cups and this amount contains " + totalCalories + " total calories.");
        
    }

}
