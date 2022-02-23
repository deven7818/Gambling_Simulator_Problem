package com.gambling;

import java.util.*;

public class GamblingUc3 {

	public static final int stakePay = 100;
	public static final int betPerGame = 1;
	public static final int win = 1;
	public static int stake = 0;
	
	/*Method to check it is win or loss*/
	public static void winCheck() {
		/*Generating Random value for bet*/
		Random random = new Random();
		int bet = random.nextInt(2);

		if (bet == win) {
			/* incrementing the stake*/
			stake++;
			System.out.println("Win");
		} else {
			/*Decrementing the stake */
			stake--;
			System.out.println("Loss");
		}
		System.out.println("Stake = " + stake);

	}
	
	
	public static void resignDay() {
		int totalstake = 0;
		while (stake != 50 && stake != -50) {
			winCheck();
		}
		totalstake = stake + stakePay;
		System.out.println("Total Stake for Resign Day is : " + totalstake);
		

	}
    public static void main(String[] args) {
    	System.out.println("Welcome to Gambling Simulation : ");
		/* Calling win check function */
		resignDay();   
    }

}