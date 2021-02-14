package com.techelevator.models.products;

import java.math.BigDecimal;

public class Candy extends Products
{
	public Candy(String slotLocation, String productName, BigDecimal price, String type, Integer qty)
	{
		super(slotLocation, productName, price, type, qty);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getSound()
	{
		return "Munch, Munch, Yum!";
	}
}
