/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recipe;

/**
 *
 * @author josh
 */

public class RecipeTest {
    
    public static void main(String[] args) {
        
    final Recipe newRecipe = new Recipe();                 //Constructor to Create new Recipe (calls other class)
    
        Recipe addNewRecipe = newRecipe.addNewRecipe();    //Invoke addNewRecipe()
        
        newRecipe.printRecipe();                           //Access printReciope()
        
    }
}

