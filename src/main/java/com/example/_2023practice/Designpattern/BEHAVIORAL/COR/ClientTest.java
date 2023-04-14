package com.example._2023practice.Designpattern.BEHAVIORAL.COR;

import java.util.Scanner;

/**
 * @author KK JavaTutorials
 * Client Program which accepts amount for processing
 * if Entered amount is not multiple of Rs 100 
 * Than it will print message
 * "Amount should be multiple of Rs 100"
 * and end the process
 */
public class ClientTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ATMMachineDispenseChain  atmMachineDispenseChain = new ATMMachineDispenseChain();
		
		Scanner scanner = null;
		while (true) {
			int amout = 0;
 			try {
				System.out.println("Please enter amout to despense:");
				scanner = new Scanner(System.in);
				amout= scanner.nextInt();
				
				if(amout %100 !=0) {
					System.out.println("Amount should be multiple of Rs 100");
					return;
				}else {
					atmMachineDispenseChain.getMoneyDispenseChain1().dispense(new Currency(amout));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}