package RecipeBox;

import java.util.Scanner;

import java.util.ArrayList;

/**
 *
 * @author josh  
 */

public class Recipe {
	
    String recipeName;	
    
    private int servings;
    
    private ArrayList<Ingredient> recipeIngredients = new ArrayList();
    
    private ArrayList<String> recipeInstructions;
	
    /**
     * 
     * @param recipeName 
     */
    public void setRecipeName(String recipeName) {
    this.recipeName = recipeName;
    }
    
    /**
     * 
     * @return 
     */
    public String getRecipeName() {
        return recipeName;
    }
    
    /**
     * 
     * @param servings 
     */
    public void setServings(int servings) {
        this.servings = servings;
    }
    
    /**
     * 
     * @return 
     */
    public int getServings() {
        return servings;
    }
    
    /**
     * 
     * @param recipeIngredients 
     */
    public void setRecipeIngredients(ArrayList<Ingredient> recipeIngredients) {
        this.recipeIngredients = recipeIngredients;
    }
    
    /**
     * 
     * @return 
     */
    public ArrayList<Ingredient> getRecipeIngredients() {
        return recipeIngredients;
    }
    
    /**
     * 
     * @param recipeInstructions 
     */
    public void setRecipeInstructions(ArrayList<String> recipeInstructions) {
        this.recipeInstructions = recipeInstructions;
    }
    
    /**
     * 
     * @return 
     */
    public ArrayList<String> getRecipeInstructions() {
        return recipeInstructions;
    }
    

 //Initial Constructor (creates new object with initialized fields)    
        
    public Recipe() {
        this.recipeName = "";
        this.servings = 0; 
        this.recipeIngredients = new ArrayList<>();
	this.recipeInstructions = new ArrayList<>();
	}
 
 //Overloaded Constructor

    public Recipe(String recipeName, int servings, 
    	ArrayList<Ingredient> recipeIngredients, ArrayList<String> recipeInstructions) {
        this.recipeName = recipeName;
        this.servings = servings;
        this.recipeIngredients = recipeIngredients;
	this.recipeInstructions = recipeInstructions;
    }
    
 //Add Instructions Method [CUSTOM METHOD]
 
	public void addInstructions() {
		
		String instruction = "";
		
		boolean addMoreInstructions = true;
                
                Scanner scnr = new Scanner(System.in);
		
		do {
                    System.out.println("Please enter an instruction or type 'end' if you are finished entering instructions: ");
			instruction = scnr.nextLine();
				
			if (instruction.toLowerCase().equals("end")) {
                                    
                    addMoreInstructions = false;
                    
                    } 
			else {
                            recipeInstructions.add(instruction);
                                        
                            addMoreInstructions = true;
                    }
                        
		} while (addMoreInstructions == true);				
	}
	
 //Print Recipe Method
 
    public void printRecipe() {
        
        System.out.println("Recipe: " + recipeName);
        
        System.out.println("Serves: " + servings);
        
        System.out.println("Ingredients: ");
        
        for (int i = 0; i < recipeIngredients.size(); i++) {  //For loop to print each array member
            recipeIngredients.get(i);
            System.out.println(i);
        }
       
		System.out.println("Instructions: ");

		for (int j = 0; j < recipeInstructions.size(); j++) {
			String instruction = recipeInstructions.get(j);
			System.out.println(j + instruction);
	}
}
   
 
 //Create New Recipe Method to Build Recipes Based on User Input

    public Recipe addNewRecipe() {
		
        ArrayList <Ingredient> recipeIngredients = new ArrayList(); 
		
            boolean addMoreIngredients = true;
        
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Please enter the recipe name: ");
        String recipeName = scnr.nextLine();
        
        System.out.println("Please enter the number of servings: ");
        int servings = scnr.nextInt();

//Do-While loop to add more ingredients (similar to Stepping Stone 4).        
                
        do {
            System.out.println("Please enter the ingredient name or type 'end' if you are finished entering ingredients: ");
                String input = scnr.nextLine();
                
                if (!input.toLowerCase().equals("end")) {
                    
                    
                    addMoreIngredients = true;
                   
                } 
            
                else {
                    addMoreIngredients = false;
                    
                    break;
                }
                
        } while (addMoreIngredients == true);
        
       
        
    Recipe recipe1 = new Recipe(recipeName, servings, recipeIngredients, recipeInstructions);
    
    recipe1.printRecipe();
   
    return recipe1;
    
    } 

 }