package Recipe;
 
import java.util.Scanner;

import java.util.ArrayList;
 
 //Class Declaration with Instance Variables 
 
public class Recipe { 
    
    private String recipeName;
    
    private int servings;
    
    ArrayList<String> recipeIngredients = new ArrayList();
    
    private int totalRecipeCalories;
 
//Accessors and Mutators for the Instance Variables
 
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
    
/*
Constructors
 */
    
//Initial Constructor (creates new object with initialized fields)    
        
    public Recipe() {
        this.recipeName = "";
        this.servings = 0; 
        this.recipeIngredients = new ArrayList<String>(); //<-- assignment value for empty ArrayList
        this.totalRecipeCalories = 0;  
    }
    
//Overloaded Constructor

    public Recipe(String recipeName, int servings, 
    	ArrayList<String> recipeIngredients, int totalRecipeCalories) 
    {
        this.recipeName = recipeName;
        this.servings = servings;
        this.recipeIngredients = recipeIngredients;
        this.totalRecipeCalories = totalRecipeCalories;
    }
    
/*
Print Recipe Method
 */ 
    
//To be called in Main() to Print Recipe Details
    
    public void printRecipe() {
        
        int singleServingCalories = (totalRecipeCalories / servings);
        
        System.out.println("Recipe: " + recipeName);
        
        System.out.println("Serves: " + servings);
        
        System.out.println("Ingredients: ");
        
        for (int i = 0; i < recipeIngredients.size(); i++) {  //For loop to print each array member
            String ingredient = recipeIngredients.get(i);
            System.out.println(ingredient);
        }
        
        System.out.println("Each Serving Has " + singleServingCalories + " Calories.");
    }
 
 //Create New Recipe Method to Build Recipes Based on User Input

    public Recipe addNewRecipe() {
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
                String ingredientName = scnr.nextLine();
                
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
        
    Recipe recipe1 = new Recipe(recipeName, servings, recipeIngredients, totalRecipeCalories);
    recipe1.printRecipe();
    return recipe1;
    
    } 

 }
 //Pseudocode for the Custom Method (List in Stepping Stone 5)
//Create an additional ArrayList that allows users to submit step by step instructions, then print those instructions in printRecipe().
/*
Public Method AddInstructions
1. Create new String Arraylist "Instructions"
2. Do
    3. Prompt User to Enter Instruction 1
    4. Ask if User Wants to Enter More Instructions (Yes/No)

         If yes, Boolean MoreInredients = True
            
	 If no, Boolean MoreIngredients = False
            Break
 
    While MoreIngredients = True

5. For each member of Instructions, Print Each Member

End Method
 */