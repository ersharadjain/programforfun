package org.personal.code;

import java.util.Scanner;

public class permuteString{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter String to permute: ");
		Scanner scanInput = new Scanner(System.in);
		String input =scanInput.nextLine();
		generatePermuteString("",input);
	}
	public static void generatePermuteString(String beginningString, String endingString) {
		
	    if (endingString.length() <= 0)
	      {
	    	System.out.println(beginningString);
	    	//return;
	      }
	    else
	      for (int i = 0; i < endingString.length(); i++) {
	        try {
	        		String newString = endingString.substring(0, i) + endingString.substring(i + 1);//****mistake***
	        		//System.out.println("begining: "+beginningString+" endstring: "+endingString);
	        		System.out.println("before call prefix:"+beginningString);
	        		System.out.println("before call suffix:"+ endingString);
	        		//System.out.println("i:"+i);
	        		generatePermuteString(beginningString + endingString.charAt(i), newString);
	        	//	System.out.println("i:"+i);
	        		System.out.println("after call prefix:"+beginningString);
	        		System.out.println("after call suffix:"+ endingString);
	        	} 
	        catch (StringIndexOutOfBoundsException exception) {
	          exception.printStackTrace();
	        }
	      }
	}
}
