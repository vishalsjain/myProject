package com.example._2023practice.Designpattern.BEHAVIORAL.COR;

/**
 * @author KK JavaTutorials
 *Filter in the chain responsible to process Rs 500 note
 */
public class Rupees500DispenseChain implements MoneyDispenseChain {

	private MoneyDispenseChain moneyDispenseChain;
	
	@Override
	public void setNextChain(MoneyDispenseChain moneyDispenseChain) {
		this.moneyDispenseChain = moneyDispenseChain;
	}

	@Override
	public void dispense(Currency currency) {
		
		if(currency.getAmount() >=500) {
			int numberOfNotes = currency.getAmount()/500;
			int remainder = currency.getAmount() % 500;
			System.out.println("Depensing " + numberOfNotes  +" Notes of Rs 500");
			if(remainder !=0) {
				moneyDispenseChain.dispense(new Currency(remainder));
			}
				
		}else {
			moneyDispenseChain.dispense(currency);
		}
		
	}

}