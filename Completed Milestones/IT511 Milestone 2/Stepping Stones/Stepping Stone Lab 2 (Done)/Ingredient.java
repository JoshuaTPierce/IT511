/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ingredient;

import java.util.Scanner;

/**
 * @author josh
 */
public class Ingredient {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        String nameOfIngredient = "";
        String unitMeasurement = "";
        double ingredientAmount = 0.0;
        int numberOfCaloriesPerUnit = 0;
        double totalCalories = 0.0;
        
        System.out.println("Please Enter Ingredient Name: ");
        nameOfIngredient = scnr.nextLine(); 
        
        System.out.println("Please Enter Unit of Measurement for this Ingredient(non-plural): ");
        unitMeasurement = scnr.next();
        
        System.out.println("Please enter the number of units of " + nameOfIngredient + " required: ");
        ingredientAmount = scnr.nextDouble();
        
        System.out.println("Please enter the number of calories per unit of " + nameOfIngredient + " : ");
        numberOfCaloriesPerUnit = scnr.nextInt();
        
        totalCalories = ingredientAmount * numberOfCaloriesPerUnit;
        
        System.out.println(nameOfIngredient + " uses " + ingredientAmount + " number of " + unitMeasurement + "'s" + " which contains " + totalCalories + " total calories.");
    
    }
}

