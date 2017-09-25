package exercises;

import javax.swing.JOptionPane;

public class Pay {
	public static String retirement;
	public static int hoursWorked;
	public static double regularPay;
	public static double overtimePay;
	public static double gross;
	public static double net;
	public static double deductions;
	public static final double LEVEL_1 = 17.00;
	public static final double LEVEL_2 = 20.00;
	public static final double LEVEL_3 = 22.00;
	public static final double RETIREMENT = 1.03;
	
	public static void main(String[] args) {
		String skillLevelString;
		String hoursWorkedString;
		String insurance = null;
		int skillLevel;
		final int OVERTIME_HOURS = 40;
		final double OVERTIME_PAY = 1.5;
		final double MEDICAL = 32.50;
		final double DENTAL = 20.00;
		final double DISABILITY = 10.00;
		
		skillLevelString = JOptionPane.showInputDialog(null, "What's your skill level?");
		hoursWorkedString = JOptionPane.showInputDialog(null, "How many hours did you work?");
		
		skillLevel = Integer.parseInt(skillLevelString);
		hoursWorked = Integer.parseInt(hoursWorkedString);
		if (skillLevel == 1) {
			if (hoursWorked <= OVERTIME_HOURS) {
				regularPay = hoursWorked * LEVEL_1;
				overtimePay = 0;
				display1();
			}
			if (hoursWorked > OVERTIME_HOURS) {
				regularPay = OVERTIME_HOURS * LEVEL_1;
				overtimePay = (hoursWorked - OVERTIME_HOURS) * LEVEL_1 * OVERTIME_PAY;
				display1();
			}
		}
		if (skillLevel == 2) {
			insurance = JOptionPane.showInputDialog(null, "What's your insurance plan? Medical, Dental, " +
					"Long-term disability, all, or none? Start from left to right if choosing only 2." +
					"Ex: Medical and Long-term disability");
			if (hoursWorked <= OVERTIME_HOURS) {
				if ("all".equalsIgnoreCase(insurance)) {
					regularPay = hoursWorked * LEVEL_2;
					overtimePay = 0;
					deductions = MEDICAL + DENTAL + DISABILITY;
					display2();
				}
				if ("medical and dental".equalsIgnoreCase(insurance)) {
					regularPay = hoursWorked * LEVEL_2;
					overtimePay = 0;
					deductions = MEDICAL + DENTAL;
					display2();
				}
				if ("medical and long-term disability".equalsIgnoreCase(insurance)) {
					regularPay = hoursWorked * LEVEL_2;
					overtimePay = 0;
					deductions = MEDICAL + DISABILITY;
					display2();
				}
				if ("dental and long-term disability".equalsIgnoreCase(insurance)) {
					regularPay = hoursWorked * LEVEL_2;
					overtimePay = 0;
					deductions = DENTAL + DISABILITY;
					display2();
				}
				if ("medical".equalsIgnoreCase(insurance)) {
					regularPay = hoursWorked * LEVEL_2;
					overtimePay = 0;
					deductions = MEDICAL;
					display2();
				}
				if ("dental".equalsIgnoreCase(insurance)) {
					regularPay = hoursWorked * LEVEL_2;
					overtimePay = 0;
					deductions = DENTAL;
					display2();
				}
				if ("long-term disability".equalsIgnoreCase(insurance)) {
					regularPay = hoursWorked * LEVEL_2;
					overtimePay = 0;
					deductions = DISABILITY;
					display2();
				}
				if ("none".equalsIgnoreCase(insurance)) {
					regularPay = hoursWorked * LEVEL_2;
					overtimePay = 0;
					deductions = 0;
					display2();
				}
			}
			if (hoursWorked > OVERTIME_HOURS) {
				if ("all".equalsIgnoreCase(insurance)) {
					regularPay = OVERTIME_HOURS * LEVEL_2;
					overtimePay = (hoursWorked - OVERTIME_HOURS) * LEVEL_2 * OVERTIME_PAY;
					deductions = MEDICAL + DENTAL + DISABILITY;
					display2();
				}
				if ("medical and dental".equalsIgnoreCase(insurance)) {
					regularPay = OVERTIME_HOURS * LEVEL_2;
					overtimePay = (hoursWorked - OVERTIME_HOURS) * LEVEL_2 * OVERTIME_PAY;
					deductions = MEDICAL + DENTAL;
					display2();
				}
				if ("medical and long-term disability".equalsIgnoreCase(insurance)) {
					regularPay = OVERTIME_HOURS * LEVEL_2;
					overtimePay = (hoursWorked - OVERTIME_HOURS) * LEVEL_2 * OVERTIME_PAY;
					deductions = MEDICAL + DISABILITY;
					display2();
				}
				if ("dental and long-term disability".equalsIgnoreCase(insurance)) {
					regularPay = OVERTIME_HOURS * LEVEL_2;
					overtimePay = (hoursWorked - OVERTIME_HOURS) * LEVEL_2 * OVERTIME_PAY;
					deductions = DENTAL + DISABILITY;
					display2();
				}
				if ("medical".equalsIgnoreCase(insurance)) {
					regularPay = OVERTIME_HOURS * LEVEL_2;
					overtimePay = (hoursWorked - OVERTIME_HOURS) * LEVEL_2 * OVERTIME_PAY;
					deductions = MEDICAL;
					display2();
				}
				if ("dental".equalsIgnoreCase(insurance)) {
					regularPay = OVERTIME_HOURS * LEVEL_2;
					overtimePay = (hoursWorked - OVERTIME_HOURS) * LEVEL_2 * OVERTIME_PAY;
					deductions = DENTAL;
					display2();
				}
				if ("long-term disability".equalsIgnoreCase(insurance)) {
					regularPay = OVERTIME_HOURS * LEVEL_2;
					overtimePay = (hoursWorked - OVERTIME_HOURS) * LEVEL_2 * OVERTIME_PAY;
					deductions = DISABILITY;
					display2();
				}
				if ("none".equalsIgnoreCase(insurance)) {
					regularPay = OVERTIME_HOURS * LEVEL_2;
					overtimePay = (hoursWorked - OVERTIME_HOURS) * LEVEL_2 * OVERTIME_PAY;
					deductions = 0;
					display2();
				}
			}
		}
		if (skillLevel == 3) {
			insurance = JOptionPane.showInputDialog(null, "What's your insurance plan? Medical, Dental, " +
					"Long-term disability, all, or none? Ex: Medical and Dental");
			retirement = JOptionPane.showInputDialog(null, "Do you have the retirement plan? Yes or no?");
			if (hoursWorked <= OVERTIME_HOURS) {
				if ("all".equalsIgnoreCase(insurance)) {
					regularPay = hoursWorked * LEVEL_3;
					overtimePay = 0;
					deductions = MEDICAL + DENTAL + DISABILITY;
					display3();
				}
				if ("medical and dental".equalsIgnoreCase(insurance)) {
					regularPay = hoursWorked * LEVEL_3;
					overtimePay = 0;
					deductions = MEDICAL + DENTAL;
					display3();
				}
				if ("medical and long-term disability".equalsIgnoreCase(insurance)) {
					regularPay = hoursWorked * LEVEL_3;
					overtimePay = 0;
					deductions = MEDICAL + DISABILITY;
					display3();
				}
				if ("dental and long-term disability".equalsIgnoreCase(insurance)) {
					regularPay = hoursWorked * LEVEL_3;
					overtimePay = 0;
					deductions = DENTAL + DISABILITY;
					display3();
				}
				if ("medical".equalsIgnoreCase(insurance)) {
					regularPay = hoursWorked * LEVEL_3;
					overtimePay = 0;
					deductions = MEDICAL;
					display3();
				}
				if ("dental".equalsIgnoreCase(insurance)) {
					regularPay = hoursWorked * LEVEL_3;
					overtimePay = 0;
					deductions = DENTAL;
					display3();
				}
				if ("long-term disability".equalsIgnoreCase(insurance)) {
					regularPay = hoursWorked * LEVEL_3;
					overtimePay = 0;
					deductions = DISABILITY;
					display3();
				}
				if ("none".equalsIgnoreCase(insurance)) {
					regularPay = hoursWorked * LEVEL_3;
					overtimePay = 0;
					deductions = 0;
					display3();
				}
			}
			if (hoursWorked > OVERTIME_HOURS) {
				if ("all".equalsIgnoreCase(insurance)) {
					regularPay = OVERTIME_HOURS * LEVEL_3;
					overtimePay = (hoursWorked - OVERTIME_HOURS) * LEVEL_3 * OVERTIME_PAY;
					deductions = MEDICAL + DENTAL + DISABILITY;
					display3();
				}
				if ("medical and dental".equalsIgnoreCase(insurance)) {
					regularPay = OVERTIME_HOURS * LEVEL_3;
					overtimePay = (hoursWorked - OVERTIME_HOURS) * LEVEL_3 * OVERTIME_PAY;
					deductions = MEDICAL + DENTAL;
					display3();
				}
				if ("medical and long-term disability".equalsIgnoreCase(insurance)) {
					regularPay = OVERTIME_HOURS * LEVEL_3;
					overtimePay = (hoursWorked - OVERTIME_HOURS) * LEVEL_3 * OVERTIME_PAY;
					deductions = MEDICAL + DISABILITY;
					display3();
				}
				if ("dental and long-term disability".equalsIgnoreCase(insurance)) {
					regularPay = OVERTIME_HOURS * LEVEL_3;
					overtimePay = (hoursWorked - OVERTIME_HOURS) * LEVEL_3 * OVERTIME_PAY;
					deductions = DENTAL + DISABILITY;
					display3();
				}
				if ("medical".equalsIgnoreCase(insurance)) {
					regularPay = OVERTIME_HOURS * LEVEL_3;
					overtimePay = (hoursWorked - OVERTIME_HOURS) * LEVEL_3 * OVERTIME_PAY;
					deductions = MEDICAL;
					display3();
				}
				if ("dental".equalsIgnoreCase(insurance)) {
					regularPay = OVERTIME_HOURS * LEVEL_3;
					overtimePay = (hoursWorked - OVERTIME_HOURS) * LEVEL_3 * OVERTIME_PAY;
					deductions = DENTAL;
					display3();
				}
				if ("long-term disability".equalsIgnoreCase(insurance)) {
					regularPay = OVERTIME_HOURS * LEVEL_3;
					overtimePay = (hoursWorked - OVERTIME_HOURS) * LEVEL_3 * OVERTIME_PAY;
					deductions = DISABILITY;
					display3();
				}
				if ("none".equalsIgnoreCase(insurance)) {
					regularPay = OVERTIME_HOURS * LEVEL_3;
					overtimePay = (hoursWorked - OVERTIME_HOURS) * LEVEL_3 * OVERTIME_PAY;
					deductions = 0;
					display3();
				}
			}
		}
	}
	public static void display1() {
		gross = regularPay + overtimePay;
		deductions = 0;
		net = gross - deductions;
		JOptionPane.showMessageDialog(null, "Hours worked - " + hoursWorked + "\nHourly pay rate - $" +
				LEVEL_1 + "\nRegular pay - $" + regularPay + "\nOvertime pay - $" + overtimePay +
				"\nTotal pay - $" + gross + "\nTotal deductions - $" + deductions + "\nNet pay - $" +
				net);
	}
	public static void display2() {
		gross = regularPay + overtimePay;
		if (gross > deductions) {
			net = gross - deductions;
			JOptionPane.showMessageDialog(null, "Hours worked - " + hoursWorked +
					"\nHourly pay rate - $" + LEVEL_2 + "\nRegular pay - $" + regularPay +
					"\nOvertime pay - $" + overtimePay + "\nTotal pay - $" + gross +
					"\nTotal deductions - $" + deductions + "\nNet pay - $" + net);
		}
		if (deductions > gross) {
			JOptionPane.showMessageDialog(null, "ERROR");
		}
	}
	public static void display3() {
		gross = regularPay + overtimePay;
		if ("no".equalsIgnoreCase(retirement)) {
			if (gross > deductions) {
				net = gross - deductions;
				JOptionPane.showMessageDialog(null, "Hours worked - " + hoursWorked +
						"\nHourly pay rate - $" + LEVEL_3 + "\nRegular pay - $" + regularPay +
						"\nOvertime pay - $" + overtimePay + "\nTotal pay - $" + gross +
						"\nTotal deductions - $" + deductions + "\nNet pay - $" + net);
			}
			if (deductions > gross) {
				JOptionPane.showMessageDialog(null, "ERROR");
			}
		}
		if ("yes".equalsIgnoreCase(retirement)) {
			if (gross > deductions) {
				net = gross * RETIREMENT - deductions;
				JOptionPane.showMessageDialog(null, "Hours worked - " + hoursWorked +
						"\nHourly pay rate - $" + LEVEL_3 + "\nRegular pay - $" + regularPay +
						"\nOvertime pay - $" + overtimePay + "\nTotal pay - $" + gross +
						"\nTotal deductions - $" + deductions + "\nNet pay - $" + net);
			}
			if (deductions > gross) {
				JOptionPane.showMessageDialog(null, "ERROR");
			}
		}
	}
}
