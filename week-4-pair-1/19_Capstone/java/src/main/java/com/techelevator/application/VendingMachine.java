package com.techelevator.application;
import java.math.BigDecimal;

import com.techelevator.models.Change;
import com.techelevator.models.Inventory;
import com.techelevator.models.MoneyManager;
import com.techelevator.models.file_io.PurchaseLogger;
import com.techelevator.models.products.Products;
import com.techelevator.ui.MainUserMenu;
import com.techelevator.ui.UserOutput;


public class VendingMachine
{
	private Inventory inventory = new Inventory();

    private PurchaseLogger errorLogger = new PurchaseLogger("errors");
    
	
    public void run()
    {
        while(true)
        {
            String choice = MainUserMenu.getHomeScreenOption();

            if(choice.equals("display"))
            {
            	displayVendingOptions();// display the vending machine slots
            }
            else if(choice.equals("purchase"))
            {
                purchase();// make a purchase
            }
            else if(choice.equals("exit"))
            {
               exit(); // good bye
                break;
            }
        }
    }
    
    public void displayVendingOptions()
    {
//    	 show the products
    	UserOutput.displayInventory(inventory);
    }
    
    
    public void purchase()
    {
        // User the UserOutput to display the products in the Inventory
        // then prompt the user for payment
        while(true)
      {
            String option = MainUserMenu.getPurchaseOptions();

            if(option.equals("feed"))
            {
                
                // add the money to the MoneyManager
            	BigDecimal moneyProvided = MainUserMenu.getMoney();
                MoneyManager.feedMoney(moneyProvided);
                UserOutput.displayFeedMoneyMessage();
            }
            else if(option.equals("select"))
            {
            	// display how much money is available
            	BigDecimal credit = MoneyManager.getCredit();
            	UserOutput.displayCreditMessage();
            	
                // display all products
            	UserOutput.displayInventory(inventory);

                // prompt for input
                String slotLocation = MainUserMenu.getSelectedProduct();
                
                // find the product based on the id
                Products product = inventory.getProductBySlotLocation(slotLocation);
                
                // calculate if they have enough money
                //check if there are any products left
                if(product.getQty() > 0)
                {
	                try
	                {
	                    MoneyManager.purchase(product.getPrice());
	                    product.purchase();
	                    
	                    System.out.println(product.getSound());
	                }
	                catch(Exception ex)
	                {
	                    // Log the error message to file
	                    // to implement this you need to open the Logger.java file
	                    // and complete the logMessage function
	                    errorLogger.logMessage(ex.getMessage());
	                    System.out.println(ex.getMessage());
	                }
                }
                else 
                {
                	System.out.println("SORRY THE PRODUCT YOU REQUESTED IS SOLD OUT!!!");
                }
            }
            else if(option.equals("finish"))
            {
            	//BigDecimal newAmount = MoneyManager.getCredit().subtract(newAmount);
            	
            	Change newChange = MoneyManager.getChange();
            	
            	UserOutput.displayFinishMessage(newChange);
            	break;
            }
        }
    }
    
    public void exit()
    {
    	UserOutput.displayExitMessage();
    }
    
}
