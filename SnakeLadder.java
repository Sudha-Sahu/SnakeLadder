package com.game;
import java.util.Random;

public class SnakeLadder {
	
	static int startPosition = 0;
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Snake and Ladder game!!!!");
		System.out.println("Initially the player is at start position that is : "+startPosition);
		
		Random random=new Random(); 
		int rollADie=random.nextInt(6)+1;
		System.out.println("We get a number after a rolling a die that is: " + rollADie);
	}
}
