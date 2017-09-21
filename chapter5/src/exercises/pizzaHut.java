package exercises;

import java.util.Scanner;

public class pizzaHut {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String choiceYes;
		String toppingsChoice;
		String size;
		String pizzaKind;
		String choiceHotDog;
		String toppingsAmount;
		double mediumCost = 9.99;
		double largeCost = 12.99;
		double smallCost = 6.99;
		double totalPrice;
		
		System.out.print("Would you like a pizza? Yes or No? >>>>>> ");
		choiceYes = input.nextLine();
		//this is where I am asking if they really want pizza
		if("Yes".equalsIgnoreCase(choiceYes)||"Y".equalsIgnoreCase(choiceYes))
		{
			System.out.println("You said " + choiceYes + " to having pizza.");
				System.out.print("Please choose a size: small, medium, or large? >>>>>> ");
				size = input.nextLine();
				if("small".equalsIgnoreCase(size))
				{
					System.out.println("You said " + size + " pizza size.");
					System.out.print("What kind of Pizza do you want? Pepperoni, Sausage, Chesse?");
					pizzaKind = input.nextLine();
					if("Pepperoni".equalsIgnoreCase(pizzaKind)||"Sausage".equalsIgnoreCase(pizzaKind)||
							"Cheese".equalsIgnoreCase(pizzaKind))
					{
						System.out.print("How many toppings would you like? None, one, two, three, four?");
						toppingsAmount = input.nextLine();
						if("none".equalsIgnoreCase(toppingsAmount))
						{
							System.out.print("You will get nothing on your pizza.");
							totalPrice = smallCost;
							System.out.println("Your total comes to $" + totalPrice);
						}
						if("one".equalsIgnoreCase(toppingsAmount))
						{
							System.out.print("What kind of topping do you want? Extra cheese, green peppers, black olives, onions?");
							toppingsChoice = input.nextLine();
							if("Extra cheese".equalsIgnoreCase(toppingsChoice)||"Green peppers".equalsIgnoreCase(toppingsChoice)
									||"Black olives".equalsIgnoreCase(toppingsChoice)||"Onions".equalsIgnoreCase(toppingsChoice))
							{
								System.out.println("You will get " + toppingsChoice + " on your pizza.");
								totalPrice = smallCost + 0.50;
								System.out.println("Your total comes to $" + totalPrice);
							}
						}
						if("two".equalsIgnoreCase(toppingsAmount))
						{
							System.out.print("What kind of toppings do you want? Extra cheese, green peppers, black olives, onions? "
									+ "Start with topping on most left and end with topping on most right. Ex: extra cheese and onions");
							toppingsChoice = input.nextLine();
							if("Extra cheese and green peppers".equalsIgnoreCase(toppingsChoice)
									||"Extra cheese and black olives".equalsIgnoreCase(toppingsChoice)
									||"Extra cheese and onions".equalsIgnoreCase(toppingsChoice)
									||"Green peppers and black olives".equalsIgnoreCase(toppingsChoice)
									||"Green peppers and onions".equalsIgnoreCase(toppingsChoice)
									||"Black olives and onions".equalsIgnoreCase(toppingsChoice))
							{
								System.out.println("You will get " + toppingsChoice + " on your pizza.");
								totalPrice = smallCost + 1.00;
								System.out.println("Your total comes to $" + totalPrice);
							}
						}
						if("three".equalsIgnoreCase(toppingsAmount))
						{
							System.out.print("What kind of toppings do you want? Extra cheese, green peppers, black olives, onions? "
									+ "Start with topping on most left and end with topping on most right. "
									+ "Ex: extra cheese, green peppers and onions");
							toppingsChoice = input.nextLine();
							if("Extra cheese, green peppers and black olives".equalsIgnoreCase(toppingsChoice)
									||"Extra cheese, green peppers and onions".equalsIgnoreCase(toppingsChoice)
									||"Extra cheese, black olives and onions".equalsIgnoreCase(toppingsChoice)
									||"Green peppers, black olives and onions".equalsIgnoreCase(toppingsChoice))
							{
								System.out.println("You will get " + toppingsChoice + " on your pizza.");
								totalPrice = smallCost + 1.50;
								System.out.println("Your total comes to $" + totalPrice);
							}
						}
						if("four".equalsIgnoreCase(toppingsAmount))
						{
							System.out.print("You will get extra cheese, green peppers, black olives, and onions on your pizza.");
							totalPrice = smallCost + 2.00;
							System.out.println("Your total comes to $" + totalPrice);
						}
					}
				}
				if ("medium".equalsIgnoreCase(size))
				{
					System.out.println("You said " + size + " pizza size.");
					System.out.print("What kind of Pizza do you want? Pepperoni, Sausage, Chesse?");
					pizzaKind = input.nextLine();
					if("Pepperoni".equalsIgnoreCase(pizzaKind)||"Sausage".equalsIgnoreCase(pizzaKind)||
							"Cheese".equalsIgnoreCase(pizzaKind))
					{
						System.out.print("How many toppings would you like? None, one, two, three, four?");
						toppingsAmount = input.nextLine();
						if("none".equalsIgnoreCase(toppingsAmount))
						{
							System.out.print("You will get nothing on your pizza.");
							totalPrice = mediumCost;
							System.out.println("Your total comes to $" + totalPrice);
						}
						if("one".equalsIgnoreCase(toppingsAmount))
						{
							System.out.print("What kind of topping do you want? Extra cheese, green peppers, black olives, onions?");
							toppingsChoice = input.nextLine();
							if("Extra cheese".equalsIgnoreCase(toppingsChoice)||"Green peppers".equalsIgnoreCase(toppingsChoice)
									||"Black olives".equalsIgnoreCase(toppingsChoice)||"Onions".equalsIgnoreCase(toppingsChoice))
							{
								System.out.println("You will get " + toppingsChoice + " on your pizza.");
								totalPrice = mediumCost + 0.50;
								System.out.println("Your total comes to $" + totalPrice);
							}
						}
						if("two".equalsIgnoreCase(toppingsAmount))
						{
							System.out.print("What kind of toppings do you want? Extra cheese, green peppers, black olives, onions? "
									+ "Start with topping on most left and end with topping on most right. Ex: extra cheese and onions");
							toppingsChoice = input.nextLine();
							if("Extra cheese and green peppers".equalsIgnoreCase(toppingsChoice)
									||"Extra cheese and black olives".equalsIgnoreCase(toppingsChoice)
									||"Extra cheese and onions".equalsIgnoreCase(toppingsChoice)
									||"Green peppers and black olives".equalsIgnoreCase(toppingsChoice)
									||"Green peppers and onions".equalsIgnoreCase(toppingsChoice)
									||"Black olives and onions".equalsIgnoreCase(toppingsChoice))
							{
								System.out.println("You will get " + toppingsChoice + " on your pizza.");
								totalPrice = mediumCost + 1.00;
								System.out.println("Your total comes to $" + totalPrice);
							}
						}
						if("three".equalsIgnoreCase(toppingsAmount))
						{
							System.out.print("What kind of toppings do you want? Extra cheese, green peppers, black olives, onions? "
									+ "Start with topping on most left and end with topping on most right. "
									+ "Ex: extra cheese, green peppers and onions");
							toppingsChoice = input.nextLine();
							if("Extra cheese, green peppers and black olives".equalsIgnoreCase(toppingsChoice)
									||"Extra cheese, green peppers and onions".equalsIgnoreCase(toppingsChoice)
									||"Extra cheese, black olives and onions".equalsIgnoreCase(toppingsChoice)
									||"Green peppers, black olives and onions".equalsIgnoreCase(toppingsChoice))
							{
								System.out.println("You will get " + toppingsChoice + " on your pizza.");
								totalPrice = mediumCost + 1.50;
								System.out.println("Your total comes to $" + totalPrice);
							}
						}
						if("four".equalsIgnoreCase(toppingsAmount))
						{
							System.out.print("You will get extra cheese, green peppers, black olives, and onions on your pizza.");
							totalPrice = mediumCost + 2.00;
							System.out.println("Your total comes to $" + totalPrice);
						}
					}
				}
				if ("large".equalsIgnoreCase(size))
				{
					System.out.println("You said " + size + " pizza size.");
					System.out.print("What kind of Pizza do you want? Pepperoni, Sausage, Chesse?");
					pizzaKind = input.nextLine();
					if("Pepperoni".equalsIgnoreCase(pizzaKind)||"Sausage".equalsIgnoreCase(pizzaKind)||
							"Cheese".equalsIgnoreCase(pizzaKind))
					{
						System.out.print("How many toppings would you like? None, one, two, three, four?");
						toppingsAmount = input.nextLine();
						if("none".equalsIgnoreCase(toppingsAmount))
						{
							System.out.print("You will get nothing on your pizza.");
							totalPrice = largeCost;
							System.out.println("Your total comes to $" + totalPrice);
						}
						if("one".equalsIgnoreCase(toppingsAmount))
						{
							System.out.print("What kind of topping do you want? Extra cheese, green peppers, black olives, onions?");
							toppingsChoice = input.nextLine();
							if("Extra cheese".equalsIgnoreCase(toppingsChoice)||"Green peppers".equalsIgnoreCase(toppingsChoice)
									||"Black olives".equalsIgnoreCase(toppingsChoice)||"Onions".equalsIgnoreCase(toppingsChoice))
							{
								System.out.println("You will get " + toppingsChoice + " on your pizza.");
								totalPrice = largeCost + 0.50;
								System.out.println("Your total comes to $" + totalPrice);
							}
						}
						if("two".equalsIgnoreCase(toppingsAmount))
						{
							System.out.print("What kind of toppings do you want? Extra cheese, green peppers, black olives, onions? "
									+ "Start with topping on most left and end with topping on most right. Ex: extra cheese and onions");
							toppingsChoice = input.nextLine();
							if("Extra cheese and green peppers".equalsIgnoreCase(toppingsChoice)
									||"Extra cheese and black olives".equalsIgnoreCase(toppingsChoice)
									||"Extra cheese and onions".equalsIgnoreCase(toppingsChoice)
									||"Green peppers and black olives".equalsIgnoreCase(toppingsChoice)
									||"Green peppers and onions".equalsIgnoreCase(toppingsChoice)
									||"Black olives and onions".equalsIgnoreCase(toppingsChoice))
							{
								System.out.println("You will get " + toppingsChoice + " on your pizza.");
								totalPrice = largeCost + 1.00;
								System.out.println("Your total comes to $" + totalPrice);
							}
						}
						if("three".equalsIgnoreCase(toppingsAmount))
						{
							System.out.print("What kind of toppings do you want? Extra cheese, green peppers, black olives, onions? "
									+ "Start with topping on most left and end with topping on most right. "
									+ "Ex: extra cheese, green peppers and onions");
							toppingsChoice = input.nextLine();
							if("Extra cheese, green peppers and black olives".equalsIgnoreCase(toppingsChoice)
									||"Extra cheese, green peppers and onions".equalsIgnoreCase(toppingsChoice)
									||"Extra cheese, black olives and onions".equalsIgnoreCase(toppingsChoice)
									||"Green peppers, black olives and onions".equalsIgnoreCase(toppingsChoice))
							{
								System.out.println("You will get " + toppingsChoice + " on your pizza.");
								totalPrice = largeCost + 1.50;
								System.out.println("Your total comes to $" + totalPrice);
							}
						}
						if("four".equalsIgnoreCase(toppingsAmount))
						{
							System.out.print("You will get extra cheese, green peppers, black olives, and onions on your pizza.");
							totalPrice = largeCost + 2.00;
							System.out.println("Your total comes to $" + totalPrice);
						}
					}
				}
		}
		if("No".equalsIgnoreCase(choiceYes)||"N".equalsIgnoreCase(choiceYes))
		{
			System.out.print("Would you like a hot dog? Yes or No?");
			choiceHotDog = input.nextLine();
			if ("Yes".equalsIgnoreCase(choiceHotDog)||"Y".equalsIgnoreCase(choiceHotDog))
			{
				System.out.println("You ordered a hot dog.");
				totalPrice = 4.99;
				System.out.println("Your total comes to $" + totalPrice);
			}
			if ("No".equalsIgnoreCase(choiceHotDog)||"N".equalsIgnoreCase(choiceHotDog))
			{
				System.out.println("Then why are you here?");
			}
		}
	}
}
