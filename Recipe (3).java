/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recipebox;

import java.util.Scanner;

import java.util.ArrayList;

/**
 *
 * @author mattskogstad  
 */

public class Recipe {

    //Declare variables
    String recipeName;
    private int servings;
    private ArrayList<Ingredient> recipeIngredients = new ArrayList<>();
    private ArrayList<String> recipeInstructions;
	
  
    
    //Mutators and Accessors

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
    

 //Constructor

    /**
     *
     */
    
        
    public Recipe() {
        this.recipeName = "";
        this.servings = 0; 
        this.recipeIngredients = new ArrayList<>();
	this.recipeInstructions = new ArrayList<>();
	}
 
 //Overloaded Constructor

    /**
     *
     * @param recipeName
     * @param servings
     * @param recipeIngredients
     * @param recipeInstructions
     */

    public Recipe(String recipeName, int servings, 
    	ArrayList<Ingredient> recipeIngredients, ArrayList<String> recipeInstructions) {
        this.recipeName = recipeName;
        this.servings = servings;
        this.recipeIngredients = recipeIngredients;
	this.recipeInstructions = recipeInstructions;
    }
 
    
    //Custom Method to add instructions to recipe

    /**
     *
     */
	public void addInstructions() {
            String instruction = "";
            boolean addMoreInstructions = true;
            Scanner scnr = new Scanner (System.in);
            boolean addMoreInstruction = false;
            
            do {
             System.out.println("Input instructions and type done when finished.");
             instruction = scnr.nextLine();
             
            if (instruction.toLowerCase().equals("done")) {
                addMoreInstruction = false;
            }
            }
            while (addMoreInstruction == true);
        }
        
		
		 				
	
	
 //Print Recipe Method

    /**
     *
     */
 
    public void printRecipe() {
        
        System.out.println("Recipe: " + recipeName);
        
        System.out.println("Serves: " + servings);
        
        System.out.println("Ingredients: ");
        
        for (int i = 0; i < recipeIngredients.size(); i++) { 
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

    /**
     *
     * @return
     */

    public Recipe addNewRecipe() {
		
        ArrayList <Ingredient> recipeIngredients = new ArrayList(); 
		
            boolean addMoreIngredients = true;
        
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Please enter the recipe name: ");
        String recipeName = scnr.nextLine();
        
        System.out.println("Please enter the number of servings: ");
        int servings = scnr.nextInt();

//Loop to add more ingredients
                
        do {
            System.out.println("Please enter the ingredient name or type done if finished.");
                String input = scnr.nextLine();
                
                if (!input.toLowerCase().equals("done")) {
                    
                    
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

    /**
     *
     */
    public static class Ingredient {

        /**
         *
         */
        public Ingredient() {
        }
    }

}

 

    /**
     * @param args the command line arguments
     */
  

