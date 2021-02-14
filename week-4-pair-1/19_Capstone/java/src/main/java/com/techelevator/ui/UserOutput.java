package com.techelevator.ui;

import java.util.Map;

import com.techelevator.models.Change;
import com.techelevator.models.Inventory;
import com.techelevator.models.MoneyManager;
import com.techelevator.models.products.Products;

public class UserOutput 
{
	public static void displayInventory(Inventory inventory)
		{
			System.out.println();
			System.out.println("*******************");
			System.out.println("   ZOMBIE SNACKS");
			System.out.println("*******************");
			System.out.println();
			
			
			
		for(Map.Entry<String, Products> product: inventory.getProducts().entrySet())
			{
				System.out.println(product.toString());
			}
			System.out.println();
		
		}
	
	public static void displayExitMessage()
	{
		System.out.println();
		System.out.println("***************************");
		System.out.println(" THANK YOU FOR YOUR TIME");
		System.out.println("***************************");
		System.out.println();
	}
	
	public static void displayCreditMessage()
	{
		System.out.println();
		System.out.println("**************************");
		System.out.println(" YOUR CREDIT AMOUNT IS: " + MoneyManager.getCredit());
		System.out.println("**************************");
		System.out.println();
	}
    
	public static void displayFeedMoneyMessage()
	{
		System.out.println();
		System.out.println("*********************************************************");
		System.out.println("PLEASE FEED MONEY IN $1, $2, $5, OR $10 DENOMINATIONS");
		System.out.println("*********************************************************");
		System.out.println();
	}
	
	
	public static void displayFinishMessage(Change newChange)
	{
		System.out.println();
		System.out.println("************");
		System.out.println("QUARTERS: " + newChange.getQuarters());
		System.out.println("************");
		System.out.println();
		
		System.out.println();
		System.out.println("**********");
		System.out.println("DIMES: " + newChange.getDimes());
		System.out.println("**********");
		System.out.println();
		
		System.out.println();
		System.out.println("*********");
		System.out.println("NICKELS: " + newChange.getNickels());
		System.out.println("*********");
		System.out.println();
		
		System.out.println("********************************************");
		System.out.println("THANK YOU FOR YOUR PURCHASE, GOODBYE!!!");
		System.out.println("********************************************");
		System.out.println();
	}
}
