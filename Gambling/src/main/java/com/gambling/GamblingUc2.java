package com.gambling;
import java.util.*;
public class GamblingUc2 {

	public static final int stakePay = 100;
	public static final int betPerGame = 1;
	public static int win = 1;
	public static int stake = 0;
	
	
	/*win check condition*/
	public static void winCheck() {
		Random random = new Random();
		int bet =  random.nextInt(2);
		
		if (bet ==  win) {
			stake++; /*incrementing stake*/
			System.out.println("Gambler Wins");
		}
		else {
			stake--;/*Decrement the stake */
			System.out.println("Gambler Loss");
		}
		System.out.println("Stake = " +stake);
	}
	
	public static void main(String args[]) {
		System.out.println("Welcome to Gambling Simulation");
		/*Calling the winCheck function*/
		winCheck();
	}
	
}
