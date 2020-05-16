package org.personal.code;

import java.util.Scanner;

/*
 * Convert string into new string e.g. "abcD"->"cdeF" and "plxY" -> "rnzA"
 * 
 */
public class StringtoNewString {
	public static void main(String []args)
	{
		System.out.println("Please enter a string");
		Scanner scanInput = new Scanner(System.in);
		String input = scanInput.nextLine();
		String output ="";
		for(int i=0;i<input.length();i++)
		{
			char c=input.charAt(i);
			char newChar;
			if((c)>=97)
			newChar = (char)(97 + (((short)c-97) + 2)%26);
			else
			newChar = (char)(65 + (((short)c-65)+2)%26);
			output+=newChar;
		}
		System.out.println(output);
	}
}
