package exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DelgadosTacos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
		tacoTruck();
	}
	public static void menu() {
		double tacoPrice = 1.99;
		double burritoPrice = 2.99;
		double enchiladaPrice = 2.99;
		double popPrice = 1.49;
		double tacoSaladPrice = 2.49;
		double tostadaPrice = 2.99;
		double quesadillaPrice = 3.99;
		double fajitaPrice = 4.99;
		double flautaPrice = 4.49;
		double sanchoPrice = 3.99;
		int tacoAmountOrdered;
		int burritoAmountOrdered;
		int enchiladaAmountOrdered;
		int popAmountOrdered;
		int tacoSaladAmountOrdered;
		int tostadaAmountOrdered;
		int quesadillaAmountOrdered;
		int fajitaAmountOrdered;
		int flautaAmountOrdered;
		int sanchoAmountOrdered;
		double tacoPriceTotal;
		double burritoPriceTotal;
		double enchiladaPriceTotal;
		double popPriceTotal;
		double tacoSaladPriceTotal;
		double tostadaPriceTotal;
		double quesadillaPriceTotal;
		double fajitaPriceTotal;
		double flautaPriceTotal;
		double sanchoPriceTotal;
		double totalWithoutTax;
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many tacos do you want? ");
		tacoAmountOrdered = input.nextInt();
		tacoPriceTotal = tacoAmountOrdered * tacoPrice;
		System.out.println("You ordered " + tacoAmountOrdered + " which will cost $" + tacoPriceTotal);
		System.out.print("How many burritos do you want? ");
		burritoAmountOrdered = input.nextInt();
		burritoPriceTotal = burritoAmountOrdered * burritoPrice;
		System.out.println("You ordered " + burritoAmountOrdered + " which will cost $" + burritoPriceTotal);
		System.out.print("How many enchiladas do you want? ");
		enchiladaAmountOrdered = input.nextInt();
		enchiladaPriceTotal = enchiladaAmountOrdered * enchiladaPrice;
		System.out.println("You ordered " + enchiladaAmountOrdered + " which will cost $" + enchiladaPriceTotal);
		System.out.print("How many pops do you want? ");
		popAmountOrdered = input.nextInt();
		popPriceTotal = popAmountOrdered * popPrice;
		System.out.println("You ordered " + popAmountOrdered + " which will cost $" + popPriceTotal);
		System.out.print("How many taco salads do you want? ");
		tacoSaladAmountOrdered = input.nextInt();
		tacoSaladPriceTotal = tacoSaladAmountOrdered * tacoSaladPrice;
		System.out.println("You ordered " + tacoSaladAmountOrdered + " which will cost $" + tacoSaladPriceTotal);
		System.out.print("How many tostadas do you want? ");
		tostadaAmountOrdered = input.nextInt();
		tostadaPriceTotal = tostadaAmountOrdered * tostadaPrice;
		System.out.println("You ordered " + tostadaAmountOrdered + " which will cost $" + tostadaPriceTotal);
		System.out.print("How many quesadillas do you want? ");
		quesadillaAmountOrdered = input.nextInt();
		quesadillaPriceTotal = quesadillaAmountOrdered * quesadillaPrice;
		System.out.println("You ordered " + quesadillaAmountOrdered + " which will cost $" + quesadillaPriceTotal);
		System.out.print("How many fajitas do you want? ");
		fajitaAmountOrdered = input.nextInt();
		fajitaPriceTotal = fajitaAmountOrdered * fajitaPrice;
		System.out.println("You ordered " + fajitaAmountOrdered + " which will cost $" + fajitaPriceTotal);
		System.out.print("How many flautas do you want? ");
		flautaAmountOrdered = input.nextInt();
		flautaPriceTotal = flautaAmountOrdered * flautaPrice;
		System.out.println("You ordered " + flautaAmountOrdered + " which will cost $" + flautaPriceTotal);
		System.out.print("How many sanchos do you want? ");
		sanchoAmountOrdered = input.nextInt();
		sanchoPriceTotal = sanchoAmountOrdered * sanchoPrice;
		System.out.println("You ordered " + sanchoAmountOrdered + " which will cost $" + sanchoPriceTotal);
		
		totalWithoutTax = tacoPriceTotal + burritoPriceTotal + enchiladaPriceTotal + popPriceTotal + tacoSaladPriceTotal +
				tostadaPriceTotal + quesadillaPriceTotal + fajitaPriceTotal + flautaPriceTotal + sanchoPriceTotal
		System.out.println("Your total without tax is $" + totalWithoutTax);
		salesTax(totalWithoutTax);
	}
	public static void salesTax(double totalWithoutTax) {
		double totalWithTax;
		final double TAX = 1.075;
		
		totalWithTax = totalWithoutTax * TAX;
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Your total with tax comes to $" + (df.format(totalWithTax)));
	}
	public static void tacoTruck() {
		System.out.println("        ___________________________________________________________________");
		System.out.println("       /        |                          Delgado's                      |");
		System.out.println("      /         |                            Tacos                        |");
		System.out.println("     /  _____   |              _________________________________          |");
		System.out.println("    /  /     |  |              |                               |          |");
		System.out.println("   /  /      |  |              |                               |          |");
		System.out.println("  /  /       |  |              |                               |          |");
		System.out.println(" /  /        |  |              |                               |          |");
		System.out.println("/  /_________|  |              |                               |          |");
		System.out.println("|  |         |  |              |                               |          |");
		System.out.println("|  |         |  |              |                               |          |");
		System.out.println("|  |         |  |              |_______________________________|          |");
		System.out.println("|  |_________|  |                                                         |");
		System.out.println("___________________________________________________________________________");
		System.out.println("             _                                                   _    ");
		System.out.println("           /   \                                               /   \  ");
		System.out.println("           \ _ /                                               \ _ /  ");
	}

}
