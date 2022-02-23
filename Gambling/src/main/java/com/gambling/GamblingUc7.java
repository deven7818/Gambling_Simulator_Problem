package com.gambling;

import java.util.Random;

public class GamblingUc7 {
	
		public static final int stakePay = 100;
		public static final int betPerGame = 1;
		public static final int win = 1;
		public static int stake = 0;//initial gambler bet
		public static int dayWonCount = 0;
		public static int daysLossCount = 0;

		/*
		 * win Check function will check if gambler wins or loss
		 */

		public static void winCheck() {
			Random random = new Random();
			int betReturns = random.nextInt(2);
			if (betReturns == win) {
				stake++;// incrementing
			} else {
				stake--;// decrementing
			}

		}
		
		/*
		 * Calculative Gambler if won or lost 50% of the stake, would resign for the day
		 */

		public static void resignDay() {
			int totalStake = 0;
			stake = 0;
			while (stake != 50 && stake != -50) {
				winCheck();
			}
			totalStake = stake + stakePay;
			System.out.println("Total stake for resign for a day is  " + totalStake);

		}
		
		/*
		 * After 20 days , to know win or loss
		 */
		
		public static void twentyDaysOfPlay() {
			for(int day = 1; day<= 20; day ++) {
				System.out.println("Days " + day);
				resignDay();
				if(stake == 50) {
					dayWonCount++;
				}
				else if(stake == -50)  {
					daysLossCount--;
					
				}
			}
			
			System.out.printf("days won in a month = "+ dayWonCount + "\n lost in a month = " + daysLossCount);
		}
		/*
		 *Check for the Lucky or unlucky day 
		 */
		public static void checkLuck() {
			if(dayWonCount > daysLossCount) {
				System.out.println("\n It's a lucky Day");
			}
			else {
				System.out.println("\n It's Unlucky Day");
			}
		}
		
	/*
	 * continue or stop play	
	 */
		public static void continueStopPlay() {
			if(dayWonCount > daysLossCount) {
				System.out.println("You can continue play");
			}
		}
		public static void main(String[] args) {
			System.out.println("Welcome to Gambling Simulation");
			continueStopPlay();
			twentyDaysOfPlay();
			checkLuck();//calling CheckLuck function for checking Lucky or unLucky Day

		}

	}
