

import java.util.ArrayList;


public class SteppingStone6_RecipeBox {
	
	/**
	 * Declare instance variables:
	 * a private ArrayList of the type SteppingStone5_Recipe named listOfRecipes
	 * 
	 */

	private ArrayList<SteppingStone5_Recipe> listOfRecipes = new.ArrayList();

    
	/**
	 * Add accessor and mutator for listOfRecipes
	 * 
	 */

	public void setRecipes(Arraylist<SteppingStone5_Recipe> listOfRecipes) {
		this.listOfRecipes = listOfRecipes;

	public ArrayList<SteppingStone5_Recipe> getSteppingStone5_Recipe() {
		return SteppingStone5_Recipe;

	/**
	 * Add constructors for the SteppingStone6_RecipeBox()
	 * 
	 */

	SteppingStone6_RecipeBox recipeBox = new SteppingStone6_RecipeBox();
	 
	/**
	 * Add the following custom methods:
	 * 
	 * //printAllRecipeDetails(SteppingStone5_Recipe selectedRecipe)
	 * 		This method should accept a recipe from the listOfRecipes ArrayList
	 * 		recipeName and use the SteppingStone5_Recipe.printRecipe() method 
	 * 		to print the recipe
	 * 		
	 * //printAllRecipeNames() <-- This method should print just the recipe
	 * 		names of each of the recipes in the listOfRecipes ArrayList
	 * 
	 * //addRecipe(SteppingStone5_Recipe tmpRecipe) <-- This method should use
	 * 		the SteppingStone5_Recipe.addRecipe() method to add a new 
	 * 		SteppingStone5_Recipe to the listOfRecipes
	 * 
	 */
	
	public printAllRecipeDetails()
		for all members of ArrayList listOfRecipes, call the printRecipe() method from SS5

	public printAllRecipeNames()
		for all members of ArrayList listOfRecipes, print recipeName

	public addRecipe()
		SteppingStone5_Recipe.addRecipe() (from SS5)
		to listOfRecipes;
	
	/**
	* A variation of following menu method should be used as the actual main 
	*		once you are ready to submit your final application.  For this 
	*		submission and for using it to do stand-alone tests, replace the 
	*		public void menu() with the standard 
	*			public static main(String[] args)
	*		method
	*
	*/
	
	public void menu() {
    	// Create a Recipe Box
    		
	//SteppingStone6_RecipeBox myRecipeBox = new SteppingStone6_RecipeBox(); //Uncomment for main method
        Scanner menuScnr = new Scanner(System.in);
        
		
		/**
		* Print a menu for the user to select one of the three options:
		*
		*/
		
		System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "\nPlease select a menu item:");

       		while (menuScnr.hasNextInt() || menuScnr.hasNextLine()) {

            	System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "\nPlease select a menu item:");
            		
			int input = menuScnr.nextInt();
            
			/**
			* The code below has two variations:
			* 	1. Code used with the SteppingStone6_RecipeBox_tester.
			*	2. Code used with the public static main() method
			*
			* One of the sections should be commented out depending on the use. 
			*/
			
			/**
			* This could should remain uncommented when using the
			* SteppingStone6_RecipeBox_tester.
			* 
			* Comment out this section when using the
			*		public static main() method
			*/
			
			if (input == 1) {
                newRecipe();
            } else if (input == 2) {
                System.out.println("Which recipe?\n");
                String selectedRecipeName = menuScnr.next();
                printAllRecipeDetails(selectedRecipeName);
            } else if (input == 3) {
                
				
				for (int j = 0; j < listOfRecipes.size(); j++) { 
                    System.out.println((j + 1) + ": " + listOfRecipes.get(j).getRecipeName()); 
                }
            } else {
                System.out.println("\nMenu\n" + "1. Add Recipe\n" + "2. Print Recipe\n" + "3. Adjust Recipe Servings\n" + "\nPlease select a menu item:");
            }
            
			/**
			* This could should be uncommented when using the
			* 		public static main() method
			* 
			* Comment out this section when using the
			* 		SteppingStone6_RecipeBox_tester.
			*		
			
			
			if (input == 1) {
                myRecipeBox.newRecipe();
            } else if (input == 2) {
                System.out.println("Which recipe?\n");
                String selectedRecipeName = menuScnr.next();
                myRecipesBox.printAllRecipeDetails(selectedRecipeName);
            } else if (input == 3) {		
				for (int j = 0; j < myRecipesBox.listOfRecipes.size(); j++) { 
                    System.out.println((j + 1) + ": " + myRecipesBox.listOfRecipes.get(j).getRecipeName());
				}
            } else {
                System.out.println("\nMenu\n" + "1. Add Recipe\n" + "2. Print Recipe\n" + "3. Adjust Recipe Servings\n" + "\nPlease select a menu item:");
            }
			
			*
			*/
			
			System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "\nPlease select a menu item:");
		}
		
        
	}

}


/**
 * 
 * Final Project Details:
 * 
 * For your final project submission, you should add a menu item and a method 
 *		to access the custom method you developed for the Recipe class 
 * 		based on the Stepping Stone 5 Lab.
 *
 */