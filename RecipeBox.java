
package RecipeBox;

import java.util.Scanner;

import java.util.ArrayList;

/**
 *
 * @author josh
*/



public class RecipeBox {
    
    ArrayList<Recipe> listOfRecipes = new ArrayList<>();
    
    /**
     * 
     * @param listOfRecipes 
     */
    public void setListOfRecipes(ArrayList<Recipe> listOfRecipes) {
        this.listOfRecipes = listOfRecipes;
    }
    
    /**
     * 
     * @return 
     */
    public ArrayList<Recipe> setListOfRecipes() {
        return listOfRecipes;
    }
    
 //Constructors
    
    public void RecipeBox() {
        this.listOfRecipes = listOfRecipes;
    }
    
    public void RecipeBox(ArrayList<Recipe> listOfRecipes) {
        listOfRecipes = listOfRecipes;
    }
    
//User-Defined Methods
    
    public void printAllRecipeNames() {
     
        for (int i = 0; i < listOfRecipes.size(); i++) {
            System.out.println(listOfRecipes.get(i));
        }
    }
    
    public void printAllRecipeDetails() {
        
        for (int j = 0; j < listOfRecipes.size(); j++) {
            
           Recipe tempRecipe = new Recipe();
           
           tempRecipe = listOfRecipes.get(j);
           
           tempRecipe.printRecipe();
            
        }
    }
    
    public void addNewRecipe() {
        
        Recipe tempRecipe2 = new Recipe();
        
        listOfRecipes.add(tempRecipe2.addNewRecipe());
            
        }
    
//Additional Method for Final Project: Remove a Recipe
//Accept user input. If user input matches a recipe in listOfRecipes, delete that recipe
    
    public void deleteRecipe() {
       
        Scanner deleteScnr = new Scanner(System.in);
        
        String recipeToDelete = deleteScnr.next();
        
        for(int k = 0; k < listOfRecipes.size(); k++) {
            
            if (listOfRecipes.get(k).recipeName.equals(recipeToDelete)) {
                
                listOfRecipes.remove(k);
                break;
            }
        }
    }
    
//Start Menu
    
    public static void main(String[] args) {
        
        RecipeBox finalRecipeBox = new RecipeBox();
        
        Scanner menuScnr = new Scanner(System.in);
        
        /**
         * Print a menu for the user to select one of three menu options.
         */
        
        System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "4. Delete a Recipe\n");
        
            while (menuScnr.hasNextInt() || menuScnr.hasNextLine()) {
                
                int input = menuScnr.nextInt();
                
                    if (input == 1) {
                        
                        finalRecipeBox.addNewRecipe();   
                    }
                    
                    else if (input == 2) {
                        
                        finalRecipeBox.printAllRecipeDetails();
                    }
                    
                    else if (input == 3) {
                        
                        finalRecipeBox.printAllRecipeNames();
                    }
                    
                    else if (input == 4) {
                        finalRecipeBox.deleteRecipe();
                    }
                    else {
                        System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "4. Delete a Recipe\n");
                    }
                    
             }            
                
        }
    
}
