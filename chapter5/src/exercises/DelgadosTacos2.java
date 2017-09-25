package exercises;

import java.util.Scanner;

public class DelgadosTacos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice1;
		Scanner input = new Scanner(System.in);
		System.out.print("Please choose a 1 for taco or 2 for burrito>>>");
		choice1 = input.nextInt();
		//Switched
		if (choice1 == 1) {
			System.out.println("You chose a burrito.");
		}
		if (choice1 == 2) {
			System.out.println("You chose a taco.");
		}
		if (choice1 >= 3 && choice1 <= 999) {
			System.out.println("I said 1 or 2 not " + choice1);
		}
		if (choice1 >= 1000 && choice1 <= 9999) {
			System.out.println("You're wrong because that was not an option.");
		}
		if (choice1 > 9999) {
			System.out.println("If you go any higher than 2147000000, the program won't work because the system " +
					"does not accept integers that big. That is because it is 32-bit.");
		}
	}
}
