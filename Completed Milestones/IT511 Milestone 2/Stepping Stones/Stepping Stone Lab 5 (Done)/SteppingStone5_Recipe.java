package SteppingStone;

import java.util.Scanner;

import java.util.ArrayList;

/**
 *
 * @author josh
 */

//Class declaration with private fields.

public class SteppingStone5_Recipe {
    
    private String recipeName;
    
    private int servings;
    
    ArrayList<String> recipeIngredients = new ArrayList();
    
    private int totalRecipeCalories;
    
//Add mutators and accessors (setters and getters) for each class field/var.
//Public Methods (no private helper methods necessary)    
    
    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }
    
    public String getRecipeName() {
        return recipeName;
    }
    
    public void setServings(int servings) {
        this.servings = servings;
    }
    
    public int getServings() {
        return servings;
    }
    
    public void setRecipeIngredients(ArrayList<String> recipeIngredients) {
    this.recipeIngredients = recipeIngredients;
    }
    
    public ArrayList<String> getRecipeIngredients() {
        return recipeIngredients;
    }
    
    public void setTotalRecipeCalories(int totalRecipeCalories) {
        this.totalRecipeCalories = totalRecipeCalories;
    }
    
    public int getTotalRecipeCalories() {
        return totalRecipeCalories;
    }
    
//Initial Constructor (creates new object with initialized fields)    
        
    public SteppingStone5_Recipe() {
        this.recipeName = "";
        this.servings = 0; 
        this.recipeIngredients = new ArrayList<String>(); //<-- assignment value for empty ArrayList
        this.totalRecipeCalories = 0;   
    }
    
//Overloaded Constructor
    public SteppingStone5_Recipe(String recipeName, int servings, 
    	ArrayList<String> recipeIngredients, int totalRecipeCalories) 
    {
        this.recipeName = recipeName;
        this.servings = servings;
        this.recipeIngredients = recipeIngredients;
        this.totalRecipeCalories = totalRecipeCalories;
    }

//Print Recipe Method (to be called in Main)    
    public void printRecipe() {
        
        int singleServingCalories = (totalRecipeCalories / servings);
        
        System.out.println("Recipe: " + recipeName);
        
        System.out.println("Serves: " + servings);
        
        System.out.println("Ingredients: ");
        
        for (int i = 0; i < recipeIngredients.size(); i++) {
            String ingredient = recipeIngredients.get(i);
            System.out.println(ingredient);
        }
        
        System.out.println("Each Serving Has " + singleServingCalories + " Calories.");
    }
    
    
    public static void main(String[] args) {
        int totalRecipeCalories = 0;
        ArrayList <String> recipeIngredients = new ArrayList();
        boolean addMoreIngredients = true;
                
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Please enter the recipe name: ");
        String recipeName = scnr.nextLine();
        
        System.out.println("Please enter the number of servings: ");
        int servings = scnr.nextInt();

//Do-While loop to add more ingredients (similar to Stepping Stone 4).        
                
        do {
            System.out.println("Please enter the ingredient name or type 'end' if you are finished entering ingredients: ");
                String ingredientName = scnr.next();
                
                if (ingredientName.toLowerCase().equals("end")) {
                    addMoreIngredients = false;
                    break;
                } 
            
                else {
                    recipeIngredients.add(ingredientName);
                    addMoreIngredients = true;
                
                    System.out.println("Please enter the number of units of the ingredient to be used: ");
                        int ingredientAmount = scnr.nextInt();
            
                    System.out.println("Please enter the ingredient Calories per unit: ");
                        int ingredientCalories = scnr.nextInt();
            
            totalRecipeCalories = (ingredientCalories * ingredientAmount);     
                 
            }
        }
            while (addMoreIngredients == true);
    SteppingStone5_Recipe recipe1 = new SteppingStone5_Recipe(recipeName, servings, recipeIngredients, totalRecipeCalories);
    recipe1.printRecipe();
    
    }
}