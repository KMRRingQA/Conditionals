package com.qa.main;

public class Q1_Calculator {
	public int calculate(int Number1, int Number2, boolean Sign) {
		int Answer;
			if (Sign == true) {
				Answer = Number1 + Number2;
			}
			else {
				Answer = Number1 * Number2;
			}
		return Answer;
	}
}
