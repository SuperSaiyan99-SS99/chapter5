package exercises;

import javax.swing.JOptionPane;

public class CondoSales2 {
	public static String parking;
	public static int price = 0;
	public static final int GARAGE_PRICE = 5000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int PARK_PRICE = 150000;
		final int GOLF_COURSE_PRICE = 170000;
		final int LAKE_PRICE = 210000;
		String condoView;
		
		condoView = JOptionPane.showInputDialog(null, "Choose a condo view:\n1 - Park view" +
				"\n2 - Golf course view\n3 - Lake view");
		if ("1".equals(condoView)) {
			price = price + PARK_PRICE;
			condoView = "park view";
			parkingArea();
		} else if ("2".equals(condoView)) {
			price = price + GOLF_COURSE_PRICE;
			condoView = "golf course view";
			parkingArea();
		} else if ("3".equals(condoView)) {
			price = price + LAKE_PRICE;
			condoView = "lake view";
			parkingArea();
		} else {
			condoView = "nothing";
			parking = "non-existant parking spot";
		}
		JOptionPane.showMessageDialog(null, "You chose " + condoView + " with a " + parking + 
				" for a price of $" + price);
	}
	public static void parkingArea() {
		parking = JOptionPane.showInputDialog(null, "Where would you like to park?\n1 - Garage" +
				"\n2 - Parking space");
			if ("1".equals(parking)) {
				price = price + GARAGE_PRICE;
				parking = "garage";
			} else {
				parking = "parking space";
			}
	}
}
  
