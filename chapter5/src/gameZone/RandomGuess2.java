package gameZone;

import javax.swing.JOptionPane;

public class RandomGuess2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numberString;
		int number;
		int randomNumber = (1 + (int)(Math.random() * 10));
		numberString = JOptionPane.showInputDialog(null, "Think of a number between 1 and 10.");
		number = Integer.parseInt(numberString);
		JOptionPane.showMessageDialog(null, "The number is " + randomNumber);
		if (number > randomNumber) {
			JOptionPane.showMessageDialog(null, "You're guess was too high.");
		}
		if (number < randomNumber) {
			JOptionPane.showMessageDialog(null, "You're guess was too low.");
		}
		if (number == randomNumber) {
			JOptionPane.showMessageDialog(null, "You're guess was correct.");
		}
	}

}