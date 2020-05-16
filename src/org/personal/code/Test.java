/*
 * Convert string into new string e.g. "abcD"->"cdeF" and "plxY" -> "rnzA"
 * 
 */
package org.personal.code;

import java.util.Scanner;

public class Test
{

	public static void main(String []args)
	{
		System.out.println("Please enter a string");
		Scanner scanInput = new Scanner(System.in);
		String input = scanInput.nextLine();
		System.out.println(uppercaseString(input));
	}
	public static String uppercaseString(String inputToken)
	{
		char [] inputArray = inputToken.toCharArray();
		int counter =0;
		for(int  i =0;i<3;i++)
		{
			if(inputToken.charAt(i)<97)
			{
				counter++;
			}
		}
		inputToken = "";
		if(counter==3)
		{
			for(int j =0;j<5;j++)
			{
				if(inputArray[j]>=97)
					inputArray[j] = (char)(((short)inputArray[j]-97)%26+65);
					inputToken += inputArray[j];
			}
		}
		return inputToken;
	}
	
}
