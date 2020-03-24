package com.qa.main;

public class Q3_NoEvens {
	public int calculate(int Number1, int Number2, boolean Sign) {
		if (Number1%2==0 || Number2%2==0) {
			return 0;
		}
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
