package exercises;

import java.util.Scanner;

public class pizzaHut {
	
	public static String size;
	public static String pizzaKind;
	public static String toppingsChoice;
	public static String toppingsAmountString;
	public static int toppingsAmount;
	public static final double MEDIUM_COST = 9.99;
	public static final double LARGE_COST = 12.99;
	public static final double SMALL_COST = 6.99;
	public static final double TOPPINGS_COST = 0.50;
	public static final double totalPrice = 0.00;
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String choiceYes;
		String choiceHotDog;
		final double HOT_DOG_COST = 4.99;
		
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
					type();
					if("Pepperoni".equalsIgnoreCase(pizzaKind)||"Sausage".equalsIgnoreCase(pizzaKind)||
							"Cheese".equalsIgnoreCase(pizzaKind))
					{
						System.out.print("How many toppings would you like? 0, 1, 2, 3, 4?");
						toppingsAmountString = input.nextLine();
						if("0".equals(toppingsAmountString))
						{
							smallPrice();
						}
						if("1".equals(toppingsAmountString))
						{
							one();
							if("Extra cheese".equalsIgnoreCase(toppingsChoice)||"Green peppers".equalsIgnoreCase(toppingsChoice)
									||"Black olives".equalsIgnoreCase(toppingsChoice)||"Onions".equalsIgnoreCase(toppingsChoice))
							{
								smallPrice();
							}
						}
						if("2".equals(toppingsAmountString))
						{
							two();
							if("Extra cheese and green peppers".equalsIgnoreCase(toppingsChoice)
									||"Extra cheese and black olives".equalsIgnoreCase(toppingsChoice)
									||"Extra cheese and onions".equalsIgnoreCase(toppingsChoice)
									||"Green peppers and black olives".equalsIgnoreCase(toppingsChoice)
									||"Green peppers and onions".equalsIgnoreCase(toppingsChoice)
									||"Black olives and onions".equalsIgnoreCase(toppingsChoice))
							{
								smallPrice();
							}
						}
						if("3".equals(toppingsAmountString))
						{
							three();
							if("Extra cheese, green peppers and black olives".equalsIgnoreCase(toppingsChoice)
									||"Extra cheese, green peppers and onions".equalsIgnoreCase(toppingsChoice)
									||"Extra cheese, black olives and onions".equalsIgnoreCase(toppingsChoice)
									||"Green peppers, black olives and onions".equalsIgnoreCase(toppingsChoice))
							{
								smallPrice();
							}
						}
						if("4".equals(toppingsAmountString))
						{
							toppingsChoice = "extra cheese, green peppers, black olives, and onions";
							smallPrice();
						}
					}
				}
				if ("medium".equalsIgnoreCase(size))
				{
					type();
					if("Pepperoni".equalsIgnoreCase(pizzaKind)||"Sausage".equalsIgnoreCase(pizzaKind)||
							"Cheese".equalsIgnoreCase(pizzaKind))
					{
						System.out.print("How many toppings would you like? 0, 1, 2, 3, 4?");
						toppingsAmountString = input.nextLine();
						if("0".equals(toppingsAmountString))
						{
							mediumPrice();
						}
						if("1".equals(toppingsAmountString))
						{
							one();
							if("Extra cheese".equalsIgnoreCase(toppingsChoice)||"Green peppers".equalsIgnoreCase(toppingsChoice)
									||"Black olives".equalsIgnoreCase(toppingsChoice)||"Onions".equalsIgnoreCase(toppingsChoice))
							{
								mediumPrice();
							}
						}
						if("2".equals(toppingsAmountString))
						{
							two();
							if("Extra cheese and green peppers".equalsIgnoreCase(toppingsChoice)
									||"Extra cheese and black olives".equalsIgnoreCase(toppingsChoice)
									||"Extra cheese and onions".equalsIgnoreCase(toppingsChoice)
									||"Green peppers and black olives".equalsIgnoreCase(toppingsChoice)
									||"Green peppers and onions".equalsIgnoreCase(toppingsChoice)
									||"Black olives and onions".equalsIgnoreCase(toppingsChoice))
							{
								mediumPrice();
							}
						}
						if("3".equals(toppingsAmountString))
						{
							three();
							if("Extra cheese, green peppers and black olives".equalsIgnoreCase(toppingsChoice)
									||"Extra cheese, green peppers and onions".equalsIgnoreCase(toppingsChoice)
									||"Extra cheese, black olives and onions".equalsIgnoreCase(toppingsChoice)
									||"Green peppers, black olives and onions".equalsIgnoreCase(toppingsChoice))
							{
								mediumPrice();
							}
						}
						if("4".equals(toppingsAmountString))
						{
							toppingsChoice = "extra cheese, green peppers, black olives, and onions";
							mediumPrice();
						}
					}
				}
				if ("large".equalsIgnoreCase(size))
				{
					type();
					if("Pepperoni".equalsIgnoreCase(pizzaKind)||"Sausage".equalsIgnoreCase(pizzaKind)||
							"Cheese".equalsIgnoreCase(pizzaKind))
					{
						System.out.print("How many toppings would you like? 0, 1, 2, 3, 4?");
						toppingsAmountString = input.nextLine();
						if("0".equals(toppingsAmountString))
						{
							largePrice();
						}
						if("1".equals(toppingsAmountString))
						{
							one();
							if("Extra cheese".equalsIgnoreCase(toppingsChoice)||"Green peppers".equalsIgnoreCase(toppingsChoice)
									||"Black olives".equalsIgnoreCase(toppingsChoice)||"Onions".equalsIgnoreCase(toppingsChoice))
							{
								largePrice();
							}
						}
						if("2".equals(toppingsAmountString))
						{
							two();
							if("Extra cheese and green peppers".equalsIgnoreCase(toppingsChoice)
									||"Extra cheese and black olives".equalsIgnoreCase(toppingsChoice)
									||"Extra cheese and onions".equalsIgnoreCase(toppingsChoice)
									||"Green peppers and black olives".equalsIgnoreCase(toppingsChoice)
									||"Green peppers and onions".equalsIgnoreCase(toppingsChoice)
									||"Black olives and onions".equalsIgnoreCase(toppingsChoice))
							{
								largePrice();
							}
						}
						if("3".equals(toppingsAmountString))
						{
							three();
							toppingsChoice = input.nextLine();
							if("Extra cheese, green peppers and black olives".equalsIgnoreCase(toppingsChoice)
									||"Extra cheese, green peppers and onions".equalsIgnoreCase(toppingsChoice)
									||"Extra cheese, black olives and onions".equalsIgnoreCase(toppingsChoice)
									||"Green peppers, black olives and onions".equalsIgnoreCase(toppingsChoice))
							{
								largePrice();
							}
						}
						if("4".equals(toppingsAmountString))
						{
							toppingsChoice = "extra cheese, green peppers, black olives, and onions";
							largePrice();
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
				totalPrice = HOT_DOG_COST;
				System.out.println("Your total comes to $" + totalPrice);
			}
			if ("No".equalsIgnoreCase(choiceHotDog)||"N".equalsIgnoreCase(choiceHotDog))
			{
				System.out.println("Then why are you here?");
			}
		}
	}
	public static void type()
	{
		System.out.println("You said " + size + " pizza size.");
		System.out.print("What kind of Pizza do you want? Pepperoni, Sausage, Chesse?");
		pizzaKind = input.nextLine();
	}
	public static void smallPrice()
	{
		toppingsAmount = Integer.parseInt(toppingsAmountString);
		System.out.println("You will get " + toppingsChoice + " on your pizza.");
		totalPrice = totalPrice + SMALL_COST + TOPPINGS_COST * toppingsAmount;
		System.out.println("Your total comes to $" + totalPrice);
	}
	public static void mediumPrice()
	{
		toppingsAmount = Integer.parseInt(toppingsAmountString);
		System.out.println("You will get " + toppingsChoice + " on your pizza.");
		totalPrice = totalPrice + MEDIUM_COST + TOPPINGS_COST * toppingsAmount;
		System.out.println("Your total comes to $" + totalPrice);
	}
	public static void largePrice()
	{
		toppingsAmount = Integer.parseInt(toppingsAmountString);
		System.out.println("You will get " + toppingsChoice + " on your pizza.");
		totalPrice = totalPrice + LARGE_COST + TOPPINGS_COST * toppingsAmount;
		System.out.println("Your total comes to $" + totalPrice);
	}
	public static void one()
	{
		System.out.print("What kind of topping do you want? Extra cheese, green peppers, black olives, onions?");
		toppingsChoice = input.nextLine();
	}
	public static void two()
	{
		System.out.print("What kind of toppings do you want? Extra cheese, green peppers, black olives, onions? "
				+ "Start with topping on most left and end with topping on most right. Ex: extra cheese and onions");
		toppingsChoice = input.nextLine();
	}
	public static void three()
	{
		System.out.print("What kind of toppings do you want? Extra cheese, green peppers, black olives, onions? "
				+ "Start with topping on most left and end with topping on most right. "
				+ "Ex: extra cheese, green peppers and onions");
		toppingsChoice = input.nextLine();
	}
}
