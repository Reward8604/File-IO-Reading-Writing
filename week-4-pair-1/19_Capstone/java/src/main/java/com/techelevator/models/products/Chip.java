package com.techelevator.models.products;

import java.math.BigDecimal;

public class Chip extends Products
{
	public Chip(String slotLocation, String productName, BigDecimal price, String type, Integer qty)
	{
		super(slotLocation, productName, price, type, qty);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getSound()
	{
		return "Crunch Crunct, Yum!";
	}

}
