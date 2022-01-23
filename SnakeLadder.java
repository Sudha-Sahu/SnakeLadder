package com.game;
import java.util.Random;

public class SnakeLadder {

	static final int ladder=1;
	static final int snake=2;
	static final int noPlay=0;
	static final int startPosition = 0;
	static final int finalPosition=100;

	public static void main(String[] args) {
		
		System.out.println("Welcome to Snake and Ladder game!!!!");
		Random random=new Random();

		int currentPosi=0;
		while(currentPosi <= finalPosition) {
			int rollADie=random.nextInt(6)+1;
			System.out.println("We get a number after a rolling a die that is: "+rollADie);
			int checkNextRoll=random.nextInt(3);
			System.out.println("The player gets a condition: "+checkNextRoll);
			switch(checkNextRoll) {
			case noPlay:
				System.out.println("The player stay in same position that is: "+currentPosi);
				break;
			case ladder:
				System.out.println("The player reached at a ladder.... ");
				System.out.println("So you have to move forward from: "+currentPosi);
				currentPosi += rollADie;
				if(currentPosi == finalPosition)
					System.out.println("The player reached at winning Position i.e. 100, So Player won the game!!!!!!! ");
				else if( currentPosi > finalPosition) 
					currentPosi -= rollADie;
				else
					System.out.println("The current Position of player is: "+currentPosi);	
				break;
			case snake:
				System.out.println("The player reached at a snake.... ");
				System.out.println("So you have to move Backward from: "+currentPosi);
				currentPosi -= rollADie;
				if( currentPosi >= 0) {
					System.out.println("The current Position of player is: "+currentPosi);
				}
				else {
					currentPosi=0;
					System.out.println("The current Position of player is: "+currentPosi);
				}
				break;
			default:
				System.out.println("Its default case");
			}
		}
	}
}