package com.example._2023practice.Designpattern.BEHAVIORAL.COR;


/**
 * @author KK JavaTutorials
 *Every object in the chain will have to process the request,
 *either complete or partial,or to send it to the next object in the chain.
 */
public class ATMMachineDispenseChain {

	private MoneyDispenseChain moneyDispenseChain1;
	
	public ATMMachineDispenseChain() {
		moneyDispenseChain1 = new Rupees2000DispenseChain();
		MoneyDispenseChain moneyDispenseChain2 = new Rupees500DispenseChain();
		MoneyDispenseChain moneyDispenseChain3 = new Rupees200DispenseChain();
		MoneyDispenseChain moneyDispenseChain4 = new Rupees100DispenseChain();
		
		moneyDispenseChain1.setNextChain(moneyDispenseChain2);
		moneyDispenseChain2.setNextChain(moneyDispenseChain3);
		moneyDispenseChain3.setNextChain(moneyDispenseChain4);
	}
	
	public MoneyDispenseChain getMoneyDispenseChain1() {
		return moneyDispenseChain1;
	}
}