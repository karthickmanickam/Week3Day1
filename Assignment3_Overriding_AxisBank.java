package org.overriding;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("This is a Deposit - AxisBank");
		//super.deposit();
	}
	public static void main(String[] args) {
				AxisBank axisBank = new AxisBank();
		axisBank.deposit();
			}
	}
