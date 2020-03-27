package com.qa.main;

public class Q3_NoEvens {
	public int calculate(int number1, int number2, boolean sign) {
		if (number1 % 2 == 0 || number2 % 2 == 0) {
			return 0;
		}
		int answer;
		if (sign) {
			answer = number1 + number2;
		} else {
			answer = number1 * number2;
		}
		return answer;
	}
}
