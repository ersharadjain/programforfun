package org.personal.code;

import java.util.Scanner;	
/**
	 * A number is called 'desirable' if all the digits are strictly ascending ex: 159 as 1<5<9. 
	 * You know that your rival has a strictly numeric password that is 'desirable'. 
	 * Your close ally has given you the number of digits (N) in your rival's password. 
	 * WAP that takes in 'N' as input and prints out all possible 'desirable' numbers that can be formed with N digits.
	 */

public class DesirableNumber {
	public static void main(String[] args) {
		System.out.println("Enter Length: ");
		Scanner scanInput = new Scanner(System.in);
		int input = Integer.parseInt(scanInput.nextLine());	
        printDesirable(0, input,"");
	}
	
	public static void printDesirable( int index, int input,String output){
		if(input == 0){//***mistake***//
			System.out.println(output);
			return;
		}
			for(int i = index; i <10; i++)//**mistake***//
			{
				String initial = output;
				output += i;
				printDesirable(i+1, input-1,output);///****mistake**//				
				output = initial;				
			}	
	}
}