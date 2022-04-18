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
    
   //Adding constructors

    /**
     *
     */
     
     public RecipeBox() {
        this.listOfRecipes = new ArrayList<>();
    }
    
     
   //Overloaded constructor

    /**
     *
     * @param listOfRecipes
     */
     
    public RecipeBox(ArrayList<Recipe> listOfRecipes) {
        this.listOfRecipes = listOfRecipes;
    }

    /**
     *
     */
    public void printAllRecipeNames() {
     
         int i = 0;
         for(i = 0; i < listOfRecipes.size(); i++) {
             System.out.println(listOfRecipes.get(i));
       
        }
    }
    
     
     //Method for printing recipe details

    /**
     *
     */
   public void printAllRecipeDetails() {
       int j = 0;
       for (j = 0; j < listOfRecipes.size(); j++) {
           Recipe tempRecipe = new Recipe();
           tempRecipe = listOfRecipes.get(j);
           tempRecipe.printRecipe();
       }
   }
   
   
   //Method for adding new recipe

    /**
     *
     */
    public void addNewRecipe() {
        
        Recipe tempRecipe2 = new Recipe();
        
        listOfRecipes.add(tempRecipe2.addNewRecipe());
            
        }
    
    
    //Method for deleting a recipe

    /**
     *
     */
    public void deleteRecipe() {
       
        Scanner deleteScnr = new Scanner(System.in);
        
        String deleteThisRecipe = deleteScnr.next();
        
        for(int k = 0; k < listOfRecipes.size(); k++) {
            
            if (listOfRecipes.get(k).recipeName.equals(deleteThisRecipe)); {
            
                listOfRecipes.remove(k);
                
            }
        }
    }
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
        RecipeBox finalRecipeBox = new RecipeBox();
        
        Scanner menuScnr = new Scanner(System.in);
        
        /**
         * Print a menu for the user to select one of three menu options.
         */
        
        System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "4. Delete a Recipe\n");
        
            while (menuScnr.hasNextInt() || menuScnr.hasNextLine()) {
                
                int input = menuScnr.nextInt();
                
            switch (input) {
                case 1:
                    finalRecipeBox.addNewRecipe();
                    break;
                case 2:
                    finalRecipeBox.printAllRecipeDetails();
                    break;
                case 3:
                    finalRecipeBox.printAllRecipeNames();
                    break;
                case 4:
                    finalRecipeBox.deleteRecipe();
                    break;
                default:
                    System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "4. Delete a Recipe\n");
                    break;
            }
                    
        }
            
     }
     
}

     

                
        
    


     
           
           
        
    
    
    
    
    
    

