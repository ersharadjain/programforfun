package org.personal.code;

import java.util.Scanner;

public class PrimeNumbers {
	static boolean flag;
	public static void findPrime(int n)
	{
		for(int i = 2 ; i < n ; i ++)
		{
			flag = false ; 
			
			for(int j = 2 ; j < Math.sqrt(i * 1.0) ; j++)
			{
				if(i%j==0)
				{	
				   flag = true ; 
					break ; 
				}
			}	
			if(flag ==false)
			   {
			System.out.println(i +" is a Prime Number");
			   }
		}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input: ");
		Scanner scan = new Scanner(System.in);
		int number = Integer.parseInt(scan.nextLine());
		findPrime(number);
	}

}
