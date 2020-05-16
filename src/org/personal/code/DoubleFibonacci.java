package org.personal.code;

import java.util.Scanner;
/**
 * "Fibonacci Numbers: A number is said to be Fibonacci number if it follows the fibonacci property. (Ex: 112, 1123, etc). 
But additionally, it need not necessarily start with 1, as with the normal fibonacci series. 
So, in this new definition, 112(1,1,2) is a fibonacci number and so is 121224(12,12,24), and so is 252550(25,25,50). 
So, given any two numbers as input, print out all the Fibonacci Numbers within that range.."

 */
 class DoubleFibonacci{
	
		public static void main(String[] args){
			System.out.println("Please enter the desired range of number:");
			Scanner scanInput = new Scanner(System.in);
			int input1 = Integer.parseInt(scanInput.nextLine());
			int input2 = Integer.parseInt(scanInput.nextLine());
			for(int input=input1;input<=input2;input++)
			{
				int len = String.valueOf(input).length();
				if(checkFibonacci(input,len))
					System.out.println(input);
			}
	}	
		public static boolean checkFibonacci(int input, int len)
		{
			boolean flag = false;
			int divisor;
			if(len>=6)
				divisor =100;
			else
				divisor =10;
			int lhs =0;
			int rhs =0;
			lhs = input%divisor;
			input = input/divisor;
			for(int i=0;i<len-1;i++)
			{
				rhs = input%divisor;
				input/=divisor;
				rhs +=input%divisor;
				input =input/divisor;
				if(lhs ==rhs)
					flag = true;
				else
					flag = false;
				len = String.valueOf(input).length();
			}
			return flag;
		}
}