package org.personal.code;

import java.util.Scanner;


public class SecuritySequence1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Code");
		String securityCode ="21465";
		Scanner scanInput = new Scanner(System.in);
		String inputCode = scanInput.nextLine();
		if(checkSingleKeyError(inputCode,securityCode))
			System.out.println("Accepted!!");
	}
	public static boolean checkSingleKeyError(String input,String security)
	{
		boolean status =false;
		for(int i =0;i<=9;i++)
			if(security.contains(String.valueOf(i)))
			{
				if((input.replaceAll(String.valueOf(i), "")).compareTo(input)==0)
					status =true;
			}
		return status;
	}
}
