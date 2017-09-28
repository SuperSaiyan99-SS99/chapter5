package gameZone;

import javax.swing.JOptionPane;

public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numberString;
		String randomNumberString;
		String result;
		int number;
		int score = 0;
		int randomNumber = (1 + (int)(Math.random() * 3));
		
		for (int x = 0; x < 5; x ++) {
		
			numberString = JOptionPane.showInputDialog(null, "Please choose:\n1 - Rock\n2 - Paper\n3 - Scissors");
			number = Integer.parseInt(numberString);
			if (number ==  1 && number == randomNumber) {
				numberString = "rock";
				randomNumberString = "rock";
				result = "the result was a tie.";
				JOptionPane.showMessageDialog(null, "You chose " + numberString + " and I chose " + randomNumberString + " so " + result);
			}
			else if (number ==  2 && number == randomNumber) {
				numberString = "paper";
				randomNumberString = "paper";
				result = "the result was a tie.";
				JOptionPane.showMessageDialog(null, "You chose " + numberString + " and I chose " + randomNumberString + " so " + result);
			}
			else if (number ==  3 && number == randomNumber) {
				numberString = "scissors";
				randomNumberString = "scissors";
				result = "the result was a tie.";
				JOptionPane.showMessageDialog(null, "You chose " + numberString + " and I chose " + randomNumberString + " so " + result);
			}
			else if (number ==  1 && randomNumber == 2) {
				numberString = "rock";
				randomNumberString = "paper";
				result = "I win.";
				JOptionPane.showMessageDialog(null, "You chose " + numberString + " and I chose " + randomNumberString + " so " + result);
			}
			else if (number ==  1 && randomNumber == 3) {
				numberString = "rock";
				randomNumberString = "scissors";
				result = "you win.";
				score ++;
				JOptionPane.showMessageDialog(null, "You chose " + numberString + " and I chose " + randomNumberString + " so " + result);
			}
			else if (number ==  2 && randomNumber == 1) {
				numberString = "paper";
				randomNumberString = "rock";
				result = "you win.";
				score ++;
				JOptionPane.showMessageDialog(null, "You chose " + numberString + " and I chose " + randomNumberString + " so " + result);
			}
			else if (number ==  2 && randomNumber == 3) {
				numberString = "paper";
				randomNumberString = "scissors";
				result = "I win.";
				JOptionPane.showMessageDialog(null, "You chose " + numberString + " and I chose " + randomNumberString + " so " + result);
			}
			else if (number ==  3 && randomNumber == 1) {
				numberString = "scissors";
				randomNumberString = "rock";
				result = "I win.";
				JOptionPane.showMessageDialog(null, "You chose " + numberString + " and I chose " + randomNumberString + " so " + result);
			}
			else if (number ==  3 && randomNumber == 2) {
				numberString = "scissors";
				randomNumberString = "paper";
				result = "you win.";
				score ++;
				JOptionPane.showMessageDialog(null, "You chose " + numberString + " and I chose " + randomNumberString + " so " + result);
			}
			else {
				JOptionPane.showMessageDialog(null, "You're a fool for choosing such a losing number.");
			}
			JOptionPane.showMessageDialog(null, "Your score is " + score);
		}
	}

}
