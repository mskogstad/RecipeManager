/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recipebox;

import java.util.Scanner;

/**
 *
 * @author mattskogstad
 */

public class Ingredient {

    
    //Declaring variables
    private String nameOfIngredient;
    private String unitMeasurement;
    private double ingredientAmount;
    private int numberCaloriesPerUnit;
    private double totalCalories;         
   
    
    //Mutators and accessors

    /**
     *
     * @return
     */
    public String getNameOfIngredient() {
        return nameOfIngredient;
    }

    /**
     *
     * @param nameOfIngredient
     */
    public void setNameOfIngredient(String nameOfIngredient) {
        this.nameOfIngredient = nameOfIngredient;
    }
    
    /**
     *
     * @return
     */
    public String unitMeasurement() {
        return unitMeasurement;
    }

    /**
     *
     * @param numberOfCups
     */
    public void numberOfCups(float numberOfCups) {
        this.unitMeasurement = unitMeasurement;
    }

    /**
     *
     * @return
     */
    public double ingredientAmount() {
        return ingredientAmount;
    }
		
    /**
     *
     * @param ingredientAmount
     */
    public void ingredientAmount(float ingredientAmount) {
        this.ingredientAmount = ingredientAmount;
    }

    /**
     *
     * @return
     */
    public int getNumberCaloriesPerUnit() {
        return numberCaloriesPerUnit;
    }
    
    /**
     *
     * @param numberCaloriesPerUnit
     */
    public void setNumberCaloriesPerUnit(int numberCaloriesPerUnit) {
        this.numberCaloriesPerUnit = numberCaloriesPerUnit;
    }

    /**
     *
     * @return
     */
    public double getTotalCalories() {
        return totalCalories;
    }
    
    /**
     *
     * @param totalCalories
     */
    public void setTotalCalories(double totalCalories) {
        this.totalCalories = totalCalories;
    }
    
    //Initializng Constructor

    /**
     *
     */
    
    public Ingredient() {
        this.nameOfIngredient = "";
        this.unitMeasurement = "";
	this.ingredientAmount = 0;
        this.numberCaloriesPerUnit = 0;
        this.totalCalories = 0.0;
    }
    
//Overloaded Constructor

    /**
     *
     * @param nameOfIngredient
     * @param unitMeasurement
     * @param ingredientAmount
     * @param numberCaloriesPerUnit
     * @param totalCalories
     */
    
    public void Ingredient(String nameOfIngredient, String unitMeasurement, 
        double ingredientAmount, int numberCaloriesPerUnit, double totalCalories) {
        this.nameOfIngredient = nameOfIngredient;
        this.unitMeasurement = unitMeasurement;
	this.ingredientAmount = ingredientAmount;
        this.numberCaloriesPerUnit = numberCaloriesPerUnit;
        this.totalCalories = totalCalories;
    }
    
    /**
     *
     * @param tempNameOfIngredient
     * @return
     */
    public Ingredient addIngredient(String tempNameOfIngredient) {
    
        Scanner scnr = new Scanner(System.in);  
    
        Ingredient newIngredient = new Ingredient();

//Asking user for ingredient name
    
	System.out.println("Please Enter Ingredient Name: ");
    
	nameOfIngredient = scnr.nextLine(); 
	
//Asking user for unit of measurement


 System.out.println("Please Enter the Unit of Measurement for this Ingredient. You have the following options:");
    System.out.println("Cup");
    System.out.println("Tbsp");
    System.out.println("Tsp");
    System.out.println("Grams");
    
    System.out.println("Select a unit of measurement from the above list.");
  
		
	if (scnr.hasNext()) {
            unitMeasurement = scnr.next();
            
            if (!"Grams".equals(unitMeasurement) && !"Cup".equals(unitMeasurement) && !"Tbsp".equals(unitMeasurement) && !"Tsp".equals(unitMeasurement)) {
                System.out.println("Please eneter a unit of measurement");
                }
			
            else {
                System.out.println("You have selected " + unitMeasurement);
                }
            }
        
	else {
            System.out.println("Please enter a unit of measurement");
		
		
            if (scnr.hasNext()) {
                unitMeasurement = scnr.next();
                 
                if (!"Grams".equals(unitMeasurement) && !"Cup".equals(unitMeasurement) && !"Tbsp".equals(unitMeasurement) && !"Tsp".equals(unitMeasurement)) {
                    System.out.println("Unit not recognized.");
                }
			
            else {
                System.out.println("You have selected " + unitMeasurement);
                }
            }
        }
        
System.out.println("Please enter the amount of " + unitMeasurement + " of " + nameOfIngredient);
			
	if (scnr.hasNextInt()) {
            ingredientAmount = scnr.nextInt();
				
            if ((ingredientAmount >= 1) && (ingredientAmount <= 10000)) {
		System.out.println(ingredientAmount + " is a valid amount."); 	
            }			
            else {
		System.out.println(ingredientAmount + " is not a valid amount.");
		System.out.println("Please enter a valid amount above 1 and below 10,000");
                    if (scnr.hasNextInt()) {
                        ingredientAmount = scnr.nextInt();
				
                        if ((ingredientAmount >= 1) && (ingredientAmount <= 10000)) {
                            System.out.println(ingredientAmount + " is a valid amount!"); 	
                        }
                        else if (ingredientAmount < 1) {
                            System.out.println(ingredientAmount + " is less than 1 unit. You are out of attempts.");
                        }
                        else {
                            System.out.println(ingredientAmount + " is greater than 10,000 units. You are out of attempts.");
                        }
            }
        }
    }
        
    else {
        System.out.println("Invalid response. You are out of attempts");
	}
	
//Asking user for calories per unit.

        System.out.println("Please enter the calories per " + unitMeasurement + " of " + nameOfIngredient);
        
    if (scnr.hasNextInt()) {
        numberCaloriesPerUnit = scnr.nextInt();
			
        if ((numberCaloriesPerUnit >= 1) && (numberCaloriesPerUnit <= 10000)) {
            System.out.println(numberCaloriesPerUnit + " is a valid number of calories."); 	
        }
        else {
            System.out.println(numberCaloriesPerUnit + " is not a valid number of calories.");
            System.out.println("Please enter an amount greater than 1 and below 10,000");
            
            if (scnr.hasNextInt()) {
                numberCaloriesPerUnit = scnr.nextInt();
        
                if ((numberCaloriesPerUnit >= 1) && (numberCaloriesPerUnit <= 10000)) {
                    System.out.println(numberCaloriesPerUnit + " is a valid number of calories."); 	
                }
                
                else if (numberCaloriesPerUnit < 1) {
                    System.out.println(numberCaloriesPerUnit + " is less than 1. You are out of attempts.");
                }
                
                else {
                    System.out.println(numberCaloriesPerUnit + " is greater than 10,000. You are out of attempts.");
                }
            }
        }
    }
    
 else {
        System.out.println("Invalid response. You are out of attempts");
        }
    

//Calculate total calories

        totalCalories = ingredientAmount * numberCaloriesPerUnit;
        
        System.out.println("Recipes that use " + nameOfIngredient + " need " + ingredientAmount + " " + 
                unitMeasurement + " of " + nameOfIngredient + " which contains " + totalCalories + " total calories.");
	
        System.out.println("Ingredient added.");
        
        return newIngredient;
        
           }
}