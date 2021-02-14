package com.techelevator.models;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.techelevator.models.exeptions.InsufficientFundsException;
import com.techelevator.models.products.Products;

public class MoneyManager
{
	private static BigDecimal credit = BigDecimal.ZERO;
	private static BigDecimal change = BigDecimal.ZERO;
	// update to just take the productAmount
	public static void purchase(BigDecimal amountOwed) 
	{
		
		//calculate new credit
		BigDecimal newCredit = credit.subtract(amountOwed);

		// throw an exception if the credit is not enough
		if(newCredit.compareTo(BigDecimal.ZERO) < 0 )
		{
			new InsufficientFundsException("The current credit is not sufficient, please add more money.", amountOwed, credit);
		}
		
		// only update if the transaction succeeds
		credit = newCredit;
	}

	public static BigDecimal getCredit()
	{ 
		return credit;
	}
	
	public static void feedMoney(BigDecimal amount)
	{
		//update the credit by adding the new amount
		
		credit = credit.add(amount);
//	    Scanner keyboard = new Scanner(System.in);
//	    BigDecimal money = new BigDecimal(0);
//	    System.out.println("Your item costs: " + Price + " Please enter the amount of money:");
//	    money = keyboard.nextBigDecimal();
//	    while (money) < Price)
//	    {
//	        System.out.println("Please insert sufficient funds");
//	        money = money + keyboard.nextBigDecimal();
//	    }
//	    return money - Price ;
	}
//	// method to add money to the credit
//
	public static Change getChange ()
	{
		int penniesCents = credit.multiply(new BigDecimal(100)).intValue();
		Change change = new Change (penniesCents);
		credit = BigDecimal.ZERO; // given change to empty wallet
		return change;
		
	}
//	// method to calculate the change
//	
}
