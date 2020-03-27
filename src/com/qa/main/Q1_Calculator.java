package com.qa.main;

public class Q1_Calculator {
	public int calculate(int number1, int number2, boolean sign) {
		int Answer;
		if (sign) {
			Answer = number1 + number2;
		} else {
			Answer = number1 * number2;
		}
		return Answer;
	}
}
