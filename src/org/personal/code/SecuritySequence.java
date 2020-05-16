package org.personal.code;

import java.util.*;
/*
 *security code takes numbers but one key is allowed to be faulty, 
 *other numbers should be same in sequence ex 124 is accepted if actual number is 12646.. 
 */
public class SecuritySequence {
	private static ArrayList<String> replaceToken = new ArrayList<String>() ;
	private static boolean equalFlag = false;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Code");
		String securityCode ="21465";
		Scanner scanInput = new Scanner(System.in);
		String inputCode = scanInput.nextLine();
		if(checkSingleKeyError(inputCode, securityCode)&&!equalFlag)
		{
			if(checkSequence(inputCode,securityCode.replaceAll(replaceToken.get(0),"")))
			{
				System.out.println("Valid Code!!");
			}
			else
			{
				System.out.println("Invalide Code!!");
			}
		}
		else if(checkSingleKeyError(inputCode, securityCode)&&equalFlag)
			System.out.println("Valid Code!!");
		else
		{
			System.out.println("Invalid Code!!");
		}

	}
	public static boolean checkSequence(String inputCode, String securityCode)
	{
		boolean state = true;
		for(int i =0;i<String.valueOf(securityCode).length();i++)
				if(inputCode.charAt(i)!=securityCode.charAt(i))
				{
					state = false;
				}
		return state;
	}
	public static boolean checkSingleKeyError(String input,String security)
	{
		String initial = security;
		for(int i=0;i<input.length();i++)
		{
			initial = initial.replaceAll(String.valueOf(input.charAt(i)),"");
		}
		if(initial.length()>0)
		{
			for(int i=0;i<9;i++)
			{
				if(initial.contains(String.valueOf(i)))
				{
					replaceToken.add(String.valueOf(i));
				}
			}
		}
		else if (security.length()!=input.length())
			return false;
		else
			equalFlag=true;
		if(replaceToken.size()>1)
			return false;
		else
			return true;
	}
}
