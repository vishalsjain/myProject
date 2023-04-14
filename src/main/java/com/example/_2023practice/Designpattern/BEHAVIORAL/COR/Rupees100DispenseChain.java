package com.example._2023practice.Designpattern.BEHAVIORAL.COR;

/**
 * @author KK JavaTutorials
 * Filter in the chain responsible to process Rs 100 note 
 */
public class Rupees100DispenseChain implements MoneyDispenseChain {

	private MoneyDispenseChain moneyDispenseChain;
	@Override
	public void setNextChain(MoneyDispenseChain moneyDispenseChain) {
		this.moneyDispenseChain = moneyDispenseChain;
	}

	@Override
	public void dispense(Currency currency) {
		
		if(currency.getAmount() >=100) {
			int numberOfNotes = currency.getAmount()/100;
			int remainder = currency.getAmount() % 100;
			System.out.println("Depensing " + numberOfNotes  +" Notes of Rs 100");
			if(remainder !=0) {
				moneyDispenseChain.dispense(new Currency(remainder));
			}
				
		}else {
			moneyDispenseChain.dispense(currency);
		}
		
	}

}