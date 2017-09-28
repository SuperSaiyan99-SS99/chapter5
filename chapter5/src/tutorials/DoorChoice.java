package tutorials;

import javax.swing.JOptionPane;

//Door Choice
//Author Chance Cornelison
public class DoorChoice {

	public static void main(String[] args) {
		//Door Prize program
		String choiceString;
		int doorChoice;
		int x = 0;
		while (x < 4) {
			x ++;
			choiceString = JOptionPane.showInputDialog(null, "Pick a door any door, 1, 2, or 3.",
					"Door Choice", JOptionPane.INFORMATION_MESSAGE);
			doorChoice = Integer.parseInt(choiceString);
		
			//if statement structure for door choice
			if (doorChoice == 1) {
				JOptionPane.showMessageDialog(null, "You win Nothing!! HAHAHAHA!");
			}
			else if (doorChoice == 2) {
				JOptionPane.showMessageDialog(null, "You win less than NOTHING! HAHAHAHAHAHA");
			}
			else if (doorChoice == 3) {
				JOptionPane.showMessageDialog(null, "You win a brand new Huffy Bike! HAHAHAHAHA");
			}
			else if (doorChoice == 666) {
				JOptionPane.showMessageDialog(null, "You win planet Earth, but you don't win me! HAHAHAHA");
			}
			else {
				JOptionPane.showMessageDialog(null, "That number was not an option, I said 1-3.");
			}
			JOptionPane.showMessageDialog(null, "There's a secret!");
		}
	}

}
