package com.techelevator.models.exeptions;

import java.math.BigDecimal;

public class InsufficientFundsException extends Exception
{

	/**
	 * 
	 */
	
	private BigDecimal vendCartTotal;
    private BigDecimal paymentAmount;

    public InsufficientFundsException(String message, BigDecimal cartTotal, BigDecimal paymentAmount)
    {
        super(message);

        this.vendCartTotal = cartTotal;
        this.paymentAmount = paymentAmount;
    }

    public BigDecimal getCartTotal()
    {
        return this.vendCartTotal;
    }

    public BigDecimal getPaymentAmount()
    {
        return this.paymentAmount;
    }

    @Override
    public String getMessage() 
    {
        String message = super.getMessage();

        return message 
            + "\nCart Total: $" + vendCartTotal.toString()
            + "\nPayment: $" + paymentAmount.toString();
    }
	
}
