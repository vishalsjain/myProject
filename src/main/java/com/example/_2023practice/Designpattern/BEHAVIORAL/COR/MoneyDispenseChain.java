package com.example._2023practice.Designpattern.BEHAVIORAL.COR;

/**
 * @author KK JavaTutorials
 * Contract to process request in chain and 
 * dispense
 */
public interface MoneyDispenseChain {

	public abstract void setNextChain(MoneyDispenseChain moneyDispenseChain);
	public abstract void dispense(Currency currency);
}