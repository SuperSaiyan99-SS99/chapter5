package exercises;

import javax.swing.JOptionPane;

public class CellPhoneService {
	
	public static void main(String[] args) {
		String talkMin;
		String textMsgs;
		String dataGigs;
		int talkMinutes;
		int textMessages;
		int dataGigabytes;
		final int MINUTES = 500;
		final int MESSAGES = 100;
		final int GIGABYTES = 2;
		final int PLAN_A = 49;
		final int PLAN_B = 55;
		final int PLAN_C = 61;
		final int PLAN_D = 70;
		final int PLAN_E = 79;
		final int PLAN_F = 87;
		
		talkMin = JOptionPane.showInputDialog(null, "What's the maximum number of minutes of talk do you need?");
		textMsgs = JOptionPane.showInputDialog(null, "What's the maximum number of text messages do you need?");
		dataGigs = JOptionPane.showInputDialog(null, "What's the maximum number of gigabytes of data do you need?");
		
		talkMinutes = Integer.parseInt(talkMin);
		textMessages = Integer.parseInt(textMsgs);
		dataGigabytes = Integer.parseInt(dataGigs);
		
		if ((talkMinutes < MINUTES) && (textMessages == 0) && (dataGigabytes == 0)) {
			JOptionPane.showMessageDialog(null, "Plan A is the best option with fewer than " + MINUTES +
					" minutes of talk, no text, and no data at a price of $" + PLAN_A);
		} else if ((talkMinutes < MINUTES) && (textMessages > 0) && (dataGigabytes == 0)) {
			JOptionPane.showMessageDialog(null, "Plan B is the best option with fewer than " + MINUTES +
					" minutes of talk, any text messages, and no data at a price of $" + PLAN_B);
		} else if ((talkMinutes > MINUTES) && (textMessages < MESSAGES) && (dataGigabytes == 0)) {
			JOptionPane.showMessageDialog(null, "Plan C is the best option with more than " + MINUTES +
					" minutes of talk, less than " + MESSAGES +
					" text messages, and no data at a price of $" + PLAN_C);
		} else if ((talkMinutes > MINUTES) && (textMessages > MESSAGES) && (dataGigabytes == 0)) {
			JOptionPane.showMessageDialog(null, "Plan D is the best option with more than " + MINUTES +
					" minutes of talk, more than " + MESSAGES +
					" text messages, and no data at a price of $" + PLAN_D);
		} else if ((talkMinutes == 0) && (textMessages == 0) && (dataGigabytes < GIGABYTES)) {
			JOptionPane.showMessageDialog(null, "Plan E is the best option with no talk, no text, and less than " + 
					GIGABYTES + " gigabytes of data at a price of $" + PLAN_E);
		} else if ((talkMinutes == 0) && (textMessages == 0) && (dataGigabytes > GIGABYTES)) {
			JOptionPane.showMessageDialog(null, "Plan F is the best option with no talk, no text, and more than " +
					GIGABYTES + " gigabytes of data at a price of $" + PLAN_F);
		} else {
			JOptionPane.showMessageDialog(null, "You have too many needs.");
		}
	}
}
