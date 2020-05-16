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
public class SecurityKeypad1 {

	private static int [][]arr={{1,2,3},{4,5,6},{7,8,9}};
	private static boolean flag;
	@SuppressWarnings("unchecked")
	private static ArrayList token = new ArrayList();
	
	@SuppressWarnings("unchecked")
	public static boolean checkSingleDigitError(String keyCode, String securityCode)
	{
		flag =true;
		int counter=0;
		for(int i =0;i<securityCode.length();i++)
			if(securityCode.charAt(i)!=keyCode.charAt(i))
			{
				if(!token.contains(securityCode.charAt(i)))
				{
					token.add(securityCode.charAt(i));
					counter++;
				}
				
				if(compareCode(Integer.parseInt(securityCode.charAt(i)+""),Integer.parseInt(securityCode.charAt(i)+"")))
					flag =true	;
				else
					flag = false;
			}
		if(flag&&counter<=1)
			return true;
		else
			return false;
	}
	public static boolean compareCode(int errorKey, int correctKey)
	{
		flag = false;
		for(int i =0;i<3;i++)
		{
			for(int j =0;j<3;j++)
			{
				if(arr[i][j]==correctKey)
				{
					for(int k=0;k<3;k++)
					{
						if(arr[i][k]==errorKey)
							flag =true;
					}
					for(int k=0;k<3;k++)
					{	if(arr[k][j]==errorKey)
							flag =true;
					}
					break;
					}
			}
		}
		return flag;
	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.out.println("Please Enter ur 4 digit key code :");
		Scanner scanInput = new Scanner(System.in);
		String securityCode = "1111";
		String keyCode = scanInput.nextLine();
		if(checkSingleDigitError(keyCode,securityCode))
			System.out.println("Correct Code");
		else
			System.out.println("Incorrect Code");
		
	}

}
