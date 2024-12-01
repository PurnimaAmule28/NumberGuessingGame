package pack1;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		
		int targetNumber=rand.nextInt(100)+1;
		int userGuess=0;
		int maxTries=10;
		
		System.out.println("Welcome to the number guessing game");
		System.out.println("You have 10 chances only......");
		
		for(int Attemp=1; Attemp<=maxTries;Attemp++) {
			System.out.println("Enter your guess : ");
			userGuess=sc.nextInt();
			
		if(userGuess==targetNumber) {
			System.out.println("Congratulations you won !!! ");
			break;
		}
		else if(userGuess<targetNumber) {
			System.out.println("The number is too low!!");
		}
		else {
			System.out.println("The number is too high!!");
		}
		if(Attemp==maxTries) {
			System.out.println("Sorry,you lost the game correct number was "+targetNumber+" .");
		}
		
		}	
		sc.close();
	}
	
	
   }
