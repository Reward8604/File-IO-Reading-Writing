package com.techelevator.models;

public class Change
{

	private int quarters;
	private int dimes;
	private int nickels;
	
	
	public Change(int totalCents)
	{
	
		
		quarters = totalCents / 25;
		
		totalCents %= 25;
		
		dimes = totalCents / 10;
		
		totalCents %= 10;
		
		nickels = totalCents / 5;
		
		
		
	}


	public int getQuarters()
	{
		return quarters;
	}


	public int getDimes()
	{
		return dimes;
	}


	public int getNickels()
	{
		return nickels;
	}
	
	
	
	
}
