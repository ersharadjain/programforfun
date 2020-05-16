package org.personal.code;

import java.util.Scanner;
public class PerfectNumber {

	public static void isPerfectNumber(int n)
	{
	int sum = 0;

	for(int i = 1; i <= n-1; i++)
	{
	if(n%i == 0)
	{
	sum = sum + i;
	}
	}
	if(sum == n)
	System.out.println("The number is a perfect number");
	else
	System.out.println("The number is not a perfect number");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input: ");
		Scanner scan = new Scanner(System.in);
		int number = Integer.parseInt(scan.nextLine());
		isPerfectNumber(number);
		

	}

}
