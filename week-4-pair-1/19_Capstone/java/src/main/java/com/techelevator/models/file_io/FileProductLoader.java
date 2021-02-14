package com.techelevator.models.file_io;

import java.io.File;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import com.techelevator.models.products.*;

// Dependencies:
// 			Inventory

public class FileProductLoader
{
   private Map<String, Products> products = new HashMap<String, Products>();
	
   
   
   public Map<String, Products> getProducts()
	{
	   Map<String, Products> products = new TreeMap<String, Products>();
	   
		File productsPath = new File("vendingmachine.csv");		
		try(Scanner fileScanner = new Scanner(productsPath))
		{	
			//loop and add each product to the list
			while(fileScanner.hasNextLine())
			{
				String line = fileScanner.nextLine();
				// create the product
				String[] parts = line.split("\\|");
				
				String slotLocation = parts[0];
				String productName = parts[1];
				BigDecimal price = new BigDecimal(parts[2]);
				String type = parts[3];
				int qty = 5;
				
				Products product = null;
				
				if(type.equals("Chip"))
				{
					product = new Chip(slotLocation, productName, price, type, qty);
				}
				
				else if (type.equals("Drink"))
				{
					product = new Drink(slotLocation, productName, price, type, qty);
				}
				else if (type.equals("Candy"))
				{
					product = new Candy(slotLocation, productName, price, type, qty);
				}

				else 
				{
					product = new Gum(slotLocation, productName, price, type, qty);
				}
					
								
				// add it to the list
				products.put(slotLocation, product);
			}
		}
		catch(Exception ex)
		{
			
		}
		
		return products;
	}
	
}
