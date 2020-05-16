package org.personal.code;

import java.util.*;
/*There is a security keypad at the entrance of a building. It has 9 numbers 1 - 9 in a 3x3 matrix format.
1 2 3
4 5 6
7 8 9
The security has decided to allow one digit error for a person but that digit should be horizontal or vertical. 
Example: for 5 the user is allowed to enter 2, 4, 6, 8 or for 4 the user is allowed to enter 1, 5, 7. 
IF the security code to enter is 1478 and if the user enters 1178 he should be allowed. 
Write a function to take security code from the user and print out if he should be allowed or not
	*/
public class SecurityKeypad {
	
	private static boolean flag =false;
	private static int errorPosition =0;
	static int[][]arr ={{1,2,3},{4,5,6},{7,8,9}};
	public static void main(String [] args)
	{
		System.out.println("Please Enter ur 4 digit key code :");
		Scanner scanInput = new Scanner(System.in);
		int securityCode = 1178;
		int keyCode = Integer.parseInt(scanInput.nextLine());
		flag = checkSingleDigitError(keyCode,securityCode);
		if(flag&&errorPosition==0)
			System.out.println("Correct Code!!");
		else if(flag&&checkKeypadError(keyCode,securityCode))			
				System.out.println("Valid Key Code");
		else
			System.out.println("Inavlid Key Code");
	}
	public static boolean checkSingleDigitError(int keyCode, int securityCode)
	{
		int counter =0;
		for(int i =0;i<4;i++)
		{
			if(securityCode%10!=keyCode%10)
				{
					counter++;
					errorPosition = 4-i;
				}
			securityCode=securityCode/10;
			keyCode=keyCode/10;
		}
		if(counter>1)
			return false;
		else 
			return true;
	}
	public static boolean checkKeypadError(int keyCode, int securityCode)
	{ 
		flag = false;
		int errorKey = Integer.parseInt(String.valueOf(keyCode).charAt(errorPosition-1)+"");
		int correctKey = Integer.parseInt(String.valueOf(securityCode).charAt(errorPosition-1)+"");
		for(int i =0;i<3;i++)
		{
			for(int j =0;j<3;j++)
			{
				if(arr[i][j]==correctKey)
				{
					for(int k=0;k<3;k++)
					{
						if(arr[i][k]==Integer.parseInt(errorKey+""))
							flag =true;
					}
					for(int k=0;k<3;k++)
					{	if(arr[k][j]==Integer.parseInt(errorKey+""))
							flag =true;
					}
					break;
					}
			}
		}
		return flag;
	}
}