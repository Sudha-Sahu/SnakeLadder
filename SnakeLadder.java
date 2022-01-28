package com.Bridgelabz.SnakeLadder;
import java.util.Random;

public class SnakeLadder {

	static final int STARTPOSITION = 0;
	static final int FINALPOSITION=100;

	public static void playGame(int posi1, int posi2) {

		int countDie1=0, countDie2=0, dice1=0 , dice2=0;
		Random random=new Random();
		while(posi1 < FINALPOSITION && posi2 < FINALPOSITION) {
			dice1 = random.nextInt(6)+1;
			countDie1++;
			System.out.println("Player1 get : "+ dice1);
			int checkNextRoll=random.nextInt(3);
			System.out.println("The player1 gets a condition: "+checkNextRoll);
			posi1 = check(checkNextRoll, posi1, dice1);

			if( posi1 == FINALPOSITION) {
				System.out.println("The player1 reached at winning Position, So Player1 won the game!!!!!!! ");
				System.out.println(countDie1+" number of times the dice was rolled to win the game...");
				break;
			}
			else if( posi1 > FINALPOSITION) 
				posi1 -= dice1;
			else 
				System.out.println("The current Position of player1 is: "+ posi1);

			dice2 = random.nextInt(6)+1;
			countDie2++;
			System.out.println("Player2 get : "+ dice2);
			checkNextRoll=random.nextInt(3);
			System.out.println("The player2 gets a condition: "+checkNextRoll);
			posi2 = check(checkNextRoll, posi2, dice2);

			if( posi2 == FINALPOSITION) {
				System.out.println("The player2 reached at winning Position, So Player2 won the game!!!!!!! ");
				System.out.println(countDie2+" number of times the dice was rolled to win the game...");
				break;
			}
			else if( posi2 > FINALPOSITION) 
				posi2 -= dice2;
			else 
				System.out.println("The current Position of player2 is: "+ posi2);

		}
	}


	public static int check(int checkNextRoll, int posi, int roll) {

		switch(checkNextRoll) {
		case 1:
			System.out.println("The player reached at a ladder.... ");
			System.out.println("So you have to move forward from: "+ posi);
			posi += roll;
			break;
		case 2:
			System.out.println("The player reached at a snake.... ");
			System.out.println("So you have to move Backward from: "+ posi);
			posi -= roll;
			if( posi > 0) 
				System.out.println("The current Position of player is: "+posi);
			else 
				posi=0;
			break;
		default:
			System.out.println("Its default case");
		}
		return posi;
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Snake and Ladder game!!!!");
		int currentPosi1=0 , currentPosi2=0;
		playGame(currentPosi1 , currentPosi2);

	}

}