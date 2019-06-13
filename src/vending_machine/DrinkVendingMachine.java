package vending_machine;

import java.util.*;



public class DrinkVendingMachine extends VendingMachine {

    /**
     * HAS-A relation
     * DrinkVendingMachine HAS-A list of Drink objects
     */
    public List<Drink> drinks;

    /**
     * current will refer to currently selected drink
     */
    public Drink current;
    /**
     * after selecting the drink, whatever amount customer owes for the drink
     */
    public double amountLeftToPay;
    /**
     * after paying for the drink whatever amount is change
     */
    public double change;
    /**
     * used to check if drink is currently selected or no
     */
    public boolean isSelected;

    /**
     * public constructor.
     * @param drinksParam VAR-ARGs.
     *                    Assign each Drink object into drinks list
     */
    public DrinkVendingMachine(Drink... drinksParam) {//DrinkVending(drink1, drink2, drink3, drink4)
       //TODO
       
    	drinks = new ArrayList<>();
    	for(int i=0; i<drinksParam.length; i++) {
    		drinks.add(drinksParam[i]);
    	}
       
    }

    /**
     * Override select abstract method.
     * This method will be used to select a drink in the vending machine
     * @param itemNumber to select in Vending machine
     *                    options are 0 to drinks.size-1
     * 1. if drinkNumber is < 0 or more than drinks.size-1
     *       then isSelected should be false
     * 2. if a drink's quantity at that position is <=0
     *       then isSelected should be false
     * 3. Set the drink object at that index to current variable
     * 4. Set the cost of the selected drink to amountLeftToPay variable
     * 5. Set isSelected to true
     *
     */ 

    //TODO: implement select method
    
    @Override
    public void select(int itemNumber) {//drinks.get(itemNumber).getQunatity
    	if(itemNumber<0 || itemNumber>drinks.size()-1 || drinks.get(itemNumber).getQuantity() <= 0) {
    		isSelected = false;
    	} else {
    		current = drinks.get(itemNumber);
    		amountLeftToPay = drinks.get(itemNumber).getCost();
    		isSelected = true;
    	}
    	
    }
    
    
    
    
    

    /**
     *
     * Override abstract method pay
     * Method is used to pay for the selected drink
     *
     * 1. If isSelected is false then return 0.0
     * 2. Deduct money from amountLeftToPay
     * 3. if there is any change set the value to change variable (positive value)
     * 4. Decrease the quantity of the selected drink by 1
     * 5. Return amountLeftToPay value
     *
     * @param money
     *
     */
    //TODO: implement pay menthod
    
    public double pay(double money) {
    	if(isSelected == false) {
    		return 0.0;
    	}
    	
    	amountLeftToPay -= money;
    	
    	change = -1*amountLeftToPay;
    	
    	current.setQuantity(current.getQuantity()-1);
    	return amountLeftToPay;
    	
    }
    


    /**
     * Override abstract method returnChange
     * Method is used to return the change to the customer
     * Return the value of change from the method and
     * 1. Set change to 0
     * 2. Set amountLeftToPay to 0
     *
     * @return
     */
   
   //TODO: implement returnChange method
    
    public double returnChange() {
    	
    	
    	double value = change;//3
    	change = 0;
    	amountLeftToPay = 0;
    	
    	return value;//3
    	
    }
 

    /**
     * Override abstract method cancel
     * Method is used by customers to cancel any selected drinks
     * 1. set current drink to null
     * 2. amountLeftToPay is zero
     * 3. isSelected to false
     * 4. return any changes
     */
    
    //TODO: implement cancel method
    
    public void cancel() {
    	
    	current = null;
    	amountLeftToPay = 0;
    	isSelected = false;
    	returnChange();
    	
    }

    

}

