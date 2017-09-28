package exercises;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int response = 1;
		int number;
		Scanner input = new Scanner(System.in);
		while (response == 1) {
			System.out.print("Enter an integer. >>> ");
			number = input.nextInt();
			if (number % 2 == 0) {
				System.out.println("The number is even.");
			}
			else {
				System.out.println("The number is odd.");
			}
			System.out.println("Would you like to enter another int? 1 for yes, 2 for no. >>> ");
			response = input.nextInt();
		}
		System.out.println("You have exited the game.");
	}

}
