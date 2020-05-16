package org.personal.code;

import java.util.*;
public class StringPermutation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input:");
		Scanner scanInput = new Scanner(System.in);
		String input = scanInput.nextLine();
		permuteString("",input);
	}
public static void permuteString(String beginingString,String endingString)
{
	if(endingString.length()<=0)
	{
		System.out.println(beginingString+endingString);
		return;
	}
	else
	for(int i=0;i<endingString.length();i++)
	{
		String newString = endingString.substring(0,i)+endingString.substring(i+1);
		permuteString(beginingString+endingString.charAt(i),newString);
	}
}
}
