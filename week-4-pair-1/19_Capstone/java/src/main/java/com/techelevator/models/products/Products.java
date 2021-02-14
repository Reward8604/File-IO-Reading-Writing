package com.techelevator.models.products;

import java.math.BigDecimal;

public class Products
{

	    String slotLocation;
	    String productName;
	    BigDecimal price;
		String type;
		Integer qty;
	    
		public Products(String slotLocation, String productName, BigDecimal price, String type, Integer qty)
		{
			this.slotLocation = slotLocation;
			this.productName = productName;
			this.price = price;
			this.type = type;
			this.qty = qty;
		}


		public String getSlotLocation()
		{
			return slotLocation;
		}

		public String getProductName()
		{
			return productName;
		}

		public BigDecimal getPrice()
		{
			return price;
		}
		
		public String getType()
		{
			return type;
		}
		
		public Integer getQty() 
		{
			return qty;
		}
		
		public void purchase()
		{
			qty--;
		}
		
		public String getSound()
		{
			return "...default sound...";
		}
		   
		
		@Override
		public String toString()
		{
			return slotLocation + ") " + productName + " - $" + price + " " + type + " --> " + qty;
		}
}
