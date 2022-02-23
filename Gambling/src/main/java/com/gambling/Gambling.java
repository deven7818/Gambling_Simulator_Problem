package com.gambling;

import java.util.Scanner;

public class Gambling {

	public static void main(String[] args) {
		System.out.println("Enter the stake ammount");
		Scanner sc = new Scanner(System.in);
		int stake = sc.nextInt();
		
		int bet = (int)(Math.floor(Math.random() *10))/2;
		
		if(bet == 1) {
			System.out.println("gambler won");
			stake ++;
			System.out.println("Amount " +stake);
		}
		
		
		else if(bet == 0) {
			System.out.println("Gambler loss");
			stake --;
			System.out.println("Amount " +stake);
		}
		else {
			System.out.println("");
		}
		
		sc.close();

	}

}
