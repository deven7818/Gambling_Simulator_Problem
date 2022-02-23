package com.gambling;

import java.util.Random;

public class GamblingUc4 {

	public static final int stakePay = 100;
	public static final int betPerGame = 1;
	public static final int win = 1;
	public static int stake = 0;
	
	public static void winCheck() {
		Random random = new Random();
		int bet = random.nextInt(2);
		if(bet == win) {
			//Increment the stake
			stake++;
		}
		else {
			//decrement the stake
			stake--;
		}
	}
	
	/*
	 * Calculating stake if win or loss by 50% then resign for the day
	 */
	public static void resignDay() {
		int totalStake = 0;
		stake = 0;
		while(stake != 50 && stake != -50) {
			winCheck();
		}
		totalStake = stake + stakePay;
		System.out.println("Total stake for resign for a day is " + totalStake);
		
	}
	/*
	 * After 20 days , to know win or loss
	 */
	
	public static void twentyDaysOfPlay() {
		for(int day = 1; day<= 20; day ++) {
			System.out.println("Days " + day);
			resignDay();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Gambling Simulation ");
		twentyDaysOfPlay();

	}

}
