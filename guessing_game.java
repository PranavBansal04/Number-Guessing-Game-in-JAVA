package assignment;

import java.util.Random;
import java.util.Scanner;

public class guessing_game {

	public static void main(String[] args) {
		
		System.out.println("****************************************************************\r\n" + 
				"*************************GUESSING GAME**************************\r\n" + 
				"****************************************************************");
		
		System.out.println("I'll think of a number 1-15. You enter your guess, and I'll tell\r\n" + 
				"you if you're correct, too high, or too low. When you guess the\r\n" + 
				"number, I'll let you know how many guesses it took. You can play\r\n" + 
				"as many times as you like. When you quit, I'll let you know what\r\n" + 
				"your average number of guesses was across all game rounds.\r\n" +
				"");
		
		Random rand = new Random();
		
		Scanner sc = new Scanner(System.in);
		String choice;
		int round=1;
		int sum_guess=0;
		do {
			System.out.println("***ROUND #"+round+"***");
			int n = 1+rand.nextInt(15);
			int guess=1;
			System.out.println("I am thinking of a number 1-15. Guess#"+guess+": ");
			int num = sc.nextInt();
			 
			while(num!=n) {
				guess+=1;
				if(num<n) {
					System.out.println("Too low! Guess#"+guess+": ");
					num = sc.nextInt();
				}
				else {
					System.out.println("Too high! Guess#"+guess+": ");
					num = sc.nextInt();
				}
				
			}
			sum_guess+=guess;
			System.out.println("Correct! That took you "+guess+" tries.");
			System.out.println("Would you like to run the game again? Y/N -->");
			choice=sc.next().toLowerCase();
			round+=1;
		}while(choice.equals("y"));
		System.out.println("***********************************************");
		System.out.println("\t\tGame Summary :");
		System.out.println("\t\tRounds Played: "+round);
		float avg = sum_guess/round;
		double avg1 = Math.round(avg * 100.0) / 100.0;
		System.out.println("\tAverage guesses per round: "+avg);

	}

}
