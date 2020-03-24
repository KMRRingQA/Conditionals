package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		Q1_Calculator calculator = new Q1_Calculator();
		System.out.println(calculator.calculate(1,2,true));
		System.out.println(calculator.calculate(3,3,false));
		System.out.println(calculator.calculate(1,1,true));
		
		System.out.println("\nBeginning of Q2:\n");
		
		Q2_Appendix appendix = new Q2_Appendix();
		System.out.println(appendix.Tree(101));
		
		System.out.println("\nBeginning of Q3:\n");
		
		Q3_NoEvens calculator2 = new Q3_NoEvens();
		System.out.println(calculator2.calculate(1,4,true));

	}

}
