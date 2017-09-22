package exercises;

import java.util.Scanner;

public class AscendingAndDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		int num3;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer. >>> ");
		num1 = input.nextInt();
		System.out.print("Enter another integer. >>> ");
		num2 = input.nextInt();
		System.out.print("Enter another integer. >>> ");
		num3 = input.nextInt();
		
		System.out.println("Ascending:");
		if (num1 > num2 && num2 > num3)
			System.out.println(num1 + " " + num2 + " " + num3);
		if (num1 > num3 && num3 > num2)
			System.out.println(num1 + " " + num3 + " " + num2);
		if (num2 > num3 && num3 > num1)
			System.out.println(num2 + " " + num3 + " " + num1);
		if (num2 > num1 && num1 > num3)
			System.out.println(num2 + " " + num1 + " " + num3);
		if (num3 > num1 && num1 > num2)
			System.out.println(num3 + " " + num1 + " " + num2);
		if (num3 > num2 && num2 > num1)
			System.out.println(num3 + " " + num2 + " " + num1);
		System.out.println("Descending:");
		if (num1 < num2 && num2 < num3)
			System.out.println(num1 + " " + num2 + " " + num3);
		if (num1 < num3 && num3 < num2)
			System.out.println(num1 + " " + num3 + " " + num2);
		if (num2 < num3 && num3 < num1)
			System.out.println(num2 + " " + num3 + " " + num1);
		if (num2 < num1 && num1 < num3)
			System.out.println(num2 + " " + num1 + " " + num3);
		if (num3 < num1 && num1 < num2)
			System.out.println(num3 + " " + num1 + " " + num2);
		if (num3 < num2 && num2 < num1)
			System.out.println(num3 + " " + num2 + " " + num1);
		
	}

}
