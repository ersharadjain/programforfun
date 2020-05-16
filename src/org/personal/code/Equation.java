package org.personal.code;

import java.util.Scanner;

/**
	 * Given a number find whether the digits in the number can be used to form an equation with + and '='. 
	 * That is if the number is 123, we can have a equation of 1+2=3. 
	 * But even the number 17512 also forms the equation 12+5=17.
	 */

public class Equation {

	private static boolean flag =false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Input: ");
		Scanner scanInput = new Scanner(System.in);
		int digits = Integer.parseInt(scanInput.nextLine());
		checkEquation(digits,digits,0);
		if(flag)
			System.out.println("Numbers are in equation");
		else
			System.out.println("Numbers are not in equation");
	}
public static void checkEquation(int n,int lhs, int rhs)
{
	for(int i =0;i<Integer.toString(n).length()-1;i++)
	{
		rhs =rhs+n%10;
		n=n/10;
		int initial=n;
		lhs=0;
		for(int j=0;j<Integer.toString(n).length();j++)
		{
			lhs = lhs+initial%10;
			initial =initial /10;
		}
		if(lhs == rhs)
			flag=true;
	}
}
}
