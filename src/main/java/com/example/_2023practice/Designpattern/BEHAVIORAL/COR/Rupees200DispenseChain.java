package com.example._2023practice.Designpattern.BEHAVIORAL.COR;

/**
 * @author KK JavaTutorials
 *Filter in the chain responsible to process Rs 200 note
 */
public class Rupees200DispenseChain implements MoneyDispenseChain {

	private MoneyDispenseChain moneyDispenseChain;
	
	@Override
	public void setNextChain(MoneyDispenseChain moneyDispenseChain) {
		this.moneyDispenseChain = moneyDispenseChain;
	}

	@Override
	public void dispense(Currency currency) {
		
		if(currency.getAmount() >=200) {
			int numberOfNotes = currency.getAmount()/200;
			int remainder = currency.getAmount() % 200;
			System.out.println("Depensing " + numberOfNotes  +" Notes of Rs 200");
			if(remainder !=0) {
				moneyDispenseChain.dispense(new Currency(remainder));
			}
				
		}else {
			moneyDispenseChain.dispense(currency);
		}
		
	}
}