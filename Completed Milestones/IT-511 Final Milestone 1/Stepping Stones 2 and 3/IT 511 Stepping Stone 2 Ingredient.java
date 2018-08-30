package SteppingStones;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *package SteppingStones;

/**
 *
 * @author snhu.edu
 */

import java.util.Scanner;

public class SteppingStone2_Ingredient {
    private String nameOfIngredient;
    private float numberCups;
    private int numberCaloriesPerCup;
    private double totalCalories;
    
    
    /**
     * @return the nameOfIngredient
     */
    public String getNameOfIngredient() {
        return nameOfIngredient;
    }

    /**
     * @param nameOfIngredient the nameOfIngredient to set
     */
    public void setNameOfIngredient(String nameOfIngredient) {
        this.nameOfIngredient = nameOfIngredient;
    }

    /**
     * @return the numberCups
     */
    public float getNumberCups() {
        return numberCups;
    }

    /**
     * @param numberCups the numberCups to set
     */
    public void setNumberCups(float numberCups) {
        this.numberCups = numberCups;
    }

    /**
     * @return the numberCaloriesPerCup
     */
    public int getNumberCaloriesPerCup() {
        return numberCaloriesPerCup;
    }

    /**
     * @param numberCaloriesPerCup the numberCaloriesPerCup to set
     */
    public void setNumberCaloriesPerCup(int numberCaloriesPerCup) {
        this.numberCaloriesPerCup = numberCaloriesPerCup;
    }

    /**
     * @return the totalCalories
     */
    public double getTotalCalories() {
        return totalCalories;
    }

    /**
     * @param totalCalories the totalCalories to set
     */
    public void setTotalCalories(double totalCalories) {
        this.totalCalories = totalCalories;
    }
    
    
    public SteppingStone2_Ingredient() {
        this.nameOfIngredient = "";
        this.numberCups = 0;
        this.numberCaloriesPerCup = 0;
        this.totalCalories = 0.0;
    }
    
    public SteppingStone2_Ingredient(String nameOfIngredient, float numberCups, 
        int numberCaloriesPerCup, double totalCalories) {
        this.nameOfIngredient = nameOfIngredient;
        this.numberCups = numberCups;
        this.numberCaloriesPerCup = numberCaloriesPerCup;
        this.totalCalories = totalCalories;
    }
    
    
    public SteppingStone2_Ingredient addIngredient(String tempNameOfIngredient) {
       tempNameOfIngredient = tempNameOfIngredient;
       float tempNumberCups;
       int tempNumberCaloriesPerCup;
       double tempTotalCalories; 
       Scanner scnr = new Scanner(System.in);
       
       System.out.println("Please enter the name of the ingredient: ");
       tempNameOfIngredient = scnr.next();
       
       System.out.println("Please enter the number of cups of " + nameOfIngredient + " we'll need: ");
       tempNumberCups = scnr.nextFloat();
       
       System.out.println("Please enter the name of calories per cup: ");
       tempNumberCaloriesPerCup = scnr.nextInt();
       
       tempTotalCalories = numberCups * numberCaloriesPerCup;
       
       SteppingStone2_Ingredient tempNewIngredient = 
               new SteppingStone2_Ingredient(tempNameOfIngredient,
                       tempNumberCups, tempNumberCaloriesPerCup,
                       tempTotalCalories);
        return tempNewIngredient;
    }
}