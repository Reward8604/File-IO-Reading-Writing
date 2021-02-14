package com.techelevator.models;
import java.util.HashMap;
import java.util.Map;
import com.techelevator.models.file_io.FileProductLoader;
import com.techelevator.models.products.Products;

public class Inventory
{
	private Map<String, Products> products = new HashMap<String, Products>();
		
		public Map<String,Products> getProducts()
		{
			return products;
		}
	
		public Inventory()
		{
			loadInventory();
		}
		
	
	    private void loadInventory()
	    {
	        // Inventory should NOT know how to read from a file
	        // we will use the FileProductLoader to get the products
	    	FileProductLoader loader = new FileProductLoader();
	    	products = loader.getProducts();
	    }
    
	  public Products getProductBySlotLocation(String slot)
	  {
		  return products.get(slot.toUpperCase());
	  }

//	  public  Products updateInventory()
//	  {
//		  FileProductLoader number = new FileProductLoader();
//		  products = number.getProducts().containsValue();
//	  }
	  
}

