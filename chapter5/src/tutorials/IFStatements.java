//Enter Your Age Program

	//Create a program that enters an age from a user.
package tutorials;//Package is called tutorials

import java.util.Scanner;

public class IFStatements {

	public static void main(String[] args) {
		int age;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter yoru age. >>>>>");
		age = input.nextInt();
		if(age <= 18) {
			System.out.println("User is 18 or younger.");
		}
		if (age >= 23 & age <= 30) {
			System.out.println("User is between the ages of 23 and 30.");
		}
		if (age >= 31 & age <= 50) {
			System.out.println("User is between the ages of 31 and 50.");
		}
		if (age >= 51 & age <= 65) {
			System.out.println("User is between the ages of 51 and 65.");
		}
		if (age >= 66 & age <= 100) {
			System.out.println("User is between the ages of 66 and 100.");
		}
	}

}
